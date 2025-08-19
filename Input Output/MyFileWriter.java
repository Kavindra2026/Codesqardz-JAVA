import java.io.*;

public class MyFileWriter {
	public static void main(String[] args) throws IOException {
		FileOutputStream fw = new FileOutputStream(new File("f2\\lalu.txt"));
		String s = "Java Input/Output (I/O) refers to the mechanisms by which a Java program interacts with external data sources and destinations. This includes reading data from sources like the keyboard, files, or network connections, and writing data to destinations like the console, files, or network connections.";
		byte ch[] = s.getBytes();
		// fw.write(ch);
		for (int i = 0; i < ch.length; i++) {
			fw.write(ch[i]);
		}
		System.out.println("file created Successfully");
		fw.close();
	}
}