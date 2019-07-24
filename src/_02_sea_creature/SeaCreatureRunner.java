package _02_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature sb = new SeaCreature("SpongeBob");
	SeaCreature s = new SeaCreature("Squidward");
	SeaCreature p = new SeaCreature("Patrick");
	sb.eat();
	sb.laugh();
	s.getName();
	s.laugh();
	s.eat();
	p.getName();
	p.eat();
	p.laugh();
}
}
