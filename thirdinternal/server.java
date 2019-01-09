package thirdinternal;

import java.io.*;
import java.net.*;

public class server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ob = new ServerSocket(2000);
		Socket ob2 = ob.accept();
		DataInputStream dis = new DataInputStream(ob2.getInputStream());
		
		int[] arr = new int[20];
		
		for(int i=0;i<10;i++) {
			arr[i] = dis.readInt();
		}
		
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
				{
					System.out.println("message: "+arr[i]);
				}
		}
		
		ob.close();
		
	}

}
