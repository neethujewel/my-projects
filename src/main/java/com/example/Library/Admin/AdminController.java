package com.example.Library.Admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/w1")


public class AdminController {

   @Autowired
   AdminRepo adminRepo;

    @GetMapping("/id")
    public Iterable<AdminDetails> getAdminDetails(int id){
        return adminRepo.findById(id);
    }
    @GetMapping("/name")
    public Iterable<AdminDetails>getAdminDetails(String name){
        return adminRepo.findByName(name);
    }
    @GetMapping("/find")
    public Iterable<AdminDetails>getAdminDetails(){
        return adminRepo.findAll();
    }

    @PostMapping("/new")
    public void addAdmin(AdminDetails adminDetails){
        adminRepo.save(adminDetails);
    }

    @PutMapping("/edit")
    public void editAdmin(AdminDetails adminDetails){
        adminRepo.save(adminDetails);
    }
    @DeleteMapping("/remove")
    public void deleteAdmin(AdminDetails adminDetails){
        adminRepo.deleteById(adminDetails.id);
    }
}
