package zhanglin.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: 张林
 * @Date :Created in 8:00 pm 7/08/2020
 */
@Getter
@Setter
@ToString
public class Page {
    private String searchText;//条件查询额字段
    private String sortOrder;//排序的条件
    private Integer pageSize;//每页的数量
    private Integer pageNumber;//当前的页码
    public static Page parse(HttpServletRequest req) {
        Page p = new Page();
        p.searchText = req.getParameter("searchText");
        p.sortOrder = req.getParameter("sortOrder");
        p.pageSize = Integer.parseInt(req.getParameter("pageSize"));

        return p;
    }

}
