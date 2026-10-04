package classesObjects;

public class Product {
    String productName;
    long price;
    long quantity;
    int discount;

    void displayProductDeatils(){
        System.out.println("Product name is:"+productName);
        System.out.println("Product price is:"+price);
        System.out.println("Product quantity is:"+quantity);
        System.out.println("total price before dicount:"+calculateTotalPrice());
        System.out.println("How much you have saved:"+disountOnTotalPrice());
        System.out.println("final Total price:"+finaltotalPrice());
        
    }
    long calculateTotalPrice(){
        return price*quantity;
    }
    long disountOnTotalPrice(){
        return calculateTotalPrice()*discount/100;
    }
    long finaltotalPrice(){
        return calculateTotalPrice() - disountOnTotalPrice();
    }

    public static void main(String[] args) {
        Product pro=new Product();
        pro.productName="rice";
        pro.price=200;
        pro.quantity=5;
        pro.discount=5;

        pro.displayProductDeatils();

    }
}
