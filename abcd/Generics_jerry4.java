package abcd;

public class Generics_jerry4<String, Integer> {
	private String name;
	private Integer salary;
	
	Generics_jerry4(String name, Integer salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public void info()
	{
		System.out.println(name + "'s salary is:- " + salary);
	}
}
