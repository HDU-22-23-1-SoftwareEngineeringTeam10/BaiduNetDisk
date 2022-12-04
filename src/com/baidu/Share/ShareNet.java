package com.baidu.Share;

public class ShareNet implements ShareWay{
    @Override
    public void localShare(String fileName) {
        //无任何操作
    }

    @Override
    public void netShare(String fileName) {
        System.out.println("分享方式："+"网盘文件分享"+"\n"+"文件名："+fileName);
        System.out.println("分享成功!");
    }
}