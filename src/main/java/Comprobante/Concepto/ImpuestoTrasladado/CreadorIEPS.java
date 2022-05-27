/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante.Concepto.ImpuestoTrasladado;

/**
 *
 * @author abrahamharos
 */
public class CreadorIEPS implements CreadorImpuestoTrasladado {

    @Override
    public IEPS crearImpuestoTrasladado(float base, String tipoFactor, float tasaOCuota, float importe) {
         return new IEPS(base, tipoFactor, tasaOCuota, importe);
    }
    
}
