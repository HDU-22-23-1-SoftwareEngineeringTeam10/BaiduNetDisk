
package com.baidu.DLpt;
import java.util.*;
import javax.swing.plaf.synth.SynthUI;

public class DLFore {
    User user;
    String FileName;
    String password;
    String link;
    int choice;

    public DLFore( User user, String FileName, String link, String password){
        this.user = user;
        this.FileName = FileName;
        this.link=link;
        this.password=password;
    }

    public void DLAsk() {
        System.out.println("Plz select the way of dl:");
        System.out.println("1. from link");
        System.out.println("2. from self netdisk");

        Scanner scanner = new Scanner(System.in);
        this.choice = scanner.nextInt();
        scanner.close();

        DLFactory DLFactory = new DLFactory(FileName, link, password, choice);
        user.FileName.add(DLFactory.FileName);
        DLFactory.GetDL();
    }
}
