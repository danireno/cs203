
public class CheckChar {

	private char ch;

	public CheckChar(char ch){
		this.ch=ch;
	}

//	public char getCh() {
//		return ch;
//	}

//	public void setCh(char ch) {
//		this.ch = ch;
//	}

	public void checkChar(){
		if('A'<=ch && ch<='Z'){
			System.out.println("it is upper case");
		}
		else if('a'<= ch && ch<='z'){
			System.out.println("it is lower case");
		}
		else if('0'<=ch && ch<='9'){
			System.out.println("it is a number ");
		}
		else{
			System.out.println("it is special character ");
		}
	}
//out put 

}
