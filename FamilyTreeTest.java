
public class FamilyTreeTest {

	public static void main(String[] args) {
		Person me = new Person("Rick Scott", 35);
		Person dad = new Person("Scott Rick", 45);
		Person grandpa = new Person("Sick Rcott", 62);
		me.setParent(dad);
		me.setGrandParent(grandpa);
		System.out.println("My dad's name is: " + me.getParentName() + 
				" My grandfather's name is: " + me.getGrandParentName() );

	}

}
