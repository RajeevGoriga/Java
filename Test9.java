import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 
public class Test9 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("default format of Localdate="+date);
		System.out.println("pattern"+date.format(DateTimeFormatter.ofPattern("d::MMM:uuuu")));
		LocalTime lt=LocalTime.now();
		System.out.println("time:"+lt);
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("default format od localdate time="+dateTime);
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

	}

}
