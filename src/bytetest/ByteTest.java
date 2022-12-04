package bytetest;


import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteTest {
public static void main(String[] args)throws IOException{
	int i = -300;
	
FileOutputStream boutput = new FileOutputStream("1.txt");
	ByteArrayOutputStream boutput1= new ByteArrayOutputStream();
	DataOutputStream doutput = new DataOutputStream(boutput1);
	doutput.writeInt(i);
	byte[] buf = boutput1.toByteArray();	
System.out.println(buf[0]);
System.out.println(buf[1]);
System.out.println(buf[2]);
System.out.println(buf[3]);
	}
}