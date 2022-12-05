
package com.baidu.DLpt;
import java.util.*;
import java.lang.constant.Constable;

public class DLlink extends DL { // its not only success DL
    public String link;
    public String password;

    public String getLink() {
        return link;
    }


    public String getPassword() {
        return this.password;
    }

    public DLlink(String link, String password) {
        this.link = link;
        this.password = password;
    }

    public void DL() {
        if (DLCheck.Check(this.link, this.password)) {
            System.out.println("DL failed.");
            return;
        }
        System.out.println("DL owari.");
        return;
    }
}
