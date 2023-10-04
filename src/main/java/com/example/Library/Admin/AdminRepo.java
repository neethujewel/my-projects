package com.example.Library.Admin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AdminRepo extends CrudRepository <AdminDetails, Integer>{


    Iterable<AdminDetails> findById(int id);


    Iterable<AdminDetails> findByName(String name);
}
