// A program to sum all multiples of 3 or 5 below 1000
public class projecteuler1{
	public static void main(String[] args){
		
		int count = 0;
			
		for(int x = 3; x < 1000; x = x+3)
			count = count + x;
		
		for(int i = 5; i < 1000; i = i+5)
			if (i % 3 != 0)
				count = count + i;

		System.out.println("");	
		System.out.println("");	
		System.out.println("");	
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 equals: "+count);
		System.out.println("");		
		System.out.println("");	
		System.out.println("");	

	}
}