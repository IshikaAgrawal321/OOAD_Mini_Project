package travelmgmtsystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import travelmgmtsystem.model.Flight;
import travelmgmtsystem.model.Train;

@Component
public class TrainDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	public List<Train> getTrain(String from, String to, String date){
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
		    transaction = session.beginTransaction();
		    Query query = session.createQuery("FROM Train WHERE source = :from and destination = :to and departuredate = :date");
		    query.setParameter("from", from);
		    query.setParameter("to", to);
		    query.setParameter("date", date);
		    List<Train> list = query.list();

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
	
	public Train searchTrain(String tid){
		return this.hibernateTemplate.get(Train.class, tid);
	}


}
