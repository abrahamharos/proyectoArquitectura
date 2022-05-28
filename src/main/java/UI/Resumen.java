/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import Comprobante.Comprobante;
import java.util.ArrayList;

/**
 *
 * @author abrahamharos
 */
public class Resumen {
    private float subtotal;
    private float iva;
    private float ieps;
    private float total;

    
    public Resumen() {
        this.subtotal = 0;
        this.iva = 0;
        this.ieps = 0;
        this.total = 0;
    }
    
    public Resumen(float subtotal, float iva, float ieps, float total) {
        this.subtotal = subtotal;
        this.iva = iva;
        this.ieps = ieps;
        this.total = total;
    }

    public float getIeps() {
        return ieps;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public float getIva() {
        return iva;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Resumen{" + "subtotal=" + subtotal + ", iva=" + iva + ", ieps=" + ieps + ", total=" + total + '}';
    }
    
    public Object[] getRowForResumen(String tipo) {
        Object rowData[] = {
                tipo,
                Utils.toPesos(subtotal), 
                Utils.toPesos(iva),
                Utils.toPesos(ieps),
                Utils.toPesos(total)
            };
        return rowData;
    }
    
}