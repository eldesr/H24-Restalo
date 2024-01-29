package ca.ulaval.glo2003;

public class Product {

    private String title;
   private String description;
    private double price;
    private Boolean sold;

    public String getTitle(){
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }



    public Product(){

    }

}
