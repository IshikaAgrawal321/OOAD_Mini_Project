package travelmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	
	// primary key
    @Id
    private String trainid;
    private String trainname;
    private String source;
    private String destination;
    private String departuredate;
    private String departuretime;
    private int availability;
    private int price;

    public String getTrainid() {
    	return trainid;
    }
    
    public void setTrainid(String trainid) {
    	this.trainid = trainid;
    }
    
    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getDeparturedate() {
    	return departuredate;
    }
    
    public void setDeparturedate(String departuredate) {
    	this.departuredate= departuredate;
    }
    
    public String getDeparturetime() {
    	return departuretime;
    }
    
    public void setDeparturetime(String departuretime) {
    	this.departuretime= departuretime;
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
        return "train [trainid=" + trainid + ", trainname=" + trainname + ", source=" + source + ", destination=" + destination + ", departuredate=" + departuredate + ", departuretime=" + departuretime + ", avaiability=" + availability + " , price=" + price + "]";
    }


}
