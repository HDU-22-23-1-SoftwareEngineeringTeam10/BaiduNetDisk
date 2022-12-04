package com.baidu.Share;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.print("请选择您要分享的文件：\n");
        FileList fileList = new FileList();
        fileList.showList();
        System.out.print("请输入您的选择：");
        Scanner sc1 = new Scanner(System.in);
        int select1 = sc1.nextInt();

        if(select1==1||select1==2||select1==3){
            System.out.print("\n");
            System.out.print("请选择您要进行的操作：\n");
            System.out.println("1.通过链接分享\n2.好友直接分享\n3.查看文件信息");
            System.out.print("请输入您的选择：");
            Scanner reader = new Scanner(System.in);
            int choose = reader.nextInt();
            System.out.print("\n");

            switch(choose){
                case 1:
                    File message = new File();
                    message.fileMessage();
                    LinkShare linkShare = new LinkShare();
                    linkShare.showLink();
                    break;
                case 2:
                    FriendList friendList = new FriendList();
                    friendList.friendSelect();
                    System.out.println("请选择分享方式：");
                    System.out.println("1.本地分享\n2.网盘分享\n3.取消分享");
                    System.out.print("请输入您的选择：");
                    NetDiskShare netDiskShare = new NetDiskShare();
                    Scanner sc2 = new Scanner(System.in);
                    String select2 = sc2.nextLine();
                    System.out.print("\n");
                    netDiskShare.share(select2,"测试文件1.txt");
                    break;
                case 3:
                    File information = new File();
                    information.fileMessage();
            }
        }
    }
}
