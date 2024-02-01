package ca.ulaval.glo2003;

import java.time.LocalTime;

public class Product {

    private String title;
   private String description;
    private double price;
    private Boolean sold;

    private LocalTime time;

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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Product(String title, String desc, double price, LocalTime time){
        this.title =title;
        this.description = desc;
        this.price = price;
        this.time = time;
    }

    public Product(){

    }

}
