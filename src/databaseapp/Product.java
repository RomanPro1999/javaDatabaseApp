package databaseapp;


public class Product {
  private int id; 
  private String name;
  private double price; 
  private String addDate;
  private byte[] picture;
  
  public Product(int pid,String pname,double price,String pAddDate,byte[]pimg){
      this.id = pid;
      this.name = pname;
      this.price = price;
      this.addDate = pAddDate;
      this.picture = pimg;
  }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAddDate() {
        return addDate;
    }

    public byte[] getPicture() {
        return picture;
    }

}

