package Java8StreamNew;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDup {

	public static void main(String[] args) {

        ArrayList<String> techCompanies = new ArrayList<String>();
 
        
       // ArrayList<String> techCompanies1 = new ArrayList<String>();
        // adding elements to ArrayList object
        techCompanies.add("Instagram");
        techCompanies.add("We Chat");  
        techCompanies.add("Facebook"); 
        techCompanies.add("Whatsup");
        techCompanies.add("Instagram");
        techCompanies.add("LinkedIn");
        techCompanies.add("Facebook");
        techCompanies.add("Instagram");
        
        HashSet<String> hs = new HashSet<>(techCompanies);
        System.out.println(hs);
        
        //to remove the duplicate and maintain the order using LinkedHashset
		/*
		 * LinkedHashSet<String> lhs = new LinkedHashSet<>(techCompanies);
		 * System.out.println(lhs );
		 */
        //Stream API to remove the dupliate
		/*
		 * List<String> list =
		 * techCompanies.stream().distinct().collect(Collectors.toList());
		 * System.out.println(list);
		 */
        
        
    	   
       }
       
	}

