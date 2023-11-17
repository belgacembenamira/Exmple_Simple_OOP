
public class Voiture  extends AbrastClasseV {
	protected String name ;
	protected double price ;
	public Voiture(String name, double price) {
		
		this.name = name;
		this.price = price;
	}

	public String toString ()
	{
		return "name "+ this.name + "\n ";
	}
    public String toString (String name)
	{
		return " Methode avec seul variable name "+ this.name + "\n ";
	}
     public String toString (String name, double price)
	{
		return " Methode avec seul variable name "+ this.name + "\n +  price " + this.price;
	}
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != "iheb")
       { this.name = name;}
       else {
        this.name ="Do             ";
       }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void f(String name) {
       System.out.println("I m from abstract class name object "+ this.name);
    }
    
}
