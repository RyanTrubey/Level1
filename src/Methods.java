import javax.swing.JOptionPane;

public class Methods {
	
public static void main(String[] args) {
	idk();
	something("Roblox Creator");
	something("Justin Beiber");
	wat(100, "idk");
	idkSomething(12389470);
}
public static void idk() {
	String name = JOptionPane.showInputDialog("What is your name");
	System.out.println(name + " rocks");
}
public static void something(String name) {
	if(name.equalsIgnoreCase("Justin Beiber")) {
		System.out.println(name + " is annoying");
	} else if (name.equalsIgnoreCase("Roblox creator")){
		System.out.println(name + " is a god");
	} else {
		System.out.println(name + " is good at singing");
	}
}
public static void wat(int number, String word) {
for(int i = 0; i < number; i++) {
	System.out.println(word);
}
}
public static boolean idkSomething(int num) {
	if(num % 2 == 0) {
		System.out.println("even");
		return true;
	} else {
		System.out.println("odd");
		return false;
	}
}
}
