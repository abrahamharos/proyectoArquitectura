/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concepto;

/**
 *
 * @author abrahamharos
 */
public class CreadorConceptoIndividual {
    public Concepto crearConcepto(int cantidad, float importe, float valorUnitario){
        return new ConceptoIndividual(cantidad, importe, valorUnitario);
    }
}
