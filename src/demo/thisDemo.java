package demo;

public class thisDemo {

	public static void main(String[] args) {
	
System.out.println("Five uses of this keyword\n Keyword THIS is a reference variable in Java that refers to the current object. ... It can be used to refer instance variable of current class. It can be used to invoke or initiate current class constructor. It can be passed as an argument in the method call\n");		
		
	B b = new B();
	b.modifier("Hello");
	b.display();
		
		
	}

}
class B{
	
	String local = "localinstance";
	
	void display() {
		this.modifier("THird use: Inside display");  // THird use: to call current object members
		System.out.println("display method :"+local);
		refernce(this);
	}
	
	void modifier(String local) {
		
		this.local =local; //first use: to call current object members
		System.out.println("SecondUSe : inside modifier :"+this.local);
		
	}
	
	
	B(){
		this(2); //Second Use: to call current class constructor
	}
	
	B(int a){
		
		System.out.println("First USE: Inside parameterized constructor");
	}
		
	
	
B returnObject () {
		
		return this; //Fouth USe: CAn return current class object
	}
	

void refernce(B obj) {
	 System.out.println("Fifth Use: parameterized object reference");
}


	}
	

	
	






