package assignment8;

import java.util.Scanner;

public class EmployeeInformation {
//to get input from student
	public void getUserInput() {
		Employee employee=new Employee();
		Scanner scanner=new Scanner(System.in);
		
	//taking first input from user and store it into employee.firstname
		
        System.out.println("Enter the first name>>");
        employee.firstName=scanner.nextLine();
        
        System.out.println("Enter the last name>>");
        employee.lastname=scanner.nextLine();
        
        System.out.println("Enter the city>>");
        employee.city=scanner.nextLine();
        
        System.out.println("Enter the mobile number>>");
        employee.mobileNumber=scanner.nextLong();
        
      //passing information to getstudentinformation
        
    	 getStudentInformation(employee.firstName ,employee.lastname ,employee.city, employee.mobileNumber,Employee.country);
        	
	}
	
      //method used for get all student information
	
        public void getStudentInformation(String fName,String lName,String ct,long mobNum,String country) {
        	
        	//printing the student details
        	
        	System.out.println("Student information>>");
        	System.out.println("firstname:  "+fName);
        	System.out.println("last name:  "+lName);
        	System.out.println("city:  "+ct);
        	System.out.println("Country:  "+country);
        }
        public static void main(String[] args) {
			EmployeeInformation employeeInformation=new EmployeeInformation();
			System.out.println("enter the number of student>>");
			Scanner input=new Scanner(System.in);
			int count=input.nextInt();
			for(int i=1;i<=count;i++) {
				System.out.println("enter the student details>>");
				employeeInformation.getUserInput();
		
			
		}
        
        	
        	
        }
        
        }
	
	