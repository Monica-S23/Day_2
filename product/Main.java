package product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // Adding the products
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));
        
        // Retrieving products depends on the name of the products     
        Product product1 = service.getProductWithName("BlackBeast");
        System.out.println("Fetching products based on the name of the products");
        System.out.println(product1);
        System.out.println("************************************");
       
        
        // Retrieving products depends on the type of the products    
        System.out.println("Fetching products based on the type of the products");
        List<Product> product2 = service.getProductWithType("mouse");
        for(Product product : product2){
            System.out.println(product);
        }
        System.out.println("************************************");
        
        // Retrieving products depends on the place     
        System.out.println("Fetching products based on the place of the products");
        List<Product> product3 = service.getProductWithPlace("White table");
        for(Product product : product3){
            System.out.println(product);
        }
        System.out.println("************************************");
        
        // Retrieving products which are currently out of Warranty
        System.out.println("Fetching products based on the currently out of warranty");
        List<Product> product4 = service.getProductOutOfWarrenty(2023);
        for(Product product : product4){
            System.out.println(product);
        }
        System.out.println("************************************");
        
        // Retrieving product based on the text 
        System.out.println("Fetching products based on the given text");
        List<Product> product5 = service.getProductWithText("black");
        for(Product product : product5){
            System.out.println(product);
        }    
        System.out.println("************************************");    
        
        // Retrieving all products
        System.out.println("Fetching all products");    
        List<Product> product6 = service.getAllProducts();
        for(Product p : product6){
            System.out.println(p);
        }
        System.out.println("************************************");
        
        
        
        //Streams 
        // Retrieving products depends on the name of the products using stream    
        Product product7 = service.getProductByName("BlackBeast");
        System.out.println("Fetching products based on the name of the products using stream ");
        System.out.println(product7);
        System.out.println("************************************");
       
        
        // Retrieving products depends on the type of the products using stream    
        System.out.println("Fetching products based on the type of the products using stream ");
        List<Product> product8 = service.getProductByType("mouse");
        for(Product product : product8){
            System.out.println(product);
        }
        System.out.println("************************************");
        
        // Retrieving products depends on the place using stream      
        System.out.println("Fetching products based on the place of the products using stream ");
        List<Product> product9 = service.getProductByPlace("White table");
        for(Product product : product9){
            System.out.println(product);
        }
        System.out.println("************************************");
        
        // Retrieving products which are currently out of Warranty using stream 
        System.out.println("Fetching products based on the currently out of warranty using stream ");
        List<Product> product10 = service.getProductOutOfWarranty(2023);
        for(Product product : product10){
            System.out.println(product);
        }
        System.out.println("************************************");
        
        // Retrieving product based on the text using stream 
        System.out.println("Fetching products based on the given text using stream ");
        List<Product> product11 = service.getProductByText("black");
        for(Product product : product11){
            System.out.println(product);
        }    
        System.out.println("************************************");        

    }
}
