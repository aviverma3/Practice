package Java8StreamNew;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
			list.add(20);
			list.add(14);
			list.add(12);
			list.add(16);
			list.add(12);
			list.add(50);
			
			list.stream().distinct().forEach(e->System.out.println(e));
			System.out.println("Its sorting");
			list.stream().sorted().forEach(s->System.out.println(s));
			System.out.println("now custom sorting based on age and name");
	
		
		//reverse order
		/*
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println
		 * (e)); //list.stream().
		 * 
		 * 
		 * System.out.println(10 + 20 + "Capita");//30Capita System.out.println(10 * 20
		 * + "Capita");//200Capita System.out.println("Capita" + 10 + 20);//capita1020
		 * System.out.println("Capita" + 10 * 20);//capita200
		 */		}
	}


