package data;

import domain.Character;

import java.util.ArrayList;
import java.util.Objects;

public class CharacterMemLocalDataSource {
    private static CharacterMemLocalDataSource instance=null;
    private ArrayList<Character> storage = new ArrayList<>();

    public ArrayList<Character> findAll() {
        return storage;
    }

    public void save(Character character) {
        storage.add(character);
    }

    public void delete(String characterId) {
        storage.removeIf(character -> Objects.equals(character.getId(), characterId));
    }

    public static CharacterMemLocalDataSource newInstance() {
        if (instance == null){
            return new CharacterMemLocalDataSource();
        }
        return instance;
    }
}
