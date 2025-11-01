 
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// Determine if time is AM or PM based on hours
		String period;
		if (hours >= 12) {
			period = "PM";
			// Convert to 12-hour format
			if (hours > 12) {
				hours -= 12;
			}
		} else {
			period = "AM";
			// Handle midnight (00:00)
			if (hours == 0) {
				hours = 00 ; 
			}
		}
       // Format minutes to always have two digits
		String minutesStr = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);
		System.out.println(hours + ":" + minutesStr + " " + period);
	}
}