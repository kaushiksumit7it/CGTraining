
public class VotingException extends Exception{
	public VotingException() {
		System.out.println("User defined Exception thrown");
	}
	public String toString() {
		return "MyException Object : Age cannot be < 18 " ;
	}

}
