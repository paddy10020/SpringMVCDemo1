package com.study.mvcdemo.service;

import com.study.mvcdemo.model.Person;
import org.springframework.stereotype.Service;

/**
 * Created by paddy on 2017-2-27.
 */
@Service
public interface PersonService {
    public Person getPerson();
}
