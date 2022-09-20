package kalfer.examenparcial;

import javax.swing.JOptionPane;
/**
 *
 * @author kalfe
 */
public class AlumnoH extends Persona{
   // string codigo;
    int nota1;
    int nota2;
    int nota3;
    double promedio;
public void leer(){
    //codigo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo: "));
    nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 1:"));
    nota2= Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 2:"));
    nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 3: "));
}
   public void Promedio(){
    promedio=(nota1+nota2+nota3)/3;
    if(promedio>=11){
        System.out.println("Aprobado");
        System.out.println("Promedio= "+promedio);
    }
    else{
        System.out.println("Desaprobado");
        System.out.println("Promedio= "+promedio);
    }
        
}

}
