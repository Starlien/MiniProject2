/*
Mini Project 2
Group #6: Jon Ashbrook, Christopher Fenter, Andrew Ireton, Evan Starling
Date: 03/11/2021
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  System.out.println("How many players are in this Easter egg hunt? Enter a positive whole number. ");

  
  int numPlayers = s.nextInt();
  
  ArrayList<Player> playerList = new ArrayList<Player>();

  for(int i = 0; i < numPlayers; i++){
    playerList.add(new Player());
  }
  System.out.println("We have added " + numPlayers + " players to this hunt. Let's find some eggs! ");

  System.out.println();

  hunt(playerList);
  recap(playerList);
  stats(playerList);
   
  }
  public static void hunt(ArrayList<Player> thePlayers){
    Random r = new Random();
    int numEggsFound;

    for(int num = 0; num < thePlayers.size(); num++){
      numEggsFound = r.nextInt(11);
    for(int num2=0; num2<numEggsFound; num2++){
      thePlayers.get(num).foundEgg(new Egg());
    }

    }
  }
  public static void recap(ArrayList<Player> thePlayers){
    for (int n=0; n<thePlayers.size(); n++){
      System.out.println("Player "+ n + " found " + thePlayers.get(n).getNumEggs()+ " eggs");
      
      thePlayers.get(n).printBasket();
      System.out.println();
    }
  }

  public static void stats(ArrayList<Player> thePlayers){
    int mostEggs = 0;
    int totalEggs = 0;

    for(int i=0; i < thePlayers.size(); i++){
      if(thePlayers.get(i).getNumEggs() > totalEggs){
        totalEggs =thePlayers.get(i).getNumEggs();
        mostEggs = i;
      }
    }
    System.out.println();
    System.out.println("Player " + mostEggs + " found the most eggs, with " + totalEggs + " eggs!");


    int[] eggColors = new int[4];
    for(int n = 0; n < thePlayers.size(); n++) {
      for(int j = 0; j < thePlayers.get(n).getNumEggs(); j++) {
        if(thePlayers.get(n).getBasket().get(j).getColor().equals("Blue"))
          eggColors[0]++;
        if(thePlayers.get(n).getBasket().get(j).getColor().equals("Pink"))
          eggColors[1]++;
        if(thePlayers.get(n).getBasket().get(j).getColor().equals("Yellow"))
          eggColors[2]++;
        if(thePlayers.get(n).getBasket().get(j).getColor().equals("Green"))
          eggColors[3]++;
      }
  }
    System.out.println();
  
  
    System.out.println("The Total Eggs Found By Color");
    System.out.println("Blue: "+ eggColors[0]);
    System.out.println("Pink: "+ eggColors[1]);
    System.out.println("Yellow: "+ eggColors[2]);
    System.out.println("Green: "+ eggColors[3]);

    
  

}
}