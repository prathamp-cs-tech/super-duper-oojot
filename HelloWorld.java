import java.util.Scanner;
class HelloWorld {
    public static void main(String arg[]){
        int i; String s; float f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s=in.nextLine();
        System.out.println("The entered string is: "+s);
        System.out.print("Enter an Int: ");
        i=in.nextInt();
        System.out.println("The entered integer is: "+i);
        System.out.print("Enter a Float: ");
        f=in.nextFloat();
        System.out.println("The entered float is: "+f);
    }    
}
