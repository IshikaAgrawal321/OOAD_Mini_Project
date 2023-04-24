package travelmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Giftcard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int giftcardid;
    private String occasion;
    private String destination;
    private int availability;
    private int price;

    public int getGiftcardid() {
    	return giftcardid;
    }
    
    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public int getAvailability() {
    	return availability;
    }
    
    public void setAvailability(int availability) {
    	this.availability = availability;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "giftcard [occasion=" + occasion + ", destination=" + destination + ", availability=" + availability +" , price=" + price + "]";
    }


}
