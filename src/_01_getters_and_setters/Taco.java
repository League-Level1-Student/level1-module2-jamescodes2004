package _01_getters_and_setters;

import javax.swing.JOptionPane;

public class Taco {
private String meat;
private String sauce;


public String getMeat(){
	return this.meat;
}
public String getSauce() {
	return this.sauce;
}
public void setMeat(String meat) {
	if(meat.equals("steak")||meat.equals("chicken")||
	meat.equals("carne asada")||meat.equals("pork"))
	this.meat = meat;
}
public void setSauce(String sauce) {
	this.sauce = sauce;
}
}
