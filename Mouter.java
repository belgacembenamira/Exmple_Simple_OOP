public class Mouter extends Voiture {

  public Mouter(String name, double price, String Mouter_name) {
    super(name, price);
  }

  public String getMouter_name() {
    return this.name;
  }

  public void setMouter_name(String Mouter_name) {
    this.name = Mouter_name;
  }

  public double getMouter_price() {
    return this.price;
  }

  public void setMouter_price(double Mouter_price) {
    this.price = Mouter_price;
  }

  public String Affichage() {
    return (
      "{" +
      " Mouter_name='" +
      getMouter_name() +
      "'" +
      ", Mouter_price='" +
      getMouter_price() +
      "'" +
      "}"
    );
  }
}
