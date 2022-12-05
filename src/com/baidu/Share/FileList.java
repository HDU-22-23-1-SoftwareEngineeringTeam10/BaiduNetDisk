package com.baidu.Share;
import java.util.Scanner;
public class FileList {
    public FileList(){}
        void showList(){
            String []file = {"测试文件1","测试文件2","测试文件3"};
            int n = file.length;
            for(int i=0;i<n;i++){
                System.out.print(i+1+"."+file[i]+"\n");
            }
        }
}
