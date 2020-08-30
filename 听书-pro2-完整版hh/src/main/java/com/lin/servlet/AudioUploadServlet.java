package com.lin.servlet;

import com.lin.service.AudioService;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * @author: 张林
 * @Date :Created in 9:27 pm 27/08/2020
 */
@MultipartConfig
@WebServlet("/upload/audio")
public class AudioUploadServlet extends HttpServlet {
    private AudioService audioService;
    //private BookService bookService;
    @Override
    public void init() throws ServletException{
        audioService = new AudioService();
       // bookService = new BookService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String s = req.getParameter("sid");

        int sid =Integer.parseInt(s);

        Part audio = req.getPart("audio");
        //通过这个输入流，就可以得到声音的所有信息
        //InputStream audio  =req.getIntStream

        //保存声音，得到声音的UUID

        //将声音的UUID和sid对应的章节进行关联
        // bookService.lind(sid,uuid);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();

        try {
            String uuid = audioService.save(sid,audio);
            writer.printf("{\"uuid\": \"%s\"}%n",uuid);
        } catch (SQLException e) {
            e.printStackTrace();
            resp.setStatus(500);
            writer.printf("{\"reason\": \"%s\"}%n",e.getMessage());
        }


    }
}
