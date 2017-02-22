public class Person {
	
	private Person grandParent;
	private Person parent;
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;		
		parent = null;
		grandParent = null;
	}
	
	public Person(String name, int age, Person parent)
	{
		this.name = name;
		this.age = age;
		this.parent = parent;
		grandParent = null;
	}
	
	public Person(String name, int age, Person parent, Person grandParent)
	{
		this.name = name;
		this.age = age;
		this.parent = parent;
		this.grandParent = grandParent;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getParentName()
	{
		return parent.getName();
	}
	
	public String getGrandParentName()
	{
		return grandParent.getName();
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setParent(Person parent)
	{
		this.parent = parent;
	}
	
	public void setGrandParent(Person grandParent)
	{
		this.grandParent = grandParent;
	}
}
