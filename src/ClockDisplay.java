import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ClockDisplay {

	public static int n=60;
	public static ArrayList<String> names=new ArrayList<String>(n);
	public static ArrayList<Character> charList=new ArrayList<Character>(60);
	public static ArrayList<Character> minList=new ArrayList<Character>(60);
	public static ArrayList<Character> hrList=new ArrayList<Character>(60);
	
	public static void initList(){
		names.add("One");
		names.add("Two");
		names.add("Three");
		names.add("Four");
		names.add("Five");
		names.add("Six");
		names.add("Seven");
		names.add("Eight");
		names.add("Nine");
		names.add("Ten");
		names.add("Eleven");
		names.add("Twelve");
		names.add("Thirteen");
		names.add("Fourteen");
		names.add("Fifteen");
		names.add("Sixteen");
		names.add("Seventeen");
		names.add("Eighteen");
		names.add("Nineteen");
		names.add("Twenty");
		names.add("Thirty");
		names.add("Forty");
		names.add("Fifty");
	}
	
	public static void hourCalc(){
		System.out.println("\nCurrent time: \n");
		if(LocalDateTime.now().getHour()%12 > 0){
			System.out.print(names.get((LocalDateTime.now().getHour()%12) - 1) + " o' clock ");
		}
		else{
			System.out.print(names.get(11) + " o' clock ");
			
		}
	}
	
	public static void minuteCalc(){
		int temp=0;
		if(LocalDateTime.now().getMinute()%60 == 0){}
		else if(LocalDateTime.now().getMinute() == 1){
			System.out.print(names.get(LocalDateTime.now().getMinute() - 1) + " minute ");
		}
		else if(LocalDateTime.now().getMinute() <= 20){
			System.out.print(names.get(LocalDateTime.now().getMinute() - 1) + " minutes ");
		}
		else if(LocalDateTime.now().getMinute() < 30){
			System.out.print(names.get(19));
			temp=LocalDateTime.now().getMinute()%10;
			if(temp==0){}
			else{
				System.out.print(" "+names.get(temp - 1));
			}
			System.out.print(" minutes ");
		}
		else if(LocalDateTime.now().getMinute() < 40){
			System.out.print(names.get(20));
			temp=LocalDateTime.now().getMinute()%10;
			if(temp==0){}
			else{
				System.out.print(" "+names.get(temp - 1));
			}
			System.out.print(" minutes ");
		}
		else if(LocalDateTime.now().getMinute() < 50){
			System.out.print(names.get(21));
			temp=LocalDateTime.now().getMinute()%10;
			if(temp==0){}
			else{
				System.out.print(" "+names.get(temp - 1));
			}
			System.out.print(" minutes ");
		}
		else if(LocalDateTime.now().getMinute() < 60){
			System.out.print(names.get(22));
			temp=LocalDateTime.now().getMinute()%10;
			if(temp==0){}
			else{
				System.out.print(" "+names.get(temp - 1));
			}
			System.out.print(" minutes ");
		}
	}
	
	public static void secondCalc(){
		int temp=0;
		if(LocalDateTime.now().getSecond()%60 == 0){}
		else if(LocalDateTime.now().getSecond() == 1){
			System.out.print(names.get(LocalDateTime.now().getSecond() - 1) + " second ");
		}
		else if(LocalDateTime.now().getSecond() <= 20){
			System.out.print(names.get(LocalDateTime.now().getSecond() - 1) + " seconds ");
		}
		else if(LocalDateTime.now().getSecond() < 30){
			System.out.print(names.get(19));
			temp=LocalDateTime.now().getSecond()%10;
			if(temp==0){}
			else{
				System.out.print(" "+names.get(temp - 1));
			}
			System.out.print(" seconds ");
		}
		else if(LocalDateTime.now().getSecond() < 40){
			System.out.print(names.get(20));
			temp=LocalDateTime.now().getSecond()%10;
			if(temp==0){}
			else{
				System.out.print(" "+names.get(temp - 1));
			}
			System.out.print(" seconds ");
		}
		else if(LocalDateTime.now().getSecond() < 50){
			System.out.print(names.get(21));
			temp=LocalDateTime.now().getSecond()%10;
			if(temp==0){}
			else{
				System.out.print(" "+names.get(temp - 1));
			}
			System.out.print(" seconds ");
		}
		else if(LocalDateTime.now().getSecond() < 60){
			System.out.print(names.get(22));
			temp=LocalDateTime.now().getSecond()%10;
			if(temp==0){}
			else{
				System.out.print(" "+names.get(temp - 1));
			}
			System.out.print(" seconds ");
		}
	}

	public static void period(){
		System.out.println("\n");
		if(LocalDateTime.now().getHour()>=22 || LocalDateTime.now().getHour()<4){
			System.out.println("Night");
		}
		else if(LocalDateTime.now().getHour()>=18 && LocalDateTime.now().getHour()<22){
			System.out.println("Evening");
		}
		else if(LocalDateTime.now().getHour()>=12 && LocalDateTime.now().getHour()<18){
			System.out.println("After noon");
		}
		else if(LocalDateTime.now().getHour()>=10 && LocalDateTime.now().getHour()<12){
			System.out.println("Noon");
		}
		else if(LocalDateTime.now().getHour()>=7 && LocalDateTime.now().getHour()<10){
			System.out.println("Morning");
		}
		else if(LocalDateTime.now().getHour()>=4 && LocalDateTime.now().getHour()<7){
			System.out.println("Early morning");
		}
	}


	
	public static void autosch(){
		for(int i=0;i<60;i++){
			charList.add('O');
			minList.add('O');
			hrList.add('O');
		}
		while(true){
			try{
				for(int i=0;i<20;i++)
					System.out.println("\n");
				period();
				hourCalc();
				minuteCalc();                         
				secondCalc();
				System.out.println("\n\n"+LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute()+":"+LocalDateTime.now().getSecond());	
				Thread.sleep(1000);
			}
			catch(Exception e){
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initList();
		autosch();
	}

}
