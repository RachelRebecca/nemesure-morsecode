import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest
{
    @Test
    public void toEnglish()
    {
        //given
        MorseCode morseCode = new MorseCode();
        MorseCodeConverter morseConverter = new MorseCodeConverter(morseCode);
        String expression = ".... . .-.. .-.. ---/.-- --- .-. .-.. -../.-.-.- -....-";

        //when and then
        assertEquals("HELLO WORLD .-", morseConverter.toEnglish(expression).strip());
    }

    @Test
    public void toMorseCode()
    {
        //given
        MorseCode morseCode = new MorseCode();
        MorseCodeConverter morseConverter = new MorseCodeConverter(morseCode);
        String expression = "HELLO WORLD! .-[]"; // completely ignore ! and []

        //when and then
        assertEquals(".... . .-.. .-.. --- /.-- --- .-. .-.. -.. /.-.-.- -....- /",
                morseConverter.toMorseCode(expression));
    }
}