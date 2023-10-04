package com.example.Library.users;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


    @Data
    @Entity
    @Table(name= "userdetails")
    public class UserDetails {

        @Column
        public Integer Id;
        @Column
        private String name;

        @Id
        @Column
        private Long phoneNumber;
        @Column
        private String email;

        public UserDetails() {

        }

    }

