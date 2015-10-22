package metodos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int calificaciones[][];
        calificaciones=new int[3][3];
        llenar(calificaciones);
        mostrar(calificaciones);
    }
    public static void llenar(int calificaciones[][]){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                calificaciones[i][j]=Integer.parseInt(JOptionPane.showInputDialog(
                        "Entre elemento en la pos.:"+i+","+j+":"));
            }

        }
    }
    public static  void mostrar(int calificaciones[][]){
        int i;
        int j;
        String x = "";
        for (i=0; i<3; i++){
            double prom=0;
            for ( j=0; j<3; j++){
                x = x +"[" + calificaciones[i][j] + "]";
                prom += calificaciones[i][j];
            }
            x = x + " Promedio: "+prom/j;
            x = x + "\n";
        }
        JOptionPane.showMessageDialog(null,"\n"+x);
        System.exit(0);
    }
}