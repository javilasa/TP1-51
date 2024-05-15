/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaApplication20 {
    
    ArrayList listaPersonas = new ArrayList<Persona>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication20 prog = new JavaApplication20();
        int op;
        do{
            op = prog.menu();
            
            switch(op) {
                case 1:
                    prog.ingresarEstudiante();
                break;
                case 2:
                    prog.ingresarProfesor();
                break;
                case 3:
                    prog.mostrarPersonas();
                break;
            }
        }while(op!=4);
    }
    
    public int menu() {
        System.out.println("1. Ingresar Estudiante");
        System.out.println("2. Ingresar Profesor");
        System.out.println("3. Mostrar Personas");
        System.out.println("4. Salir");
        
        Scanner sc = new Scanner(System.in);
        
        return sc.nextInt();
    }
    
    public void ingresarEstudiante() {
        Scanner sc = new Scanner(System.in);
        Estudiante oEstudiante = new Estudiante();
        
        System.out.println("Ingrese el nombre");
        oEstudiante.setNombre(sc.nextLine());
        System.out.println("Ingrese el id");
        oEstudiante.setID(sc.nextInt());
        System.out.println("Ingrese el #carnet");
        oEstudiante.setCarnet(sc.nextInt());
        
        this.listaPersonas.add(oEstudiante);
    }
    
    public void ingresarProfesor() {
        Scanner sc = new Scanner(System.in);
        Profesor oProfesor = new Profesor();
        
        System.out.println("Ingrese el nombre");
        oProfesor.setNombre(sc.nextLine());
        System.out.println("Ingrese la materia");
        oProfesor.setMateria(sc.nextLine());
        System.out.println("Ingrese el ID");
        oProfesor.setID(sc.nextInt());
        
        this.listaPersonas.add(oProfesor);
    }
    
    public void mostrarPersonas() {
        Persona oP;
        for(int i=0; i<this.listaPersonas.size(); i++) {
            oP = (Persona)this.listaPersonas.get(i);
            System.out.println(oP);
        }
    }

    
}
