/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.bean;

/**
 *
 * @author kumar
 */
public class Employee {
    int eid;
    String name;
    String address;
    String city;
    public Employee(int eid, String name) {
       
        this.name = name;
    }
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
    
}
