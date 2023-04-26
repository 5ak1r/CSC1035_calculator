import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleContact extends JFrame {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 300;

    private JLabel title, firstName, lastName, email;
    private JTextField firstNameText, lastNameText, emailText;
    private JButton submitButton;

    public SimpleContact() {
        setTitle("Contact Form");

        Container contactPane = getContentPane();
        contactPane.setLayout(new GridLayout(5,3));

        title = new JLabel("Contact Form");
        firstName = new JLabel("First Name: ");
        lastName = new JLabel("Last Name: ");
        email = new JLabel("Email: ");

        firstNameText = new JTextField(12);
        lastNameText = new JTextField(12);
        emailText = new JTextField(12);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(contactPane,
                        String.format(
                                """
                                        You form has been submitted with the following data:\s
                                        First name: %s\s
                                        Surname: %s\s
                                        Email: %s""",
                                firstNameText.getText(), lastNameText.getText(), emailText.getText()));
            }
        });

        contactPane.add(new JPanel());
        contactPane.add(title);
        contactPane.add(new JPanel());
        contactPane.add(firstName);
        contactPane.add(new JPanel());
        contactPane.add(firstNameText);
        contactPane.add(lastName);
        contactPane.add(new JPanel());
        contactPane.add(lastNameText);
        contactPane.add(email);
        contactPane.add(new JPanel());
        contactPane.add(emailText);
        contactPane.add(new JPanel());
        contactPane.add(submitButton);
        contactPane.add(new JPanel());


        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        SimpleContact contactForm = new SimpleContact();
    }
}


