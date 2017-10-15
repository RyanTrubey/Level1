
public class DogRunner {
public static void main(String[] args) {
	Dog wolf = new Dog("wolf disguised as shibe", "HowlShibe");
	Dog woof = new Dog("borks", "GabeTheDog");
	Dog idk = new Dog("a rare type of shibe", "mysteryShibe");
	idk.borkType = "unknown borks";
	idk.eyeColor = "unknown";
	idk.furColor = "slightly transparent black";
	idk.numBorks = "infinite";
	idk.numEyes = 0;
	woof.numEyes = 2;
	woof.eyeColor = "blue";
	woof.furColor = "white";
	woof.numBorks = "infinite";
	woof.borkType = "Rapid fire borks";
	wolf.numEyes = 4;
	wolf.borkType = "Howls";
	wolf.numBorks = "1";
	wolf.eyeColor = "blue";
	wolf.furColor = "gray";
	System.out.println("there is " + Dog.numDogs + " Doggos");
	Dog.eatSomething();
	woof.sleep(285);
	wolf.sleep(9000);
	idk.sleep(1);
	idk.loadout();
	woof.loadout();
	wolf.loadout();
}
}
