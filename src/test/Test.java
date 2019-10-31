package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入数：");
        String s= String.valueOf(sc.nextInt());
        String x="";
        for(int i=s.length()-1;i>=0;i--){
            x+=s.charAt(i);
        }
        if (x.equals(s)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
