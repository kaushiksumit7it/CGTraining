
class MyExceptionDemo{
	static int flag=0;
	public static void main(String args[]) {
		try {
			int age=16;
			if(age < 18)
				throw new VotingException();
		}
		
		catch(NumberFormatException e) {
			flag=1;
			System.out.println("Exception : "+ e);
		}
		catch (MyException e) {
			flag=1;
			System.out.println("Exception : "+ e);
		}
		if(flag==0)
			System.out.println("Everything is fine");
	}
}
