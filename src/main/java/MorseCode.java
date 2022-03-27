import java.util.HashMap;

public class MorseCode
{
    private final HashMap<Character, String> morseCharacters;
    private final HashMap<String, Character> morseCharactersOtherDirection;

    public MorseCode()
    {
        morseCharacters = new HashMap<>();
        addMorseCode();
        morseCharactersOtherDirection = new HashMap<>();
        addOtherDirection();
    }

    private void addMorseCode()
    {
        morseCharacters.put('A', ".-");
        morseCharacters.put('B', "-...");
        morseCharacters.put('C', "-.-.");
        morseCharacters.put('D', "-..");
        morseCharacters.put('E', ".");
        morseCharacters.put('F', "..-.");
        morseCharacters.put('G', "--.");
        morseCharacters.put('H', "....");
        morseCharacters.put('I', "..");
        morseCharacters.put('J', ".---");
        morseCharacters.put('K', "-.-");
        morseCharacters.put('L', ".-..");
        morseCharacters.put('M', "--");
        morseCharacters.put('N', "-.");
        morseCharacters.put('O', "---");
        morseCharacters.put('P', ".--.");
        morseCharacters.put('Q', "--.-");
        morseCharacters.put('R', ".-.");
        morseCharacters.put('S', "...");
        morseCharacters.put('T', "-");
        morseCharacters.put('U', "..-");
        morseCharacters.put('V', "...-");
        morseCharacters.put('W', ".--");
        morseCharacters.put('X', "-..-");
        morseCharacters.put('Y', "-.--");
        morseCharacters.put('Z', "--..");
        morseCharacters.put('0', "-----");
        morseCharacters.put('1', ".----");
        morseCharacters.put('2', "..---");
        morseCharacters.put('3', "...--");
        morseCharacters.put('4', "....-");
        morseCharacters.put('5', ".....");
        morseCharacters.put('6', "-....");
        morseCharacters.put('7', "--...");
        morseCharacters.put('8', "---..");
        morseCharacters.put('9', "----.");
        morseCharacters.put('.', ".-.-.-");
        morseCharacters.put(',', "--..--");
        morseCharacters.put(':', "---...");
        morseCharacters.put('?', "..--..");
        morseCharacters.put('\'', ".----.");
        morseCharacters.put('-', "-....-");
        morseCharacters.put('/', "-..-.");
        morseCharacters.put('"', ".-..-.");
    }

    public void addOtherDirection()
    {
        morseCharactersOtherDirection.put(".-", 'A');
        morseCharactersOtherDirection.put("-...", 'B');
        morseCharactersOtherDirection.put("-.-.", 'C');
        morseCharactersOtherDirection.put("-..", 'D');
        morseCharactersOtherDirection.put(".", 'E');
        morseCharactersOtherDirection.put("..-.", 'F');
        morseCharactersOtherDirection.put("--.", 'G');
        morseCharactersOtherDirection.put("....", 'H');
        morseCharactersOtherDirection.put("..", 'I');
        morseCharactersOtherDirection.put(".---", 'J');
        morseCharactersOtherDirection.put("-.-", 'K');
        morseCharactersOtherDirection.put(".-..", 'L');
        morseCharactersOtherDirection.put("--", 'M');
        morseCharactersOtherDirection.put("-.", 'N');
        morseCharactersOtherDirection.put("---", 'O');
        morseCharactersOtherDirection.put(".--.", 'P');
        morseCharactersOtherDirection.put("--.-", 'Q');
        morseCharactersOtherDirection.put(".-.", 'R');
        morseCharactersOtherDirection.put("...", 'S');
        morseCharactersOtherDirection.put("-", 'T');
        morseCharactersOtherDirection.put("..-", 'U');
        morseCharactersOtherDirection.put("...-", 'V');
        morseCharactersOtherDirection.put(".--", 'W');
        morseCharactersOtherDirection.put("-..-", 'X');
        morseCharactersOtherDirection.put("-.--", 'Y');
        morseCharactersOtherDirection.put("--..", 'Z');
        morseCharactersOtherDirection.put("-----", '0');
        morseCharactersOtherDirection.put(".----", '1');
        morseCharactersOtherDirection.put("..---", '2');
        morseCharactersOtherDirection.put("...--", '3');
        morseCharactersOtherDirection.put("....-", '4');
        morseCharactersOtherDirection.put(".....", '5');
        morseCharactersOtherDirection.put("-....", '6');
        morseCharactersOtherDirection.put("--...", '7');
        morseCharactersOtherDirection.put("---..", '8');
        morseCharactersOtherDirection.put("----.", '9');
        morseCharactersOtherDirection.put(".-.-.-", '.');
        morseCharactersOtherDirection.put("--..--", ',');
        morseCharactersOtherDirection.put("---...", ':');
        morseCharactersOtherDirection.put("..--..", '?');
        morseCharactersOtherDirection.put(".----.", '\'');
        morseCharactersOtherDirection.put("-....-", '-');
        morseCharactersOtherDirection.put("-..-.", '/');
        morseCharactersOtherDirection.put(".-..-.", '"');
    }

    public String translateFromEnglishToMorse(String letter)
    {
        Character charLetter = letter.charAt(0);
        return morseCharacters.get(charLetter);
    }

    public Character translateFromMorseToEnglish(String morse)
    {
        return morseCharactersOtherDirection.get(morse);
    }
}
