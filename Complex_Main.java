import java.util.Scanner;
public class Complex_Main {
    public static void main(String[] args) {
        int ch=-1;  //for choice to continue
        do {
            int real, img;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number");
            System.out.println("Enter real part:");
            real = sc.nextInt();
            System.out.println("Enter img part:");
            img = sc.nextInt();
            ComplexNumber c1 = new ComplexNumber(real, img);
            c1.display();

            System.out.println("Enter second number");
            System.out.println("Enter real part:");
            real = sc.nextInt();
            System.out.println("Enter img part:");
            img = sc.nextInt();
            ComplexNumber c2 = new ComplexNumber(real, img);
            c2.display();

            ComplexNumber c3 = new ComplexNumber();  //default constructor object

            System.out.println("Select the operation you want to perform:");
            System.out.println("1.ADD THE TWO COMPLEX NUMBER");
            System.out.println("2.SUBTRACT THE TWO COMPLEX NUMBER");
            System.out.println("3.MULTIPLY THE TWO COMPLEX NUMBER");
            System.out.println("4.DIVIDE THE TWO COMPLEX NUMBER");

            System.out.println("Enter your choice:");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    c3.add(c1, c2);
                    c3.display();
                    break;

                case 2:
                    c3.sub(c1, c2);
                    c3.display();
                    break;
                case 3:
                    c3.multiply(c1,c2);
                    c3.display();
                    break;
                case 4:
                    c3.divide(c1,c2);
                    c3.display();
                    break;
            }
            System.out.println("Do you wish to continue (YES =1 ; NO =0) ");
            System.out.println("Enter choice :");
            ch=sc.nextInt();
        }while(ch==1);
    }
}