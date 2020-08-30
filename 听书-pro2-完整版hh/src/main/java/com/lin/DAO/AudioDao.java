package com.lin.DAO;

import com.lin.model.Audio;
import com.lin.util.DButil;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: 张林
 * @Date :Created in 9:27 pm 23/08/2020
 */
public class AudioDao {
    public void insert(int sid, String uuid, String contentType, InputStream inputStream) throws SQLException {
        String sql = "insert into audios (sid,uuid,type,content) values (?,?,?,?)";
        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1,sid);
                s.setString(2,uuid);
                s.setString(3,contentType);
                s.setBlob(4,inputStream);
                s.executeUpdate();
            }
        }
    }

    public Audio select(String uuid) throws SQLException {
        String sql = "select type,content from audios where uuid = ?";

        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql)) {
                s.setString(1,uuid);

                try(ResultSet r = s.executeQuery()) {
                    if(!r.next()) {
                        return null;
                    }
                    return new Audio(r.getString("type"),r.getBinaryStream("content"));

                }
            }
        }
    }
}
