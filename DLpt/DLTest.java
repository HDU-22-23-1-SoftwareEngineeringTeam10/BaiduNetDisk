package com.baidu.DLpt;

import java.util.Scanner;

import com.baidu.DLpt.User;


public class DLTest {
    public static void main(String[] args) {

        User user = new  User("kumori",12345);

        System.out.println("input the file name or anything if u wanna dl from link");
        Scanner input = new Scanner(System.in);
        String FileName = input.next();

        System.out.println("input the link or anything if u wanna dl from disk");
        String link = input.next();

        System.out.println("input the password or anything if u wanna dl from disk");
        String password = input.next();

        DLFore dlfore = new DLFore(user, FileName, link, password);
        dlfore.DLAsk();

        input.close();

        System.out.println("dl mission accomplished");

        return;
    }
}
