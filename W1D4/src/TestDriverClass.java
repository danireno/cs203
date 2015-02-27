
public class TestDriverClass {

	public static void main(String[] args) {
		Scientist s1=new Scientist();
		GuineaPig g1=new GuineaPig();
		g1.setName("haile");
		int x=90;
		System.out.println(g1.getName());
		System.out.println(x);
		
		s1.ChangeThese(x,g1);
		
		System.out.println(g1.getName());
		System.out.println(x);

	}

}
