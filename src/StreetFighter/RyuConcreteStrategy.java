package StreetFighter;

public class RyuConcreteStrategy extends WarriorStrategy implements RollCharStrategy {
    public void  kick(){
        System.out.println("Ryu kicks");
    }
    public void  punch(){
        System.out.println("Ryu punches");
    }
    public void  rolldown(){
        System.out.println("Ryu rolldown");
    }

}
