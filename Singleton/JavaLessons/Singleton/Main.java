package JavaLessons.Singleton;

public class Main {

	public static void main(String[] args) {
		SimpleSingleton ss = SimpleSingleton.getInstance();
		SimpleSingleton ss1 = SimpleSingleton.getInstance();
		SimpleSingleton ss2 = SimpleSingleton.getInstance();
		int s1,s2,s3;
		s1 = ss.hashCode();
		s2 = ss1.hashCode();
		s3 = ss2.hashCode();
		if (s1 == s2 && s2 == s3)
		{
			System.out.print("Ta sama referencja");
		}
		
	}
	
	
	

}
