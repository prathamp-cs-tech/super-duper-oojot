package pack.see;

import java.util.*;
import pack.cie.Personal;

public class External extends Personal{
    public External(String u,String n,int sm, int no){
        super(u,n,sm);
        int[][] marksee;
        marksee=new int[no][5];
        Scanner sc= new Scanner(System.in);
        int item;
        for(int j=0;j<no;j++){
            for (int i=0; i<5;i++){
                item=sc.nextInt();
                marksee[j][i]=item;
            }
        }
    }
}

