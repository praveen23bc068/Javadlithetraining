package polymorphism;

public class poly1 {
    void add(int a,int b){
        System.out.println("sum: "+(a+b));
    }
    void add(float a,float b){
        System.out.println("sum: "+(a+b));
    }
    void add(int a, int b,int c){
        System.out.println("sum: "+(a+b+c));
    }

    public static void main(String[] args){
        poly1 p=new poly1();
        p.add(10,20);
        p.add(10,20.86450f);
        p.add(10,20,30);
    }
}
