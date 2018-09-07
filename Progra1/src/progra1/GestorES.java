package progra1;

import javax.swing.JOptionPane;

public class GestorES {
	public void mostrarMensaje (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
        }
    public String solicitarString (String mensaje) {
        String palabraDigitada = JOptionPane.showInputDialog(null, mensaje);
        return palabraDigitada;
        }
    public int solicitarEntero ( String mensaje) {
        int numeroDigitado= Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        return numeroDigitado;
        }
    public double solicitarDecimal (String mensaje) {
        double numerodigitado = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return numerodigitado;
        }

}
