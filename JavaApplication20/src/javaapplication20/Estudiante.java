/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    private int carnet;

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        int id = super.getID();
        String nom = super.getNombre();
        return "Estudiante{" + "carnet=" + carnet + " nombre=" + nom + " id=" + id + "}";
    }
}
