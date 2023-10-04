package com.example.Library.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping( "api/t1")

    public class UserController {


        @Autowired
        UserRepo userRepo;


    @GetMapping("/name")
        public Iterable<UserDetails>getUserDetails(String name){
            return userRepo.findByName(name);
        }

    @GetMapping("/phoneNumber")
        public Iterable<UserDetails>getUserDetails(Long phoneNumber){
            return userRepo.findByPhoneNumber(phoneNumber);
        }

        @GetMapping ("/find")
       public Iterable<UserDetails>getUserDetails(){
          return userRepo.findAll();
        }

        @PostMapping("/add")
        public void addUser(UserDetails userDetails){
         userRepo.save(userDetails);
        }

        @PutMapping("/update")
        public void updateUser(UserDetails userDetails){
            userRepo.save(userDetails);

        }
        @DeleteMapping("/delete")
        public void deleteUser(UserDetails userDetails){
           userRepo.deleteById(userDetails.Id);
        }
    }

