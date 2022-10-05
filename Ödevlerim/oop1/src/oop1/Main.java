package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";
		
		Product product1 = new Product();
		product1.setName("Delonghi kahve makinesi");
	product1.setDiscount(7);
	product1.setUnitPrice(7500);
	product1.setUnitsInStock(3);
	product1.setImageUrl("image1.jpg");


		Product product2 = new Product();
		product2.setName("smeg kahve makinesi");
				product2.setDiscount(7);
				product2.setUnitPrice(7500);
				product2.setUnitsInStock(3);
				product2.setImageUrl("image2.jpg");

	
		Product product3 = new Product();
		product3.setName("Kitchen aid kahve makinesi");
				product3.setDiscount(7);
				product3.setUnitPrice(7500);
				product3.setUnitsInStock(3);
				product3.setImageUrl("image3.jpg");

		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
			
		}
		İndivualCustomer indiviualCustomer= new İndivualCustomer();
		indiviualCustomer.setId(1);
		indiviualCustomer.setPhone("05222222");
		indiviualCustomer.setPhone("12345");
		indiviualCustomer.setFirstname("Engin");
		indiviualCustomer.setLastname("Demiroğ");
		
		CorparateCustomer corparateCustomer= new CorparateCustomer();
		CorparateCustomer.setId(2);
		corparateCustomer.setCompanyName("kodlama.io");
		corparateCustomer.setPhone("214124124");
		corparateCustomer.setTaxNumber("1111111");
		corparateCustomer.setCustomerNumber("54321");
		
		Customer[] customers= {indiviualCustomer,corparateCustomer};
		
				

	}

}
