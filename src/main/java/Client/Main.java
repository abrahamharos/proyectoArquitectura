/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import Empresa.*;
import ImpuestoTrasladado.*;

/**
 *
 * @author abrahamharos
 */
public class Main {
    public static void main(String[] args) {
        /*
            CREANDO EMPRESA: EMISOR Y RECEPTOR
        */
        CreadorEmpresa creadorEmisor = new CreadorEmisor();
        Empresa emisor = creadorEmisor.crearEmpresa("HAMJ000829JV2", "AbrahamHaros", "RIF", null);
        
        CreadorEmpresa creadorReceptor = new CreadorReceptor();
        Empresa receptor = creadorReceptor.crearEmpresa("HAMJ000829JV2", "AbrahamHaros", "RIF", "G03");
        
        System.out.println(emisor.toString());
        System.out.println();
        System.out.println(receptor.toString());
        System.out.println();
        /*
            CREANDO EMPRESA: EMISOR Y RECEPTOR
        */
        
        /* CREANDO IMPUESTO TRASLADADO: IVA Y EPS */
        CreadorImpuestoTrasladado creadorIVA = new CreadorIVA();
        ImpuestoTrasladado IVA = creadorIVA.crearImpuestoTrasladado(1, "1", 1, 1);
        
        CreadorImpuestoTrasladado creadorIEPS = new CreadorIEPS();
        ImpuestoTrasladado IEPS = creadorIEPS.crearImpuestoTrasladado(2, "2", 2, 2);
        
        System.out.println(IVA.toString());
        System.out.println();
        System.out.println(IEPS.toString());
        System.out.println();
        /* CREANDO IMPUESTO TRASLADADO: IVA Y EPS */
        
        System.out.println("Main finished");
    }
}
