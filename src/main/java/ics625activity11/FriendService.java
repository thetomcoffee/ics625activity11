/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics625activity11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author tomco
 */
@Service
public class FriendService {
     private int curId = 0;
     
     private Map<Long, Friend> data = new HashMap<>();
    
    public Friend get(long id){
        if (data.containsKey(id))
            return data.get(id);
        throw new FriendNotFoundException(id);
    }
    
    public List<Friend> get(){
        List<Friend> all = new ArrayList<>();
        data.values().forEach(all::add);
        return all;
    }
    
    public Friend add(String name, String phoneNumber, String email){
        Friend f = new Friend(name, phoneNumber, email);
        data.put(f.getId(), f);
        return f;
    }
    
    public Friend update(long id, String name, String phoneNumber, String email){
        if (!data.containsKey(id))
            throw new FriendNotFoundException(id);
    
        Friend f = data.get(id);
        f.setName(name);
        f.setPhoneNumber(phoneNumber);
        f.setEmail(email);
        return f;
    }
    
    public void delete(long id){
        if (data.containsKey(id))
             data.remove(id);
        
    }
}
