
public class FamilyTreeTest {

	public static void main(String[] args) {
		Person me = new Person("Rick Scott", 35, "Male");
		Person dad = new Person("Scott Rick", 45, "Male");		
		me.setParent(dad);	
		String name = me.getFatherName();
		System.out.print(name);
		//System.out.println("My dad's name is: " + me.getFatherName() + 
		//		"My son's name is: " + dad.getSonName());
				

	}

}
