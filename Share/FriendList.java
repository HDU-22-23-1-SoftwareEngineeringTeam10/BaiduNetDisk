package Share;
import java.util.Scanner;

public class FriendList {
    public FriendList(){}
        void friendSelect(){
            String[] name = {"WZZ","MJC","RD","LJJ","LHT","ZYX"};
            int n = name.length;
            System.out.println("好友列表：");
            for(int i=0;i<n;i++){
                System.out.print(i+1 + "."+name[i] + "\n");
            }
            System.out.print("请选择您要分享的好友：");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();

            switch (choose) {
                case 1 -> System.out.println("分享对象：WZZ\n");
                case 2 -> System.out.println("分享对象：MJC\n");
                case 3 -> System.out.println("分享对象：RD\n");
                case 4 -> System.out.println("分享对象：LJJ\n");
                case 5 -> System.out.println("分享对象：LHT\n");
                case 6 -> System.out.println("分享对象：ZYX\n");
                default -> System.out.println("好友不存在！\n");
            }
        }
}
