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
        horizontalPanel1.setLayout(new FlowLayout());
        morseExpression = new JTextArea();
        morseExpression.setText(morsePlacementText);
        morseExpression.setColumns (60);
        morseExpression.setLineWrap (true);
        horizontalPanel1.add(morseExpression);
        verticalPanel.add(horizontalPanel1);
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
        horizontalPanel2.setLayout(new FlowLayout());
        englishExpression = new JTextArea();
        englishExpression.setText(englishPlacementText);
        englishExpression.setColumns (60);
        englishExpression.setLineWrap (true);
        horizontalPanel2.add(englishExpression);
        verticalPanel.add(horizontalPanel2);
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
