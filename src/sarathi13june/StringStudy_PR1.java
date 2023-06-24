package sarathi13june;

public class StringStudy_PR1 {

	public static void main(String[] args) {
		
		String s="Velocity";
		String s1="Velocity";
		String s2=" Nashik";
		
		String m = new String("Java Class");
		
			System.out.println(s.length());	// find the length of string
			
			System.out.println(s==s1);  //name same in s=ss1--> true
			
			System.out.println(s==s2); //name same in s=ss1--> False

			System.out.println(s.equals(s1));
			
			System.out.println(s.equals(s2));
			
			System.out.println(s.toUpperCase());
			
			System.out.println(m.toLowerCase());
			
			System.out.println(m.charAt(6));
			
			System.out.println(m.contains("J")); //any contain sentance word -->true
			
			
			System.out.println(m.endsWith("Class "));
			
			System.out.println(m.startsWith("Java Class"));
			
			System.out.println(s.startsWith(s1));
			
			System.out.println(s1.concat(s2));  // add two string name
			
			String p="Vikrant";
			String p1=" Pravin";
			String p2=" Thorat";
		
			p=p.concat(p1);
			
			System.out.println(p.concat(p2));
					
			String k=new String  (" Kanchan");
			
			
			p=p.concat(p1).concat(p2);
			
			System.out.println(p.concat(k));
	}

}
