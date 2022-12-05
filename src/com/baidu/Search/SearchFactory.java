package com.baidu.Search;

public class SearchFactory {
    //使用 getShape 方法获取形状类型的对象
    public Search getFile(String fileMessage){
        if(fileMessage == null){
            return null;
        }
        if(fileMessage.contains("2022/12/05")){
            return new DateSearch();
        } else if(fileMessage.contains("测试文件")){
            return new KeyWordSearch();
        } else if(fileMessage.contains(".pdf")){
            return new TypeSearch();
        }
        else{
            return null;
        }
    }
}
