package abcd;

import java.io.Serializable;

// A Class whose object are been serialized, that class must 
 // implements the Serializabele interface

// Serializable is an marker interface, means it do not have any abstract methods....

// At compile time compiler understands the purpose of this class, class which implements
 // marker interface and hence it gives some functionality to it....
public class Serialization_jerry1 implements Serializable {
	private int salary;
	
	Serialization_jerry1()
	{}
	
	Serialization_jerry1(int Salary)
	{
		salary = Salary;
	}
	
	public int getSalary()
	{
		return salary;
	}
}
