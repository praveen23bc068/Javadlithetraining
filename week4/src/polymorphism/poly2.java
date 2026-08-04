package polymorphism;


class Parent{
    void display(){
        System.out.println("From parent class");
    }
}

class child extends Parent{
    void display(){
        System.out.println("From child class");
    }
}
public class poly2 {
    public static void main(String[] args){
        Parent p=new child();
        p.display();

    }
}
