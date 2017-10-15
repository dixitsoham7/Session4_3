
/*Program shows the use of final keyword in 4 cases : 1) with variable 2) with class 3) with method 4) in a constructor 
 * Final keyword is used to restrict the user
 * with variable if used then its value cannot be changed
 * with class if used then class cannot be inherited
 * with method if used then we cannot override it
 * we can initialize blank final variable inside constructor
  */



public class Speed {

	final int speed = 80;   //when final is used with variable its value cannot be changed
	final int max_speed;         //blank final variable can be initialized only in constructor
	
	
	public Speed()         //constructor is used to initialize blank final variable
	{
		max_speed=120;   //final variable initialized
		System.out.print("Max Speed = "+max_speed+"\n");  //printing details of initialized blank final variable
	}
	
	void boost() {
		//speed=100;      as we have used final with speed before and declared its value 80 hence we cannot change
		System.out.println("Speed = "+speed+" km/hr\n"); //it will display 80 as we have used final keyword with speed its value wont change
	}
	
	final void safe() {              //we cannot override this method because it is used with final keyword
		System.out.println("Safe Speed is 60 km/hr");   //it will display the statement
	}
	
	
	public static void main(String[] args) {   //main method
		
		
		System.out.print("Example of final in constructor -> \n");  //blank final variable is initialized inside constructor
		Speed obj = new Speed();  //creating object of base class
		System.out.print("\n");
		
		System.out.print("Example of final variable -> \n");
		obj.boost();   //calling method boost
		
		System.out.print("Example of final method -> \n");
		obj.safe();   //calling method safe
		 
		Activa a = new Activa();   //creating object of derived class
		a.boost();   //calling method boost of derived class
		
		System.out.print("Example of final class -> \n"); 
		Pleasure p = new Pleasure();  //creating object of derived class
		p.display();  //calling method display of derived class
	}

}

final class Activa extends Speed{            //as class Speed is not final we can extend it if class is final we cannot extend it
	
	//void safe() {                                                    //as we have made safe method as final we cannot override it
		//System.out.println("Safe speed is 50 km/hr");
	//}
	
	int sp = 30;     //final is not used with this variable hence its value can be changed        
	
	void boost() {     //method is ovverride because it is not final
		sp=50;       //value of variable changed as it is not final
		System.out.println("Speed = "+sp+" km/hr\n");  //printing speed
	}
}


//class Pleasure extends Activa {      //as class Activa is final class it cannot be inherited	
//}

class Pleasure extends Speed{      //Pleasure can be derived from Speed class as Speed class is not final class
	
	void display()
	{
		System.out.println("Pleasure can be extend from Speed class but i cannot be extended from \nActiva class because if class is final then we cannot extend it.");
	}
}
	
