/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics625activity11;

/**
 *
 * @author tomco
 */
public class Friend {
    
  private static long curId = 0;
  private long id;
  private String name;
  private String phoneNumber;
  private String email;
  
  public Friend(){
      
  }
  
  public Friend(String name, String phoneNumber, String email) {
    this.id = curId++;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
  
  public long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }
  
  public String getPhoneNumber() {
      return this.phoneNumber;
  }
  
  public String getEmail() {
      return this.email;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
}
