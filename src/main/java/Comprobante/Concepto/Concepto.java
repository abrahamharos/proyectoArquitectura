/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante.Concepto;
import Comprobante.Concepto.ImpuestoTrasladado.ImpuestoTrasladado;
import java.util.ArrayList;

/**
 *
 * @author abrahamharos
 */
public abstract class Concepto {
    protected int cantidad;
    protected float importe;
    protected float valorUnitario;
    protected ArrayList<ImpuestoTrasladado> listaImpuestos;
    
    public Concepto(int cantidad, float importe, float valorUnitario) {
        this.cantidad = cantidad;
        this.importe = importe;
        this.valorUnitario = valorUnitario;
        this.listaImpuestos = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return 
                "Cantidad: " + this.cantidad + 
                "\nImporte: " + this.importe + 
                "\nValorUnitario: " + this.valorUnitario;
    }
    
    public void addImpuestoTrasladado(ImpuestoTrasladado impuestoTrasladado) {
        this.listaImpuestos.add(impuestoTrasladado);
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public ArrayList<ImpuestoTrasladado> getListaImpuestos() {
        return listaImpuestos;
    }

    public void setListaImpuestos(ArrayList<ImpuestoTrasladado> listaImpuestos) {
        this.listaImpuestos = listaImpuestos;
    }
}
