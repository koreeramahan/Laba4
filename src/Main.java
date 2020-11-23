import Forms.*;
//создание окна в отдельном файле, здесь только запускаем окна
public class Main {

    public static void main(String[] args) {

        F1 form1 = new F1(); //создаем окно
        form1.setSize(200, 200); //задаем размер окна
        form1.setTitle("Простая программа"); //задаем название окна
        form1.setVisible(true); //вызываем метод для отображения окна
        form1.setLocation(200, 200); //задаем положение окна

        F2 form2 = new F2();
        form2.setSize(300, 150);
        form2.setTitle("Приложение с выбором");
        form2.setVisible(true);
        form2.setLocation(200, 400);

        F3 form3 = new F3();
        form3.setSize(300, 150);
        form3.setTitle("Отслеживание нажатий");
        form3.setVisible(true);
        form3.setLocation(600, 230);

        F4 form4 = new F4();
        form4.setSize(300, 60);
        form4.setTitle("Диалоговое окно");
        form4.setVisible(true);
        form4.setLocation(600, 400);

    }

}
