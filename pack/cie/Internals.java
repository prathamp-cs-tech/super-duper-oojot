package pack.cie;

import java.util.Scanner;

public class Internals{
    public Internals(int n){
        int markcie[][];
        markcie=new int[n][5];
        Scanner sc= new Scanner(System.in);
        int item;
        for (int j=0;j<n;j++){
            for(int i=0;i<5;i++){
                item=sc.nextInt();
                markcie[i][j]=item;
            }
        }
        
    }
}
