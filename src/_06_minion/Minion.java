package _06_minion;

public class Minion {
private String name;
private int eyes;
private String color;
private String master;

Minion(String name, int eyes, String color, String master){
	this.name = name;
	this.eyes = eyes;
	this.color = color;
	this.master = master;
	
}
public String getName() {
	return this.name;
}
public int getEyes() {
	return this.eyes;
}
public String getColor() {
	return this.color;
}
public String getMaster() {
	return this.master;
}
public void setName(String name) {
	this.name=name;
}
public void setEyes(int eyes) {
	if (eyes==1 || eyes==2);		
	this.eyes = eyes;
}
public void setColor(String color) {
	if (color.equalsIgnoreCase("Yellow"));
	this.color = color;
}
public void setMaster(String master) {
	if (master.equalsIgnoreCase("Gru"));
		this.master = master;
}
}