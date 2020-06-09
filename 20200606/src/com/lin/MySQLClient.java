package com.lin;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:20200606
 * @description
 * @author: 张林
 * @creat:2020-06-07 16:24
 **/
public class MySQLClient {


    /**
     * 以下配置可以通过
     */
    private static String host = "127.0.0.1";
    private static int port = 3306;
    private static String  user = "root";
    private static String password = "zhl19990207803";
    private static String defaultDatabaseName = "shopes";


    public static void main(String[] args) {
        //args 代表的就会说用户输入的参数
        System.out.println(Arrays.toString(args));
        if(args.length == 0) {
            printUsageAndExit();
        }

        parseArguments(args);
        String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false&characterEncodeing=utf8",
               host,port,defaultDatabaseName );
        System.out.println("DEBUG: url = " + url);
        System.out.println("DEBUG : user = "+ user);
        System.out.println("DEBUG: password = "+ password);

        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            printWelcome();

            Scanner scanner = new Scanner(System.in);
            //进入之前所谓的mysql界面
            System.out.println("mysql> ");
            //一次连接多次执行


            while(true) {
                String cmd = scanner.nextLine();
                if(cmd.equalsIgnoreCase("quit")) {
                    break;
                }
                while(!cmd.endsWith(";")) {
                    System.out.println("   ->");
                    cmd += scanner.nextLine();
                }
               cmd = cmd.substring(0,cmd.length()-1);
                System.out.println("DEBUG:"+ cmd);

                //select 和show 开头的sql，是会返回结果的
                //所以使用，带resultSet的查询方式
                //否则使用executeUpdate的执行方式

                if(cmd.startsWith("select") || cmd.startsWith("show")) {
                    executeQuery(connection,cmd);
                }else {
                    executeUpdate(connection,cmd);
                }
                System.out.println("mysql>");

            }
            connection.close();

        } catch (SQLException e) {
           printUsageAndExit(e.toString());
        }



        System.out.println(host);
        System.out.println(port);
        System.out.println(user);
        System.out.println(password);
        System.out.println(defaultDatabaseName);
    }

    private static void executeUpdate(Connection connection, String cmd) throws SQLException {
        /*long b = System.currentTimeMillis();
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);
        long e = System.currentTimeMillis();
        statement.close();*/


    }

    private static void executeQuery(Connection connection, String cmd) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(cmd);

        //利用结果集中的“元数据metadata” 获取一些基本信息
        //一共有多少列
        //每一列的名称是什么
        int columnCount = resultSet.getMetaData().getColumnCount();

        for(int i = 0;i < columnCount-1;i++) {
            String label = resultSet.getMetaData().getColumnLabel(i+1);
            if(i != columnCount-1) {
                System.out.println(label+ ",");
            }else {
                System.out.println();

            }
            System.out.println(label + ",");
        }
        //依次去遍历每一行打印每一行的结果
        while(resultSet.next()) {
            for(int i = 0;i < columnCount;i++) {
                String value = resultSet.getString(i+1);
                System.out.println(value+",");

            }

        }
        resultSet.close();
        statement.close();

    }

    private static void printWelcome() {
        System.out.println("欢迎使用MySQLClient");
        System.out.println();
    }

    private static void parseArguments(String[] args) {
        defaultDatabaseName = args[args.length-1];
        args = Arrays.copyOfRange(args,0,args.length-1);
        for(int i = 0;i <args.length;i++) {
            String arg = args[i];
            switch(arg) {
                case "--help":
                    printUsageAndExit();
                case  "-h":
                case "--host":
                    host = args[++i];
                    break;
                case "-P":
                case "--port":
                    port = Integer.parseInt(args[++i]);
                    break;
                case "-u":
                case "--user":
                    user = args[++i];
                    break;
                case "-p":
                case "--password":
                    password = args[++i];
                    break;
                default:
                   printUsageAndExit("不认识的选项：+arg");
            }
        }

    }

    private static void printUsageAndExit(String... messages) {
        System.out.println("Usage: mysql [选项] [默认数据库] ");
        System.out.println(" --heap      打印帮助信息");
        System.out.println(" -h, --host  连接主机，默认是127.0.0.1");
        System.out.println(" -P, --port  连接端口，默认是 3306");
        System.out.println(" -u, --user  用户名，必须设置");
        System.out.println(" -p, --password mysql 密码");


        //1.stream的操作
        //2.方法的引用
        //等于下面的代码对哒简单版本

        Arrays.stream(messages).peek(System.out::println);

       /* for(String s: messages) {
            System.out.println(s);
        }*/
        System.exit(1);
    }

}
