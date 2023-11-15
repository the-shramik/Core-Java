package com2.guru.client2;
import com2.guru.helper.Helper2;

public class Client2 extends Helper2{

  public void morning(){
    System.out.println("good morning!");
  }

  public void evening(){
    System.out.println("good evening!");
  }
  public static void main(String[] args){
   Client2 c2=new Client2();
   c2.morning();
   c2.evening();
   c2.night();
  }

}