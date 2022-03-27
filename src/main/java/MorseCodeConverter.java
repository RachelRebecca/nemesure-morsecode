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

            boolean letterTranslated = false;
            for (String letter : englishLetters)
            {
                if (!letter.equals(""))
                {
                    letterTranslated = true;
                    String morse = morseCode.translateFromEnglishToMorse(letter);
                    morseExpression.append(morse == null ? "" : (morse + " "));
                }
            }
            if (letterTranslated)
            {
                morseExpression.append("/");
            }
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
                Character english = morseCode.translateFromMorseToEnglish(letter);
                englishExpression.append(english == null ? "" : english);
            }
            englishExpression.append(" ");
        }

        return englishExpression.toString().strip();
    }
}
