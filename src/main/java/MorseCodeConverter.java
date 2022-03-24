public class MorseCodeConverter
{
    private final MorseCode morseCode;

    public MorseCodeConverter()
    {
        this.morseCode = new MorseCode();
    }

    public String toMorseCode(String englishExpression)
    {
        englishExpression = englishExpression.toUpperCase();
        String morseExpression = "";
        String[] englishWords = englishExpression.split(" ");
        for (String word : englishWords)
        {
            String[] englishLetters = word.split("");

            for (String letter : englishLetters)
            {
                for (Character key : morseCode.getMorseCharacters().keySet())
                {
                    String keyString = key.toString();
                    if (letter.equals(keyString))
                    {
                        morseExpression += morseCode.getMorseCharacters().get(key) + " ";
                        break;
                    }
                }
            }
            morseExpression += "/";
        }

        return morseExpression;
    }

    public String toEnglish(String morseExpression)
    {
        String englishExpression = "";
        String[] morseWords = morseExpression.split("/");
        for (String word : morseWords)
        {
            String[] morseLetters = word.split(" ");

            for (String letter : morseLetters)
            {
                for (Character key : morseCode.getMorseCharacters().keySet())
                {
                    if (morseCode.getMorseCharacters().get(key).equals(letter))
                    {
                        englishExpression += key;
                        break;
                    }
                }
            }
            englishExpression += " ";
        }

        return englishExpression;
    }
}
