import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main
{
	public static void main(String[] args) {
		System.out.println("HashMap => doesn't follow the insertion order");
		
		Map<String,String> hm=new HashMap<>();
		
		hm.put("first", "one");
		hm.put("second", "two");
		hm.put("third", "three");
		hm.put("fourth", "four");
		hm.put("fifth", "five");
		
		System.out.println(hm);
		System.out.println();
		System.out.println("LinkedHashMap => follows the insertion order");
		
		Map<String,String> lhm=new LinkedHashMap<>();
		
		lhm.put("first", "one");
		lhm.put("second", "two");
		lhm.put("third", "three");
		lhm.put("fourth", "four");
		lhm.put("fifth", "five");
		
		System.out.println(lhm);
		System.out.println();
		System.out.println("TreeMap => alphabetical sorting");
		
		Map<String,String> thm=new TreeMap<>();
		
		thm.put("first", "one");
		thm.put("second", "two");
		thm.put("third", "three");
		thm.put("fourth", "four");
		thm.put("fifth", "five");
		
		System.out.println(thm);
		
	}
}



/*************************************************************
Output:
HashMap => doesn't follow the insertion order
{third=three, fifth=five, fourth=four, first=one, second=two}

LinkedHashMap => follows the insertion order
{first=one, second=two, third=three, fourth=four, fifth=five}

TreeMap => alphabetical sorting
{fifth=five, first=one, fourth=four, second=two, third=three}

*************************************************************/

