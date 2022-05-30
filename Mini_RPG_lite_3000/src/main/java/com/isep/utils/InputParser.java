package com.isep.utils;

import java.util.Scanner;

public class InputParser {
    Scanner sc = new Scanner(System.in);
    public String AskUser(String question){
        System.out.println(question);
        return sc.nextLine();
    }
    public Integer AskIntUser(String question){
        System.out.println(question);
        int unEntier = Integer.parseInt(sc.nextLine());
        return unEntier;
    }
}
