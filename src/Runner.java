import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        Function f = new Function();
        Object[] mainOption = {"Try Again", "Quit"};
        Object[] option1 = {"USD", "EUR", "UAH", "Quit"};
        Object[] option2 = {"EUR", "UAH", "Quit"};
        Object[] option3 = {"USD", "UAH", "Quit"};
        Object[] option4 = {"USD", "EUR", "Quit"};


        while (true) {
            int choice1 = JOptionPane.showOptionDialog(null, "Choose your currency", "Currency converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[3]);
            System.out.println(choice1);

            if (choice1 == 0) {
                String input = JOptionPane.showInputDialog(null, "Enter value: ");
                System.out.println(input);
                if (f.check(input)){
                    double amount = Double.parseDouble(input);

                    int choice2 = JOptionPane.showOptionDialog(null, "Choose Which Currency You Wish To Convert", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[2]);

                    if (choice2 == 0) {
                        f.dollarToEuro(amount);

                        int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);

                        if (choice3 == 1) {break;}
                    } else if (choice2 == 1) {
                        f.dollarToUAH(amount);

                        int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);

                        if (choice3 == 1) {break;}
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Output, try again");

                    int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);
                    if (choice3 == 1) {break;}
                }
            } else if (choice1 == 1) {
                String input = JOptionPane.showInputDialog(null, "Enter value: ");
                System.out.println(input);
                if (f.check(input)){
                    double amount = Double.parseDouble(input);

                    int choice2 = JOptionPane.showOptionDialog(null, "Choose Which Currency You Wish To Convert", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[2]);

                    if (choice2 == 0) {
                        f.EuroToDollar(amount);

                        int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);

                        if (choice3 == 1) {break;}
                    } else if (choice2 == 1) {
                        f.EuroToUAH(amount);

                        int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);

                        if (choice3 == 1) {break;}
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Output, try again");

                    int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);

                    if (choice3 == 1) {break;}
                }
            } else if (choice1 == 2) {
                String input = JOptionPane.showInputDialog(null, "Enter value: ");
                System.out.println(input);
                if (f.check(input)){
                    double amount = Double.parseDouble(input);

                    int choice2 = JOptionPane.showOptionDialog(null, "Choose Which Currency You Wish To Convert", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option4, option4[2]);

                    if (choice2 == 0) {
                        f.UAHToDollar(amount);

                        int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);

                        if (choice3 == 1) {break;}
                    } else if (choice2 == 1) {
                        f.UAHToEuro(amount);

                        int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);

                        if (choice3 == 1) {
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Output, try again");

                    int choice3 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mainOption, mainOption[1]);

                    if (choice3 == 1) {break;}
                }
            } else {break;}
        }
    }
}
