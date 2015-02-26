
public class Dog {
	String name="jack ";
	public static void main(String args[]){
		Dog dog1=new Dog();
		dog1.bark();
		dog1.name="bart ";
		Dog[] MyDogs=new Dog[3];
		MyDogs[0]=new Dog();
		MyDogs[1]=new Dog();
		MyDogs[2]=dog1;
		MyDogs[0].name="fred";
		MyDogs[1].name="Marqe";
		MyDogs[1].eat();
		MyDogs[2].chaseCat();
		
		System.out.print("last dog's name is ");
		System.out.print(MyDogs[2].name);
		int x=0;
		while(x<MyDogs.length){
			MyDogs[x].bark();
			x=x+1;
		}
		
		
		
	}
public void bark(){
	System.out.println(name + " says Ruff!");
}
public void eat(){
	System.out.println("i like bone ");
}
public void chaseCat(){
	System.out.println("i like to chase a cat");
	
}
}
