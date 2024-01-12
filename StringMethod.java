
class StringMethod
{
	public static void main(String ar[]){
		String a="Hello Shantanu, How are you? Shantanu";
		System.out.println(a.charAt(4)); 
		// .charAt()- It returns a charachter at specific index..
		System.out.println(a.indexOf('o')); 
		// .indexOf() - it returns the index no of the specific charatcter.. 
		System.out.println(a.lastIndexOf('o')); 
		// .lastIndexOf()- it returns the last index no of the specific charatcter..  
		System.out.println(a.length());
		// .length()- It returns the length of the string..
		System.out.println(a.toUpperCase());
		// .toUpperCase()- It returns the complete string in capital format..
		System.out.println(a.toLowerCase());
		// .toLowerCase()- It returns the complete string in small format..
		System.out.println(a.trim());
		// .trim()-it removes the white spaces before and after the string..
		System.out.println(a.startsWith("He")); 
		//.startsWith()- It check the string starts with what and give output accordingly..
		System.out.println(a.endsWith("He"));
		//.endsWith()- It check the sytring ends  with what and give output accordingly..
		System.out.println(a.replace("Shantanu", "Vishal"));
		//.replace("A", "B") or .replaceAll("A", "B") - it replace String A by String B..
		
		int b=10;                          
		String p = String.valueOf(b);  //String.valueOf(b)- It converts the int, long, float,boolean,char into String..
        System.out.println(p+100);		   
		int k=10;                          
		String l = Integer.toString(k);  //alternate method for conversion of int to string - Integer.toString(b)
		System.out.println(l+100);
		
		
		String s="Java";                /* S1.equals(S2) - it checks whether the two string are equals or not */
	    String t="Python";
	    System.out.println(s.equals(t));
		System.out.println(s.concat(t));  // a.concat(b)- it combines a string a and astring b..
		System.out.println(t.substring(1,5)); // .substring(a,b) - It write the string from a to b..
		System.out.println(t.compareTo(s));   //  a.compareTo(b) - it find the difference of intial  character of string 
		
	}
       
}