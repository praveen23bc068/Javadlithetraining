package inheritance;

class GrandParent{
    int x=30;
}

class Parent extends GrandParent{
    int a=10;
}

class child extends Parent{
    int b=20;
}
public class sample_single_level {
    public static void main(String[] args) {
        child c=new child();
        System.out.println(c.b);
        System.out.println(c.a);
        Parent p=new Parent();
        System.out.println(p.x);
    }
}
