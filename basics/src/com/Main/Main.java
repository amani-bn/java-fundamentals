package com.Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        pluralize("cat", 4);
        pluralize("dog", 1);
        flipNHeads(1);
        clock();

    } // end main()


    public static void pluralize(String s, int num) {
        if (num == 0 || num > 1) {
            System.out.println("I own " + num + " " + s + "s");
        } // end if
        else {
            System.out.println("I own " + num + " " + s);

        } // end else

    } // end pluralize()

    public static void flipNHeads(int n) {
        int count = 0;
        int heads = 0;
        double rand;
        while (heads<n) {
            rand=Math.random();
            count ++;
            if (rand > 0.5){
                System.out.println("heads");
                heads++;
            }// end if
            else {
                System.out.println("tials");
                heads=0;

            }// end else
        }// end while
        System.out.println("it took "+count+" flips to flip "+n+" in a rows");

    }// end flipNHeads()

    public static void clock(){
        LocalDateTime now = LocalDateTime.now();
        int sec=now.getSecond();
        int sec1=0;
//        System.out.println(now.getSecond());
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatDateTime = now.format(format);
        while (true) {
            now = LocalDateTime.now();
            formatDateTime = now.format(format);
            sec=now.getSecond();
           if (sec == sec1) {

               continue;

            }

            System.out.println(formatDateTime);
            sec1=sec;
        }

    }//end clock()

} // end class
