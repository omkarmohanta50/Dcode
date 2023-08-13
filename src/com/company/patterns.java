package com.company;

public class patterns {
    public static void main(String[] args) {
        patterns28(5);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row run how many column
            for (int col = 1; col < n; col++) {
                System.out.print("* ");
            }
            // when one row is printed, print a new line
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row run how many column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, print a new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = n; row >= 1; row--) {

            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patterns4(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void patterns5(int n) {
        for (int row = 0; row < 2*n; row++) {
            int noofcol = row>n ? 2 * n - row :row;
            for (int col = 0; col < noofcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns28(int n) {
        for (int row = 0; row < 2*n; row++) {
            int noofcol = row>n ? 2 * n - row :row;

            int noofspace = n-noofcol;
            for (int s = 0; s < noofspace; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < noofcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
