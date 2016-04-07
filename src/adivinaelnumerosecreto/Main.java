/*
ITCampeche
Alumno: Chi Rejón Juan Manuel
Semestre: Segundo
Grupo: MS2
Laboratorio 1.- El Número Secreto
 */
package adivinaelnumerosecreto;
import java.util.Scanner;
import model.Juego;

/**
 *
 * @author juanm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean seAdivinoElNumeroSecreto = false;
        Juego juego = new Juego(1,100,5);
        while (juego.puedeIntentarDeNuevo() == true
                && !seAdivinoElNumeroSecreto) {
            System.out.print("Adivine el número secreto: ");
            numero = entrada.nextInt();
            seAdivinoElNumeroSecreto = juego.esElNumeroSecreto(numero);
            if (seAdivinoElNumeroSecreto) {
                System.out.println("Felicidades. Has adivinado el número secreto.");
                }
            else {
                System.out.println("Fallaste. El número secreto es "
                        + juego.getTextoDeAyuda(numero)
                        + " que el número proporcionado");
                System.out.println("Intenta de nuevo.");
                }
            }
        System.out.println("El número secreto es " + juego.getNumeroSecreto());
    }                    
      
}
