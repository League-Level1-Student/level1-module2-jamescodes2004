package _07_tea_party;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
public String  welcome(String name, boolean isWoman, boolean isKnighted) {
	this.name =name;
	this.isWoman = isWoman;
	this.isKnighted = isKnighted;
	if (isKnighted)
		setIsKnighted(isKnighted);
	if(isWoman)
		setIsWoman(isWoman);
	System.out.println("Hello " +this.name);
	return "Hello " + this.name;
}
public String getName() {
	return this.name;
}
public boolean getIsWoman() {
	return this.isWoman;
}
public boolean getIsKnighted() {
	return this.isKnighted;
}
public void setName(String name) {
	this.name = name;
}
public void setIsWoman(boolean isWoman) {
	if(isWoman) {
		this.name = "Ms. "+ name;
	}
	else {
		this.name = "Mr. "+ name;
	}
}

public void setIsKnighted(boolean isKnighted) {
	if(isKnighted && isWoman) {
		this.name = "Lady " + name.substring(4);
	}
	if(isKnighted && !isWoman) {
		this.name = "Sir " + name.substring(4);
	}

}

}



