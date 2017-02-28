package com.study.mvcdemo.service.impl;

import com.study.mvcdemo.model.Person;
import com.study.mvcdemo.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * Created by paddy on 2017-2-27.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService{



    public Person getPerson() {

        Person person = new Person();
        person.setName("GuanPaddy");
        person.setAge(10);
        person.setSex("male");

        return person;
    }
}
