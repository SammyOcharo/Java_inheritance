//inheritance example

class Product{
    //attributes
    int pid;
    String name;
    int price;

    Product(){
        System.out.println("The Object has been constructed");
    }

    //Methods constructor

    void setProductDetails(int pid, String name, int price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    void showProductDetails(){
        System.out.println("---Product ID " + pid);
        System.out.println("---Product Name " + name);
        System.out.println("---Product Price " + price);
    }

    //getters and getters
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

//Now lets make a child class to inherit from the product parent class
class HPLaptop extends Product {

    //we can add additional attributes to the child class
    String version;
    int ram;
    int hardDiskSize;
    HPLaptop(){
        System.out.println("The HpLaptop object constructed");
    }

    //we have redefined the parent methods and added more fields to explain our class
    //This is called Method Overloading: Same method name as the parent methods but inputs.

    void setProductDetails(int pid,
                           String name,
                           int price,
                           String version,
                           int ram,
                           int hardDiskSize) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.version = version;
        this.hardDiskSize = hardDiskSize;
    }

    //We have also redefined another method of the parent class
    //we have added more fields to be output
    //now this two methods will be executed from the child class not the parent class
    //This concept is called Method Overriding
    void showProductDetails(){
        System.out.println("---Product ID " + pid);
        System.out.println("---Product Name " + name);
        System.out.println("---Product Price " + price);
        System.out.println("---Product Price " + ram);
        System.out.println("---Product Price " + version);
        System.out.println("---Product Price " + hardDiskSize);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        //creating an object
        Product product = new Product();

        //we now write data into the object
        product.setProductDetails(101, "Samsung", 17000);

        //reading the products
        //product.showProductDetails();

        //adding getter and setters to our class then change the modifiers to private

        Product product1 = new Product();

        product1.setPid(102);
        product1.setName("Laptop");
        product1.setPrice(20000);

        product1.showProductDetails();

        //***********This is a HPLaptop class********
        //Hp laptop constructor
        HPLaptop hpLaptop = new HPLaptop();

        //Now if we try to enter data through the new class you will realize that it has inherited the parent class

        hpLaptop.setProductDetails(203, "Hp laptop vintage", 100000);

        hpLaptop.showProductDetails();


    }


}
