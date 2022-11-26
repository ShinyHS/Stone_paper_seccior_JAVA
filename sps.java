import java.util.Random;
import java.util.Scanner;
import java.lang.*;
class user{
    Scanner sc=new Scanner(System.in);
    String uc;
    public void userget() {
        System.out.println("enter your choise\n1.stone\n2.paper\n3.seccior");
        this.uc=sc.next();
    }
}
class rond extends user{
    Random ran=new Random();
    String st;
    public void rondoms() {
        String str[]= new String[]{"stone","paper","seccior"};
        int x=ran.nextInt(3);
        st=str[x];
    }
    public void check() {
        System.out.println("User selection :"+uc);
        System.out.println("Computer selection :"+st);
        System.out.println("-----------------------");
        if(uc.equals(st))
        {
            System.out.println("match die");
        }
        if(uc.equals("stone") && st.equals("paper"))
        {
            System.out.println("computer win");
        }
        if(uc.equals("stone") && st.equals("seccior"))
        {
            System.out.println("user win");
        }
        if(uc.equals("paper") && st.equals("seccior"))
        {
            System.out.println("computer win");
        }
        if(uc.equals("paper") && st.equals("stone"))
        {
            System.out.println("user win");
        }
        if(uc.equals("seccior") && st.equals("paper"))
        {
            System.out.println("user win");
        }
        if(uc.equals("seccior") && st.equals("stone"))
        {
            System.out.println("computer win");
        }
    }
}
class sps{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        rond obj =new rond();
       while(true)
       {
            System.out.println("1.play\n2.exit");
            int x=sc.nextInt();
            switch (x) {
                case 1:
                obj.userget();
                obj.rondoms();
                obj.check();
                break;
                case 2:
                System.out.println("exit....");
                System.exit(0);
                //return;
                break;
            }
       }
       
    }
}