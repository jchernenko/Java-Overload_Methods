/** @author Jeff Chernenko a00745858 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Tiger", "Woods", 1975, "divorced", 200, "undergraduate");
		
		p1.printDetails();
		p1.printDetails(true);
		p1.printDetails(true, true);
		p1.printDetails(true, false);
		p1.printDetails(false, true);
		p1.printDetails(false, false);
		
		System.out.println("");
		Person p2 = new Person("Jason", "Harrison", 2000, "no", 180, "graduate");
		
		p2.printDetails();
		p2.printDetails(true);
		p2.printDetails(true, true);
		p2.printDetails(true, false);
		p2.printDetails(false, true);
		p2.printDetails(false, false);
		
		System.out.println("");
		Person p3 = new Person("Santa", "Claus", 1000, "yes", 280, "high school");
		
		p3.printDetails();
		p3.printDetails(true);
		p3.printDetails(true, true);
		p3.printDetails(true, false);
		p3.printDetails(false, true);
		p3.printDetails(false, false);
	}
}
