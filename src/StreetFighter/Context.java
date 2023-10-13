package StreetFighter;

import java.util.ArrayList;

public class Context {
    public void simulate() {
        ArrayList<WarriorStrategy> characters = new ArrayList<>();
        characters.add(new AkumaConcreteStrategy());
        characters.add(new RyuConcreteStrategy());
        characters.add(new KenMastersConcreteStrategy());
        characters.add(new ChunLiConcreteStrategy());


        // En este bucle se recorre el array de personajes y se escoge la estrategia
        // concreta de cada uno de ellos. Se llama a los métodos de la interfaz
        for(WarriorStrategy character : characters) {
            character.kick();
            character.punch();
            if (character instanceof JumpCharStrategy){
                ((JumpCharStrategy) character).jump();
            }
            if (character instanceof RollCharStrategy){
                ((RollCharStrategy) character).rolldown();
            }
            if (character instanceof RollCharStrategy && character instanceof JumpCharStrategy){
                ((RollCharStrategy) character).rolldown();
                ((JumpCharStrategy) character).jump();
            }
        }
    }
}
