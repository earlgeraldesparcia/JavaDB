/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadb;

/**
 *
 * @author L27X14W14
 */
public class Students {
    String id, fname, lname, age;
    
    public Students(String id, String fname, String lname, String age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    
    public String getLname() { return this.lname; }
    public String getFname() { return this.fname; }
    public String getId() { return this.id; }
    public String getAge() { return this.age; }
}
