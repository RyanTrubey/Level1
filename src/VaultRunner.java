
public class VaultRunner {
	
public static void main(String[] args) {
	Vault vault = new Vault();
	JamesBond bond = new JamesBond();
	bond.setVault(vault);
	vault.checkCode(3);
	int code = bond.findCode();
	System.out.println("You have found the code. It is " + code);
}
}
