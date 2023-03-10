package comClassesAndObjects;

public class Kid {
	String name;
	int age;
	public Kid(String name,int age) {
		this.name = name;
		this.age = age;
	}
public void play() {
	System.out.println(this.name + " is playing");
	}
public void printKid(String name) {
	System.out.println("Name od Kid is : "+ this.name + " and Age is"+this.age);
}
public void printKid(int studying) {
	System.out.println("Kid is studying in : "+ this.name + " and Age is");
}
}



//method overloading......different arguments
//in different classes ...we can give different behaviour or same functions/method like (gotoclass).....methodoverriding