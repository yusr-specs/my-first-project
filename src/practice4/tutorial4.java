package practice4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class tutorial4 {

public static void main (String[] args)
{

/*ArrayList bl=new ArrayList<>();
bl.add("hello");
bl.add(4.5);
bl.add(2);
for (Object i:bl)
{
	System.out.println(i);
}*/
	
	ArrayList  al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
			al.add(sc.nextLine());
		al.add(sc.nextInt());
		al.add(sc.nextDouble());
		for(Object i: al)
		{
			System.out.println(i);
		}
		HashMap<String,Object> hm=new HashMap<>();
		hm.put("SIN",12345);
		hm.put("Name","Alpha");
		hm.put("DOB", 13);
		for(Entry<String, Object> m:hm.entrySet())
		{
			System.out.println(m.getKey()+"==" +m.getValue());
		}
	
}
}
