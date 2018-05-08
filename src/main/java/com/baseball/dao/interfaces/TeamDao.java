package com.baseball.dao.interfaces;

import com.baseball.dto.Person;
import com.baseball.dto.Team;

import java.util.List;

public interface TeamDao {

    public Team create(Team team);
    public Team read(Long id);
    public void update(Team team);
    public void delete(Team team);
    public List<Team> getAll();


}
