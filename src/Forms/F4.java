package Forms;
//для графического дизайна, нажатия кнопок и тд
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//чтобы работать с многими методами, основной класс должен наследовать все от JFrame
@SuppressWarnings("serial")
public class F4 extends JFrame
{
    private JTextField textField;
    private JButton button;

    public F4()
    {
        Container container = getContentPane(); //объект на основе класса контейнер
        container.setLayout(new GridLayout(1, 2, 5, 5)); //создаем слой
        textField = new JTextField();
        container.add(textField);
        button = new JButton("Отобразить");
        button.addActionListener(new ButtonListener());
        container.add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = textField.getText();
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

