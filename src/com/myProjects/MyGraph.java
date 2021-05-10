package com.myProjects;




public class MyGraph {

    public static int x = 1;
    public static int rev = 0;

    public static void main(String[] args) {

        String s1 = new String("123");
        String s2 = new String("123");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        int s = doRev(124);
        System.out.println(s);

    }

    public static int doRev(int input){
        if(input > 0)
        {
            doRev(input/10);
            rev = rev + (input%10) * x;
            x=x*10;
        }
        return rev;
    }
}
