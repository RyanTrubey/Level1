
public class VaultRunner {
	
public static void main(String[] args) {
	Vault vault = new Vault();
	JamesBond bond = new JamesBond();
	bond.setVault(vault);
	
	int code = bond.findCode();
	System.out.println("You have found the code. It is " + code);
}
}
