package com.baidu.Share;

public class ShareLocal implements ShareWay{
    @Override
    public void localShare(String fileName) {
        System.out.println("分享方式："+"本地文件分享"+"\n"+"文件名："+fileName);
        System.out.println("分享成功!");
    }

    @Override
    public void netShare(String fileName) {
        //无任何操作
    }
}
