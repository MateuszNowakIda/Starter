package pl.mationcode.catbase.model;

import java.util.Date;
import java.util.Scanner;

public class Cat {
	
	String name;
	Date born;
	Float weight;
	String ownerName;

	static Scanner sc=new Scanner(System.in);
	public
	String giveInfo(){
		
		return "Info is:" +this.name+this.born+this.weight+this.ownerName;
	}
	static String getUserInput(){
	 
		return sc.nextLine();		
	}
	String getOwnerName() {
		return ownerName;
	}
	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}

}
