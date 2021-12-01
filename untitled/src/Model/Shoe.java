package untitled.src.Model;
public class Shoe {
    private String name,location,phoneNumber,contactName,contactphoneNumber;
    public Shoe(String name, String location, String phoneNumber,String contactName, String contactphoneNumber) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
        this.contactphoneNumber = contactphoneNumber;
    }

    public Shoe() {
        name = "name";
        location = "location";
        phoneNumber = "phoneNumber";
        contactName = "contactName";
        contactphoneNumber = "contactphoneNumber";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactphoneNumber() {
        return contactphoneNumber;
    }

    public void setContactphoneNumber(String contactphoneNumber) {
        this.contactphoneNumber = contactphoneNumber;
    }

    public void run(){}

    @Override
    public String toString(){
        return "Name: " + getName() + " Location: " + getLocation() + " PhoneNumber: " + getPhoneNumber() + " ContactName: " +
                getContactName() + " ContactphoneNumber: " + getContactphoneNumber();
    }
}
