package ioStreams;

public class ApplicationException extends Exception {
	public ApplicationException(String msg, Throwable obj) {
		super(msg,obj);
		System.out.println("Application Specific Exception");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
