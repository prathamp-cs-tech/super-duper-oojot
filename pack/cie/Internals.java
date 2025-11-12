package pack.cie;

import java.util.Scanner;

public class Internals {
    public int[][] internalMarks;

    public Internals(int n) {
        internalMarks = new int[n][5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter internal marks for " + n + " students (5 subjects each):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                internalMarks[i][j] = sc.nextInt();
            }
        }
    }
}