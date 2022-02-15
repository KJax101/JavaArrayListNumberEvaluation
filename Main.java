package Q19ArrayListResults;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>(10);
		//all arrayLists are generic
		for(int i = 1; i <= 10; i++) {
			arrlist.add(i);
		}
		System.out.println(Arrays.toString(arrlist.toArray()));
		int result = 0;
		for(Integer num : arrlist) {
			if(num%2 == 0) {
				result += num;
			}
		}
		System.out.println(result);
		
		result = 0;
		for(Integer num : arrlist) {
			if(num%2 == 1) {
				result += num;
			}
		}
		System.out.println(result);
		
		ArrayList<Integer> noPrimes = new ArrayList<Integer>();
		
		for(Integer num : arrlist) {
			int temp;
			boolean isPrime = true;
			for(int i=2; i<num/2; i++) {
				temp = num%i;
				if(temp==0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime == true) {
				noPrimes.add(arrlist.indexOf(num));
			}
		}
		
		System.out.println(Arrays.toString(noPrimes.toArray()));

	}
	
	
}
