import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MorseCodePresenterTest
{
    private final MorseCodeFrame frame = mock(MorseCodeFrame.class);
    private final MorseCodeConverter converter = mock(MorseCodeConverter.class);
    private final MorseCodePresenter presenter = new MorseCodePresenter(frame, converter);

    @Test
    public void translateToEnglish()
    {
        //given
        String morseExpression = ".... . .-.. .-.. --- /.-- --- .-. .-.. -.. /";
        frame.setMorseExpressionText(morseExpression);
        frame.setEnglishExpressionText("");
        doReturn(morseExpression).when(frame).getMorseExpressionText();
        doReturn("").when(frame).getEnglishExpressionText();
        doReturn("HELLO WORLD").when(converter).toEnglish(morseExpression);

        //when
        presenter.translateToEnglish(morseExpression);

        //then
        verify(frame).setEnglishExpressionText("HELLO WORLD");
    }

    @Test
    public void translateToMorse()
    {
        //given
        String englishExpression = "HELLO WORLD";
        String morseExpression = ".... . .-.. .-.. --- /.-- --- .-. .-.. -.. /";

        frame.setEnglishExpressionText(englishExpression);
        frame.setMorseExpressionText("");

        doReturn(englishExpression).when(frame).getEnglishExpressionText();
        doReturn("").when(frame).getMorseExpressionText();
        doReturn(morseExpression).when(converter).toMorseCode(englishExpression);

        //when
        presenter.translateToMorse(englishExpression);

        //then
        verify(frame).setMorseExpressionText(morseExpression);
    }
}