/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import Comprobante.Comprobante;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abrahamharos
 */
public class ComprobantesTableRows {
    private ArrayList<Comprobante> comprobantes;
    private boolean isIngreso;
    private Resumen resumen;
    Map<String, String> formasDePago = Map.of(
            "01","Efectivo", 
            "03", "Transferencia electrónica de fondos"
    );
    
    
    public ComprobantesTableRows(ArrayList<Comprobante> comprobantes, boolean isIngreso) {
        this.comprobantes = comprobantes;
        this.isIngreso = isIngreso;
        this.resumen = new Resumen();
    }
    
    private String getNombreEmisorReceptor(Comprobante comprobanteActual) {
        if (this.isIngreso) {
            return comprobanteActual.getReceptor().getNombre();
        }
        return comprobanteActual.getEmisor().getNombre();
    }
    
    private String getFormaDePago(Comprobante comprobanteActual) {
        if(formasDePago.containsKey(comprobanteActual.getFormaDePago())) {
            return this.formasDePago.get(comprobanteActual.getFormaDePago());
        }
        return comprobanteActual.getFormaDePago();
    }
    
    public void setTableRows(DefaultTableModel model) {
        int counter = 1;
        float resumenSubtotal = 0;
        float resumenIva = 0;
        float resumenIeps = 0;
        float resumenTotal = 0;
        for(Comprobante comprobanteActual : this.comprobantes) {
            String nombre = this.getNombreEmisorReceptor(comprobanteActual);
            String formaPago = this.getFormaDePago(comprobanteActual);
            float subtotal = comprobanteActual.getConceptos().calcularSubtotal();
            float iva = comprobanteActual.getConceptos().calcularIVA();
            float ieps = comprobanteActual.getConceptos().calcularIEPS();
            float total = comprobanteActual.getConceptos().calcularTotal();
            Object rowData[] = {
                counter, 
                comprobanteActual.getFecha(), 
                nombre,
                comprobanteActual.getReceptor().getUsoCFDI(), 
                formaPago,
                Utils.toPesos(subtotal), 
                Utils.toPesos(iva),
                Utils.toPesos(ieps),
                Utils.toPesos(total)
            };
            
            model.addRow(rowData);
            counter++;
            
            // Sumar valores al resumen
            resumenSubtotal += subtotal;
            resumenIva += iva;
            resumenIeps += ieps;
            resumenTotal += total;
        }
        this.resumen = new Resumen(resumenSubtotal, resumenIva, resumenIeps, resumenTotal);
    }

    public Resumen getResumen() {
        return resumen;
    }
}
