
package com.knoldus;

import java.util.logging.Logger;

 public class MainClass {

    /**
     * @param args
     */
    public static void main(String args[]) {

        PhoneBook phoneBook = new PhoneBook();
        //Exercise-1
        Logger logger = Logger.getLogger(MainClass.class.getName());
        logger.info(String.valueOf(phoneBook.findPhoneByName("karishma")));


        PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler();

        // Exercise-2
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPunishifNothingFound("Priya")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPunishifNothingFound("Rupa")));



        //Exercise-3
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFound("Anuradha")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFound("Aanchal")));



        //Exercise-4

       logger.info(String.valueOf(phoneBookCrawler.checkPhoneByNameAndPrintHelloifNothingFound("Priya")));



        //Exercise-5
       logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPunishifNothingFoundUsingStream("karishma")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPunishifNothingFoundUsingStream("Rahul")));




        //Exercise-6
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream("Anuradha")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream("Rupa")));


        //Exercise-7
        logger.info(String.valueOf(phoneBook.findNameByPhoneNumber("123456")));
        logger.info(String.valueOf(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Meera", "78965")));


    }
}
