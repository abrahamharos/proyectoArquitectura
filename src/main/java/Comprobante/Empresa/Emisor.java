/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante.Empresa;

/**
 *
 * @author abrahamharos
 */
public class Emisor extends Empresa {
    public Emisor(String RFC, String nombre, String regimenFiscal) {
        super(RFC, nombre, regimenFiscal);
    }
    
    @Override
    public String toString() {
        return 
                "RFC: " + this.RFC + 
                "\nNombre: " + this.nombre + 
                "\nRegimenFiscal: " + this.regimenFiscal;
    }
}
