package _03_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;


	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";

	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if (this.name.equalsIgnoreCase("Papa")) {
			return "Papa Smurf's hat is red!";
		}
		else{
				return "His/her hat is white";
						
			}

	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if (this.name.equalsIgnoreCase("Smurfette")) {
			return "Smurffete is a woman!";
		}else {
			return "This guy is a boy.";
						
			}
	}

}


