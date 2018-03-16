package abcd;

public class Generics_jerry1<T> {
	
	T data;
	
	Generics_jerry1(T data)
	{
		this.data = data;
	}
	
	public T display_data()
	{
		return data;
	}

}
