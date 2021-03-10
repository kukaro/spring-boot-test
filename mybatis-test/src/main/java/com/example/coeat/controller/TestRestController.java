package com.example.coeat.controller;

import com.example.coeat.dao.PersonDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    private final PersonDao personDao;

    public TestRestController(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping(value = "/person/list")
    public String list(){
        return this.personDao.selectPersonALl().toString();
    }

    @GetMapping(value = "/person/test")
    public String test(){
        return "PERSON TEST!!";
    }

    @GetMapping(value = "/person/dao")
    public String dao(){
        return personDao.toString();
    }
}
