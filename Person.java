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
	
	public Person(String name, int age, String gender, Person father)
	{
		this.name = name;
		this.age = age;	
		this.gender = gender;
		this.father = father;
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
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public String getFatherName()
	{
		return this.father.getName();
	}
	
	public String getMotherName()
	{
		return this.mother.getName();
	}
	
	public String getGrandFatherName()
	{
		return this.grandFather.getName();
	}
	
	public String getSonName()
	{
		return this.son.getName();
	}	
	
	public Person getSon()
	{
		return this.son;
	}
	
	public Person getDaughter()
	{
		return this.daughter;
	}
	
	public Person getFather()
	{
		return this.father;
	}
	
	public Person getMother()
	{
		return this.mother;
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
		if (genderParent.toUpperCase().equals("MALE"))
		{
			this.father = parent;
			if ((genderChild.toUpperCase().equals("MALE")) && (parent.getSon() == null))
			{
				parent.setChild(this);
			}
			else if ((genderChild.toUpperCase().equals("FEMALE")) && (parent.getDaughter() == null))
			{
				parent.setChild(this);
			}
			
		}
		else if (genderParent.toUpperCase().equals("FEMALE"))
		{
			this.mother = parent;
			if ((genderChild.toUpperCase().equals("FEMALE")) && (parent.getDaughter() == null))
			{
				parent.setChild(this);
			}
			else if ((genderChild.toUpperCase().equals("MALE")) && (parent.getSon() == null))
			{
				parent.setChild(this);
			}
			
		}
	}
	
	public void setGrandparent(Person grandParent)
	{
				
	}
	
	public void setChild(Person child)
	{
		String genderChild = child.getGender();		
		if (genderChild.toUpperCase().equals("MALE"))
		{
			this.son = child;
			if (child.getFather() == null)
			{
				child.setParent(this);
			}			
		}
		else if (genderChild.toUpperCase().equals("FEMALE"))
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
