package untitled.src.Model;
public class OnlineSite {
    private String shippingAddress,creditCardInformation;
    public OnlineSite(String shippingAddress, String creditCardInformation) {
        this.shippingAddress = shippingAddress;
        this.creditCardInformation = creditCardInformation;


    }

    public OnlineSite() {
        shippingAddress = "shippingAddress";
        creditCardInformation = "creditCardInformation";

    }
    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(String creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    @Override
    public String toString(){
        return "ShippingAddress: " + getShippingAddress() + " CreditCardInformation: " + getCreditCardInformation() ;
    }
}
