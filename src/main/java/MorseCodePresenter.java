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
        if (view.getMorseExpressionText() == null || view.getMorseExpressionText().strip().equals(""))
        {
            view.setMorseExpressionText("Make sure to enter some Morse Code before clicking on Translate To English");
        }
        else
        {
            view.setEnglishExpressionText("");
            String english = model.toEnglish(expression);
            view.setEnglishExpressionText(english);
            if (view.getEnglishExpressionText() == null || view.getEnglishExpressionText().equals(""))
            {
                view.setEnglishExpressionText("Couldn't translate to English");
            }

        }
    }

    public void translateToMorse(String expression)
    {
        if (view.getEnglishExpressionText() == null || view.getEnglishExpressionText().strip().equals(""))
        {
            view.setEnglishExpressionText("Make sure to enter some English text before clicking on Translate To Morse");
        }
        else
        {
            view.setMorseExpressionText("");
            String morse = model.toMorseCode(expression);
            view.setMorseExpressionText(morse);
            if (view.getMorseExpressionText() == null || view.getMorseExpressionText().equals(""))
            {
                view.setMorseExpressionText("Couldn't translate to Morse");
            }
        }
    }
}
