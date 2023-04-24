package travelmgmtsystem.dao;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import travelmgmtsystem.model.User;

@Component
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	// create
	@Transactional
	public void createUser(User user) {
		this.hibernateTemplate.save(user);
	}

	// validate user
	public boolean getUser(String uname, String pwd) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean userData=false;

		try {
		    transaction = session.beginTransaction();
		    Query query = session.createQuery("FROM User WHERE username = :username and password = :password");
		    query.setParameter("username", uname);
		    query.setParameter("password", pwd);
		    List list = query.list();

		    // If user exists and password matches, load data
		    if ((list != null)&&(list.size()>0)) {
		    	userData= true;
		    }

		    transaction.commit();
		    
		} catch (Exception ex) {
		    if (transaction != null) {
		        transaction.rollback();
		    }
		    ex.printStackTrace();
		} finally {
		    session.close();
		    return userData;
		}
	}
	
	public User getBalance(String uname) {
		
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
		    transaction = session.beginTransaction();
		    Query query = session.createQuery("FROM User WHERE username = :username");
		    query.setParameter("username", uname);
		    List list = query.list();

		    // If user exists and password matches, load data
		    if ((list != null)) {
		    	return (User) list.get(0);
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
	
public int updateBalance(int uid, int total) {
		
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction transaction = null;
		int result=-1;

		try {
		    transaction = session.beginTransaction();
		    Query query = session.createQuery("UPDATE User SET walletamount=walletamount-:total WHERE uid = :uid");
		    query.setParameter("uid", uid);
		    query.setParameter("total", total);
		    result= query.executeUpdate();

		    transaction.commit();
		    
		} catch (Exception ex) {
		    if (transaction != null) {
		        transaction.rollback();
		    }
		    ex.printStackTrace();
		} finally {
		    session.close();
			return result;
		}
	}

}
