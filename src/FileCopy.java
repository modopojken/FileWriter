import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        String filnamn = "text.txt";
        int resultat;
        int Text;
        int Binary;
        filnamn = JOptionPane.showInputDialog(null, "Vad ska filen heta?");

        Object[] options = {"text",
                "binary"};
        resultat = JOptionPane.showOptionDialog(null,
                "Choose wisley",
                "text, binary",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        if(resultat == 0){
            FileWriter fw = null;
            try {
                fw = new FileWriter("KopiaAv"+filnamn);
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter utFil = new PrintWriter(bw);

            FileReader fr = null;
            try {
                fr = new FileReader(filnamn);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader inFil = new BufferedReader(fr);
        }else if(resultat == 1){

        }else{
            System.exit(0);
        }
    }
}