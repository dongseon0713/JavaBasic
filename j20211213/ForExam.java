package j20211213;

import java.util.Scanner;

public class ForExam {
    public static void main(String[] args) {

        // "Line ?" 3
        // ***
        // ***
        // ***

        // "Line ?" 5
        // *****
        // *****
        // *****
        // *****
        // *****

        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Line ? ");

        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {

                System.out.print("*");

            }
            System.out.println("");
        }

    }
}
