/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics625activity11;

/**
 *
 * @author tomco
 */
public class FriendNotFoundException extends RuntimeException {
    
    public FriendNotFoundException(Long id) {
        super("Could not find friend with id: " + id);
    }
    
}
