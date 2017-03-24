package examen2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Hilo_Reproduccion implements Runnable {

    private int duracion;
    private JLabel label;
    private JProgressBar bar;

    public Hilo_Reproduccion(int duracion, JLabel label, JProgressBar bar) {
        this.duracion = duracion;
        this.label = label;
        this.bar = bar;
    }

    

    public void run() {
        int acum = 0;
        while (acum <= duracion) {
            label.setText("" + acum);
            bar.setValue(acum);
            acum++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
}
