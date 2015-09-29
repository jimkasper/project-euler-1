public class projecteuler1{
	public static void main(String[] args){
		
		int count = 0;
			
		for(int ix = 3; ix < 1000; ix = ix+3)
			count = count + ix;
		
		for(int ii = 5; ii < 1000; ii = ii+5)
		if (ii % 3 != 0)
			count = count + ii;
				
			
		System.out.println(count);	
		}
	}