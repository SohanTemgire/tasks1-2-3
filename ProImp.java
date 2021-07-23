package handson1productimplement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.lang.Error;

/*
class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

public class ProImp {
	double sumOfPrice(ArrayList<Product> productList) {
		
		return sum;
	}
	
	float  maxPrice(ArrayList<Product> productList) {
		
		return max;
	} 
	float  minPrice(ArrayList<Product> productList) {
		
		return min;
		
	}
	List<String> getProductNameList(ArrayList<Product> productList) {
		
		return namesList;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));
		ProImp pa=new ProImp();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		
	}

}*/


class Product1 {
	int id;
	String name;
	int price;
	
	public Product1(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
class ProImp {
	double sumOfPrice(ArrayList<Product1> productList) {
		double sum=0;
		 for(Product1 price : productList)
		 {
			 sum+=price.getPrice();
		 }
		 return sum;
	}
	float  maxPrice(ArrayList<Product1> productList) {
		List<Integer> priceList=new ArrayList<Integer>();
		for(Product1 price : productList)
		{
			priceList.add(price.getPrice());
		}
		Collections.sort(priceList);
		int max=priceList.get(priceList.size()-1);
		return max;
		
	}
	float  minPrice(ArrayList<Product1> productList) {
		List<Integer> priceList=new ArrayList<Integer>();
		for(Product1 price : productList)
		{
			priceList.add(price.getPrice());
		}
		Collections.sort(priceList);
		int min=priceList.get(0);
		return min;
		
	}
	List<String> getProductNameList(ArrayList<Product1> productList) {
		List<String> namesList=new ArrayList<String>();
		for(Product1 names : productList)
		{
			namesList.add(names.getName());
		}
		return namesList;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product1>();
		plist.add(new Product1(20,"Bag",897));
		plist.add(new Product1(21,"Book",87));
		plist.add(new Product1(22,"Table",89));
		plist.add(new Product1(23,"pen",597));
		ProImp pa=new ProImp();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		System.out.println(pa.minPrice(plist));
	}
}
