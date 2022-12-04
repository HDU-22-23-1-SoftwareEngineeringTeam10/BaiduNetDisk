package com.baidu.uploadth;

// 视频上传模块
public class Video extends Upload{
    public String FileName;
    public Video(String FileName){
        this.FileName = FileName;
    }
    public void Uploaded(){
        System.out.println("视频上传成功");;
    }
}
