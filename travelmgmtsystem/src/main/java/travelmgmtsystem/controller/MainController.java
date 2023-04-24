package travelmgmtsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import travelmgmtsystem.dao.UserDao;
import travelmgmtsystem.dao.FlightDao;
import travelmgmtsystem.dao.TrainDao;
import travelmgmtsystem.dao.TripsDao;
import travelmgmtsystem.dao.GiftcardDao;
import travelmgmtsystem.dao.GiftcardbookingDao;
import travelmgmtsystem.dao.HolidaypackageDao;
import travelmgmtsystem.model.User;
import travelmgmtsystem.model.Flight;
import travelmgmtsystem.model.Train;
import travelmgmtsystem.model.Trips;
import travelmgmtsystem.model.Giftcard;
import travelmgmtsystem.model.Holidaypackage;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SessionAttributes({"passengercount","uname","totalamount","from","to","date","choice"})
public class MainController {

	@Autowired
	private UserDao userDao;
	@Autowired
	private FlightDao flightDao;
	@Autowired
	private TrainDao trainDao;
	@Autowired
	private TripsDao tripDao;
	@Autowired
	private GiftcardDao giftcardDao;
	@Autowired
	private GiftcardbookingDao gcbookDao;
	@Autowired
	private HolidaypackageDao holidaypackageDao;
	
	@RequestMapping("/")
	public String home() {
		return "login";
	}
	
	@RequestMapping(value = "/validate-user", method= RequestMethod.POST)
	public String validateUser(@RequestParam("username") String username, @RequestParam("password") String password,Model model) {
		boolean userFound = userDao.getUser(username, password);
		if(userFound) {
			model.addAttribute("name",username);
			model.addAttribute("uname",username);
			return "home";
		}
		else {
		return "error";
		}
	}
	
	@RequestMapping("/flight")
	public String flight() {
		return "flight";
	}
	
