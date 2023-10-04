package com.example.Library.Admin;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "adminpage")

public class AdminDetails {

    @Id
    int id;
    @Column
    String name;

    public AdminDetails() {

    }
}
