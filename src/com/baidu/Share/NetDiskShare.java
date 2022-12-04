package com.baidu.Share;

public class NetDiskShare implements FileShare{
    ShareAdapter shareAdapter;

    public void share(String shareType, String fileName){
        if (shareType.equalsIgnoreCase("3")){
            System.out.println("取消分享!");
        }
        else if(shareType.equalsIgnoreCase("1")||shareType.equalsIgnoreCase("2")){
            shareAdapter = new ShareAdapter(shareType);
            shareAdapter.share(shareType, fileName);
        }
        else{
            System.out.println("Error!");
        }
    }
}
