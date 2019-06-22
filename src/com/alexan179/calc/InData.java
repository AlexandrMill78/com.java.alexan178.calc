package com.alexan179.calc;

import java.util.Scanner;

public class InData {
    public String getingData(){
        System.out.println("Input data-calculation with 'space' (example: 55 + 6 = ):");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
}

