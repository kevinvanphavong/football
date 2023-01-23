package com.example.football.repository;

import com.example.football.pojos.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends CrudRepository<Journey, Long> {

    Iterable<Journey> findJourneysByLeague(League league);
}