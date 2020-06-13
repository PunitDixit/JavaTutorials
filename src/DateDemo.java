import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		SimpleDateFormat datefor = new SimpleDateFormat("MMM-d-YYY");
		
		System.out.println(datefor.format(date));
		
		
		// Date to String
		
		System.out.println(datefor.format(date));
		
		
		
	}

	public static void main(Integer [] args) {
		
	}

}
