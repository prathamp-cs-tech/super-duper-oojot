import java.util.Scanner;
class max3{
    public static void main(String arg[]){
        int i; int j; int k;
        Scanner in= new Scanner(System.in);
        System.out.print("enter first number:");
        i=in.nextInt();
        System.out.print("enter second number:");
        j=in.nextInt();
        System.out.print("enter third number:");
        k=in.nextInt();
        if (i>j && i>k) System.out.println("The greatest number is: "+i);
        if (j>i && j>k) System.out.println("The greatest number is: "+j);
        if (k>i && k>j) System.out.println("The greatest number is: "+k);
    }
}