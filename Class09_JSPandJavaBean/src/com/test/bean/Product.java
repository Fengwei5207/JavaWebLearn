package com.test.bean;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/24 15:35
 */
public class Product {
    private float price;
    private int num;

    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double total(){
        return this.price* this.num;
    }
}
