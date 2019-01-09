package thirdinternal;

import java.io.*;
import java.net.*;

public class client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Socket ob = new Socket("localhost",2000);
		DataOutputStream dobt = new DataOutputStream(ob.getOutputStream());
		for(int i=0;i<10;i++)
		{
			dobt.writeInt(i);
		}
		dobt.flush();
		dobt.close();
		ob.close();

	}

}
