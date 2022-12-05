package com.baidu.DLpt;
import java.util.*;
public class DLFactory {
    private final String password;
    private final String link;
    String FileName;
    int choice;

    public DLFactory(String FileName, String link, String password, int choice) {
        this.FileName = FileName; // from disk and path
        this.link = link;
        this.password = password;
        this.choice = choice;
    }

    public DL GetDL() {
        DL dl = new DL();
        switch (choice) {
            case 1: {
                DL dlFromLink = new DLlink(link, password);
                System.out.println("mission created");
                return dlFromLink;
            }
            case 2: {
                DL dlFromDisk = new DLdisk(FileName);
                System.out.println("mission created");
                return dlFromDisk;
            }
        }
        return dl;
    }
}
