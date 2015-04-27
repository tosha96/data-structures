/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

/**
 *
 * @author Tosha
 */
public class DigitalCamera {
    private String brand;
    private int megapixels;
    private int price;

    public String getDetails() {
        return "Brand: " + brand + " Megapixels: " + megapixels + " Price: " + price;
    }
    
    public DigitalCamera(String brand, int megapixels) {
        this.brand = brand;
        if (megapixels <= 10) {
            this.megapixels = megapixels;
        } else if (megapixels > 10) {
            this.megapixels = 10;
        }
        if (this.megapixels <= 6) {
            this.price = 99;
        } else {
            this.price = 129;
        }
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
