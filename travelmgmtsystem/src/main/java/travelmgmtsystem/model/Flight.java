package travelmgmtsystem.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
	
	// primary key
    @Id
    private String flightid;
    private String flightname;
    private String source;
    private String destination;
    private String departuredate;
    private String departuretime;
    private int availability;
    private int price;

    public String getFlightid() {
    	return flightid;
    }
    
    public void setFlightid(String flightid) {
    	this.flightid = flightid;
    }
    
    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
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
        return "flight [flightid=" + flightid + ", flightname=" + flightname + ", source=" + source + ", destination=" + destination + ", departuredate=" + departuredate + ", departuretime=" + departuretime + ", avaiability=" + availability + " , price=" + price + "]";
    }

}
