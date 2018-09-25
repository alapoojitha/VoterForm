package com.service;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
import com.pojo.VoterDetails;
public class AddRecordService {
	public boolean addRecords(int voter_id, String voter_name, int voter_age) {
	Configuration cfg = new Configuration();
	cfg.configure("com/pojo/hibernate.cfg.xml"); 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction t=session.beginTransaction();   
    //Add new record
    VoterDetails voter = new VoterDetails();
    voter.setVid(voter_id);
    voter.setName(voter_name);
    voter.setAge(voter_age);    
    //Save the employee in database
    session.save(voter);
    //Commit the transaction
    t.commit();
    session.close();  
    factory.close();
    return true;
  }
}
