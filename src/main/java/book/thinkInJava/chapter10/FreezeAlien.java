package book.thinkInJava.chapter10;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class FreezeAlien {
	public static void main(String[] args) throws Exception {
		ObjectOutput out = new ObjectOutputStream(
				new FileOutputStream("D:/logs/file.x"));
		Alien zorcon = new Alien();
		out.writeObject(zorcon);
	}
} // /:~
