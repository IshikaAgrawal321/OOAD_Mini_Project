package travelmgmtsystem.dao;



import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import travelmgmtsystem.model.Trips;

@Component
public class TripsDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insertTrip(int userid, String triptype, String from, String to, String depdate, String deptime, int pcount, int amt){
		Transaction transaction = null;
		Trips trip= new Trips();
		trip.setUserid(userid);
		trip.setTriptype(triptype);
		trip.setSource(from);
		trip.setDestination(to);
		trip.setDeparturedate(depdate);
		trip.setDeparturetime(deptime);
		trip.setPassengercount(pcount);
		trip.setAmount(amt);
		this.hibernateTemplate.save(trip);
	}
	
	public List<Trips> getTrips(){
		List<Trips> trips= this.hibernateTemplate.loadAll(Trips.class);
		return trips;
	}
}
