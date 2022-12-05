package com.baidu.Share;

public class File {
    String filename = "测试文件1.txt";
    String filerode = "F:/测试文件目录/测试文件子目录/测试文件1.txt";

    private static File instance= new File();
    File(){}

    public static File getInstance(){
        return instance;
    }

    public void fileMessage(){
        System.out.println("文件名称："+filename);
        System.out.println("文件路径："+filerode+"\n");
    }
}
