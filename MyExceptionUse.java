package com.guru.userexceptionuse;

import com.guru.myexception.InvalidAgeException;

import java.util.Scanner;
public class MyExceptionUse {

    public void marriage(int age) throws InvalidAgeException{
        if (age > 20) {
            System.out.println("You have eligible to marry!");
        } 
        else {
            throw new InvalidAgeException("You are not eligible for marry!");
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a age:");
      int age=sc.nextInt();

      try{
           new  MyExceptionUse().marriage(age);
      }
      catch(InvalidAgeException ie){
        ie.printStackTrace();
      }
    }
}
