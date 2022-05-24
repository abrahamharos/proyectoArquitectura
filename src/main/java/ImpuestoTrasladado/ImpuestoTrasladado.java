/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImpuestoTrasladado;

/**
 *
 * @author abrahamharos
 */
public abstract class ImpuestoTrasladado {
    protected float base;
    protected String tipoFactor;
    protected float tasaOCuota;
    protected float importe;
    
    public ImpuestoTrasladado(float base, String tipoFactor, float tasaOCuota, float importe) {
        this.base = base;
        this.tipoFactor = tipoFactor;
        this.tasaOCuota = tasaOCuota;
        this.importe = importe;
    }
    
    @Override
    public String toString() {
        return 
                "Base: " + this.base + 
                "\nTipoFactor: " + this.tipoFactor + 
                "\nTasaOCuota: " + this.tasaOCuota +
                "\nImporte: " + this.importe;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public String getTipoFactor() {
        return tipoFactor;
    }

    public void setTipoFactor(String tipoFactor) {
        this.tipoFactor = tipoFactor;
    }

    public float getTasaOCuota() {
        return tasaOCuota;
    }

    public void setTasaOCuota(float tasaOCuota) {
        this.tasaOCuota = tasaOCuota;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }
}
