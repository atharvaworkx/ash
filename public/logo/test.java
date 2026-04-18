/*

Unit 1 – Introduction to Java & Programming Concepts


1. Write a Java program to accept dimensions of a sphere and print the surface area and volume. (Surface Area : 4πr^2, Volume : (4/3)​πr^3)



import java.util.Scanner;

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of sphere : ");
		int r = sc.nextInt();

		double area = 4 * Math.PI * Math.pow(r, 2);
		double volume = (4.0/3) * Math.PI * Math.pow(r, 3);

		System.out.printf("Surphace Area : %.2f\n", area);
		System.out.printf("Volume : %.2f\n", volume);

        sc.close();
	}
}



2. Write a Java program to take a character as input and check if it is a vowel or consonant. 


import java.util.Scanner;

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character : ");
		char ch =  sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consnant");
		}

		sc.close();

	}
}



3. Write a java program to accept n employee names from user. Sort them in ascending order and Display them. 

import java.util.*;

public class test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of employees : ");
		int n = sc.nextInt();

		sc.nextLine();

		String emp[] = new String[n];

		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Employee " + (i + 1) + " : ");
			emp[i] = sc.nextLine();
		}

		Arrays.sort(emp);

		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(emp[i]);
		}
		sc.close();
	}
}



Unit 2 – Classes and Objects



1. Define an abstract class Shape with abstract methods area () and volume (). Derive abstract class Shape into two classes Cone and Cylinder. Write a java Program to calculate area and volume of Cone and Cylinder.(Use Super Keyword.) (cone area : πr(r+l), cone volume : (1/3)​πr^2h,  cylinder area : 2πr(r+h), cylinder volume : πr^2h)


import java.util.Scanner;

abstract class Shape
{
	double r, h;

	Shape(double r, double h)
	{
		this.r = r;
		this.h = h;
	}

	abstract double area();
	abstract double volume();
}

class Cone extends Shape
{
	Cone(double r, double h)
	{
		super(r, h);
	}

	double area()
	{
		double l = Math.sqrt(r*r + h*h);

		return Math.PI * r * (r + l);
	}

	double volume()
	{
		return (1.0/3) * Math.PI * r * r * h;
	}
}

class Cylinder extends Shape
{
	Cylinder(double r, double h)
	{
		super(r, h);
	}

	double area()
	{
		return 2 * Math.PI * r * (r + h);
	}

	double volume()
	{
		return Math.PI * r * r * h;
	}
}

class test
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Radius of Cone : ");
		double r1 = sc.nextDouble();

		System.out.print("Height of Cone : ");
		double h1 = sc.nextDouble();

		Cone cone = new Cone(r1, h1);

		System.out.print("Radius of Cylinder : ");
		double r2 = sc.nextDouble();
		
		System.out.print("Height of Cylinder : ");
		double h2 = sc.nextDouble();

		Cylinder cylinder = new Cylinder(r2, h2);

		System.out.printf("Area of cone : %.2f \n", cone.area());
		System.out.printf("Volume of cone : %.2f \n", cone.volume());

		System.out.printf("Area of Cylinder : %.2f \n", cylinder.area());
		System.out.printf("Volume of Cylinder : %.2f \n", cylinder.volume());

		sc.close();
	}
}


2. Create a package named “Series” having three different classes to print series:
		i. Fibonacci series
		ii. Cube of numbers
		iii. Square of numbers 


import series.*;
import java.util.Scanner;

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		Fibonacci f = new Fibonacci();
		Cube c = new Cube();
		Square s = new Square();

		f.printSeries(n);

		System.out.println();

		c.printCube(n);

		System.out.println();

		s.printSquare(n);

		System.out.println();

		sc.close();

	}
}



3. Define an interface “Operation” which has methods area(),volume(). Define a constant PI having a value 3.142. Create a class circle (member – radius), cylinder (members – radius, height) which implements this interface. Calculate and display the area and volume. 


import java.util.Scanner;

interface operations 
{
	double PI = 3.142;

	double area();
	double volume();
}

class circle implements operations
{
	double radius;

	circle(double r)
	{
		radius = r;
	}

	public double area()
	{
		return PI * radius * radius;
	}

	public double volume()
	{
		return 0;
	}
}

class cylinder implements operations
{
	double radius, height;

	cylinder(double r, double h)
	{
		radius = r;
		height = h;
	}

	public double area()
	{
		return 2 * PI * radius * (radius + height);
	}

	public double volume()
	{
		return PI * radius * radius * height;
	}
}

class test
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of circle : ");
		double rcir = sc.nextDouble();
		
		circle cir = new circle(rcir);

		System.out.print("Enter radius of cylinder : ");
		double rcyl = sc.nextDouble();

		System.out.print("Enter height of cylinder : ");
		double rh = sc.nextDouble();

		cylinder cyl = new cylinder(rcyl, rh);

		System.out.printf("Area of circle : %.2f \n", cir.area());

		System.out.printf("Area of cylinder : %.2f \n", cyl.area());

		System.out.printf("Volume of cylinder : %.2f \n", cyl.volume());

		sc.close();
	}
}

4. Define a class MyNumber having one private integer data member. Write a default constructor initialize it to 0 and another constructor to initialize it to a value. Write methods isNegative, isPositive, isOdd, iseven. Use command line argument to pass a value to the object and perform the above operations. 


class MyNumber
{
	private int n;

	MyNumber()
	{
		n = 0;
	}

	MyNumber(int n)
	{
		this.n = n;
	}

	boolean isNegative()
	{
		return n < 0;
	}

	boolean isPositive()
	{
		return n > 0;
	}

	boolean isOdd()
	{
		return n % 2 != 0;
	}

	boolean isEven()
	{
		return n % 2 == 0;
	}
}

class test
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);

		MyNumber mn = new MyNumber(n);

		System.out.println("Is negative : " + mn.isNegative());
		System.out.println("Is positive : " + mn.isPositive());
		System.out.println("Is odd : " + mn.isOdd());
		System.out.println("Is even : " + mn.isEven());
	}
}



5. Define a class Employee having members – id, name, salary. Define default constructor. Create a subclass called Manager with private member bonus. Define methods accept and display in both the classes. Create “n” objects of the Manager class and display the details of the worker having the maximum total salary (salary + bonus). 


import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double salary;

	Employee()
	{
		id = 0;
		name = "";
		salary = 0;
	}

	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID : ");
		id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name : ");
		name = sc.nextLine();

		System.out.print("Enter Salary : ");
		salary = sc.nextDouble();
	}

	void display()
	{
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}


}

class Manager extends Employee
{
	private double bonus;

	void accept()
	{
		super.accept();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter bonus : ");
		bonus = sc.nextDouble();

		System.out.println();
	}

	void display()
	{
		super.display();
		
		System.out.println("Bonus : " + bonus);
	}

	double total()
	{
		return salary + bonus;
	}

}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of managers : ");
		int n = sc.nextInt();

		Manager m[] = new Manager[n];

		for(int i = 0 ; i < n ; i++)
		{
			m[i] = new Manager();

			System.out.println("Enter details of Manager " + (i + 1) + "\n");

			m[i].accept();
		}

		int max = 0;

		for(int i = 0 ; i < n ; i++)
		{
			if(m[i].total() > m[max].total())
			{
				max = i;
			}
		}

		System.out.println("The manager having highest total salary - \n");

		m[max].display();

		sc.close();
	}
}



6. Write a java program to accept details of ‘n’ cricket players(pid, pname, totalRuns, InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the details of player having maximum average. 


import java.util.Scanner;

class Cricket
{
	int pid;
	String pname;
	int totalRuns;
	int InningsPlayed;
	int NotOuttimes;

	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter PID : ");
		pid = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name : ");
		pname = sc.nextLine();

		System.out.print("Enter Total Runs : ");
		totalRuns = sc.nextInt();

		System.out.print("Enter Innings Played : ");
		InningsPlayed = sc.nextInt();

		System.out.print("Enter Not Out Times : ");
		NotOuttimes = sc.nextInt();

		System.out.println();

	}

	void display()
	{
		System.out.println("PID : " + pid);
		System.out.println("Name : " + pname);
		System.out.println("Total Runs : " + totalRuns);
		System.out.println("Innings Played : " + InningsPlayed);
		System.out.println("Not Out Times : " + NotOuttimes);
		System.out.println("Average : " + this.average());
	}

	double average()
	{
		return (double) totalRuns / (InningsPlayed - NotOuttimes);
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of players : ");
		int n = sc.nextInt();

		Cricket players[] = new Cricket[n];

		for(int i = 0 ; i < n ; i++)
		{
			players[i] = new Cricket();

			System.out.println("Enter details of player " + (i + 1) + "\n");

			players[i].accept();
		}

		int max = 0;

		for(int i = 0 ; i < n ; i++)
		{
			if(players[i].average() > players[max].average())
			{
				max = i;
			}
		}

		System.out.println("The player having maximum average - \n");

		players[max].display();

		sc.close();

	}
}



7. Write a program which define class Employee with data member as id, name and salary Store the information of 'n' employees and Display the name of employee having maximum salary (Use array of object). 


import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display()
	{
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = 2;

		Employee emp[] = new Employee[n];

		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("\nEnter Details of employee " + (i + 1) + "\n");

			System.out.print("Enter ID : ");
			int id = sc.nextInt();
			
			sc.nextLine();

			System.out.print("Enter Name : ");
			String name = sc.nextLine();

			System.out.print("Enter Salary : ");
			double salary = sc.nextDouble();

			emp[i] = new Employee(id, name, salary);
		}

		int max = 0;

		for(int i = 0 ; i < n ; i++)
		{
			if(emp[i].salary > emp[max].salary)
			{
				max = i;
			}
		}

		System.out.println("The employee having maximum salary - \n");

		emp[max].display();

		sc.close();
	}
}



8. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee(). 


class Employee
{
	void work()
	{
		System.out.println("Employee is working");
	}
	int getSalary()
	{
		return 1000000;
	}
}

class HRManager extends Employee
{
	void work()
	{
		System.out.println("HR Manager is working");
	}

	void addEmployee()
	{
		System.out.println("HR Manager is adding employees");
	}
}

class test
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		HRManager hr = new HRManager();

		e.work();
		System.out.println("Employee Salary : " + e.getSalary());

		hr.work();
		System.out.println("HR Manager Salary : " + hr.getSalary());
		hr.addEmployee();
	}
}



9. Define a class person(pid,pname,age,gender). Define Default and parameterized constructor. Accept the 5 person details and display it.(Use this keyword). 


import java.util.Scanner;

class person
{
	int pid;
	String pname;
	int age;
	String gender;

	person()
	{
		pid = 0;
		pname = "";
		age = 0;
		gender = "";
	}

	person(int pid, String pname, int age, String gender)
	{
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.gender = gender;
	}

	void display()
	{
		System.out.println("PID : " + pid);
		System.out.println("PName : " + pname);
		System.out.println("PAge : " + age);
		System.out.println("PGender : " + gender);
		System.out.println();
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		person p[] = new person[5];

		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println("Enter details of person " + (i + 1) + "\n");

			System.out.print("Enter PID : ");
			int pid = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Name : ");
			String pname = sc.nextLine();

			System.out.print("Enter Age : ");
			int age = sc.nextInt();

			System.out.print("Enter Gender : ");
			String gender = sc.next();

			System.out.println();

			p[i] = new person(pid, pname, age, gender);
		}

		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println("Details of Person " + (i + 1) + "\n");
			p[i].display();
		}
	}
}



10. Define an Interface Shape with abstract method area(). Write a java program to calculate an area of Circle and Sphere.(use final keyword) 


import java.util.Scanner;

interface Shape
{
	final double PI = 3.14;
	double area();
}

class Circle implements Shape
{
	double radius;

	Circle(double radius)
	{
		this.radius = radius;
	}

	public double area()
	{
		return PI * radius * radius;
	}
}

class Sphere implements Shape
{
	double radius;

	Sphere(double radius)
	{
		this.radius = radius;
	}

	public double area()
	{
		return 4 * PI * radius * radius;
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of circle : ");
		double rc = sc.nextDouble();

		Circle c = new Circle(rc);

		System.out.print("Enter radius of sphere : ");
		double rs = sc.nextDouble();

		Sphere s = new Sphere(rs);

		System.out.println("The area of Circle is : " + c.area());

		System.out.println("The area of Sphere is : " + s.area());

	}
}



11. Write a java program to create a package mypackage containing a class Calculator with method for addition, subtraction, multiplication, and division. 


import mypackage.Calculator;
import java.util.Scanner;

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("n1 : ");
		int n1 = sc.nextInt();

		System.out.print("n2 : ");
		int n2 = sc.nextInt();

		Calculator c = new Calculator();

		System.out.println("Addition : " + c.addition(n1, n2));
		System.out.println("Subtraction : " + c.subtraction(n1, n2));
		System.out.println("Multiplicatino : " + c.multiplication(n1, n2));
		System.out.println("Division : " + c.division(n1, n2));

		sc.close();
		
	}
}



12. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee(). 


class Employee
{
	void work()
	{
		System.out.println("Employee is working");
	}
	int getSalary()
	{
		return 1000000;
	}
}

class HRManager extends Employee
{
	void work()
	{
		System.out.println("HR Manager is working");
	}

	void addEmployee()
	{
		System.out.println("HR Manager is adding employees");
	}
}

class test
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		HRManager hr = new HRManager();

		e.work();
		System.out.println("Employee Salary : " + e.getSalary());

		hr.work();
		System.out.println("HR Manager Salary : " + hr.getSalary());
		hr.addEmployee();
	}
}


13. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle. 


import java.util.Scanner;

import org.w3c.dom.css.Rect;

class Shape
{
	double getArea()
	{
		return 0;
	}
}

class Rectangle extends Shape
{
	double l, w;

	Rectangle(double l, double w)
	{
		this.l = l;
		this.w = w;
	}

	double getArea()
	{
		return l * w;
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of rectangle : ");
		double l = sc.nextDouble();

		System.out.print("Enter width of rectangle : ");
		double w = sc.nextDouble();

		Rectangle r = new Rectangle(l, w);

		System.out.println("Area of Rectangle : " + r.getArea());

		sc.close();
	}
}



14. Write a Java program to implement an abstract class Employee with an abstract method calculateSalary(). 


abstract class Employee
{
    int id;
	String name;

    Employee(int id, String name)
    {
		this.id = id;
		this.name = name;
    }

    abstract double calculateSalary();

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee
{
    double basic, bonus;

    Manager(int id, String name, int basic, int bonus)
    {
        super(id, name);
        this.basic = basic;
        this.bonus = bonus;
    }

    double calculateSalary()
    {
        return basic + bonus;
    }
}

class test
{
    public static void main(String args[])
    {
        Manager m = new Manager(1, "Syed", 275000, 25000);

        m.display();
        System.out.println("Salary: " + m.calculateSalary());
    }
}



15. Define a class product(pid,pname,price). Write a function to accept the product details, to display product details and to calculate total amount. 


import java.util.Scanner;

class product
{
	int pid;
	String pname;
	double price;

	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter PID : ");
		pid = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter PName : ");
		pname = sc.nextLine();

		System.out.print("Enter Price : ");
		price = sc.nextDouble();
	}

	void display()
	{
		System.out.println("PID : " + pid);
		System.out.println("PName : " + pname);
		System.out.println("Price : " + price);
	}

	static double calculateTotal(product p[])
    {
        double total = 0;

        for(int i = 0; i < p.length; i++)
        {
            total += p[i].price;
        }

        return total;
    }
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter number of products : ");
		int n = sc.nextInt();

		product p[] = new product[n];

		

		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("\nEnter details of product " + (i + 1) + "\n");

			p[i] = new product();

			p[i].accept();
		}

		double total = product.calculateTotal(p);

		System.out.println("\nTotal : " + total);

	}
}



16. Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method Overloading) 


import java.util.Scanner;

class test
{
	double area(double radius)
	{
		return Math.PI * radius * radius;
	}

	double area(double base, double height)
	{
		return (base * height) / 2;
	}

	double area(int length, int width)
	{
		return length * width;
	}

	public static void main(String args[])
	{
		test t = new test();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of circle : ");
		double radius = sc.nextDouble();

		System.out.print("Enter base of triangle : ");
		double base = sc.nextDouble();

		System.out.print("Enter height of triangle : ");
		double height = sc.nextDouble();

		System.out.print("Enter length of rectangle : ");
		int length = sc.nextInt();

		System.out.print("Enter width of rectangle : ");
		int width = sc.nextInt();

		System.out.println("Area of Circle : " + t.area(radius));
		System.out.println("Area of triangle : " + t.area(base, height));
		System.out.println("Area of rectangle : " + t.area(length, width));

		sc.close();
	}
}


Unit 3 – File and Exception Handling

1. Write a java program to accept a number from user, if it zero then throw user defined Exception “Number Is Zero”, otherwise calculate the sum of first and last digit of that number. (Use static keyword). 


import java.util.Scanner;

class NumberZeroException extends Exception
{
	NumberZeroException(String msg)
	{
		super(msg);
	}
}

class test
{
	static int n;

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
			
		n = sc.nextInt();

		try
		{
			if(n == 0)
			{
				throw new NumberZeroException("Number is zero!");
			}

			int lastD = n % 10;

			int firstD = n;
			while(firstD >= 10)
			{
				firstD = firstD / 10;
			}

			int sum = lastD + firstD;

			System.out.println("The sum of first and last digit : " + sum);
		} 
		catch (NumberZeroException e) 
		{
			System.out.println(e);
		}
	}
}



2. Write a ‘java’ program to copy only non-numeric data from one file to another file. 


import java.io.*;

class test
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("input.txt");
		FileWriter fw = new FileWriter("output.txt");

		int ch;

		while((ch = fr.read()) != -1)
		{
			if(!Character.isDigit(ch))
			{
				fw.write(ch);
			}
		}

		fr.close();
		fw.close();

		System.out.println("Data Copied");
	}
}



3. Write a java program to validate PAN number and Mobile Number. If it is invalid then throw user defined Exception “Invalid Data”, otherwise display it. 


import java.io.*;
import java.util.Scanner;

class InvalidDataException extends Exception
{
	InvalidDataException(String msg)
	{
		super(msg);
	}
}

class test
{
	static boolean isValidPAN(String pan)
	{
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	static boolean isValidMOB(String mob)
	{
		if(mob.length() != 10)
		{
			return false;
		}
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter PAN Number : ");
		String pan = sc.next();

		System.out.print("Enter Mobile Number : ");
		String mob = sc.next();

		try
		{
			if(!isValidPAN(pan) || !isValidMOB(mob))
			{
				throw new InvalidDataException("Invalid Data");
			}

			System.out.println("PAN : " + pan);
			System.out.println("Mobile : " + mob);
		}
		catch(InvalidDataException e)
		{
			System.out.println(e);
		}
	}
}



4. Write a java program to count number of lines, words and characters from a given file. 


import java.io.*;

class test
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));

		int lines = 0, words = 0, characters = 0;

		String line;

		while((line = br.readLine()) != null)
		{
			lines++;

			characters += line.length();

			String w[] = line.trim().split("\\s+");

			if(line.trim().length() != 0)
			{
				words += w.length;
			}
		}

		br.close();

		System.out.println("Lines : " + lines);
		System.out.println("Words : " + words);
		System.out.println("Characters : " + characters);

	}
}



5. Write a java program to accept a number from the user, if number is zero then throw user defined exception ―Number is 0, otherwise check whether no is prime or not. 


import java.io.*;
import java.util.Scanner;

class NumberZeroException extends Exception
{
	NumberZeroException(String msg)
	{
		super(msg);
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		try
		{
			if(n == 0)
			{
				throw new NumberZeroException("Number is 0");
			}

			int count = 0;

			for(int i = 2 ; i < n ; i++)
			{
				if(n % i == 0)
				{
					count++;
				}
			}

			if(count == 0)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not Prime");
			}
		}
		catch(NumberZeroException e)
		{
			System.out.println(e);
		}
	}
}



6. Write a java program to accept a number from a user, if it is zero then throw user defined Exception “Number isZero”. If it is non-numeric then generate an error “Number is Invalid” otherwise check whether it is palindrome or not. 

import java.util.Scanner;

class NumberIsZeroException extends Exception
{
    NumberIsZeroException(String msg)
    {
        super(msg);
    }
}

class test
{
    static boolean isPalindrome(int num)
    {
        int original = num;
        int reverse = 0;

        while(num != 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        try
        {
            int num = Integer.parseInt(input);

            if(num == 0)
            {
                throw new NumberIsZeroException("Number is Zero");
            }

            if(isPalindrome(num))
            {
                System.out.println("Palindrome Number");
            }
            else
            {
                System.out.println("Not a Palindrome Number");
            }
        }

		catch(NumberFormatException e)
        {
            System.out.println("Number is Invalid");
        }

		catch(NumberIsZeroException e)
        {
            System.out.println(e);
        }
    }
}


7. Write a java program to accept a number from user, If it is greater than 100 then throw user defined exception “Number is out of Range” otherwise do the addition of digits of that number. (Use static keyword.) 


import java.io.*;
import java.util.Scanner;

class NumberOutOfRangeException extends Exception
{
	NumberOutOfRangeException(String msg)
	{
		super(msg);
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		try
		{
			if(n > 100)
			{
				throw new NumberOutOfRangeException("Number is out of range");
			}

			int sum = 0;

			while(n != 0)
			{
				sum = sum + (n % 10);
				n = n / 10;
			}

			System.out.println("Sum of digits : " + sum);
		}
		catch(NumberOutOfRangeException e)
		{
			System.out.println(e);
		}
	}
}



Unit 4 – Multithreading

1. Write a Java program to create a thread that prints the first 5 Fibonacci numbers. 


class Fibonacci extends Thread
{
	public void run()
	{
		int a = 0, b = 1, c;

		System.out.print("\nFibonnaci Numbers : ");

		for(int i = 1 ; i <= 5 ; i++)
		{
			System.out.print(a + "  ");

			c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
	}
}

class test
{
	public static void main(String args[])
	{
		Fibonacci f = new Fibonacci();

		f.start();
	}
}



2. Write a Java program to create a thread that reverses a string and prints it. 


import java.util.Scanner;

class Reverse extends Thread
{
	String str;

	Reverse(String str)
	{
		this.str = str;
	}

	public void run()
	{
		String rs = new StringBuilder(str).reverse().toString();

		System.out.println("\nOriginal String : " + str);
		System.out.println("Reversed String : " + rs);
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String str = sc.next();

		Reverse r = new Reverse(str);

		r.start();

		sc.close();
		
	}
}



3. Write a ‘java’ program to check whether given number is Armstrong or not.(Use thread) 


import java.util.Scanner;

class CheckArmstrong extends Thread
{
	int n;

	CheckArmstrong(int n)
	{
		this.n = n;
	}

	public void run()
	{
		int temp = n, digits = 0, sum = 0;
		while(temp != 0)
		{
			digits++;
			temp = temp / 10;
		}
		
		temp = n;

		while(temp != 0)
		{
			int rem = temp % 10;
			sum = sum + (int)Math.pow(rem, digits);
			temp = temp / 10;
		}

		if(n == sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		CheckArmstrong ca = new CheckArmstrong(n);

		ca.start();

		sc.close();

	}
}



4. Write a Java program to calculate the sum of numbers from 1 to 10 using a thread.  


class Sum extends Thread
{
	public void run()
	{
		int sum = 0;

		for(int i = 1 ; i <= 10 ; i++)
		{
			sum = sum + i;
		}
		System.out.println("The sum of numbers from 1 to 10 : " + sum);
	}
}

class test
{
	public static void main(String args[])
	{
		Sum s = new Sum();

		s.start();
	}
}



5. Write a Java program to simulate a Traffic Signal System using multithreading, where each signal (Red, Yellow, Green) runs as a separate thread. 


class TrafficSignal extends Thread
{
	String color;

	TrafficSignal(String color)
	{
		this.color = color;
	}

	public void run()
	{
		try
		{
			System.out.println(color + " Signal is ON");
			Thread.sleep(2000);
			System.out.println(color + " Signal OFF\n");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class test
{
	public static void main(String args[]) throws InterruptedException
	{
		TrafficSignal red = new TrafficSignal("RED");
		TrafficSignal yellow = new TrafficSignal("YELLOW");
		TrafficSignal green = new TrafficSignal("GREEN");

		red.start();
		red.join();

		yellow.start();
		yellow.join();

		green.start();
		green.join();
	}
}



6. Write a Java program to take a number from the user and print all odd numbers from 1 to n.(Use thread) 


import java.util.Scanner;

class OddNumbers extends Thread
{
	int n;

	OddNumbers(int n)
	{
		this.n = n;
	}
	public void run()
	{
		for(int i = 1 ; i < n ; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		OddNumbers on = new OddNumbers(n);

		on.start();

		sc.close();
	}
}



7. Write a Java program to demonstrate multithreading using a Railway Reservation System, where one thread handles ticket booking and another thread handles ticket cancellation simultaneously. 


import java.util.*;
import java.io.*;

class Reservation
{
	synchronized void book()
	{
		System.out.println("Ticket Booked.");
	}
	
	synchronized void cancel()
	{
		System.out.println("Ticket Cancelled.");
	}
}

class TicketBooking extends Thread
{
	Reservation r;
	
	TicketBooking(Reservation r)
	{
		this.r = r;
	}
	
	public void run()
	{
		r.book();
	}
} 

class TicketCancellation extends Thread
{
	Reservation r;
	
	TicketCancellation(Reservation r)
	{
		this.r = r;
	}
	
	public void run()
	{
		r.cancel();
	}
}

class test
{
	public static void main(String args[])
	{
		Reservation r = new Reservation();
		
		TicketBooking tb = new TicketBooking(r);
		TicketCancellation tc = new TicketCancellation(r);
		
		tb.start();
		tc.start();
	}
}



8. Write a Write a Java program to create a thread that checks whether a number is Armstrong or not. 


import java.util.Scanner;

class CheckArmstrong extends Thread
{
	int n;

	CheckArmstrong(int n)
	{
		this.n = n;
	}

	public void run()
	{
		int temp = n, digits = 0, sum = 0;
		while(temp != 0)
		{
			digits++;
			temp = temp / 10;
		}
		
		temp = n;

		while(temp != 0)
		{
			int rem = temp % 10;
			sum = sum + (int)Math.pow(rem, digits);
			temp = temp / 10;
		}

		if(n == sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		CheckArmstrong ca = new CheckArmstrong(n);

		ca.start();

		sc.close();

	}
}



9. Write a Java program to create a thread that checks whether a number is Armstrong or not.


import java.util.Scanner;

class CheckArmstrong extends Thread
{
	int n;

	CheckArmstrong(int n)
	{
		this.n = n;
	}

	public void run()
	{
		int temp = n, digits = 0, sum = 0;
		while(temp != 0)
		{
			digits++;
			temp = temp / 10;
		}
		
		temp = n;

		while(temp != 0)
		{
			int rem = temp % 10;
			sum = sum + (int)Math.pow(rem, digits);
			temp = temp / 10;
		}

		if(n == sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		CheckArmstrong ca = new CheckArmstrong(n);

		ca.start();

		sc.close();

	}
}



Unit 5 – User Interface using Swing

1. Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICK and display the position 
of the Mouse_Click in a TextField. 


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class test extends JFrame implements MouseListener, MouseMotionListener
{
    JTextField textField;

    test()
    {
        // Frame setup
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // TextField to display click position
        textField = new JTextField(25);
        add(textField);

        // Register listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Mouse Click Event
    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();

        textField.setText("Mouse Clicked at: (" + x + ", " + y + ")");
    }

    // Mouse Move Event
    public void mouseMoved(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();

        setTitle("Mouse Moving at: (" + x + ", " + y + ")");
    }
	public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}

	public static void main(String[] args)
    {
        new MouseEventDemo();
    }
}



2. Write a Java program to create a JFrame window with the title “Computer Application” with a JLabel that shows your name 


import javax.swing.*;

class test
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Computer Application");

		JLabel label = new JLabel("Mustaqeem Ahmed Syed", JLabel.CENTER);

		frame.setSize(300, 200);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}



3. Write a Java program to create a JFrame window with the title “My First Swing Application” with a Jlabel that shows your name. 


import javax.swing.*;

class test
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("My First Swing Application");

		JLabel label = new JLabel("Mustaqeem Ahmed Syed", JLabel.CENTER);

		frame.setSize(300, 200);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}



4. Write a Java program to create a JFrame with a JButton that displays a message when clicked. 


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class test
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();

		JButton button = new JButton("Click Me");

		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(frame, "Button Clicked");
			}
		});

		frame.add(button);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}



5. Write a Program to design following GUI by using swing component JComboBox. On click of show button display the selected language on Jlabel 


import javax.swing.*;
import java.awt.event.*;

class test
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("ComboBox Example");

        String languages[] = {"C", "C++", "C#", "Java", "PHP"};

        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setBounds(100, 80, 120, 30);

        JLabel label = new JLabel("Programming language Selected: ");
        label.setBounds(60, 30, 300, 30);

        JButton button = new JButton("Show");
        button.setBounds(250, 80, 100, 30);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                String selectedLang = (String) comboBox.getSelectedItem();
                label.setText("Programming language Selected: " + selectedLang);
            }
        });

        frame.add(comboBox);
        frame.add(button);
        frame.add(label);

        frame.setSize(420, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



6. Write a Java program to create JRadioButtons for choosing a payment mode (Cash, UPI, Card) and display the selected mode when a button is clicked 


import javax.swing.*;
import java.awt.event.*;

public class test
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Payment Mode Selection");

        JRadioButton cash = new JRadioButton("Cash");
        JRadioButton upi = new JRadioButton("UPI");
        JRadioButton card = new JRadioButton("Card");

        cash.setBounds(100, 50, 100, 30);
        upi.setBounds(100, 80, 100, 30);
        card.setBounds(100, 110, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(cash);
        group.add(upi);
        group.add(card);

        JButton button = new JButton("Submit");
        button.setBounds(100, 150, 120, 40);

        button.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String message = "No option selected";

                if (cash.isSelected()) 
				{
                    message = "Payment Mode: Cash";
                } 
				else if (upi.isSelected()) 
				{
                    message = "Payment Mode: UPI";
                } 
				else if (card.isSelected())
				{
                    message = "Payment Mode: Card";
                }

                JOptionPane.showMessageDialog(frame, message);
            }
        });

        frame.add(cash);
        frame.add(upi);
        frame.add(card);
        frame.add(button);

        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



7. Write java program to design a following GUI. Use appropriate Layout and Components.


import javax.swing.*;
import java.awt.*;

public class test 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(3, 1, 10, 10));

        JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);
        userPanel.add(userLabel);
        userPanel.add(userField);

        JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        passPanel.add(passLabel);
        passPanel.add(passField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
        JButton loginBtn = new JButton("Login");
        JButton resetBtn = new JButton("Reset");

        buttonPanel.add(loginBtn);
        buttonPanel.add(resetBtn);

        mainPanel.add(userPanel);
        mainPanel.add(passPanel);
        mainPanel.add(buttonPanel);

        frame.add(mainPanel);

        frame.setVisible(true);
    }
}



8. Write a java program to create the following GUI using Swing components. 


import javax.swing.*;
import java.awt.*;

public class test 
{
    public static void main(String[] args) 
	{
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout(10, 10));

        JTextField display = new JTextField();
        display.setPreferredSize(new Dimension(300, 50));
        display.setFont(new Font("Arial", Font.BOLD, 18));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        String buttons[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                ".", "0", "=", "+"
        };

        for (String text : buttons) 
        {
            JButton btn = new JButton(text);
            panel.add(btn);

            btn.addActionListener(e -> 
            {
                display.setText(display.getText() + text);
            });
        }
    
		frame.add(panel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JButton clearBtn = new JButton("Clear");
        clearBtn.setPreferredSize(new Dimension(100, 30));
        bottomPanel.add(clearBtn);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}



9. Write a Java program to create a JLabel that changes color when a button is clicked.


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Label Color Change");

        JLabel label = new JLabel("Hello!", JLabel.CENTER);
        label.setBounds(100, 50, 200, 30);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.BLACK);

        JButton button = new JButton("Change Color");
        button.setBounds(120, 120, 150, 40);

        button.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                label.setForeground(Color.RED); // Change text color
            }
        });

        frame.add(label);
        frame.add(button);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

*/