
public class JamesBond {
	Vault vault;
	public void setVault(Vault v) {
		this.vault = v;
	}
public static void main(String[] args) {
	
}
public int findCode() {
	for(int i = 0; i<= 99999; i++) {
		boolean t = vault.checkCode(i);
		if(t) {
			return i;
			
		
		}
	}
	return 0;
}
}
