package com.cts.employee;

public class ContractEmployee extends Employee{
private int duration;
public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}
public void display()
{
	
    System.out.println(getId());
    System.out.println(getName()); 
    System.out.println(getSalary());
	System.out.println(duration);
}}