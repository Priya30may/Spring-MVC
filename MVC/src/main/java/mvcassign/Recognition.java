package mvcassign;

import org.springframework.stereotype.Service;

@Service
public class Recognition {
	
	public boolean RecongnationUser(String name,String accountNo)
	{
		
		if(name.equals("Priya")&& accountNo.equals("8000060299"))
		{
			
			return true;
		}
		return false;
		
	}

}
