package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf h = new Smurf("Handy");
		System.out.println(h.getName());
		h.eat();
		Smurf p = new Smurf("Papa");
		System.out.println(p.getHatColor());
		System.out.println(p.isGirlOrBoy());
		Smurf s = new Smurf("Smurfette");
		System.out.println(s.getHatColor());
		System.out.println(s.isGirlOrBoy());
	}

}
