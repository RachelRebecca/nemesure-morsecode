import java.util.HashMap;

public class MorseCode
{
    private final HashMap<Character, String> morseCharacters;

    public MorseCode()
    {
        morseCharacters = new HashMap<>();
        addMorseCode();
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

    public HashMap<Character, String> getMorseCharacters()
    {
        return this.morseCharacters;
    }
}
