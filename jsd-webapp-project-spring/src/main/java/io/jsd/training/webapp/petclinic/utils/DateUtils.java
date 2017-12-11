package io.jsd.training.webapp.petclinic.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DateUtils {
	
	static Logger logger = LoggerFactory.getLogger(DateUtils.class);
	
	public static String dateToString(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(date);
	}

	public static Date stringToDate(String dateString) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.parse(dateString);
	}
	
	public static Date ageToDate(Integer age){
		
		Calendar today = new GregorianCalendar();
		today.setTime(new Date());
		
		Integer birthYear = today.get(Calendar.YEAR) - age;
		
		Calendar birthDate = new GregorianCalendar();
		
		birthDate.setLenient(false);
		birthDate.set(GregorianCalendar.YEAR, birthYear);
		
		logger.debug("Birth date : " + birthDate);
				
		return birthDate.getTime();
	}
	
	
}
