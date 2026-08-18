package list;

import java.util.ArrayList;
import java.util.Iterator;

public class isample {
    public static void main(String[] args){
        ArrayList<String> a= new ArrayList();
        System.out.println(a);

        a.add("Mumbai");
        a.add("Banglore");
        a.add("Mumbai");
        a.add("Mumbai");
        System.out.println(a);
        a.add(1,"hyd");
        System.out.println(a);

        a.remove("hyd");
        System.out.println(a.indexOf(("Mumbai")));
        System.out.println(a.lastIndexOf("Mumbai"));
        System.out.println(0);
        System.out.println(a.set(1,"Banglore"));
        System.out.println(a.subList(1,4));

        System.out.println("Elements of list:"+a);
        System.out.println("Using for  loop");
        for (int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }


        //do for each loop

        //iterator interface
        System.out.println("Using iterator interface");
        Iterator<String> i=a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }




    }
}
