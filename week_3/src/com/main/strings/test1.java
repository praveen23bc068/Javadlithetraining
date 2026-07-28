package com.main.strings;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args)
    {
        //mutable strings
        StringBuffer s1= new StringBuffer("Batchb2");
        System.out.println(s1);
        StringBuffer s2= new StringBuffer("Batchb3");
        System.out.println(s2);

        //insert ,replace(),delete(),reverse() uppend()
        s2.append("NSAM");
        System.out.println(s2);
        s2.insert(2, "ABCD");
        s2.replace(3, 6,"xyz");
        System.out.println(s2);

        s2.delete(1,5);
        System.out.println(s2);

        s2.reverse();
        System.out.println(s2);


        String x="Java";
        String y="Java";
        System.out.println(x==y);


        String p=new String("JAVA");
        String q=new String("JAVA");
        System.out.println(p==q);


        String z="RajaMohanRoy";
        System.out.println(z.charAt(5));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf("R"));
        System.out.println(z.lastIndexOf("R"));
        String a="nsam";
        String b="nsam";

        System.out.println(a.equalsIgnoreCase(b));
        char arr[]=z.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
