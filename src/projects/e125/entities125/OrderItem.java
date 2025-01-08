package projects.e125.entities125;

public class OrderItem {
    
    private Integer quantity;
    private double price;
    private Product product;

//#################################################

public OrderItem() {
}

public OrderItem(Integer quantity, Double price,Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
}

//#################################################


    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

//#################################################

    public double subTotal() {
		return price * quantity;
	}

//#################################################

    @Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
 
}
