package com.example.neuedaspringdb.repo;

import com.example.neuedaspringdb.entity.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IMusicRepo extends MongoRepository<Music, String> {

    @Query("{'name':'?0'}")
    Music findByName(String name);

    @Query(value = "{genre:'?0'}", fields = "{'name':1,'artists':1}")
    List<Music> findAll(String genre);

}