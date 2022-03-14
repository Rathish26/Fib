package org.fib;

public class Fibonacci {
	private void sample() {

		int pf = 1, sf = 0, cr = 0;
				
		for(int i = 1; i<=8; i++) {
			
			System.out.println(cr);
			
			sf = pf;
			pf = cr + pf;
			cr = sf;
			
			
		}
	}
		public static void main(String[] args) {
			Fibonacci h = new Fibonacci();
		h.sample();
		}
		

}
