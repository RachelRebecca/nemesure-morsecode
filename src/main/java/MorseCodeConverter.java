public class MorseCodeConverter
{
    private final MorseCode morseCode;

    public MorseCodeConverter(MorseCode morseCode)
    {
        this.morseCode = morseCode;
    }

    public String toMorseCode(String englishExpression)
    {
        englishExpression = englishExpression.toUpperCase();

        StringBuilder morseExpression = new StringBuilder();

        String[] englishWords = englishExpression.split(" ");

        for (String word : englishWords)
        {
            String[] englishLetters = word.split("");

            for (String letter : englishLetters)
            {
                 String morse = morseCode.getMorseCharacters().get(letter.charAt(0));
                 morseExpression.append(morse == null? "" : morse + " ");
            }
            morseExpression.append("/");
        }

        return morseExpression.toString();
    }

    public String toEnglish(String morseExpression)
    {
        StringBuilder englishExpression = new StringBuilder();

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
                        englishExpression.append(key);
                        break;
                    }
                }
            }
            englishExpression.append(" ");
        }

        return englishExpression.toString();
    }
}
