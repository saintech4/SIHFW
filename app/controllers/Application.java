package controllers;

import java.io.File;
import java.io.IOException;
import play.*;
import play.mvc.*;
import views.html.*;

/**
 * @author SIHFW Inc.
 *#EDF0F5
 */
public class Application extends Controller {
	/**
	 * Display the Home page
	 */
	public static Result index() {
	  return ok(home.render("SIHFW Karnataka"));
	}
	
	/**
	 * Display the Infrastructure
	 */
	public static Result infrastructure() {
		return ok(infrastructure.render("SIHFW - Infrastructure"));
	}
	
	/**
	 * Display the HR
	 */
	public static Result hr() {
		return ok(hr.render("SIHFW - HR"));
	}
	
	/**
	 * Display the Photo Gallery
	 */
	public static Result photos() {
		return ok(photos.render("SIHFW - Photo Gallery"));
	}
	
	/**
	 * Display the archetypal
	 */
	public static Result archetypal() {
		return ok(infrastructure.render("SIHFW - Archetypal"));
	}
	
	/**
	 * Can Download the files which include PDF's.
	 */
	public static Result downloadFile(String file) {
		File currentFile = new File(".");
		Logger.debug("Selected file: "+file);
		try {
			if (file.equals("statistics") || file.equals("report")) {
				return ok(new java.io.File(currentFile.getCanonicalPath() + "/conf/files/" + file + ".xlsx"));
			} else {
			    return ok(new java.io.File(currentFile.getCanonicalPath() + "/conf/files/" + file + ".pdf"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return ok(home.render("SIHFW Karnataka"));
	}
		
	/**
	 * Display the Training Details
	 */
	public static Result trainingDetails() {
		return ok(training_details.render("SIHFW - Training Details"));
	}
	
	/**
	 * Display the Health Statistics
	 */
	public static Result healthStatistics() {
		return ok(health_statistics.render("SIHFW - Health Statistics"));
	}
	
	/**
	 * Display the Health Days
	 */
	public static Result healthDays() {
		return ok(health_days.render("SIHFW - Health Days & Themes"));
	}
	
	/**
	 * Display the Reports by SIHFW
	 */
	public static Result reports() {
		return ok(reports.render("SIHFW - Reports by SIHFW"));
	}
		
	/**
	 * Display the Committee
	 */
	public static Result committee() {
		return ok(committee.render("SIHFW - Committee"));
	}
		
	/**
	 * Display the presentations
	 */
	public static Result presentations() {
		return ok(presentations.render("SIHFW - Presentations"));
	}
	
	/**
	 * Display the Activities
	 */
	public static Result activities() {
		return ok(activities.render("SIHFW - Activities"));
	}
	
	
	/**
	 * Display the Contact page 
	 */
	public static Result contact() {
		return ok(contact.render("SIHFW - Contact Us"));
	}
	
	/**
	 * Display the About page 
	 */
	public static Result about() {
		return ok(about.render("SIHFW - About Us"));
	}
	
	/**
	 * Receives the Ajax request and create the kafka message.
	 * Sends kafka message to Kafka Server via Producer
	 *    
	 * @param json JSON data sent via AJAX  
	 */
	public static Result apiEventTracker(String json)  {
		return ok();
	}
}