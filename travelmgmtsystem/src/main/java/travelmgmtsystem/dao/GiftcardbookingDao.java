package travelmgmtsystem.dao;

import javax.transaction.Transactional;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import travelmgmtsystem.model.GiftCardBooking;

@Component
public class GiftcardbookingDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insertGc(int gid, int userid, String sname, String rname, String msg){
		GiftCardBooking gcb= new GiftCardBooking();
		gcb.setGiftcardid(gid);
		gcb.setUserid(userid);
		gcb.setFromusername(sname);
		gcb.setTousername(rname);
		gcb.setMessage(msg);
		this.hibernateTemplate.save(gcb);
	}
}
