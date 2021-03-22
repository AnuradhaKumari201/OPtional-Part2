package com.knoldus;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookCrawlerTest {
    //Exercise-1
    @Test
    public  void  findPhoneByName() {
        PhoneBook phoneBook = new PhoneBook();
        Assert.assertEquals(Optional.of("123456"), phoneBook.findPhoneByName("Anuradha"));

    }
        @Test
        public void findPhoneByNameTestForThoseValueDoesNotExist(){
            PhoneBook obj = new PhoneBook();
            Assert.assertEquals(Optional.empty(), obj.findPhoneByName("Rupa"));

        }

        //Exercise-2
    @Test
    public void findPhoneByNameAndPunishifNothingFoundTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals(Optional.of("123456"), obj.findPhoneByNameAndPunishifNothingFound("Anuradha"));
    }


    //Exercise-3
    @Test
    public void findPhoneByNameAndPrintPhoneBookifNothingFoundTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals("78965", obj.findPhoneByNameAndPrintPhoneBookifNothingFound("karishma"));
    }

    @Test
    public void findByNameAndPrintPhoneBookifNothingFoundTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals("PhoneBook{map={Anuradha=123456, Priya=879659, karishma=78965}}", obj.findPhoneByNameAndPrintPhoneBookifNothingFound("Rupa"));
    }

    //Exercise-4
    @Test
    public void checkPhoneByNameAndPrintPhoneBookifNothingFoundTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals("Hello", obj.checkPhoneByNameAndPrintHelloifNothingFound("Rupa"));
    }

    //Exercise-5
    @Test
    public void findPhoneByNameAndPunishifNothingFoundUsingStreamTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals("123456", obj.findPhoneByNameAndPrintPhoneBookifNothingFound("Anuradha"));
    }
    @Test
    public void findByNameAndPunishifNothingFoundUsingStreamTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals("Phone number is not found", obj.findPhoneByNameAndPunishifNothingFoundUsingStream(""));
    }

    //Exercise-6
    @Test
    public void findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals("123456", obj.findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream("Anuradha"));
        Assert.assertEquals("PhoneBook{map={Anuradha=123456, Priya=879659, karishma=78965}}",obj.findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream("Rupa"));
    }

    //Exercise-7
    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumberTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals( Optional.of("123456"), obj.findPhoneNumberByNameOrNameByPhoneNumber("Anuradha","123456"));
    }

    @Test
    public void findNumberByNameOrNameByPhoneNumberTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        Assert.assertEquals( Optional.of("Anuradha"), obj.findPhoneNumberByNameOrNameByPhoneNumber("Rupa","123456"));
    }
















}


