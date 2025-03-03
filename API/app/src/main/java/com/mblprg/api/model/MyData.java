package com.mblprg.api.model;

public class MyData {
    private int id;
    private String name;
    private String address;


    public MyData(int id, String name, String address){
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getId(){
        return id;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
