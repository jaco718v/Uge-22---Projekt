package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public char ceaserCrypt(int cypher, char bogstav){
        char krypteret = bogstav;
        if(bogstav !=' '){
        int encryption = bogstav - 'a'+cypher;
        if(encryption>25) {
            encryption=encryption-26;
        }
        else if (encryption<0){
            encryption=encryption+26;
        }
        krypteret = (char)(encryption+'a');}
        return krypteret;
    }

    public StringBuilder ceaserEncString(String besked){
        StringBuilder text = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        besked = besked.toUpperCase(Locale.ROOT);
        System.out.println("Indtast dit cypher-tal");
        int cypherTal = sc.nextInt();
        for (int i =0;i<besked.length();i++ ){
            text.append(ceaserCrypt(cypherTal,besked.charAt(i)));
        }
        return text;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        StringBuilder text = obj.ceaserEncString("Ka Ge");
        System.out.println(text);
    }
}
