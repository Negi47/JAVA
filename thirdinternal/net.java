package thirdinternal;
import java.net.*;

public class net {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
//		InetAddress ob = InetAddress.getLocalHost();
		
		InetAddress ob2,ob3,ob4;
		
		ob2 = InetAddress.getByName("www.w3schools.com");
		
		ob3 = InetAddress.getByName("www.jussaurabh.com");
		
		byte[] ipadd = new byte[] {111,93, (byte) 136,(byte) 229};
		
//		ob4 = InetAddress.getByAddress(ipadd);
//		
		String ipadstr = InetAddress.getByAddress(ipadd).getHostName();
		
		System.out.println("ipad : " + ipadstr);
		
		InetAddress a[]=InetAddress.getAllByName("www.christuniversity.in");
		for(int i=0; i<a.length;i++)
			System.out.println(a[i]);
	}

}
