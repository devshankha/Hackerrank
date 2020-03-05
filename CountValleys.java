import java.util.Stack;

// This is my own solution to the hackerrank problem countingValleys --
//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

//
public class CountValleys {
	static int countValleys(int n, String s) {
		boolean atSeaLevel = true;
		boolean InMountain = false;
		boolean InValley = false;
		Stack<Character> stackM = new Stack<>();
		Stack<Character> stackV = new Stack<>();
		int valleyCount = 0;
		for (int i =0; i < s.length();i++) {
			if (atSeaLevel) {
				if (s.charAt(i) == 'U') {
					InMountain = true;
					stackM.push('U');
				}
				if (s.charAt(i) == 'D') {
					InValley = true;
					stackV.push('D');
				}
				atSeaLevel = false;
				continue;
				
			}
			if (InMountain) {
				if (s.charAt(i) == 'U') {
					stackM.push('U');
					continue;
					
				}
				if (s.charAt(i) == 'D') {
					stackM.pop();
					if (stackM.isEmpty()) {
						atSeaLevel = true;
						InMountain = false;
					}
					continue;
						
					
				}
				
				
			}
			
			if (InValley) {
				if (s.charAt(i) == 'D') {
					stackV.push('D');
					continue;
					
				}
				
				if (s.charAt(i) == 'U') {
					stackV.pop();
					if (stackV.isEmpty()) {
						atSeaLevel = true;
						InValley = false;
						valleyCount++;
					}
					continue;
						
					
				}
				
			}
			
		}
		return valleyCount;
	}
	public static void main(String[] args) {
		String s1 ="UUDDDUDDUU";
		int n = 10;
		System.out.println(countValleys(n, s1));
		
		
	}

}
