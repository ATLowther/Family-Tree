
public class FamilyTreeTest {

	public static void main(String[] args) {
		Person dad = new Person("Scott Rick", 45, "Male");		
		Person me = new Person("Rick Scott", 35, "Male");
		me.setParent(dad);
		Person father = me.getFather();
		if (father == null)
		{
			System.out.println("Father is null.");
		}
		else
		{
			System.out.println(me.getFatherName());
		}
		
		//System.out.println("My dad's name is: " + me.getFatherName() + 
		//		"My son's name is: " + dad.getSonName());
				

	}

}
