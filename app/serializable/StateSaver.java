package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StateSaver {
	
	public static void save(Object o, String name) throws IOException {
			FileOutputStream fout = new FileOutputStream("public/objects/" + name + ".ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);   
			oos.writeObject(o);
			oos.close();
		}
	
	public static Object read (String name) throws IOException, ClassNotFoundException{
		   FileInputStream fin = new FileInputStream("public/objects/" + name + ".ser");
		   ObjectInputStream ois = new ObjectInputStream(fin);
		   return ois.readObject();
	}
}
