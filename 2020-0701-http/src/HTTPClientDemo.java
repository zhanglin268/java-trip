import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program:2020-0701-http
 * @description
 * @author: 张林
 * @creat:2020-07-02 14:31
 **/
public class HTTPClientDemo {
    public static void main(String[] args) {
        //URL:http://www.baidu.com/s?wd=java
        String SERVER_HOST = "www.baidu.com";
        int SEVER_PORT = 80;
        try(Socket socket = new Socket(SERVER_HOST,SEVER_PORT)) {

            //GET方法的请求，不包含请求体
            String request = "GET /s?wd=java HTTP/1.0\r\nHost: www.baidu.com\r\n\r\n";
            PrintWriter writer = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream(),"utf-8")
            );
            //成功的把请求发送过去
            writer.print(request);
            writer.flush();

            //等待响应
            Scanner scan = new Scanner(socket.getInputStream(),"utf-8");
           while(scan.hasNextLine()) {
               System.out.println(scan.nextLine());
           }


        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
