/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import Comprobante.Empresa.CreadorEmisor;
import Comprobante.Empresa.CreadorReceptor;
import Comprobante.Empresa.Empresa;
import Comprobante.Empresa.CreadorEmpresa;
import Comprobante.Concepto.Conceptos;
import Comprobante.Concepto.Concepto;
import Comprobante.Concepto.CreadorConceptoIndividual;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorImpuestoTrasladado;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorIEPS;
import Comprobante.Concepto.ImpuestoTrasladado.ImpuestoTrasladado;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorIVA;

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
        
        /* CREANDO CONCEPTO INVIDUAL */
        CreadorConceptoIndividual creadorConceptoIndividual = new CreadorConceptoIndividual();
        Concepto conceptoIndividual = creadorConceptoIndividual.crearConcepto(1, 1, 1);
        
        System.out.println(conceptoIndividual.toString());
        System.out.println();
        /* CREANDO CONCEPTO INVIDUAL */
        
        Conceptos conceptos = new Conceptos();
        conceptos.addConcepto(conceptoIndividual);
        System.out.println(conceptos.toString());
        System.out.println();
        
        
        System.out.println("Main finished");
    }
}
