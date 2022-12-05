package com.baidu.uploadth;

import java.util.*;

import com.baidu.Users.User;

public class FactoryUserUpload {
    User user;
    String FileName;
    public FactoryUserUpload(User user,String FileName){
        this.user = user;
        this.FileName = FileName;
    }
    public void UploadAsk(){
        System.out.println("请选择要上传的文件类型:1.文档 2.视频 3.音频 4.图片");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        scanner.close();
        UploadFactory uploadFactory = new UploadFactory(FileName, select);
        user.FileName.add(uploadFactory.FileName);
        uploadFactory.GetUpload();
    }
}
