package com.lin.servlet;

import com.lin.model.Audio;
import com.lin.service.AudioService;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author: 张林
 * @Date :Created in 3:08 pm 28/08/2020
 */
@WebServlet("/audio/get")
public class AudioGetServlet extends HttpServlet {
    private AudioService audioService;

    @Override
    public void init() {
        audioService = new AudioService();

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String uuid = req.getParameter("uuid");
        Audio audio = null;
        try {
            audio = audioService.get(uuid);
            if(audio == null) {
                resp.sendError(404,"没有这个url");
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }

        resp.setContentType(audio.contentType);
        ServletOutputStream outputStream = resp.getOutputStream();

        byte[] buf = new byte[1024];
        int len;
        while((len = audio.inputStream.read(buf)) != -1) {
            outputStream.write(buf,0,len);

        }
        audio.inputStream.close();




    }
}
