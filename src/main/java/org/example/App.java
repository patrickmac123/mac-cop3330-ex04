package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 4 Solution
 *  Copyright 2021 Patrick Mac
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner x = new Scanner(System.in);
        System.out.print( "Enter a noun: " );
        String noun = x.nextLine();
        System.out.print( "Enter a verb: " );
        String verb = x.nextLine();
        System.out.print( "Enter a adjective: " );
        String adjective = x.nextLine();
        System.out.print( "Enter a adverb: " );
        String adverb = x.nextLine();
        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!");
    }
}