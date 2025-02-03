package entites;

public class VerificationData {
	private Product product;
	private Double amount;
	private Double stock;
	
	public VerificationData(Product product, Double amount, Double stock) {
		super();
		this.product = product;
		this.amount = amount;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "VerificationData [product=" + product + ", amount=" + amount + ", stock=" + stock + "]";
	}
	
	
}
