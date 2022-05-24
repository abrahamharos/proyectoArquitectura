/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author abrahamharos
 */
public class Receptor extends Empresa {
    private String usoCFDI;
    
    public Receptor(String RFC, String nombre, String regimenFiscal, String usoCFDI) {
        super(RFC, nombre, regimenFiscal);
        this.usoCFDI = usoCFDI;
    }
    
    @Override
    public String toString() {
        return 
                "RFC: " + this.RFC + 
                "\nNombre: " + this.nombre + 
                "\nRegimenFiscal: " + this.regimenFiscal + 
                "\nusoCFDI: " + this.usoCFDI;
    }
    
}
