import com.course.structure.*;

public class L7_Q1 {

	public static void main(String[] args) {
		System.out.println("Working on Building");
		Building b = new Building();

		System.out.println("Working on School");
		School s = new School();
		s.set_grade();
		s.set_qty_classroom();

		System.out.println("Working on House");
		House h = new House();
		h.set_qty_bathroom();
		h.set_qty_bedroom();

		System.out.println("Displaying Building");
		b.display();

		System.out.println("Displaying School");
		s.display();
		s.get_grade();
		s.get_qty_classroom();

		System.out.println("Displaying House");
		h.display();
		h.get_qty_bathroom();
		h.get_qty_bedroom();
	}

}
