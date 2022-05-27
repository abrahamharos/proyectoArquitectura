/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante.Empresa;

/**
 *
 * @author abrahamharos
 */
public class CreadorReceptor implements CreadorEmpresa {
    @Override
    public Empresa crearEmpresa(String RFC, String nombre, String regimenFiscal, String usoCFDI){
        return new Receptor(RFC, nombre, regimenFiscal, usoCFDI);
    }
}
