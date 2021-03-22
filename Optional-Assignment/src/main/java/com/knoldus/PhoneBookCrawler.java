
package com.knoldus;

import java.util.Optional;
import java.util.stream.Collectors;



public class PhoneBookCrawler {

    /**
     *
     */
    private PhoneBook phoneBook;


    /**
     *
     * @param phoneBook
     */
    public PhoneBookCrawler(final PhoneBook phoneBook) {

        this.phoneBook = phoneBook;
    }

    /**
     *
     * @param name
     * @return phone with name else punish
     */

    //Exercise-2
    public Optional<String> findPhoneByNameAndPunishifNothingFound(final String name) {

        PhoneBook phbook = new PhoneBook();
        return Optional.ofNullable(phbook.findPhoneByName(name).orElse("No phone number found"));
    }

    //Exercise-3

    /**
     * @param name
     * @return phoneNumber with name and else Print phoneBook
     * */
    public String findPhoneByNameAndPrintPhoneBookifNothingFound(final String name) {

        return phoneBook.findPhoneByName(name).orElseGet(() -> phoneBook.toString());

    }


    //Exercise-4

    /**
     *
     * @return Hello
     */

    boolean checkHelloMessage() {

        return phoneBook.toString().equals("Hello");
    }

    /**
     *
     * @param name
     * @return phone from name else print Hello
     */
    public String checkPhoneByNameAndPrintHelloifNothingFound(final String name) {

        if (checkHelloMessage()) {

            return phoneBook.findPhoneByName(name).orElseGet(() -> phoneBook.toString());
        }


        return "Hello";

    }

    /**
     *
     * @param name
     * @return phoneNumber from name else punish
     */


    //Exercise -5
    public String findPhoneByNameAndPunishifNothingFoundUsingStream(final String name) {

        PhoneBook ph = new PhoneBook();
        String result = ph.map.entrySet().stream().filter(map -> name.equals(map.getKey())).map(i -> i.getValue()).collect(Collectors.joining());
         return result.equals("") ?  "Phone number is not found" : result;

    }


    //Exercise-6

    /**
     *
     * @param name
     * @return phoneNumber and else PhoneBook
     */
    public String findPhoneByNameAndPrintPhoneBookifNothingFoundUsingStream(final String name) {
        return phoneBook.map.entrySet().stream().filter(map -> name.equals(map.getKey())).map(i -> i.getValue()).collect(Collectors.joining());
    }

    //Exercise-7
    /**
     *
     * @param name
     * @param phoneNumber
     * @return phoneNumber by name else name by phoneNumber
     */


    public Optional<String> findPhoneNumberByNameOrNameByPhoneNumber(final String name, final String phoneNumber) {

        Optional<String> s = phoneBook.findPhoneByName(name);
         return s.isPresent() ?  s : phoneBook.findNameByPhoneNumber(phoneNumber);

     }


    /**
     *
     * @return PhoneBookCrawler
     */


    @Override
    public String toString() {
        return "PhoneBookCrawler{"
                +
                "phoneBook=" + phoneBook
                +
                '}';
    }
}
