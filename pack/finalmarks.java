package pack;

import java.util.*;
import pack.cie.*;
import pack.see.*;

public class finalmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Personal[] students = new Personal[n];
        Internals internals = new Internals(n);

        System.out.println("Enter student details:");
        for (int i = 0; i < n; i++) {
            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();
            sc.nextLine();
            students[i] = new Personal(usn, name, sem);
        }

        External externals = new External("", "", 0, n);

        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < n; i++) {
            students[i].display();
            for (int j = 0; j < 5; j++) {
                int total = internals.internalMarks[i][j] + externals.seeMarks[i][j];
                System.out.println("Subject " + (j + 1) + ": " + total);
            }
            System.out.println();
        }
    }
}