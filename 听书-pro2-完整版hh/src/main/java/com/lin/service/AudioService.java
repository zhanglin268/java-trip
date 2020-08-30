package com.lin.service;

import com.lin.DAO.AudioDao;
import com.lin.model.Audio;

import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

/**
 * @author: 张林
 * @Date :Created in 9:38 pm 27/08/2020
 */
public class AudioService {
    private AudioDao audioDao;
    public AudioService() {
        audioDao = new AudioDao();
    }
    public String save(int sid,Part audio) throws IOException, SQLException {
        String uuid = UUID.randomUUID().toString();
        audioDao.insert(sid,uuid,audio.getContentType(),audio.getInputStream());
        return uuid;
    }

    public Audio get(String uuid) throws SQLException {
        return audioDao.select(uuid);
    }
}
