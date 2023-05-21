package product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }
    
   // Fetching products based on the name of the products
    public Product getProductWithName(String name){
    	String str = name.toLowerCase();
    	
        for(Product p : products){
        	String productName = p.getName().toLowerCase();
            if(productName.equals(str))
               return p;
        }    
        return null;
    }
    
    // Fetching products based on the name of the products
    public List<Product> getProductWithType(String type){
    	String str = type.toLowerCase();
    	List<Product> prods = new ArrayList<>();
    	
        for(Product p : products){
        	String typ = p.getType().toLowerCase();
            if(typ.equals(str))
               prods.add(p);
        }    
        return prods;
    }
    
    // Fetching products based on the place
    public List<Product> getProductWithPlace(String plc){
    	String str= plc.toLowerCase();
    	List<Product> prods = new ArrayList<>();
    	
    	for(Product p: products){
    		String place = p.getPlace().toLowerCase();
    		if(place.contains(str))
    			prods.add(p);
    	}
    	 return prods;
    }
    
    // Fetching products which are currently out of Warranty
    public List<Product> getProductOutOfWarrenty(int year){
    	List<Product> prods = new ArrayList<>();
    	
    	for(Product p: products){
    		if(p.getWarranty()<year)
    			prods.add(p);
    	}
    	 return prods;
    }
    
    // Fetching products based on the text
    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;
    }
    
    // Fetching all products
    public List<Product> getAllProducts(){
        return products;
    }
    
    //USING STREAMS
    
    //Fetching products based on the name of the product
    public Product getProductByName(String name){
        return products.stream().filter(product -> product.getName().equals(name)).findFirst().orElse(null);
    }
    
    //Fetching products based on the type of the product
    public List<Product> getProductByType(String type){
        return products.stream().filter(product -> product.getType().toLowerCase().equals(type)).collect(Collectors.toList());
    }
    
    //Fetching products based on the place of the product
    public List<Product> getProductByPlace(String text){
        String str = text.toLowerCase();

        return products.stream().filter(product -> product.getPlace().toLowerCase().equals(str)).collect(Collectors.toList());
    }
    
    //Fetching products based on the currently out of Warranty
    public List<Product> getProductOutOfWarranty(int year){

        return products.stream().filter(product -> product.getWarranty() < year).collect(Collectors.toList());
    }

    // Fetching products based on given text
    public List<Product> getProductByText(String text){
        String str = text.toLowerCase();

        return products.stream().filter(product ->  product.getName().toLowerCase().contains(str) ||
                                                    product.getType().toLowerCase().contains(str) ||
                                                    product.getPlace().toLowerCase().contains(str))
                                                    .collect(Collectors.toList());
    }
}