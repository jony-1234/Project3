package Homework5;

public class WeekTodo {
	Week week;
	public WeekTodo(){
		
	}
	public WeekTodo(Week week){
		this.week = week;
	}
	public void tellLikeItIs(Week week){
		switch (week){
		case THIRD:
			System.out.println("THIRDWEEKS service was good");
			break;
		case SIXTH:
			System.out.println("SIXTHDWEEKS service was preety much good");
		case SECOND:
			System.out.println("SECONDWEEKS service was best");
			
			break;
			default:
				System.out.println("FORTHWEEKS service was bad");
				break;
		}
		
	}
	

}
