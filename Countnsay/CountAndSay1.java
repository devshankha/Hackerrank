// Another implementation of countandsay algorithm
//this is my own implementation
class Count {
	static String countAndSay(int n) {
		String str = "11";		
		for (int i = 2; i <= n; i++) {
			StringBuffer res = new StringBuffer();
			int k = 0;
			for (; k < str.length();) {
				char temp = str.charAt(k);
				int count = 0;
				while (k < str.length() && str.charAt(k) == temp) {
					count++;
					k++;
				}			
				res = res.append(Integer.toString(count) + temp);	

			}
			str = res.toString();
		}
		if (n == 0)
			return new String("1");
		if (n == 1)
			return new String("11");
		return str;

	}
}

public class CountAndSay1 {
	public static void main(String[] args) {
		System.out.println(Count.countAndSay(3));

	}

}
