/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante.Concepto.ImpuestoTrasladado;

/**
 *
 * @author abrahamharos
 */
public class CreadorIVA implements CreadorImpuestoTrasladado {

    @Override
    public ImpuestoTrasladado crearImpuestoTrasladado(float base, String tipoFactor, float tasaOCuota, float importe) {
        return new IVA(base, tipoFactor, tasaOCuota, importe);
    }   
}
