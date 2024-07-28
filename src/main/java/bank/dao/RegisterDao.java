package bank.dao;

import java.util.List;

import bank.model.Register;

public interface RegisterDao {
	
	int createRecord(List<Register> lst);
	//boolean validateUser()
	List<Register> retriveRecord(int regNo);
	int deleteRecord(int regNo);
	

}
