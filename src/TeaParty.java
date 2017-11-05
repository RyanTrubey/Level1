
public class TeaParty {

	public static String welcome(String lastName, boolean isWoman, boolean isKnighted) {
		// TODO Auto-generated method stub
		if(isWoman == true) {
			return "Hello Ms. " + lastName;
		} else if(isKnighted) {
			return "Hello Sir " + lastName;
		} else {
			return "Hello Mr. " + lastName;
		}
		
		
	}

}
