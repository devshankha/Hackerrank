
public class CountandSay {
	
	static String countNsay(int n) {
		if (n <= 0)
			return "";
		String res = "1";
		while (n > 1) {
			StringBuilder cur = new StringBuilder();
			//System.out.println("For n and printing the string "+n +" "+res);
			for (int i =0; i < res.length();i++) {
				int count = 1;
				//int j = i;
				while (((i+1) <= res.length()-1) && (res.charAt(i) == res.charAt(i+1))) {
					count++;
					//j++;
					i++;
					
				}
				//System.out.println("The value of count and res.charAt(i) is "+count+" "+res.charAt(i));
				cur.append(count).append(res.charAt(i));
				
			}
			res = new String(cur);
			//System.out.println("The output is "+res);
			
			n--;
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		//System.out.println(countNsay(2));
		//System.out.println(countNsay(2));
		System.out.println(countNsay(2));
		System.out.println(countNsay(3));
		System.out.println(countNsay(4));
		System.out.println(countNsay(5));
		System.out.println(countNsay(6));
		System.out.println(countNsay(7));
		
	}

}
