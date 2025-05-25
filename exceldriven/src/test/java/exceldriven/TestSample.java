package exceldriven;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		DataDriven d =new DataDriven();
		ArrayList<String>data=d.getData("Add Profile");
		for(int i=0;i<data.size();i++) 
		{
			data.get(i);
		}
	}

}
