/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics625activity11;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tomco
 */
@RestController
public class FriendController {
    
    @Autowired
    private FriendService service;
    
    @GetMapping("/friends")
    public List<Friend> get(){
        return service.get();
    }
    
    @GetMapping("/friends/{id}")
    public Friend get(@PathVariable long id){
        return service.get(id);
    }
    
    @PostMapping("/friends")
    public Friend add(@RequestBody Friend f){
        return service.add(f.getName(), f.getPhoneNumber(), f.getEmail());
    }    
    
    @DeleteMapping("/friends/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
    @PutMapping("/friends/{id}")
    public Friend update(@PathVariable long id, 
                            @RequestBody Friend f){
        return service.update(id, f.getName(), f.getPhoneNumber(), f.getEmail());
    }
}
