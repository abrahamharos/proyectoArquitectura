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
}
