package StreetFighter;

public class KenMastersConcreteStrategy extends WarriorStrategy implements JumpCharStrategy {
    public void  kick(){
        System.out.println("KenMasters kicks");
    }
    public void  punch(){
        System.out.println("KenMasters punches");
    }
    public void  jump(){
        System.out.println("KenMasters jumps");
    }
}
