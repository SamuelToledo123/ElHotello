package GUI;

import javax.swing.*;
import java.awt.*;

public class BookRoomPanel extends JPanel {
    private JPanel textAndFields = new JPanel();
    private JLabel name = new JLabel("namn:");
    private JTextField writeName = new JTextField();
    private JLabel amountOfNights = new JLabel("namn:");
    private JTextField writeAmountOfNigths = new JTextField();

    private JPanel buttonPanel = new JPanel();
    private JButton book = new JButton("Book now");
    private JButton cancel = new JButton("Cancel");

    public BookRoomPanel(Frame frame){
        setLayout(new BorderLayout());

        textAndFields.setLayout(new GridLayout(2,1));

        buttonPanel.setSize(new Dimension(500,20));
        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(book);
        buttonPanel.add(cancel);

        add(name);
        add(writeName);
        add(buttonPanel, BorderLayout.SOUTH);

    }

}
