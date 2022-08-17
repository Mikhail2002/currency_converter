import javax.swing.*;

public class Function {

    public boolean check(String input){
        try{
            double x = Double.parseDouble(input);
            if (x>=0||x<0);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }

    public void dollarToEuro(double amount){
        double euro = amount * 0.98;
        JOptionPane.showMessageDialog(null, "Amount of Euro: "+euro);
    }

    public void dollarToUAH(double amount){
        double UAH = amount * 36.59;
        JOptionPane.showMessageDialog(null, "Amount of UAH: "+UAH);
    }

    public void UAHToEuro(double amount){
        double euro = amount * 0.027;
        JOptionPane.showMessageDialog(null, "Amount of Euro: "+euro);
    }

    public void UAHToDollar (double amount){
        double dollar = amount * 0.027;
        JOptionPane.showMessageDialog(null, "Amount of Dollar: "+dollar);
    }

    public void EuroToUAH (double amount){
        double UAH = amount * 37.74;
        JOptionPane.showMessageDialog(null, "Amount of UAH: "+UAH);
    }
    public void EuroToDollar (double amount){
        double dollar = amount * 1.02;
        JOptionPane.showMessageDialog(null, "Amount of Dollar: "+dollar);
    }
}
