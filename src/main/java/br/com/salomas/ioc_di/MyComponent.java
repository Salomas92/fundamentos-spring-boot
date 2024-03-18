package br.com.salomas.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MyComponent {

  public String callMyComponent() {
    return "Called my component";
  }
  
}
