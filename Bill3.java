
public class Bill3 {
	public static void main(String[] args) {
		
	    String name1 = args[0];
	    String name2 = args[1];
	    String name3 = args[2];
		double billAmount = Double.parseDouble(args[3]);
		double tip = billAmount * 0.15; // Add tip
		double totalAmount = billAmount + tip;
		double amountPerPerson = totalAmount / 3;
	    System.out.println("Total amount: " + totalAmount);
	    System.out.println(name1 + "'s share: " + amountPerPerson);
	    System.out.println(name2 + "'s share: " + amountPerPerson);
	    System.out.println(name3 + "'s share: " + amountPerPerson);
	}
}
