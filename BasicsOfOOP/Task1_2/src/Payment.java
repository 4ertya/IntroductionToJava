import java.util.ArrayList;

public class Payment {
    private ArrayList<Product> cart;
    private double price;
    private String name;

    public Payment(String name) {
        this.name=name;
        this.cart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void addProduct(double price, String name) {
        cart.add(new Product(price,name));
        this.price+=price;
    }
    public void removeProduct(String name){
        for (int i=0;i<cart.size();i++){
            if (cart.get(i).getName().equalsIgnoreCase(name)){
                cart.remove(i);
                this.price-=cart.get(i).getPrice();
                break;
            }
        }
    }

    public ArrayList<Product> getCart() {
        return cart;
    }
    public void printPaymentInfo (){
        System.out.println("Payment: "+name);
        cart.forEach(System.out::println);
        System.out.println("-------------------");
        System.out.println("Total price: "+price+"\n");
    }



    private class Product {
       private double price;
        private String name;

        public Product(double price, String name) {
            this.price = price;
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return  name +
                    " - " + price;
        }
    }
}
