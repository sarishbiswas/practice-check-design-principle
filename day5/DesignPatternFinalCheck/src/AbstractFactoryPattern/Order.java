package AbstractFactoryPattern;

public abstract class Order {
private Channel channel;
private ProductType productType;

public Order() {
	super();
}
public Order(Channel channel, ProductType productType) {
	super();
	this.channel = channel;
	this.productType = productType;
}
public Channel getChannel() {
	return channel;
}
public ProductType getProductType() {
	return productType;
}
public void setChannel(Channel channel) {
	this.channel = channel;
}
public void setProductType(ProductType productType) {
	this.productType = productType;
}
public abstract void processOrder();
@Override
public String toString() {
	return "Order [channel=" + channel + ", productType=" + productType + "]";
}

}
