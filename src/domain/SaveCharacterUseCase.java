package domain;

import data.CharacterMemLocalDataSource;

import java.lang.Character;


public class SaveCharacterUseCase {
    public static void execute(Character character) {
        CharacterMemLocalDataSource characterMemLocalDataSource=CharacterMemLocalDataSource.newInstance();
    }
}