	@RequestMapping(value = "/search-flight", method= RequestMethod.POST)
	public String searchFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("date") String date,@RequestParam("passengercount") int passengercount, Model model){
		List<Flight> flights = flightDao.getFlight(from, to, date);
		model.addAttribute("passengercount", passengercount);
		model.addAttribute("from", from);
		model.addAttribute("to", to);
		model.addAttribute("date", date);
		model.addAttribute("flight", flights);
		return "flight-info";
	}
	
	@RequestMapping(value = "/flight-booking", method= RequestMethod.POST)
	public String bookFlight(@RequestParam("flchoice") String flchoice,@RequestParam("totalamount") String totalamount, Model model){
		model.addAttribute("choice", flchoice);
		model.addAttribute("totalamount", totalamount);
		return "user-details-flight";
	}
	
	@RequestMapping(value = "/payment-procedure-flight", method= RequestMethod.POST)
	public String paymentProcedure(@RequestParam("uname") String uname,@RequestParam("choice") String flchoice,@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("date") String date,@RequestParam("passengercount") int passengercount,@RequestParam("totalamount") String totalamount, Model model){
		User user= userDao.getBalance(uname);
		int uid= user.getId();
		Flight flight= flightDao.searchFlight(flchoice);
		String deptime= flight.getDeparturetime();
		int amount = user.getWallet();
		int total = Integer.parseInt(totalamount);
		if(amount >= total) {
			tripDao.insertTrip(uid, "flight", from, to, date, deptime, passengercount, total );
			int status2= userDao.updateBalance(uid, total);
			return "payment-success";
		}
		else {
			return "payment-error";
		}
	}
	
	@RequestMapping("/train")
	public String train() {
		return "train";
	}
	
	@RequestMapping(value = "/search-train", method= RequestMethod.POST)
	public String searchTrains(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("date") String date,@RequestParam("passengercount") int passengercount, Model model){
		List<Train> trains = trainDao.getTrain(from, to, date);
		model.addAttribute("passengercount", passengercount);
		model.addAttribute("from", from);
		model.addAttribute("to", to);
		model.addAttribute("date", date);
		model.addAttribute("trains", trains);
		return "train-info";
	}
	
	@RequestMapping(value = "/train-booking", method= RequestMethod.POST)
	public String bookTrain(@RequestParam("choice") String choice,@RequestParam("totalamount") String totalamount, Model model){
		model.addAttribute("choice", choice);
		model.addAttribute("totalamount", totalamount);
		return "user-details-train";
	}
	
	@RequestMapping(value = "/payment-procedure-train", method= RequestMethod.POST)
	public String paymentProcedureTrain(@RequestParam("uname") String uname,@RequestParam("choice") String choice,@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("date") String date,@RequestParam("passengercount") int passengercount,@RequestParam("totalamount") String totalamount, Model model){
		User user= userDao.getBalance(uname);
		int uid= user.getId();
		Train train= trainDao.searchTrain(choice);
		String deptime= train.getDeparturetime();
		int amount = user.getWallet();
		int total = Integer.parseInt(totalamount);
		if(amount >= total) {
			tripDao.insertTrip(uid, "train", from, to, date, deptime, passengercount, total );
			int status2= userDao.updateBalance(uid, total);
			return "payment-success";
		}
		else {
			return "payment-error";
		}
	}
	
	@RequestMapping("/holidaypackage")
	public String holidaypackage() {
		return "holidaypackage";
	}
	
	@RequestMapping(value = "/search-package", method= RequestMethod.POST)
	public String searchPackages(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("date") String date,@RequestParam("passengercount") int passengercount,@RequestParam("flightpref") String flightpref, Model model){
		List<Holidaypackage> packages=null;
		if(flightpref=="Without Flight") {
		packages = holidaypackageDao.getHolidaypackage(from, to, date, "No");
		}
		else {
		packages = holidaypackageDao.getHolidaypackage(from, to, date, "Yes");
			}
		model.addAttribute("passengercount", passengercount);
		model.addAttribute("from", from);
		model.addAttribute("to", to);
		model.addAttribute("date", date);
		model.addAttribute("packages", packages);
		return "package-info";
	}
	
	@RequestMapping(value = "/package-booking", method= RequestMethod.POST)
	public String bookPackage(@RequestParam("choice") String choice,@RequestParam("totalamount") String totalamount, Model model){
		model.addAttribute("choice", choice);
		model.addAttribute("totalamount", totalamount);
		return "user-details-package";
	}
	
	@RequestMapping(value = "/payment-procedure-package", method= RequestMethod.POST)
	public String paymentProcedurePackage(@RequestParam("uname") String uname,@RequestParam("choice") String flchoice,@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("date") String date,@RequestParam("passengercount") int passengercount,@RequestParam("totalamount") String totalamount, Model model){
		User user= userDao.getBalance(uname);
		int uid= user.getId();
		Holidaypackage hpackage= holidaypackageDao.searchPackage(flchoice);
		String deptime= hpackage.getDeparturetime();
		int amount = user.getWallet();
		int total = Integer.parseInt(totalamount);
		if(amount >= total) {
			tripDao.insertTrip(uid, "holidaypackage", from, to, date, deptime, passengercount, total );
			int status2= userDao.updateBalance(uid, total);
			return "payment-success";
		}
		else {
			return "payment-error";
		}
	}
	
	@RequestMapping("/giftcard")
	public String giftcard(Model model) {
		List<Giftcard> giftcards = giftcardDao.getGiftcards();
		model.addAttribute("giftcard", giftcards);
		return "giftcard-info";
	}
	
	@RequestMapping(value = "/giftcard-booking", method= RequestMethod.POST)
	public String bookGiftcard(@RequestParam("choice") String choice,@RequestParam("totalamount") String totalamount, Model model){
		model.addAttribute("choice", choice);
		System.out.println(choice);
		model.addAttribute("totalamount", totalamount);
		return "giftcard";
	}
	
	@RequestMapping(value = "/giftcard-send", method= RequestMethod.POST)
	public String sendGiftcard(@RequestParam("uname")String uname, @RequestParam("choice") String choice,@RequestParam("recv") String recv,@RequestParam("msg") String msg, Model model){
		User user= userDao.getBalance(uname);
		System.out.println(user);
		int uid= user.getId();
		int gchoice = Integer.parseInt(choice);
		Giftcard gc= giftcardDao.searchGiftcard(gchoice);
		int price= gc.getPrice();
		
		int amount = user.getWallet();
		if(amount >= price) {
			gcbookDao.insertGc(gchoice, uid, uname, recv, msg);
			int status2= userDao.updateBalance(uid, price);
			return "payment-success";
		}
		else {
			return "payment-error";
		}
		
	}
	
	@RequestMapping("/trips")
	public String trips(Model model) {
		List<Trips> trips= tripDao.getTrips();
		model.addAttribute("trip",trips);
		return "mytrips";
	}
	
	@RequestMapping("/wallet")
	public String wallet(@RequestParam("name") String uname, Model model) {
		User user= userDao.getBalance(uname);
		model.addAttribute("name", uname);
		model.addAttribute("user", user);
		return "wallet";
	}
}
