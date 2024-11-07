/** @author Jeff Chernenko a00745858 */
public class Person {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private String married;
	private double weightInPounds;
	private String highestEducationLevel;
	private static final int CURRENT_YEAR = 2021;
	
	//constructorA: 6 Values
	public Person(String firstName, String lastName, int birthYear, String married, double weightInPounds, String highestEducationLevel) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.married = married;
		this.weightInPounds = weightInPounds;
		this.highestEducationLevel = highestEducationLevel;
	}
	
	//constructorB: 5 Values
	public Person(String firstName, String lastName, String married, double weightInPounds, String highestEducationLevel) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.married = married;
		this.weightInPounds = weightInPounds;
		this.highestEducationLevel = highestEducationLevel;
		this.birthYear = CURRENT_YEAR;
	}
	
	//constructorC: 3 Values
	public Person(String firstName, String lastName, double weightInPounds) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.married = "No";
		this.weightInPounds = weightInPounds;
		this.highestEducationLevel = "High School";
		this.birthYear = CURRENT_YEAR;
	}
	
	/**
	 * @param educationLevelToVerify
	 * @return boolean true if parameter requirements are met or false if otherwise
	 */
	private boolean isValidEducationLevel(String educationLevelToVerify) {
		
		if(educationLevelToVerify.equalsIgnoreCase("high school") || 
				educationLevelToVerify.equalsIgnoreCase("undergraduate") || 
				educationLevelToVerify.equalsIgnoreCase("graduate"))
			return true;
		else
			return false;	
	}
	
	/**
	 * @param marriedStatusToVerify
	 * @return boolean true if parameter requirements are met or false if otherwise
	 */
	private boolean isValidMarriageStatus(String marriedStatusToVerify) {
		
		if(marriedStatusToVerify.equalsIgnoreCase("no") || 
				marriedStatusToVerify.equalsIgnoreCase("yes") || 
				marriedStatusToVerify.equalsIgnoreCase("divorced")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//overloaded method1
	public void printDetails() {
		
		String marriageStatus = "";
		String graduation = "";
		
		if(isValidEducationLevel(highestEducationLevel) == false) {
			throw new IllegalArgumentException("invalid education status: " + highestEducationLevel);
		}
		
		if(isValidMarriageStatus(married) == false) {
			throw new IllegalArgumentException("invalid marriage status: " + married);
		}
		
		if(highestEducationLevel.equalsIgnoreCase("high school")) {
			graduation = highestEducationLevel + " diploma!";
		}
		
		else if(highestEducationLevel.equalsIgnoreCase("undergraduate") || highestEducationLevel.equalsIgnoreCase("graduate") ) {
			graduation = highestEducationLevel + " degree!";
		}
				
		if(married.equalsIgnoreCase("yes")) {
			marriageStatus = "married";
		}
		else if(married.equalsIgnoreCase("no")) {
			marriageStatus = "single";
		}
		else if(married.equalsIgnoreCase("divorced")) {
			marriageStatus = "divorced";
		}
		
		String str = String.format("%s %s (%s) was born in %d, weighs %.1f pounds, and has a %s", firstName, lastName, marriageStatus, birthYear, weightInPounds, graduation); 
		System.out.println(str);
	}

	/**
	 * @param boolean kilogram
	 * @throws IllegalArgumentException if isValidEducationLevel is false
	 * @throws IllegalArgumentException if isValidMarriageStatus is false
	 * @throws IllegalArgumentException if parameter is not valid
	 */
	//overload method2
	public void printDetails(boolean kilogram) {
		
		String marriageStatus = "";
		String graduation = "";
		
		if(isValidEducationLevel(highestEducationLevel) == false) {
			throw new IllegalArgumentException("invalid education status: " + highestEducationLevel);
		}
		
		if(isValidMarriageStatus(married) == false) {
			throw new IllegalArgumentException("invalid marriage status: " + married);
		}
		
		if(highestEducationLevel.equalsIgnoreCase("high school")) {
			graduation = highestEducationLevel + " diploma!";
		}
		
		else if(highestEducationLevel.equalsIgnoreCase("undergraduate") || highestEducationLevel.equalsIgnoreCase("graduate") ) {
			graduation = highestEducationLevel + " degree!";
		}
				
		if(married.equalsIgnoreCase("yes")) {
			marriageStatus = "married";
		}
		else if(married.equalsIgnoreCase("no")) {
			marriageStatus = "single";
		}
		else if(married.equalsIgnoreCase("divorced")) {
			marriageStatus = "divorced";
		}
	       
		if(kilogram == true) {
			final double weightInKilograms = weightInPounds * 0.453592;
			String str = String.format("%s %s (%s) was born in %d, weighs %.1f kilograms, and has a %s", firstName, lastName, marriageStatus, birthYear, weightInKilograms, graduation); 
			System.out.println(str);
		}
		else if(kilogram == false) {
			String str = String.format("%s %s (%s) was born in %d, weighs %.1f pounds, and has a %s", firstName, lastName, marriageStatus, birthYear, weightInPounds, graduation); 
			System.out.println(str);
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * @param boolean kilogram, boolean isUpperCase
	 * @throws IllegalArgumentException if isValidEducationLevel is false
	 * @throws IllegalArgumentException if isValidMarriageStatus is false
	 * @throws IllegalArgumentException if parameters are not valid
	 */
	//overloaded method3
	public void printDetails(boolean kilogram, boolean isUpperCase) {
			
		String marriageStatus = "";
		String graduation = "";
		
		if(isValidEducationLevel(highestEducationLevel) == false) {
			throw new IllegalArgumentException("invalid education status: " + highestEducationLevel);
		}
		
		if(isValidMarriageStatus(married) == false) {
			throw new IllegalArgumentException("invalid marriage status: " + married);
		}
		
		if(highestEducationLevel.equalsIgnoreCase("high school")) {
			graduation = highestEducationLevel + " diploma!";
		}
		
		else if(highestEducationLevel.equalsIgnoreCase("undergraduate") || highestEducationLevel.equalsIgnoreCase("graduate") ) {
			graduation = highestEducationLevel + " degree!";
		}
				
		if(married.equalsIgnoreCase("yes")) {
			marriageStatus = "married";
		}
		else if(married.equalsIgnoreCase("no")) {
			marriageStatus = "single";
		}
		else if(married.equalsIgnoreCase("divorced")) {
			marriageStatus = "divorced";
		}
		       
		if(kilogram == true && isUpperCase == true) {
			final double weightInKilograms = weightInPounds * 0.453592;
			firstName = firstName.toUpperCase();
			lastName = lastName.toUpperCase();
			String str = String.format("%s %s (%s) was born in %d, weighs %.1f kilograms, and has a %s", firstName, lastName, marriageStatus, birthYear, weightInKilograms, graduation); 
			System.out.println(str);
		}
			
		else if(kilogram == true && isUpperCase == false) {
			final double weightInKilograms = weightInPounds * 0.453592;
			firstName = firstName.toLowerCase();
			lastName = lastName.toLowerCase();
			String str = String.format("%s %s (%s) was born in %d, weighs %.1f kilograms, and has a %s", firstName, lastName, marriageStatus, birthYear, weightInKilograms, graduation); 
			System.out.println(str);
		}
		
		else if(kilogram == false && isUpperCase == true) {
			firstName = firstName.toUpperCase();
			lastName = lastName.toUpperCase();
			String str = String.format("%s %s (%s) was born in %d, weighs %.1f pounds, and has a %s", firstName, lastName, marriageStatus, birthYear, weightInPounds, graduation); 
			System.out.println(str);
		}
		
		else if(kilogram == false && isUpperCase == false) {
			firstName = firstName.toLowerCase();
			lastName = lastName.toLowerCase();
			String str = String.format("%s %s (%s) was born in %d, weighs %.1f pounds, and has a %s", firstName, lastName, marriageStatus, birthYear, weightInPounds, graduation); 
			System.out.println(str);
		}
		
		else
			throw new IllegalArgumentException();
	}

	//not sure if these are required or not...
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public String isMarried() {
		return married;
	}

	public double getWeightInPounds() {
		return weightInPounds;
	}

	public String gethighestEducationLevel() {
		return highestEducationLevel;
	}

}
