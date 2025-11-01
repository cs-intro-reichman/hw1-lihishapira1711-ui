
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * limit) + 1;
		int b = (int)(Math.random() * limit) + 1;
		int c = (int)(Math.random() * limit) + 1;
		int min = Math.min(a, b);
		min = Math.min(min, c);
		int max = Math.max(a, b);
		max = Math.max(max, c);
		int mid = a + b + c - min - max; // Find the middle value
		System.out.println(min + " " + mid + " " + max);

	}
}
