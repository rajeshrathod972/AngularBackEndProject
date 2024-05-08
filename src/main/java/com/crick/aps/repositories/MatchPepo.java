package com.crick.aps.repositories;

import com.crick.aps.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchPepo extends JpaRepository<Match, Integer> {

    // match fetch karna chahta hoo-->
    //provide kar de ==> teamNmae

    Optional<Match> findByTeamHeading(String teamHeading);
}
