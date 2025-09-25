import java.util.Scanner;
public class sumofdig {
        public static void main(String[] args) {
        int i; int sum; int dig;
        sum=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a 5 digit number: ");
        i=in.nextInt();
        while(i!=0){
            dig=i%10;
            sum=sum+dig;
            i=i/10;
        
        }
        System.out.println("The sum of the digits: "+sum);
    }
}
