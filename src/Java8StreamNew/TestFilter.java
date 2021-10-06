package Java8StreamNew;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(101, "Aviansh", 28));
		al.add(new Employee(102, "Tannu", 24));
		al.add(new Employee(103, "Yash", 22));
		al.add(new Employee(104, "Anshu", 20));
		al.add(new Employee(105, "Ritesh", 32));

		//Greatr than 25
		Long count  =  al.stream()
						 .filter(e -> e.getAge() >25)
						 .count();
		System.out.println(count);
		//custom sorting by Age
		 al.stream()
			 .sorted((o1,o2) -> (o1.getAge() - o2.getAge()))
			 .forEach(System.out::println);
		 //custom sorting by name
		 System.out.println("custom sorting by name");
		 al.stream()
		   .sorted(Comparator.comparing(s -> s.getName()))
		   .forEach(System.out::println);
		 //custom sorting using method reference
		 System.out.println("Using method reference");
		 al.stream()
		   .sorted(Comparator.comparing(Employee::getName))
		   .forEach(System.out::println);
	}

}
