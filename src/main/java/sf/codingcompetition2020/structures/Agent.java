package sf.codingcompetition2020.structures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Agent {
	
	private int agentId;
	private String area;
	private String language;
	private String firstName;
	private String lastName;

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
