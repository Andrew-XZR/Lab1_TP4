package com.ulp.lab_tp4;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Colegio {

    public static void main(String[] args) {
       //Solucion a la parte grafica luego de sacar el main del jframe ventanaprincipal//
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        Materia web2 = new Materia(8, "Web 2", 2);
        Materia matematica = new Materia(2, "Matemáticas", 1 );
        Materia lab1 = new Materia(4, "Laboratorio 1", 1 );
        Alumno martin = new Alumno(1001, "López", "Martin");
        Alumno brenda = new Alumno(1002, "Martínez", "Brenda");
        
        martin.agregarMateria(web2);
        martin.agregarMateria(matematica);
        martin.agregarMateria(lab1);
        brenda.agregarMateria(web2);
        brenda.agregarMateria(matematica);
        brenda.agregarMateria(lab1);
        
        brenda.agregarMateria(lab1);
        
        System.out.println("Cantidad de materias Martin: "
                + martin.cantidadMaterias());
        System.out.println("Cantidad de materias Brenda: "
                + brenda.cantidadMaterias());
        
        
      java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });  
        
        
    }
}