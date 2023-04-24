package travelmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GiftCardBooking {

	@Id
    private int giftcardid;
	private int userid;
	private String fromusername;
	private String tousername;
    private String message;

    public int getGiftcardid() {
    	return giftcardid;
    }
    
    public void setGiftcardid(int giftcardid) {
    	this.giftcardid = giftcardid;
    }
    
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFromusername() {
        return fromusername;
    }

    public void setFromusername(String fromusername) {
        this.fromusername = fromusername;
    }

    public String getTousername() {
        return tousername;
    }

    public void setTousername(String tousername) {
        this.tousername = tousername;
    }

    public String getmessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "giftcardbooking [giftcardid=" + giftcardid + ", userid=" + userid + ", fromusername=" + fromusername + ", tousername=" + tousername + " , message=" + message + "]";
    }

	
}
