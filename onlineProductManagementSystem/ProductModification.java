
import java.util.ArrayList;
import java.util.List;

public class ProductModification {

	private ArrayList<Product> productList = new ArrayList<Product>();

	public ProductModification() {

	}

	void addProduct(Product productobject) {

		productList.add(productobject);

	}

	void DisplayProduct() {
		System.out.println(productList);

	}

	void DeleteProduct(Product productobject) {

		productList.remove(productList.indexOf(productobject));
	}
	
	int getIndex(String target)
	{
		
		int index=0;
		for(int i=0;i<productList.size();i++)
		{
			if(((List<Product>) productList.get(i)).contains(target))
			{
				index=i;
				break;
			}
			
		}
		return index;
		
		
	}

	void modifyProduct(String productname,Product modifiedObject) {

		//productList.remove(targetObject);

		productList.add(modifiedObject);

	}

	public static void main(String[] args) {

		Product onion = new Product(12345, "onion", 120, 4, true);
		Product coke = new Product(12346, "coke", 50, 10, true);
		Product mentos = new Product(12345, "mentos", 20, 45, true);
		Product condom = new Product(12345, "condom", 20, 24, true);

		ProductModification f = new ProductModification();
		f.addProduct(onion);
		f.addProduct(coke);
		f.addProduct(mentos);
		f.addProduct(condom);

		f.DisplayProduct();
		f.DeleteProduct(onion);
		f.DisplayProduct();
		
		System.out.println("indec: "+f.getIndex("onion"));

	}

}
