package com.baidu.Share;

import java.util.Random;
import java.util.Scanner;

public class LinkShare {
    public LinkShare(){}

    void showLink(){
        String linkroad = "https://pan.baidu.com/s/";
        System.out.print("请设置提取码：");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println("");

        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder dir = new StringBuilder();

        for (int i=1;i<10;i++) {
            int number = random.nextInt(base.length());
            dir.append(base.charAt(number));
        }
        dir.toString();
        System.out.print("分享链接为：");
        System.out.println(linkroad+dir+"/");
        System.out.print("文件提取码："+password+"\n");
        System.out.println("请手动复制该链接发送至分享对象\n");
    }
}
