package data;

import domain.Character;
import domain.CharacterRepository;

public class CharacterDataRepository implements CharacterRepository {
 private CharacterMemLocalDataSource characterMemLocalDataSource;

    public CharacterDataRepository(CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }

    @Override
    public void save(Character character) {
        characterMemLocalDataSource.save(character);
    }
    @Override
    public void print(Character character) {
        characterMemLocalDataSource.findAll();
    }
}
