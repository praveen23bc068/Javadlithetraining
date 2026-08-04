package interfaces;

import javax.lang.model.element.Name;

interface nsam
{
    void cs_dept();
    void com_dept();
    void math_dept();
    void language_dept();

}

class Student implements nsam {
    @Override
    public void cs_dept() {
        System.out.println("Students from cs_dept");
    }

    @Override
    public void com_dept() {
        System.out.println("Students from com_dept");

    }

    @Override
    public void math_dept() {
        System.out.println("Students from math_dept");

    }

    @Override
    public void language_dept() {
        System.out.println("Students from language_dept");
    }

}
