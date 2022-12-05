package com.baidu.uploadth;


public class UploadFactory {
    String FileName;
    int select;
    public UploadFactory(String FileName,int select){
        this.FileName = FileName;
        this.select = select;
    }
    public Upload GetUpload(){
        Upload upload = new Upload();
        switch(select){
            case 1:{
                Upload upload1 = new Documentation(FileName);
                System.out.println("上传文档:"+FileName);
                return upload1;
            }
            case 2:{
                Upload upload2 = new Video(FileName);
                System.out.println("上传视频："+FileName);
                return upload2;
            }
            case 3:{
                Upload upload3 = new Audio(FileName);
                System.out.println("上传音频："+FileName);
                return upload3;
            }
            case 4:{
                Upload upload4 = new Photo(FileName);
                System.out.println("上传图片："+FileName);
                return upload4;
            }
            default:{
                System.out.println("选择类型错误,上传失败！");
                break;
            }
        }
        return upload;
    }
}
