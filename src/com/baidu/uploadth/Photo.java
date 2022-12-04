package com.baidu.uploadth;

// 文档上传模块
public class Photo extends Upload{
    public String FileName;
    public Photo(String FileName){
        this.FileName = FileName;
    }
    public void Uploaded(){
        System.out.println("图片上传成功");;
    }
}
