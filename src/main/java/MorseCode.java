import java.util.HashMap;

public class MorseCode
{
    private final HashMap<Character, String> englishToMorse;
    private final HashMap<String, Character> morseToEnglish;

    public MorseCode()
    {
        englishToMorse = new HashMap<>();
        morseToEnglish = new HashMap<>();
        addMorseAndEnglish();
    }

    private void addMorseAndEnglish()
    {
        addMorseAndEnglish('A', ".-");
        addMorseAndEnglish('B', "-...");
        addMorseAndEnglish('C', "-.-.");
        addMorseAndEnglish('D', "-..");
        addMorseAndEnglish('E', ".");
        addMorseAndEnglish('F', "..-.");
        addMorseAndEnglish('G', "--.");
        addMorseAndEnglish('H', "....");
        addMorseAndEnglish('I', "..");
        addMorseAndEnglish('J', ".---");
        addMorseAndEnglish('K', "-.-");
        addMorseAndEnglish('L', ".-..");
        addMorseAndEnglish('M', "--");
        addMorseAndEnglish('N', "-.");
        addMorseAndEnglish('O', "---");
        addMorseAndEnglish('P', ".--.");
        addMorseAndEnglish('Q', "--.-");
        addMorseAndEnglish('R', ".-.");
        addMorseAndEnglish('S', "...");
        addMorseAndEnglish('T', "-");
        addMorseAndEnglish('U', "..-");
        addMorseAndEnglish('V', "...-");
        addMorseAndEnglish('W', ".--");
        addMorseAndEnglish('X', "-..-");
        addMorseAndEnglish('Y', "-.--");
        addMorseAndEnglish('Z', "--..");
        addMorseAndEnglish('0', "-----");
        addMorseAndEnglish('1', ".----");
        addMorseAndEnglish('2', "..---");
        addMorseAndEnglish('3', "...--");
        addMorseAndEnglish('4', "....-");
        addMorseAndEnglish('5', ".....");
        addMorseAndEnglish('6', "-....");
        addMorseAndEnglish('7', "--...");
        addMorseAndEnglish('8', "---..");
        addMorseAndEnglish('9', "----.");
        addMorseAndEnglish('.', ".-.-.-");
        addMorseAndEnglish(',', "--..--");
        addMorseAndEnglish(':', "---...");
        addMorseAndEnglish('?', "..--..");
        addMorseAndEnglish('\'', ".----.");
        addMorseAndEnglish('-', "-....-");
        addMorseAndEnglish('/', "-..-.");
        addMorseAndEnglish('"', ".-..-.");
    }

    private void addMorseAndEnglish(Character english, String morse)
    {
        englishToMorse.put(english, morse);
        morseToEnglish.put(morse, english);
    }


    public String translateFromEnglishToMorse(String letter)
    {
        Character charLetter = letter.charAt(0);
        return englishToMorse.get(charLetter);
    }

    public Character translateFromMorseToEnglish(String morse)
    {
        return morseToEnglish.get(morse);
    }
}
