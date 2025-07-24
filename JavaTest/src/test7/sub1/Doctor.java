package test7.sub1;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	protected String name;
	protected String id;
	protected String special;
	
	protected List<Patient> patients = new ArrayList<>();

	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	@Override
	public String toString() {
		String result =  "의사: "+name+"(ID: "+id+", 전문분야: "+special+")\n";
		result += "담당 환자 목록: \n";
		for(Patient p : patients) {
			result += "- " + p + "\n";
		}
		return result;
	}	
}
