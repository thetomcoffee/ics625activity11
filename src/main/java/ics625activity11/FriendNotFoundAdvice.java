/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics625activity11;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 *
 * @author tomco
 */
@ControllerAdvice
public class FriendNotFoundAdvice {
    @ResponseBody
  @ExceptionHandler(FriendNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String friendNotFoundHandler(FriendNotFoundException ex) {
    return ex.getMessage();
  }
}