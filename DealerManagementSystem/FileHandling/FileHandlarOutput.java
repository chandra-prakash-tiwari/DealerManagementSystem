package DealerManagementSystem.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlarOutput { 
	private BufferedWriter filewriter;
	  
	public FileHandlarOutput(String name) throws Exception{ 
		filewriter=new BufferedWriter(new FileWriter(name));
	}
  
	public void Write(String string) throws IOException { 
		filewriter.write(string);
		filewriter.flush();
	} 
	
	public void CloseFile() throws IOException {
		filewriter.close();
	}
 }
 