package _01_getters_and_setters;

public class Person {
private String Name;
private String Superpower;

Person(String Name, String Superpower){
	this.Name=Name;
	this.Superpower = Superpower;
}
public String getName() {
	return this.Name;
}
public String getSuperpower() {
	return this.Superpower;
}
public void setName(String Name) {
	this.Name=Name;
}
public void setSuperpower(String SuperPower) {
	this.Superpower = Superpower;
}
public String toString() {
	return Name + " has mad "+ Superpower + " skills.";
}
}