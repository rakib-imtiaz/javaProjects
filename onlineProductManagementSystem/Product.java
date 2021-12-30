

public class Product {

	private int productID;
	private String productName;
	private double productPrice;
	private double quantity;
	private boolean isAvailable;

	public Product(int productID, String productName, double productPrice, double quantity, boolean isAvailable) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.isAvailable = isAvailable;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", isAvailable=" + isAvailable + "]";
	}

}
