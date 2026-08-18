package exception;

public class exception1 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int a = 10;
        int b = 2;
        try {
            System.out.println(a / b);
        //    System.out.println("Hiii");
        } catch (ArithmeticException e) {
            System.out.println("You can divide a number by zero");
        }
//        System.out.println("hiii");
    finally{
        System.out.println("Hi class");
        }
////        Null Pointer Exception
//        String a="";
//        System.out.println(a.length());
//
//        //Array Index out of bound exception
//        int arr[]={10,20,30};
//        System.out.println(arr[5]);
    }
}
