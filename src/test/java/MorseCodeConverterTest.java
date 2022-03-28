import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest
{
    @Test
    public void toEnglish()
    {
        //given
        MorseCode morseCode = new MorseCode();
        MorseCodeConverter codeConverter = new MorseCodeConverter(morseCode);
        String expression = ".... . .-.. .-.. ---/.-- --- .-. .-.. -../.-.-.- -....-";

        //when and then
        assertEquals("HELLO WORLD .-", codeConverter.toEnglish(expression).strip());
    }

    @Test
    public void toMorseCode()
    {
        //given
        MorseCode morseCode = new MorseCode();
        MorseCodeConverter codeConverter = new MorseCodeConverter(morseCode);
        String expression = "HELLO WORLD! .-[]"; // completely ignore ! and []

        //when and then
        assertEquals(".... . .-.. .-.. --- /.-- --- .-. .-.. -.. /.-.-.- -....- /", codeConverter.toMorseCode(expression));
    }
}