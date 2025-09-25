import java.util.*;
class quadratic{
        public static void main(String args[]){
            int a,b,c;
            double x1,x2;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter value of a: ");
            a=sc.nextInt();
            System.out.print("Enter value of b: ");
            b=sc.nextInt();
            System.out.print("Enter value of c: ");
            c=sc.nextInt();
            float D= (b*b)-4*a*c;
            if (D>0){
                x1=((-b+Math.pow(D,.5))/2*a);
                x2=((-b-Math.pow(D,.5))/2*a);
                System.out.println("The roots are real and are: "+x1+","+x2);
            }
            else if (D==0) {
                x1=((-b+Math.pow(D,.5))/2*a);
                System.out.println("The roots are equal and is: "+x1);
            }
            else{
                System.out.println("The roots are imaginary");
            }
        }
    }
