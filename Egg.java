import java.util.*;

class Egg {
private String color;
private String contents;

public String randomColor(){
  Random r = new Random();
  String arrayColors[] = {"Blue", "Pink", "Yellow", "Green"};
  int color = r.nextInt(4);
  return arrayColors[color];
}

public String randomContents(){
  Random r = new Random();
  String arrayContent[] = {"Cadbury Egg", "Reese's Egg", "pink Starburst", "yellow Peep", "25 cents", "50 cents", "one dollar"};
  int contents = r.nextInt(7);
  return arrayContent[contents];
}

Egg () {
color = randomColor();
contents = randomContents();
}

public String getColor(){
  return color;
}

public String getContents(){
  return contents;
}

void printEgg(){
  System.out.println(color + " egg contains " + contents);
}

} 