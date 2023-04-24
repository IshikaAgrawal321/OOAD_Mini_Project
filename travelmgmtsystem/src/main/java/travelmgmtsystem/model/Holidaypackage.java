package travelmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Holidaypackage {
	
	// primary key
    @Id
    private String packageid;
    private String hotelname;
    private String source;
    private String destination;
    private String departuredate;
    private String departuretime;
    private String withflight;
    private int nduration;
    private int price;

    public String getPackageid() {
    	return packageid;
    }
    
    public void setPackageid(String packageid) {
    	this.packageid = packageid;
    }
    
    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
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
    
    public String getWithflight() {
        return withflight;
    }

    public void setWithflight(String withflight) {
        this.withflight = withflight;
    }    
    
    public int getNduration() {
    	return nduration;
    }
    
    public void setNduration(int nduration) {
    	this.nduration = nduration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "holidaypackage [packageid=" + packageid + ", hotelname=" + hotelname + ", source=" + source + ", destination=" + destination + ", departuredate=" + departuredate + ", departuretime=" + departuretime + ", withflight=" + withflight + ", nduration=" + nduration + " , price=" + price + "]";
    }

}
