package com.provider;

 class PublicProvider{
    public void provide(){
        System.out.println("publically providing!");
    }
    
}
class DefaultProvider{
    public void provide(){
        System.out.println("default providing!");
    }
}

public class ProtectedProvider{
    protected void provide(){
        System.out.println("protected providing!");
    }
}

class Accessor{
    public static void main(String[] args){
        DefaultProvider dp=new  DefaultProvider();
        dp.provide();

        ProtectedProvider prp=new ProtectedProvider();
        prp.provide();
    }
}