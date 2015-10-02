
public class Check {

	// h = 1..12, m = 0..59
	static double angle(int h, int m) {
	    double hAngle = 0.5D * (h * 60 + m);
	    double mAngle = 6 * m;
	    double angle = Math.abs(hAngle - mAngle);
	    angle = Math.min(angle, 360 - angle);
		System.out.print("angle is " + angle);
	    return angle;

	}
	
	public static void main(String[] args) {
		//Check ch = new Check();
		Check.angle(3,0);
				
	}
}
