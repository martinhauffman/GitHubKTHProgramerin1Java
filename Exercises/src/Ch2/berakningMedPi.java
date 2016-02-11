package Ch2;

public class berakningMedPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float radius = 3F;
		double Pi = Math.PI;
		double diameter = 0;
		double omkrets = 0F;
		double area = 0F;
		
		diameter = radius * 2;
		omkrets = diameter * Pi;
		area = Pi *  Math.pow(radius, 2);
		
		System.out.println("Pi = " + Pi);
		System.out.println("radien = " + radius);
		System.out.println("diameter = " + diameter);
		System.out.println("area = " + area);
		
	}

}
