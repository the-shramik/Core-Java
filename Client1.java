package com2.guru.client1;
import com2.guru.message.Messages;
public class Client1 implements Messages{

  public void morning(){
   System.out.println("goood mrng!");
  }

  public void evening(){
    System.out.println("goood evng!");
  }

  public void night(){
   System.out.println("goood nght!");
  }
  public static void main(String[] args){
     Client1 c1=new Client1();
     c1.morning();
     c1.evening();
     c1.night();
  }
}