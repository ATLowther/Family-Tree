import java.io.*;
public class Person {
	
	private Person grandMother;
	private Person grandFather;	
	private Person mother;
	private Person father;
	private Person son;
	private Person daughter;
	private Person grandSon;
	private Person grandDaughter;
	private String gender;
	private String name;
	private int age;
	
	public Person(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;	
		this.gender = gender;
		father = null;
		grandFather = null;
		son = null;
	}
	
	public Person(String name, int age, Person father)
	{
		this.name = name;
		this.age = age;
		this.father = father;
		grandFather = null;
	}
	
	public Person(String name, int age, Person father, Person grandFather)
	{
		this.name = name;
		this.age = age;
		this.father = father;
		this.grandFather = grandFather;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getFatherName()
	{
		return father.getName();
	}
	
	public String getGrandFatherName()
	{
		return grandFather.getName();
	}
	
	public String getSonName()
	{
		return son.getName();
	}	
	
	public Person getSon()
	{
		return son;
	}
	
	public Person getDaughter()
	{
		return daughter;
	}
	
	public Person getFather()
	{
		return father;
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
		String genderParent = parent.getGender();
		String genderChild = this.getGender();
		if (genderParent.toUpperCase() == "MALE")
		{
			this.father = parent;
			if ((genderChild.toUpperCase() == "MALE") && (parent.getSon() == null))
			{
				parent.setChild(this);
			}
			else if ((genderChild.toUpperCase() == "FEMALE") && (parent.getDaughter() == null))
			{
				parent.setChild(this);
			}
			
		}
		else if (genderParent.toUpperCase() == "FEMALE")
		{
			this.mother = parent;
			parent.setChild(this);
		}
	}
	
	public void setGrandparent(Person grandParent)
	{
				
	}
	
	public void setChild(Person child)
	{
		String genderChild = child.getGender();		
		if (genderChild.toUpperCase() == "MALE")
		{
			this.son = child;
			if (child.getFather() == null)
			{
				child.setParent(this);
			}			
		}
		else if (genderChild.toUpperCase() == "FEMALE")
		{
			this.daughter = child;
			if (child.getFather() == null)
			{
				child.setParent(this);
			}
			
		}
	}
	
	public void setGrandchild(Person grandChild)
	{
		
	}
}
