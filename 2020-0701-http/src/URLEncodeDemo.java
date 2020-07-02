import com.sun.deploy.net.URLEncoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @program:2020-0701-http
 * @description
 * @author: 张林
 * @creat:2020-07-02 12:50
 **/
public class URLEncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encode = URLEncoder.encode("c++","utf-8");
        System.out.println(encode);

        String decode = URLDecoder.decode("c%2B%2B","utf-8");
        System.out.println(decode);
    }
}
