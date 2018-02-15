
public class Memes {
	
private int lengthDays;
private String timeCreated;
public Memes() {
	MemesRunner.count++;
}
public int getLengthDays() {
	return lengthDays;
}
public String getTimeCreated() {
	return timeCreated;
}
public void setLengthDays(int lengthDays) {
	this.lengthDays = lengthDays;
}
public void setTimeCreated(String timeCreated) {
	this.timeCreated = timeCreated;
}
}
