package com.knoldus;

import java.util.logging.Logger;

public class MainClass {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {

        PhoneBook phoneBook = new PhoneBook();
        //Exercise-1
        Logger logger = Logger.getLogger(MainClass.class.getName());
        logger.info(String.valueOf(phoneBook.findPhoneByName("Anuradha")));

        //System.out.println(".......Exercise-1........");
       // System.out.println(phoneBook.findPhoneByName("Anuradha"));



        PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

        // Exercise-2
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPunishifNothingFound("Priya")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPunishifNothingFound("Rupa")));



        //System.out.println(".......Exercise-2........");
      //  System.out.println(phoneBookCrawler.findPhoneByNameAndPunishifNothingFound("Priya"));
        //  System.out.println(phoneBookCrawler.findPhoneByNameAndPunishifNothingFound("Rupa"));


        //Exercise-3
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFound("Anuradha")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFound("Aanchal")));


        //System.out.println(".......Exercise-3........");
       // System.out.println( phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFound("Anuradha"));
       // System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFound("Aanchal"));

        //Exercise-4

       logger.info(String.valueOf(phoneBookCrawler.checkPhoneByNameAndPrintHelloifNothingFound("Anuradha")));
       // System.out.println(".......Exercise-4........");
       // System.out.println( phoneBookCrawler.checkPhoneByNameAndPrintHelloifNothingFound("Anuradha"));


        //Exercise-5
       logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPunishifNothingFoundUsingStream("karishma")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPunishifNothingFoundUsingStream("Rahul")));


       // System.out.println(".......Exercise-5........");
      //System.out.println( phoneBookCrawler.findPhoneByNameAndPunishifNothingFoundUsingStream("karishma"));
       //System.out.println(phoneBookCrawler.findPhoneByNameAndPunishifNothingFoundUsingStream("Rahul"));


        //Exercise-6
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream("Anuradha")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream("Rupa")));

       // System.out.println(".......Exercise-6........");
        //System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream("Anuradha"));
       // System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream("Rupa"));

        //Exercise-7
        logger.info(String.valueOf(phoneBook.findNameByPhoneNumber("123456")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Meera","78965")));


       // System.out.println("-------Exercise-7---------");
        //System.out.println(phoneBook.findNameByPhoneNumber("123456"));
       // System.out.println(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Meera","78965"));



    }
}
