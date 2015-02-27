
public class TestComparisonClass {

	public static void main(String[] args) {
		byte b=5;
		short s=5;
		int i=5;
		long l=5;
		float f=5.0f;
		double d=5.0;
		String s1="Mi";
		String s2="Mi";
		String s3="MiMi";
		System.out.println(b==s);
		System.out.println(s==i);
		System.out.println(i==l);
		System.out.println(l==f);
		System.out.println(f==d);
		System.out.println(s1==s2);
		String s5=s1+s2;
		System.out.println(s5==s3);
		System.out.print(s5.equals(s3));
		

	}

}
