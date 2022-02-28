package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public char ceaserEncrypt(int cypher, char bogstav){
        int encryption = bogstav - 'a'+cypher;
        if(encryption>25) {
            encryption=encryption-26;
        }
        char krypteret = (char)(encryption+'a');
        return krypteret;
    }
        //Mellemrum virker nok ikke
    public StringBuilder ceaserEncString(String besked){
        StringBuilder text = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        besked = besked.toLowerCase(Locale.ROOT);
        System.out.println("Indtast dit cypher-tal");   // Kun positive tal
        int cypherTal = sc.nextInt();
        for (int i =0;i<besked.length();i++ ){
            text.append(ceaserEncrypt(cypherTal,besked.charAt(i)));
        }
        return text;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        StringBuilder text = obj.ceaserEncString("KaGe");
        System.out.println(text);
    }
}
