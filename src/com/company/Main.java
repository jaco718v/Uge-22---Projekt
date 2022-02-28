package com.company;

public class Main {

    public char ceaserEncrypt(int cypher, char bogstav){
        int encryption = bogstav - 'a'+cypher;
        if(encryption>25) {
            encryption=encryption-26;
        }
        char krypteret = (char)(encryption+'a');
        System.out.println(krypteret);
        return krypteret;
    }

    public String ceaserString(String besked){
        
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.ceaserEncrypt(1,'z');
        System.out.println();
    }
}
