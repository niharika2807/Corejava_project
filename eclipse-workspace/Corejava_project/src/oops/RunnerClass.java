package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// create the object without constructor
		/*Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.name = "Niharika";
		emp1.empId = 1000;
		emp1.salary = 5000;
		
		emp1.displayData();
		
		emp2.name = "Ranjith";
		emp2.empId = 1001;
		emp2.salary = 5500;
		
		emp2.displayData(); */
		
		
		// create the object for person class with constructor
		Person per1 = new Person("Surbhi",12345,25,"New york");
		Person per2 = new Person("Vankta",67890,26,"New Jersy");
		
		per1.displayData();
		per2.displayData();
		
		System.out.println("Country for all the objects is " + Person.country);
		
		AccessModifierExample obj1 = new AccessModifierExample();
		obj1.name = "Chandra";
		obj1.rollNo = 100;
		obj1.grade = 5;
		
		obj1.setSchoolName("Oxford");
		System.out.println(obj1.getSchoolName());
		
		// Inheritance concept

		ChildClass chld1 = new ChildClass();
		chld1.phoneNo = 123456;
		chld1.name = "Deepthi";
		chld1.rollNo = 105;
		chld1.grade = 6;
		
		
		System.out.println(chld1.phoneNo);
		System.out.println(chld1.name);
		System.out.println(chld1.rollNo);
		System.out.println(chld1.grade);
		
		MethodOverLoading m1= new MethodOverLoading();
		m1.Sum(4,5);
		m1.Sum(4,5,6);
		
		

				// TODO Auto-generated method stub
					
				
				//Browser b1 = new Browser();
				Browser b2 = new ChromeBrowser();
				Browser b3 = new FirefoxBrowser();
				
				//b1.LaunchBrowser();
				b2.LaunchBrowser();
				b3.LaunchBrowser();
				
				Bank bank1 = new ICICIBank();
				ICICIBank bank2 = new ICICIBank();
				
				bank1.PrintStatement();
				bank2.OpenAccount();	
				
			


	}

}



