package travelmgmtsystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import travelmgmtsystem.model.Flight;
import travelmgmtsystem.model.Holidaypackage;

@Component
public class HolidaypackageDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Holidaypackage> getHolidaypackage(String from, String to, String date, String flightpref) {
		// TODO Auto-generated method stub
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
		    transaction = session.beginTransaction();
		    Query query = session.createQuery("FROM Holidaypackage WHERE source = :from and destination = :to and departuredate = :date and withflight = :fp");
		    query.setParameter("from", from);
		    query.setParameter("to", to);
		    query.setParameter("date", date);
		    query.setParameter("fp", flightpref);
		    List<Holidaypackage> list = query.list();
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
	
	public Holidaypackage searchPackage(String pid){
		return this.hibernateTemplate.get(Holidaypackage.class, pid);
	}

}
