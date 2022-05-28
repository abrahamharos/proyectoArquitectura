/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import Comprobante.Comprobante;
import Comprobante.ComprobanteParser;
import Comprobante.Empresa.CreadorEmisor;
import Comprobante.Empresa.CreadorReceptor;
import Comprobante.Empresa.Empresa;
import Comprobante.Empresa.CreadorEmpresa;
import Comprobante.Concepto.Conceptos;
import Comprobante.Concepto.Concepto;
import Comprobante.Concepto.ConceptoIndividual;
import Comprobante.Concepto.CreadorConceptoIndividual;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorImpuestoTrasladado;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorIEPS;
import Comprobante.Concepto.ImpuestoTrasladado.ImpuestoTrasladado;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorIVA;
import UI.RifCalculatorUI;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author abrahamharos
 */
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> facturasTest = new ArrayList<String>();
//        File folder = new File("/Users/abrahamharos/Documents/proyectoArquitectura/testFacturas/Emitidas/");
//        File[] listOfFiles = folder.listFiles();
//
//        for (int i = 0; i < listOfFiles.length; i++) {
//          if (listOfFiles[i].isFile()) {
//            facturasTest.add("/Users/abrahamharos/Documents/proyectoArquitectura/testFacturas/Emitidas/" + listOfFiles[i].getName());
//          }
//        }
//       
//        ArrayList<Comprobante> comprobantesResult = new ArrayList<Comprobante>();
//        
//        ComprobanteParser comprobanteParser = new ComprobanteParser();
//        comprobanteParser.parseComprobante(facturasTest);

        
        RifCalculatorUI UI = new RifCalculatorUI();
        UI.run();
    }
}
