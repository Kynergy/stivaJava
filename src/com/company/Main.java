package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        File fisier = new File("input");
        File fisier2 = new File("output.txt");
        FileWriter writer = new FileWriter(fisier2);

        Scanner scanner = new Scanner(fisier);
        while(scanner.hasNextLine()){
            String Line = scanner.nextLine();
            double num = Double.parseDouble(Line);
            int intreg = (int)num;
            int zecimal = zecimale(num);
            writer.write(zecimal+ "; " + intreg + '\n');

        }
        writer.close();

    }


    public static int zecimale(Double x){
        String number =String.valueOf(x);
        System.out.println(number);
        String substring = number.substring(number.indexOf('.')+1);
        return Integer.parseInt(substring);

    }

}
