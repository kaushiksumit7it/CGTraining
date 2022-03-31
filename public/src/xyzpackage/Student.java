package xyzpackage;

class Student{  
	   int rollno;//instance variable  
	   int studentID;
	   static String myname="test";
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   Student(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  
	//Test class to show the values of objects  
	
