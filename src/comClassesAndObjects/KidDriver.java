package comClassesAndObjects;

public class KidDriver {

	public static void main(String[] args) {
		// Kid kidOne = new Kid();
		Kid KidOne = new Kid("Pinky", 8);
		KidOne.play();
		Kid KidTwo = new Kid("Wicky", 8);
		System.out.println(KidTwo.name);
		KidTwo.play();
	}

}
