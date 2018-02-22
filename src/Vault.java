import java.util.Random;

public class Vault {
	Random r = new Random();
	int random;
public Vault() {
	
	random = r.nextInt(99999);
	
}

public boolean checkCode(int guess) {
	if(guess == random) {
		return true;
	}
	return false;
}
}
