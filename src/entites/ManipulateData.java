package entites;

public class ManipulateData {
	private Product product;
	private Double quantity;
	private Double stock;

	public ManipulateData(Product product, Double quantity, Double stock) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.stock = stock;

	}
	public void verificationRemains() {
		if(quantity <= 9) {
			System.out.println(quantity);
		}if((quantity > 1000 && quantity < 5000) || (quantity > 100.0 && quantity < 1000)){
			System.out.println(quantity);
		}
	}
	
	public void verificationStock() {
		if (quantity == stock) {
			System.out.println(product);
		}else {
			System.out.println("Nem um desses produtos está com estoque zerado.");
		}
	}
	@Override
	public String toString() {
		return "VerificationData [product=" + product + ", quantity=" + quantity + ", stock=" + stock + "]";
	}
}
