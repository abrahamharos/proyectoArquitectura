/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import Empresa.*;

/**
 *
 * @author abrahamharos
 */
public class Main {
    public static void main(String[] args) {
        CreadorEmpresa creadorEmisor = new CreadorEmisor();
        Empresa emisor = creadorEmisor.crearEmpresa("HAMJ000829JV2", "AbrahamHaros", "RIF", null);
        
        CreadorEmpresa creadorReceptor = new CreadorReceptor();
        Empresa receptor = creadorReceptor.crearEmpresa("HAMJ000829JV2", "AbrahamHaros", "RIF", "G03");
        
        System.out.println(emisor.toString());
        System.out.println();
        System.out.println(receptor.toString());
        System.out.println();
        
        System.out.println("Main finished");
    }
}
