
package com.baidu.DLpt;
import java.util.*;
public class DLdisk extends DL {
    public String FileName;

    public DLdisk(String FileName) {
        this.FileName = FileName;
    }

    public String getFileName() {
        return FileName;
    }

    public void DL() {
        System.out.println("DL owari.");
        return;
    }
}
