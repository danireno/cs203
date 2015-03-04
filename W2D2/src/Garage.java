import java.util.ArrayList;
public class Garage {
	private Automobile auto;
	private ArrayList<Item> things=new ArrayList<Item>();
	
	public void store(Automobile a){
		auto=a;
	}
	public void store(Item i){
		things.add(i);
	}
	public Automobile retrieve(){
		return this.auto;
	}
	public Item retrieve(int index){
		return things.get(index);
		
	}
	

}
