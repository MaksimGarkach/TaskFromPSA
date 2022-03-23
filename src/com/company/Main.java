package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir");

        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter CSV file name");
        String fileName = in.nextLine();
        System.out.println("Please, enter coloumn name");
        String coloumnName = in.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(path + '\\' + fileName + ".csv"));

        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = reader.readLine()) != null) {
            sb.append(s + "\n");
        }

        PSATest test = new PSATest();
        System.out.println(test.solution(sb.toString(), coloumnName));

        reader.close();
    }
}
