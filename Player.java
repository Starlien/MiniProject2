import java.util.*;


class Player{
  private int numberEggs;
  private ArrayList<Egg> basket;

  Player(){
    numberEggs = 0;
    basket = new ArrayList<Egg>();
    
  }

  int getNumEggs(){
    return numberEggs;
  }

  ArrayList<Egg> getBasket(){
    return basket;
  }
  
  void printBasket(){
    for(int i=0; i<basket.size(); i++){
      basket.get(i).printEgg();
    }
  }

  void foundEgg(Egg addEgg){
    basket.add(addEgg);
    numberEggs++;
  }
  

}