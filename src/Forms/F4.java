package Forms;
//для графического дизайна, нажатия кнопок и тд
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//чтобы работать с многими методами, основной класс должен наследовать все от JFrame
@SuppressWarnings("serial")
public class F4 extends JFrame
{
    private JTextArea text;
    private JButton button;

    public F4()
    {
        Container container = getContentPane(); //объект на основе класса контейнер
        container.setLayout(new GridLayout(1, 2, 5, 5)); //создаем слой
        text = new JTextArea();
        container.add(text);
        button = new JButton("Отобразить");
        button.addActionListener(new ButtonListiner());
        container.add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class ButtonListiner implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = text.getText();
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

