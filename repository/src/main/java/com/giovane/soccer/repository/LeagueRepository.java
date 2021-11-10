package com.giovane.soccer.repository;

import com.giovane.soccer.model.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends JpaRepository<League, Integer> {

}
