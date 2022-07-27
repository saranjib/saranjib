package string;

public class Immutabel {
	private int number;
	Immutabel(int number){
		this.number=number;
	}
	public Immutabel modify(int number){
		if(this.number==number){
			return this;
		}
		else{
			return(new Immutabel(number));
		}
	}
	public static void main(String[] args) {
		Immutabel i1 = new Immutabel(10);
		Immutabel i2 = i1.modify(100) ;
		Immutabel i3 = i1.modify(10);
		System.out.println(i1==i2);
		System.out.println(i1==i3);
	}

}
