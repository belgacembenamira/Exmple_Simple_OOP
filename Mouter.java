public class Mouter {
private String Mouter_name;
private double Mouter_price;
   

    public Mouter(String Mouter_name, double Mouter_price) {
        this.Mouter_name = Mouter_name;
        this.Mouter_price = Mouter_price;
    }

  
    public String getMouter_name() {
        return Mouter_name;
    }

    
    public void setMouter_name(String Mouter_name) {
        this.Mouter_name = Mouter_name;
    }

   
    public double getMouter_price() {
        return Mouter_price;
    }


    public void setMouter_price(double Mouter_price) {
        this.Mouter_price = Mouter_price;
    }



    public String Affichage() {
        return "{" +
            " Mouter_name='" + getMouter_name() + "'" +
            ", Mouter_price='" + getMouter_price() + "'" +
            "}";
    }
    
}