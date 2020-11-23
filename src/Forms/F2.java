package Forms;
//для графического дизайна, нажатия кнопок и тд
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//чтобы работать с многими методами, основной класс должен наследовать все от JFrame
@SuppressWarnings("serial")
public class F2 extends JFrame
{
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JCheckBox checkBox;

    public F2()
    {
        Container container = getContentPane(); //объект на основе класса контейнер
        container.setLayout(new GridLayout(2, 2, 5, 5)); //создаем слой
        label = new JLabel("Введите имя:");
        container.add(label);
        textField = new JTextField("Джон Сноу");
        container.add(textField);
        button = new JButton("Все готово");
        button.addActionListener(new F2.ButtonListener());
        container.add(button);
        checkBox = new JCheckBox("Согласны?");
        container.add(checkBox);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = textField.getText();
            str+=" (CheckBox is "+((checkBox.isSelected())?"checked":"unchecked") + ")";
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

