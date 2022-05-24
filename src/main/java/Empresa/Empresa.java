/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author abrahamharos
 */
public abstract class Empresa {
    protected String RFC;
    protected String nombre;
    protected String regimenFiscal;
    
    public Empresa(String RFC, String nombre, String regimenFiscal) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.regimenFiscal = regimenFiscal;
    }
}
