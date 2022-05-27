/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Comprobante.Empresa;

/**
 *
 * @author abrahamharos
 */
public interface CreadorEmpresa {
    // usoCFDI debe ser null cuando se registra un emisor
    public Empresa crearEmpresa(String RFC, String nombre, String regimenFiscal, String usoCFDI);
}
