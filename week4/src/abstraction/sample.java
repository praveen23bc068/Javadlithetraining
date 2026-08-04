package abstraction;

abstract class nsam{
    abstract  void cs_dept();
    void com_dept()
    {
        System.out.println("Student from com_dept");
    }
}
class Students extends nsam{

    @Override
    void cs_dept() {
        System.out.println("Student from com_dept");
    }
}
 public class sample{
    public static void main(String[] args)
    {
        Students s=new Students();
        s.cs_dept();
        s.com_dept();
    }
 }