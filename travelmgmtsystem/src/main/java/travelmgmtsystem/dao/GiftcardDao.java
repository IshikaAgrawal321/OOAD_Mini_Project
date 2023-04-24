package travelmgmtsystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import travelmgmtsystem.model.Giftcard;

@Component
public class GiftcardDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<Giftcard> getGiftcards(){
		List<Giftcard> giftcards = this.hibernateTemplate.loadAll(Giftcard.class);
		return giftcards;
	}
	
	public Giftcard searchGiftcard(int gid){
		return this.hibernateTemplate.get(Giftcard.class, gid);
	}

}
