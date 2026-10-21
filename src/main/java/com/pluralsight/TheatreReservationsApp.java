package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservationsApp {

    public static void main(String[] args) {

        //we need this scanner to get input from the user
        Scanner sc = new Scanner(System.in);

        //ask the user to povide their name
        System.out.print("Please enter your name: ");

        //store the answer to the question
        String name = sc.nextLine().trim();

        //ask them for the date
        System.out.println("What date will you be coming (MM/dd/yyyy): ");

        //store the answer to the above question
        String date = sc.nextLine().trim();

        //ask how many tickets
        System.out.println("How many tickets would you like?");

        //store the answer to the
        int tickets = sc.nextInt();

        //raymond said we need to split the name because we need to work with the first and last name separately
        String[] nameSplit = name.split(" ");

        //get a variable to hold the first and last names
        String firstName = nameSplit[0];
        String lastName = nameSplit[1];

        //create a date out of the date they gave us
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //create a out of the date format they gave us
        LocalDate parsedDateOfEvent =  LocalDate.parse(date, dateFormat);

        //figure out plural signal
      //  String sOrNoS = (tickets == 1) ? "ticket" : "tickets";

        String sOrNoS;
        if(tickets == 1) {
            sOrNoS = "ticket";
        }else {
            sOrNoS = "tickets";
        }

        //print out the output
        System.out.println(tickets + " " + sOrNoS + " reserved for " + parsedDateOfEvent + " under " + lastName + ", " + firstName);


    }


}
