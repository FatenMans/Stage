package com.example.Stage.Repository;

import com.example.Stage.Entites.Vehicule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepository extends MongoRepository<Vehicule, String> {
}
