package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public char caeserCypher(int cypher, char bogstav){
        char krypteret = bogstav;
        if(bogstav !=' '){
        int encryption = bogstav - 'A'+cypher;
        if(encryption>25) {
            encryption=encryption-26;
        }
        else if (encryption<0){
            encryption=encryption+26;
        }
        krypteret = (char)(encryption+'A');}
        return krypteret;
    }

    public StringBuilder caeserCypherString(String inputString, int cypherTal){
        StringBuilder text = new StringBuilder();
        inputString = inputString.toUpperCase(Locale.ROOT);
        System.out.println("Indtast dit cypher-tal");
        cypherTal = sc.nextInt();
        for (int i =0;i<inputString.length();i++ ){
            text.append(caeserCypher(cypherTal,inputString.charAt(i)));
        }
        return text;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Indtast det der skal krypteres/afkrypteres");
        String inputString = obj.sc.next();
        System.out.println("Indtast cypher tal");
        int cypherTal = obj.sc.nextInt();
        StringBuilder text = obj.caeserCypherString(inputString,cypherTal);
        System.out.println(text);
    }
}
