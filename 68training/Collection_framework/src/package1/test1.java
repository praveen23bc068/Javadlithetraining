package package1;

interface Nsam{
    void cal(int a,int b);
}
public class test1 {
   public static void main(String[] args){
        Nsam n =(int a,int b)->{
            System.out.println("Sum:"+(a+b));
        };
        n.cal(10,20);

        Nsam n1=(int x,int y)->{
            System.out.println("Product:"+(x*y));
        };
        n1.cal(10,20);
    }

}
