package pack;
import java.util.*;
import pack.cie.Internals;
import pack.cie.Personal;
import pack.see.External;

public class final{
   public static void main(String[] args){
        Personal[] student;
        int n;
        String u,na;
        int sm;
        double cg, sg;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of students: ");
        n=sc.nextInt();
        student= new Personal[n]; 
        External ext=new External();
        Internal inte=new Internal();
        for(int i=0;i<n;i++){
            u=sc.nextLine();
            na=sc.nextLine();
            sm=sc.nextInt();
            sg=sc.nextDouble();
            cg=sc.nextDouble();
            student[i]=Personal(u,na,sm,sg,cg);
            ext(u,na,sm,n);
            inte(n);
        }
        for(int i=0;i<n;i++){
            
        }
        
    }
}
 

