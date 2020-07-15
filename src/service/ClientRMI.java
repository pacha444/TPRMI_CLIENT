package service;


import java.rmi.Naming;


public class ClientRMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IBanqueRemote stub= (IBanqueRemote) Naming.lookup("rmi://localhost:1098/BK");
			System.out.println(stub.conversion(70));
			System.out.println(stub.GetServerDate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
