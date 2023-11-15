package com.accessor;

// import com.provider.PublicProvider;
// import com.provider.DefaultProvider;
import com.provider.ProtectedProvider;

public class Accessor extends ProtectedProvider{
    public static void main(String[] args){
        // PublicProvider pp=new PublicProvider ();
        // DefaultProvider dp=new DefaultProvider(); we can not access it beacuse it is not public
        // pp.provide();

        // ProtectedProvider prp=new ProtectedProvider(); when we are accessing protected members we can not access them using parent refrence , to aceess them use child refrence!

        Accessor as=new Accessor();
        as.provide();
    }
}

class Accessor2 extends Accessor{
    Accessor2 ac2=new Accessor2();
    // ac2.provide(); we can not access the protected members in indirect subclass!
}