package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public char caesarCypher(int cypherShift, char bogstav){
        char krypteret = bogstav;
        if(bogstav !=' '){
        char encryption = (char)(bogstav+cypherShift);
        if(encryption>'Z') {
            encryption=(char)(encryption-26);
            }
        else if (encryption<'A'){
            encryption=(char)(encryption+26);
            }
        krypteret = (encryption);
        }
        return krypteret;
    }

    public StringBuilder caesarCypherString(String inputString, int cypherTal){
        StringBuilder text = new StringBuilder();
        inputString = inputString.toUpperCase(Locale.ROOT);
        for (int i =0;i<inputString.length();i++ ){
            text.append(caesarCypher(cypherTal,inputString.charAt(i)));
        }
        return text;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast det der skal krypteres/dekrypteres");
        String inputString = sc.next();
        System.out.println("Indtast cypher tal");
        int cypherTal = sc.nextInt();
        StringBuilder text = obj.caesarCypherString(inputString,cypherTal);
        System.out.println(text);
    }
}
