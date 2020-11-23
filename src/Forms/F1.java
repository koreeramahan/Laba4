package Forms;
//для графического дизайна, нажатия кнопок и тд
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//чтобы работать с многими методами, основной класс должен наследовать все от JFrame
@SuppressWarnings("serial")
public class F1 extends JFrame
{
    private JTextField text1;
    private JTextField text2;
    private JButton button;

    public F1()
    {
        Container container = getContentPane(); //объект на основе класса контейнер
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); //создаем слой

        text1 = new JTextField("Привет");
        text1.setPreferredSize(new Dimension(200, 65));
        text1.setAlignmentX(Component.LEFT_ALIGNMENT);
        container.add(text1);
        container.add(Box.createVerticalStrut(2));

        text2 = new JTextField("Мир!");
        text2.setPreferredSize(new Dimension(200, 65));
        text2.setAlignmentX(Component.LEFT_ALIGNMENT);
        container.add(text2);
        container.add(Box.createVerticalStrut(2));

        button = new JButton("Нажмите");
        button.setMaximumSize(new Dimension(10000, 10000));
        button.setPreferredSize(new Dimension(200, 65));
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        container.add(button);
        button.addActionListener(new F1.ButtonListener());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = text1.getText();
            str+=" "+text2.getText();
            if (!str.equals(""))
            {
                JOptionPane.showMessageDialog(
                        new JFrame(),
                        str,
                        "Информация",
                        JOptionPane.DEFAULT_OPTION
                );
            }
        }
    }
}

