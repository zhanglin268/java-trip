package com.lin.DAO;

import com.lin.model.Section;
import com.lin.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 11:49 pm 22/08/2020
 */
public class SectionDao {
    public void insert(int bid, String name) throws SQLException {

        String sql = "insert into sections (bid,name) value (?,?)";
        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1,bid);
                s.setString(2,name);

                s.executeUpdate();
            }
        }
    }

    public List<Section> selectByBid(int bid) throws SQLException {
        String sql = "select sections.sid,uuid,name from sections left join audios on " +
                "sections.sid = audios.sid where bid =? order by sections.sid";
        List<Section> sections = new ArrayList<>();

        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1,bid);

                try(ResultSet r = s.executeQuery()) {
                    while(r.next()) {
                        Section section = new Section(
                                r.getInt("sid"),
                                r.getString("uuid"),
                                r.getString("name"));
                        sections.add(section);
                    }
                }
            }
        }
        return sections;
    }
}
