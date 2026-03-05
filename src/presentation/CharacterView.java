package presentation;


import data.CharacterDataRepository;
import data.CharacterMemLocalDataSource;
import domain.SaveCharacterUseCase;

public class CharacterView {
    public static void saveCharacterUseCase(Character character){

        CharacterDataRepository characterDataRepository = new CharacterDataRepository(
                CharacterMemLocalDataSource.newInstance());

    SaveCharacterUseCase.execute(character);
    System.out.println();
    }
}
