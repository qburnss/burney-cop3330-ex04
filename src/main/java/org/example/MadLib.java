/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){
        System.out.println("Enter a noun:");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
        System.out.println("Enter a verb:");
        Scanner scanner1 = new Scanner(System.in);
        String verb = scanner1.nextLine();
        System.out.println("Enter an adjective:");
        Scanner scanner2 = new Scanner(System.in);
        String adjective = scanner2.nextLine();
        System.out.println("Enter an adverb:");
        Scanner scanner3 = new Scanner(System.in);
        String adverb = scanner3.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " "+ adverb + "?");

    }
}
