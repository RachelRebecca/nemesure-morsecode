import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MorseCodeFrame extends JFrame
{
    private final MorseCodePresenter presenter;

    private JPanel verticalPanel;

    private JTextArea morseExpression;
    private JTextArea englishExpression;

    public final static String morsePlacementText = "Enter Morse Code here " +
            "(Use spaces to separate letters and / to separate words)";
    public final static String englishPlacementText = "Enter English text here";

    public MorseCodeFrame()
    {
        MorseCode morseCode = new MorseCode();
        MorseCodeConverter converter = new MorseCodeConverter(morseCode);
        presenter = new MorseCodePresenter(this, converter);

        setFormProperties();

        initializeVerticalPanel();

        setEnterMorseCodeTextArea();

        setButtons();

        setEnterEnglishTextArea();
    }

    private void setFormProperties()
    {
        setTitle("Morse Code Conversion");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    private void initializeVerticalPanel()
    {
        verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        add(verticalPanel);
    }

    private void setEnterMorseCodeTextArea()
    {
        JPanel horizontalPanel1 = new JPanel();

        morseExpression = new JTextArea();

        setEnterTextArea(horizontalPanel1, morseExpression, morsePlacementText);
    }

    private void setButtons()
    {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton translateToEnglish = new JButton();
        translateToEnglish.setText("Translate to English");
        translateToEnglish.addActionListener(this::onClickedTranslateToEnglish);
        buttonPanel.add(translateToEnglish);

        JButton translateToMorse = new JButton();
        translateToMorse.setText("Translate to Morse");
        translateToMorse.addActionListener(this::onClickedTranslateToMorse);
        buttonPanel.add(translateToMorse);
        verticalPanel.add(buttonPanel);
    }

    private void onClickedTranslateToEnglish(ActionEvent actionEvent)
    {
        presenter.translateToEnglish(morseExpression.getText());
    }

    private void onClickedTranslateToMorse(ActionEvent actionEvent)
    {
        presenter.translateToMorse(englishExpression.getText());
    }

    private void setEnterEnglishTextArea()
    {
        JPanel horizontalPanel2 = new JPanel();
        englishExpression = new JTextArea();
        setEnterTextArea(horizontalPanel2, englishExpression, englishPlacementText);
    }

    private void setEnterTextArea(JPanel panel, JTextArea expression, String text)
    {
        panel.setLayout(new FlowLayout());
        expression.setText(text);
        expression.setColumns(60);
        expression.setLineWrap(true);
        panel.add(expression);
        verticalPanel.add(panel);
    }

    public void setMorseExpressionText(String text)
    {
        morseExpression.setText(text);
    }

    public void setEnglishExpressionText(String text)
    {
        englishExpression.setText(text);
    }

    public static void main(String[] args)
    {
        JFrame frame = new MorseCodeFrame();

        frame.setVisible(true);
    }

}
