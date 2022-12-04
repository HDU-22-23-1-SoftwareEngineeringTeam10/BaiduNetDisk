package com.baidu.Search;
import java.util.Scanner;
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入格式：");
        System.out.println("  关键字查找：***"+"\n"+"  文件类型查找：.***"+"\n"+"  修改日期查找：****/**/**"+"\n");
        System.out.print("请输入您要查找的文件信息：");

        String inf = sc.nextLine();

        SearchFactory shapeFactory = new SearchFactory();
        //获取Search的对象，并调用它的getFile()方法
        Search file = shapeFactory.getFile(inf);

        file.search();

    }
}
