package package1;


import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {



        emp e1=new emp(1,"Sam","IT",50000.0);
        emp e2=new emp(2,"Simon","Marketing",55000.0);
        emp e3=new emp(3,"Price","Marketing",10000.0);
        emp e4=new emp(4,"Gaz","Accountant",65000.0);
        emp e5=new emp(5,"Riley","Accountant",95000.0);

        ArrayList<emp> emp_list=new ArrayList<>();
        emp_list.add(e1);
        emp_list.add(e2);
        emp_list.add(e3);
        emp_list.add(e4);
        emp_list.add(e5);

        for(emp e:emp_list) {
               System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
        }
        ArrayList<String> s1=new ArrayList<>();
        s1.add("riya");
        s1.add("siya");
        s1.add("sham");
        s1.add("diya");
        s1.add("nidhi");
        System.out.println(s1);
        s1.stream().filter(k->k.startsWith("d")).forEach(k->System.out.println(k));
        s1.stream().map(String k->.toupper)

    }

}
