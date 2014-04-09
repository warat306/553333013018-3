package Lab2;

import java.util.Arrays;
	
	public class TestCall {
		
		public static void main(String[] args) {
			Rafael Rafael = new Rafael();
			System.out.println("Name : "+Rafael.getName());
			System.out.println("Position : "+Rafael.getPosition());
			System.out.println("Friend : "+Arrays.toString(Rafael.getFriend()));
	}

}
