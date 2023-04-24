package travelmgmtsystem.dao;

import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import travelmgmtsystem.model.Flight;

@Component
public class FlightDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	public List<Flight> getFlight(String from, String to, String date){
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
		    transaction = session.beginTransaction();
		    Query query = session.createQuery("FROM Flight WHERE source = :from and destination = :to and departuredate = :date");
		    query.setParameter("from", from);
		    query.setParameter("to", to);
		    query.setParameter("date", date);
		    List<Flight> list = query.list();

		    // If user exists and password matches, load data
		    if ((list != null)&&(list.size()>0)) {
		    	return list;
		    }

		    transaction.commit();
		    
		} catch (Exception ex) {
		    if (transaction != null) {
		        transaction.rollback();
		    }
		    ex.printStackTrace();
		} finally {
		    session.close();
		}
		return null;
	}
	
	public Flight searchFlight(String fid){
		return this.hibernateTemplate.get(Flight.class, fid);
	}

}
