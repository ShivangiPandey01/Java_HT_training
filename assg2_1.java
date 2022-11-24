abstract class Animal{
	
	int height;
	double weight;
	
	Animal(int height,double weight){
		this.height=height;
		this.weight=weight;
	}
	abstract void action();
	
}
class Dog{
	
}
public class assg2_1 extends Animal{
	
	String color;
	
	assg2_1(int height, double weight, String color) {
		super(height, weight);
		this.color=color;		
	}

	@Override
	void action() {
		System.out.println("Guess what I am from my action?");
		System.out.println("Barking!!");
		System.out.println("Ohh yeh!! u guessed it right!! I am a dog.");
	}

	public static void main(String[] args) {
		Animal obj = new assg2_1(56,67,"Golden");
		obj.action();		
	}
}
