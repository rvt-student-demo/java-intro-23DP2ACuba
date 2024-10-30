package lv.rvt;

public class Product {
    private String item;
    private double price;
    private Integer qnt;
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.item = initialName;
        this.price = initialPrice;
        this.qnt = initialQuantity;
    }
    public void printProduct(){
        System.out.println(this.item + ", price " + this.price + this.qnt + " pcs");
    }
}
