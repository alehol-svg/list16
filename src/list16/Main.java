package list16;

public class Main {

	public static void main(String[] args) {
		Male male = new Male("John", 20);
		Female female = new Female("Maria", 30);
		OtherGender otherGender = new OtherGender("Lenny", 18);
		
		male.printClassName();
		female.printClassName();
		otherGender.printClassName();

	}

}
