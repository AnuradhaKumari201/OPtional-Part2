package com.knoldus;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class PhoneBook {

    /**
     * Created map with name and phoneNumber as a key-value pair.
     */
   public final   Map<String, String> map = new HashMap<String, String>();
    {
        map.put("Anuradha", "123456");
        map.put("Priya", "879659");
        map.put("karishma", "78965");
    }

    PhoneBook() {


    }


    //Exercise-1
    /**
     * @param name
     * @return Phonenumber from name
     */
    public Optional<String> findPhoneByName(final String name) {

        return Optional.ofNullable(map.get(name));
    }


    /**
     * @param phoneNumber
     * @return name from phoneNumber
     */
    public Optional<String> findNameByPhoneNumber(final String phoneNumber) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return Optional.ofNullable(entry.getKey());
            }
        }
        return Optional.empty();


     }

    /**
     * @return PhonBook
     */
    public String toString() {
        return "PhoneBook{"  +  "map=" + map
                + '}';
    }
}







