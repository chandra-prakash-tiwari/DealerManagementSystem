package DealerManagementSystem.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@SuppressWarnings("hiding")
public class GenericObjectWriter<Object> {
	FileOutputStream fis;
	
	public GenericObjectWriter(String string) throws IOException {
		fis = new FileOutputStream(string);
		
	}
	
	public void Write(Object object) throws IOException {
		ObjectOutputStream obj = new ObjectOutputStream(fis);
		obj.writeObject(object);
		obj.flush();
	}
	
	public void close() throws IOException {
		fis.close();
	}
}
