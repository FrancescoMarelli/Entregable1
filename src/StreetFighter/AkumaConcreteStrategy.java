package StreetFighter;

public class AkumaConcreteStrategy extends WarriorStrategy implements RollCharStrategy, JumpCharStrategy{
    public void  kick(){
        System.out.println("Akuma kicks");
    }
    public void  punch(){
        System.out.println("Akuma punches");
    }
    public void  jump(){
        System.out.println("Akuma jumps");
    }
    public void  rolldown(){
        System.out.println("Akuma rolldown");
    }

}
