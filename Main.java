import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
//lab2ex2
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Carly’s makes the food that makes it a party");
        System.out.println("Introduceti nr de invitati:");
        Integer invitati = Integer.valueOf(JOptionPane.showInputDialog(null, "Introduceti nr de invitati:"));
        double pret;
        int preti=35;
        pret=35*invitati;
        JOptionPane.showMessageDialog(null, "Pretul per invitat este:" + preti);
        JOptionPane.showMessageDialog(null, "Pretul total este:" + pret);
        if(invitati>=50) {
            JOptionPane.showMessageDialog(null, "Eveniment Mare");
        }
        else {
            JOptionPane.showMessageDialog(null, "Eveniment Mic");
     }

     }
}