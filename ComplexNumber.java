public class ComplexNumber
{

    int real,img;
    ComplexNumber() //default constructor
    {
        real=0;
        img=0;
    }

    ComplexNumber(int real,int img) //paramterized constructor
    {
        this.real=real;
        this.img=img;
    }

    public void add(ComplexNumber x,ComplexNumber y)
    {
        real = x.real + y.real;
        img = x.img + y.img;
    }

    public void sub(ComplexNumber x,ComplexNumber y)
    {
        real = x.real - y.real;
        img = x.img - y.img;
    }

    public void multiply(ComplexNumber x,ComplexNumber y)
    {
        real = x.real*y.real - x.img*y.img;
        img = x.real*y.img + y.real*x.img;
    }

    public void divide(ComplexNumber x,ComplexNumber y)
    {
        real = (x.real*y.real +x.img*y.img)/(y.real*y.real + y.img*y.img);
        img = (x.img*y.real - x.real*y.img)/(y.real*y.real + y.img*y.img);
    }

    public void display()
    {
        System.out.println(real + "+" + img + "i");
    }
}
