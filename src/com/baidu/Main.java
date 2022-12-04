package com.baidu;

import com.baidu.DLpt.DLTest;
import com.baidu.uploadth.UploadTHTest;
import com.baidu.Share.Demo;
import com.baidu.Search.FactoryPatternDemo;
import com.baidu.relation.RelationTest;

public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("资源上传");
        System.out.println("---------------------------");
        UploadTHTest.main(args);

        System.out.println("");
        System.out.println("资源下载");
        System.out.println("---------------------------");
        DLTest.main(args);

        System.out.println("");
        System.out.println("资源共享");
        System.out.println("---------------------------");
        Demo.main(args);

        System.out.println("");
        System.out.println("资源检索");
        System.out.println("---------------------------");
        FactoryPatternDemo.main(args);

        System.out.println("");
        System.out.println("关系系统");
        System.out.println("---------------------------");
        RelationTest.main(args);
    }
}
