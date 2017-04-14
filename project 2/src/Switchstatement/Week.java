package Switchstatement;

public class Week {
	Day day;
	public Week(){	
	}
    public Week(Day day){
		this.day = day;
	}
	public void taskToDo(Day day){
		switch(day){
		case MONDAY:
			System.out.println("Homework and mentoring starts");
			break;
		case TUESDAY:
			System.out.println("Codelab is due");
			break;
		case WEDNESDAY:
			System.out.println("Complete the home work and submit");
			break;
		case THURSDAY:
			System.out.println("Start reading Data Structure book");
			break;
		case FRIDAY:
			System.out.println("Practice Git");
			break;
		case SATURDAY:
			System.out.println("Data Structure class starts");
			break;
		case SUNDAY:
			System.out.println("Data Structure class continue");
			break;
	    default:
			System.out.println("Not a valid day");
			break;
		}
	}
}
