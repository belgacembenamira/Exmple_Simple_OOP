public class FastVoiture extends Voiture  implements Roles{
    private int speed ;
    public FastVoiture(String name, double price ,int speed) {
        super(name, price);
        this.speed=speed; 
     
    
}
public String toString (String name, double price)
{
    return " Classe Fast Voiture  name  Fast voiture  "+ this.name + "\n +  price  fast Voiture " + this.price;
}

public void f_one(String name) {
   System.out.println("fuction 1 de "+this.name+"\n");
}

public void f_two(String name) {
      System.out.println("fuction 2 de "+this.name+"\n");

    
}

}
