package Day2Practise;
//● Create a class Mobile with the following field:
//HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
//● Implement the following methods inside the Mobile class:
//public String addMobile(String company, String model)
//● This method will take a string as a company name and its model as an argument.
//● Ex: "apple", "Iphone13"
//● add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
//● if the company name already exists then their model should be added to the existing list.
//● This method should return a message "Mobile added successfully" after adding a mobile.
//public List<String> getModels(String company)throws InvalidMobileException
//This method return the list of all the models of the supplied company
//If we supply any invalid company name then it should throw a checked exception
//● Inside the main method of the Mobile class perform the following task:
//➔ Call the addMobile method by adding some mobiles with their details
//➔ Call the getModels method and print the list of the models of the supplied company.
//★ Note: Application should be terminated normally.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class MobileStoreManagment {

	static HashMap<String,ArrayList<String>> hm  = new HashMap<>();
	
	public static  String addMobile(String company, String model) {
		if( hm.containsKey(company)) {
			ArrayList<String> al = hm.get(company);
			al.add(model);
			hm.put(company, al);
			
		}else {
			ArrayList<String> al = new ArrayList<>();
			al.add(model);
			hm.put(company, al);
		}
		
		return "Mobile added successfully";
	}
	
	public static List<String> getModels(String company)throws InvalidMobileException{
		
		if(hm.containsKey(company)) {
			
			return hm.get(company);
		}else {
			throw new InvalidMobileException("not found!");
		}

		
		
	}
	
	public static void main(String[] args) {
		
		
		addMobile("Apple", "iphone");
		addMobile("Apple","iphone8");
		addMobile("realme", "6i");
		
		try {
//			getModels("Apple");
			List<String> asn = getModels("pp343le");
			asn.forEach(System.out::println);
		}catch(InvalidMobileException e){
			System.out.println(e.getMessage());
		}
		
	}

	
}
 


	

