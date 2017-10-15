
public class Dog {
int numEyes;
boolean energize;
String dogBreed;
String name;
String furColor;
String eyeColor;
String numBorks;
String borkType;
static int numDogs;
public Dog(String dogBreed, String name) {
numDogs++;	
this.name = name;
this.dogBreed = dogBreed;
}
public static void eatSomething() {
	System.out.println("doggos doin a nomm on grass");
}
public void sleep(int Length) {
	System.out.println(name + " doin a " + Length + " minute sleep");
	this.energize = false;
}
public void loadout() {
	System.out.println(name + " is loaded with "  + this.borkType + "");
}
}
