package com.cgm.internship.person;

interface defaultInterface {

    default void show(){
        System.out.println("Default method");
    }

}

class TestInterface implements defaultInterface{

}
