/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Comprobante.Concepto.ImpuestoTrasladado;

/**
 *
 * @author abrahamharos
 */
public interface CreadorImpuestoTrasladado {
    public ImpuestoTrasladado crearImpuestoTrasladado(float base, String tipoFactor, float tasaOCuota, float importe);
}
