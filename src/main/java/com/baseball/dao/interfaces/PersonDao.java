package com.baseball.dao.interfaces;

import com.baseball.dto.Person;

import java.util.List;

public interface PersonDao {

    public Person create(Person person);
    public Person read(Long id);
    public void update(Person person);
    public void delete(Person person);
    public List<Person> getAll();


}
