package com.baidu.uploadth;

// 文档上传模块
public class Documentation extends Upload{
    public String FileName;
    public Documentation(String FileName){
        this.FileName = FileName;
    }
    public void Uploaded(){
        System.out.println("文档上传成功");;
    }
}
