package com.baidu.uploadth;

import java.util.Scanner;

import com.baidu.Users.User;

// 测试
public class UploadTHTest {
    public static void main(String[] args){
        User user = new User();
        System.out.println("请输入要上传的文件名");
        Scanner input = new Scanner(System.in);
        String FileName = input.next();
        FactoryUserUpload  factoryUserUpload = new FactoryUserUpload(user, FileName);
        factoryUserUpload.UploadAsk();
        input.close();
        
        System.out.println("用户所拥有文件:"+user.FileName);
    }
}
