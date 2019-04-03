/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author duong
 */
public class User {
    private String full_name;
    private String cmnd;
    private String aCode;
    private String city;
    private int age;
    private int type;
    private Assurance assurance;

    public User() {
    }

    public User(String full_name, String cmnd, String aCode, String city, int age, int type, Assurance assurance) {
        this.full_name = full_name;
        this.cmnd = cmnd;
        this.aCode = aCode;
        this.city = city;
        this.age = age;
        this.type = type;
        this.assurance = assurance;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getaCode() {
        return aCode;
    }

    public void setaCode(String aCode) {
        this.aCode = aCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Assurance getAssurance() {
        return assurance;
    }

    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }
    
    
    
}

