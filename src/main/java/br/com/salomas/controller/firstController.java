package br.com.salomas.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class firstController {

  @GetMapping("/firstMethod/{id}")
  public String firstMethod(@PathVariable String id) {
    return "My first method api rest" + id;
  }

  @GetMapping("/queryParams")
  public String queryParams(@RequestParam String id) {
    return "My request com queryParams" + id;
  }

  @GetMapping("/queryParams2")
  public String queryParams2(@RequestParam Map<String, String> allParams) {
    return "My request com queryParams2 is: " + allParams.entrySet();
  }

  @PostMapping("/bodyRequest")
  public String bodyRequest(@RequestBody User user){
    return "Body Params " + user.username();
  }

  @PostMapping("/headersMethod")
  public String headersMethod(@RequestHeader Map< String, String> headers){
    return "Headers Requests " + headers.entrySet();
  }

  @GetMapping("/responseEntity/{id}")
  public ResponseEntity<Object> responseEntity(@PathVariable long id) {
    var user = new User("salomas santos");

    if (id > 5) {
      return ResponseEntity.status(HttpStatus.OK).body(user);
    }
    return ResponseEntity.badRequest().body("number less than 5");
  }


  record User(String username) {
  }
  
}
