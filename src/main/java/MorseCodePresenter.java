public class MorseCodePresenter
{
    private MorseCodeFrame view;
    private MorseCodeConverter model;

    public MorseCodePresenter(MorseCodeFrame view, MorseCodeConverter model)
    {
        this.view = view;
        this.model = model;
    }

    public void translateToEnglish(String expression)
    {
       String english = model.toEnglish(expression);
       view.setEnglishExpressionText(english);
    }

    public void translateToMorse(String expression)
    {
        String morse = model.toMorseCode(expression);
        view.setMorseExpressionText(morse);
    }
}
