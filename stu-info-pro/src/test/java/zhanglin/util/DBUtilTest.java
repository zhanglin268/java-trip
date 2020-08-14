package zhanglin.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author: 张林
 * @Date :Created in 3:43 pm 27/07/2020
 */
public class DBUtilTest {
    @Test
    public void testConnection(){
        Assert.assertNotNull(DBUtil.getConnection());
    }
}
