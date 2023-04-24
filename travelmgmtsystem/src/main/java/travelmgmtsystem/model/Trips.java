package travelmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trips {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int tripid;
    private int userid;
    private String triptype;
    private String source;
    private String destination;
    private String departuredate;
    private String departuretime;
    private int passengercount;
    private int amount;
    
    public int getUserid() {
    	return tripid;
    }
    
    public void setUserid(int userid) {
    	this.userid = userid;
    }
    
    public String getTriptype() {
        return triptype;
    }

    public void setTriptype(String triptype) {
        this.triptype = triptype;
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
    
    public int getPassengercount() {
    	return passengercount;
    }
    
    public void setPassengercount(int passengercount) {
    	this.passengercount = passengercount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "trips [userid=" + userid + ", triptype=" + triptype + ", source=" + source + ", destination=" + destination + ", departuredate=" + departuredate + ", departuretime=" + departuretime + ", passengercount=" + passengercount + " , amount=" + amount + "]";
    }

}
