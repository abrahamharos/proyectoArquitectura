/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Comprobante;

import Concepto.Conceptos;

/**
 *
 * @author abrahamharos
 */
public interface BuilderComprobante {
    public void addFormaDePago(String formaDePago);
    public void addSubtotal(float subtotal);
    public void addFecha(String fecha);
    public void addTotalImpuestosTrasladados(float totalImpuestosTrasladados);
    public void addConceptos(Conceptos conceptos);
}
