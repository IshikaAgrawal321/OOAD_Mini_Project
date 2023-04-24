package travelmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	    // primary key
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int uid;
	    private String username;
	    private String password;
	    private String email;
	    private int walletamount;
	    
	    public int getId() {
	    	return uid;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String brand) {
	        this.email = email;
	    }

	    public int getWallet() {
	        return walletamount;
	    }

	    public void setWallet(int walletamount) {
	        this.walletamount = walletamount;
	    }
	    public User(int uid, String username, String password, String email, int walletamount) {
			super();
			this.uid = uid;
			this.username = username;
			this.password = password;
			this.email = email;
			this.walletamount = walletamount;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

	    @Override
	    public String toString() {
	        return "userdetails [username=" + username + ", password=" + password + ", email=" + email + " , wallet=" + walletamount + "]";
	    }
	}
