package com.example.Library.users;

import com.example.Library.users.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
   public interface UserRepo extends CrudRepository<UserDetails, Integer> {

        Iterable<UserDetails> findByPhoneNumber(Long phoneNumber);

        Iterable<UserDetails> findByName(String name);
    }

