package pack.see;

import java.util.Scanner;
import pack.cie.Personal;

public class External extends Personal {
    public int[][] seeMarks;

    public External(String u, String n, int s, int nStudents) {
        super(u, n, s);
        seeMarks = new int[nStudents][5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SEE marks for " + nStudents + " students (5 subjects each):");
        for (int i = 0; i < nStudents; i++) {
            for (int j = 0; j < 5; j++) {
                seeMarks[i][j] = sc.nextInt();
            }
        }
    }
}
