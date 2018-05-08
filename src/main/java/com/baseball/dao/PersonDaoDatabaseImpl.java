package com.baseball.dao;

import com.baseball.dao.interfaces.PersonDao;
import com.baseball.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class PersonDaoDatabaseImpl implements PersonDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public PersonDaoDatabaseImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Person create(Person person) {

        String query = "INSERT INTO person (first_name, last_name, middle_name, height, weight, current_team_id) VALUES (?, ?, ?, ?, ?, ?)";


        Long teamId = null;

        if (person.getCurrentTeam() != null) {
            teamId = person.getCurrentTeam().getId();
        }



        jdbcTemplate.update(
                query,
                person.getFirstName(),
                person.getLastName(),
                person.getMiddleName(),
                person.getHeight(),
                person.getWeight(),
                teamId
        );


        Long insertedId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Long.class);

        person.setId(insertedId);


        return person;
    }

    @Override
    public Person read(Long id) {
        return null;
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public List<Person> getAll() {
        return null;
    }
}
