import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest
{
    @Test
    public void toEnglish()
    {
        //given
        MorseCodeConverter codeConverter = new MorseCodeConverter();
        String expression = ".- / --.- ..- .. -.-. -.- / .-- --- .-. -.. / .-- .. - .... / " +
                ".-. .- -.-. .... . .-.. .----. .../ -- --- -- ..--..";

        //when and then
        assertEquals("A QUICK WORD WITH RACHEL'S MOM?", codeConverter.toEnglish(expression).strip());
    }

    @Test
    public void toMorseCode()
    {
        //given
        MorseCodeConverter codeConverter = new MorseCodeConverter();
        String expression = "A QUICK WORD WITH RACHEL'S MOM?";

        //when and then
        assertEquals(".- /--.- ..- .. -.-. -.- /.-- --- .-. -.. /.-- .. - .... /" +
                ".-. .- -.-. .... . .-.. .----. ... /-- --- -- ..--.. /", codeConverter.toMorseCode(expression));
    }
}