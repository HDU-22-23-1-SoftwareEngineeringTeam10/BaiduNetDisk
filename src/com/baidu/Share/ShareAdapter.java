package com.baidu.Share;

public class ShareAdapter implements FileShare{
    ShareWay fileShare;

    public ShareAdapter(String shareType){
        if(shareType.equalsIgnoreCase("1")){
            fileShare = new ShareLocal();
        }
        else if(shareType.equalsIgnoreCase("2")){
            fileShare = new ShareNet();
        }
    }

    public void share(String shareType, String fileName){
        if(shareType.equalsIgnoreCase("1")){
            fileShare.localShare(fileName);
        }
        else if(shareType.equalsIgnoreCase("2")){
            fileShare.netShare(fileName);
        }
    }
}
