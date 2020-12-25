package org.example;

public abstract class Rocket  implements SpaceShip{

    public boolean launch(){
        return true;
    }
    public boolean land(){
        return true;
    }
    public boolean canCarry(Item item){
  
       return true;
    }
    public void carry(Item item,int newWeight){
      item.setWeight(newWeight);
    }
}
