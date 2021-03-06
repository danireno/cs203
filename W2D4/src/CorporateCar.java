
public class CorporateCar extends Vehicle implements Asset {
	public int purchasePrice;
	public int currentValue;
	private int yearPurchased;
	private String employee;
	
	
	 public CorporateCar(int x,int y,int direction,int price,int value,int year,String employee){
	  // super(x,y,direction);
		//this.x=x;
		
		this.purchasePrice=price;
		this.currentValue=value;
		this.yearPurchased=year;
		this.employee=employee;
		
	}
	CorporateCar(int price,int value,int year,String employee){
		this.purchasePrice=price;
		this.currentValue=value;
		this.yearPurchased=year;
		this.employee=employee;
	}
	 
   CorporateCar(int price,int value){
	   this.currentValue=value;
	   this.purchasePrice=price;
	   
   }
   
	
	public void accelerate(){
		if(speed <= 60)
			this.speed += 5;
	} 
	public void brake(){
		if(speed >= 5)
			this.speed -= 5;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	@Override
	public int amoritize(int years) {
		int yearsOfPurchase = 2015 - yearPurchased;
		
		int amountRemaining = purchasePrice -(purchasePrice / years) * yearsOfPurchase;
		
		if(currentValue >= amountRemaining)
			return purchasePrice/years;
		else
		
		return (purchasePrice/years) + (amountRemaining - currentValue);
	}
	

}
