package sf.codingcompetition2020.structures;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private int age;
	private String area;
	private int agentId;
	private short agentRating;
	private String primaryLanguage;
	private List<Dependent> dependents;
	private boolean homePolicy;
	private boolean autoPolicy;
	private boolean rentersPolicy;
	private String totalMonthlyPremium;
	private short yearsOfService;
	private Integer vehiclesInsured;

	public String getFirstName()
	{
		return this.firstName;
	}

	public int getAgentCountInArea(String filepath, String area)
	{	
		int count = 0;
		try{
			File file = new File(filepath);
			Scanner scanner = new Scanner(file);

			scanner.useDelimiter(",");
			
			while(scanner.hasNext())
			{
					if(scanner.next().equals(area))
						count++;
			}
			scanner.close();
		}
			catch (FileNotFoundException fe) 
			{
				fe.printStackTrace();
			}

			return count;
	}
}
