package com.baidu.uploadth;

// 音频上传模块
public class Audio extends Upload{
    public String FileName;
    public Audio(String FileName){
        this.FileName = FileName;
    }
    public void Uploaded(){
        System.out.println("音频上传成功");;
    }
}
