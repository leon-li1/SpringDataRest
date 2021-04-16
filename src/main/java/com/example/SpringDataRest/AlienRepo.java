package com.example.SpringDataRest;

import com.example.SpringDataRest.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "alien", path = "alien")
public interface AlienRepo extends JpaRepository<Alien, Integer> {
}
