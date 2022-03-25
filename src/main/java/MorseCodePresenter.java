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
        if (view.getMorseExpression().getText() == null || view.getMorseExpression().getText().strip().equals(""))
        {
            view.setMorseExpressionText("Make sure to enter some Morse Code before clicking on Translate To English");
        }
        else
        {
            view.setEnglishExpressionText("");
            String english = model.toEnglish(expression);
            view.setEnglishExpressionText(english);
            if (view.getEnglishExpression().getText() == null || view.getEnglishExpression().getText().equals(""))
            {
                view.setEnglishExpressionText("Couldn't translate to English");
            }

        }
    }

    public void translateToMorse(String expression)
    {
        if (view.getEnglishExpression().getText() == null || view.getEnglishExpression().getText().strip().equals(""))
        {
            view.setEnglishExpressionText("Make sure to enter some English text before clicking on Translate To Morse");
        }
        else
        {
            view.setMorseExpressionText("");
            String morse = model.toMorseCode(expression);
            view.setMorseExpressionText(morse);
            if (view.getMorseExpression().getText() == null || view.getMorseExpression().getText().equals(""))
            {
                view.setMorseExpressionText("Couldn't translate to Morse");
            }
        }
    }
}
