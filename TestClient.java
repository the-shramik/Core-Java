package com.gm.client;
import com.gm.helper.Helper;
import com.gm.declaratiion.Message;

public class TestClient extends Helper{ 
  public void morning(){
    System.out.println("good morning!");
  }

  public void afternoon(){
    System.out.println("good afternoon!");
  }

  public void evening(){
    System.out.println("good evening!");
  }

  public static void main(String[] args){
     Message m=new TestClient();
     
     m.morning();
     m.afternoon();
     m.evening();
     m.night();
     
  }
}