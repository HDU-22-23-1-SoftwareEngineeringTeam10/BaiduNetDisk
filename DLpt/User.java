
package com.baidu.DLpt;
import java.util.*;
public class User {
    int ID;
    String Name;
    int Authority; // normal person or importent person
    String Intro;

    List<String> FileName = new ArrayList<String>();

    public User(String Name, int ID) {
        this.Name = Name;
        this.ID = ID;

        this.otherInit();
    }

    private void otherInit(){
        this.Authority = 0;
    }

    public void changeAuthority(int res) { // 2out

        this.changeAuthorityIn(res);
    }

    private void changeAuthorityIn(int flag) { // 2in
        if (flag == 1)
            this.Authority = 1;
        else if (flag == 0)
            this.Authority = 0;
        return;
    }

    public void setIntro(String Intro) {
        this.Intro = Intro;
    }

    public void setUserName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public int getAuthority() {
        return this.Authority;
    }

    public String getUserIntro() {
        return Intro;
    }
}
