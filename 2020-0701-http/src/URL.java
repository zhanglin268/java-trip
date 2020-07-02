import java.util.HashMap;
import java.util.Map;

/**
 * @program:2020-0701-http
 * @description
 * @author: 张林
 * @creat:2020-07-02 10:14
 **/
public class URL {
    public static void main(String[] args) {
        String[] urls = {
                "https://www.baidu.com/s?wd=java&rsv_spt=1&rsv_iqid=0xb86707600004351f&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_dl=tb&rsv_sug3=8&rsv_sug1=4&rsv_sug7=100&rsv_sug2=0&rsv_btype=i&inputT=2099&rsv_sug4=2305",
                "https://www.sogou.com/web?query=java&_asf=www.sogou.com&_ast=&w=01019900&p=40040100&ie=utf8&from=index-nologin&s_from=index&sut=871&sst0=1593516407073&lkt=4%2C1593516406203%2C1593516406827&sugsuv=00033F407B8B8B625E1ECF5D4D743627&sugtime=1593516407073",
                "http://www.qq.com/",
                "http://localhost:9939/hello"
        };
        for(String url : urls) {
            parseURL(url);
            System.out.println("================================");

        }

    }

    private static Map<String,Integer> map = new HashMap<>();
    static {
        map.put("http",8080);
        map.put("https",443);
    }

    public static void parseURL(String url) {
            //1.找到协议部分 通过第一个“://”
        int index = url.indexOf("://");
        String schema = url.substring(0,index);
        System.out.println("协议部分："+schema);
        String remain = url.substring(index+3);//跳过 "://"

        index = remain.indexOf("/");
        String service = remain.substring(0,index);
        System.out.println("服务器地址："+service);
        //通过server 找到host和port部分
        int i = service.indexOf(":");
        String host = null;
        int port = -1;
        if(i == -1) {
            //没有写明端口号,则使用端口的默认协议
            host = service;
            port = map.get(schema);
        }else {
            host = service.substring(0,i);
            port = Integer.parseInt(service.substring(i+1));
        }
        System.out.println("服务端主机信息："+ host);
        System.out.println("服务端端口信息："+port);
        remain = remain.substring(index);
        index = remain.indexOf("?");
        if(index == -1) {
            System.out.println("文件路劲：" + remain);
        }else {
            String path = remain.substring(0,index);
            System.out.println("文件路劲：" + path);
            System.out.println("查询字符串：" + remain.substring(index+1));

        }






    }
}
