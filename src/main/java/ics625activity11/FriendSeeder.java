package ics625activity11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomco
 */
@Component
public class FriendSeeder implements CommandLineRunner{
     @Autowired
    private FriendService service;
    
    @Override
    public void run(String... args) throws Exception {
        service.add("Superman", "651-123-1234", "superman@gmail.com");
        service.add("Batman", "800-5687-6373", "brucewayne@outlook.com");
        service.add("Wolverine", "555-555-5555", "logan@xmen.com");
        service.add("Iron Man", "612-8667-7655", "ironman@starkindustries.com");

    }
}
