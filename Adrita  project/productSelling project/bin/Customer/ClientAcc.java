package bin.Customer;

import java.io.*;
import java.util.*;

public class ClientAcc {

 
  
  private String username;
  private String pass;

  public ClientAcc() {}

  public ClientAcc(
    
    String username,
    String pass
  ) {
   
    
    this.username = username;
    this.pass = pass;
  }

  
  
  

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  


  

  public String getUsername() {
    return username;
  }

  public String getPass() {
    return pass;
  }

  @Override
  public String toString() {
    return (
      "UserInfo{" +
      
      ", username='" +
      username +
      '\'' +
      ", pass='" +
      pass +
      '\'' +
      '}'
    );
  }

}


