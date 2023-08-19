package com.example.Stage.Repository;

import com.example.Stage.Entites.Appreil;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppreilRepository extends MongoRepository<Appreil, String> {
}

