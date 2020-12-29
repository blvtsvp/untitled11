package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();
	int d = in.nextInt();
	int min1, min2 = -1;
	if(a > b) min1 = b;
	else min1 = a;
	if(c > d) min2 = d;
	else min2 = c;
	if(min1 > min2) System.out.println("Maximum = "+min1);
	else System.out.println("Maximum = "+min2);
    }
}
