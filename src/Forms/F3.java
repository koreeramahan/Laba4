package Forms;
//для графического дизайна, нажатия кнопок и тд
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//чтобы работать с многими методами, основной класс должен наследовать все от JFrame
@SuppressWarnings("serial")
public class F3 extends JFrame
{
    private JLabel label;
    private JTextArea text;
    private JButton button;

    public F3()
    {
        Container container = getContentPane(); //объект на основе класса контейнер
        container.setLayout(new GridLayout(2, 2, 5, 5)); //создаем слой
        label = new JLabel("Введите число:");
        container.add(label);
        text = new JTextArea();
        text.setBackground(Color.RED);
        container.add(text);
        button = new JButton("Скрыть поле");
        button.addActionListener(new ButtonListener());
        container.add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    //для отслеживания событий используется интерфейс ActionListener
    class ButtonListener implements ActionListener
    {
        //выполняем обработку действий пользователя (действие выполнено)
        public void actionPerformed(ActionEvent e)
        {
            if (text.isVisible())
            {
                text.setVisible(false);
                button.setText("Показать поле");
            }
            else
            {
                text.setVisible(true);
                button.setText("Скрыть поле");
            }
        }
    }
}
