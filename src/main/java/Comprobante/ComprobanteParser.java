/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante;

import Comprobante.Concepto.ConceptoIndividual;
import Comprobante.Concepto.Conceptos;
import Comprobante.Concepto.CreadorConceptoIndividual;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorIEPS;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorIVA;
import Comprobante.Concepto.ImpuestoTrasladado.CreadorImpuestoTrasladado;
import Comprobante.Concepto.ImpuestoTrasladado.ImpuestoTrasladado;
import Comprobante.Empresa.CreadorEmisor;
import Comprobante.Empresa.CreadorEmpresa;
import Comprobante.Empresa.CreadorReceptor;
import Comprobante.Empresa.Emisor;
import Comprobante.Empresa.Receptor;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author abrahamharos
 */
public class ComprobanteParser {
    CreadorEmpresa creadorEmisor;
    CreadorEmpresa creadorReceptor;
    CreadorImpuestoTrasladado creadorIVA;
    CreadorImpuestoTrasladado creadorIEPS;
    CreadorConceptoIndividual creadorConceptoIndividual;
    
    public ComprobanteParser() {
        this.creadorEmisor = new CreadorEmisor();
        this.creadorReceptor = new CreadorReceptor();
        this.creadorIVA = new CreadorIVA();
        this.creadorIEPS = new CreadorIEPS();
        this.creadorConceptoIndividual = new CreadorConceptoIndividual();
    }
    
    private Document readXMLDocument(String filePath) throws SAXException, ParserConfigurationException, IOException {
        File comprobanteActual = new File(filePath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(comprobanteActual);
        doc.normalize();

        return doc;
    }
    
    private Comprobante crearComprobante(NamedNodeMap atributos) {
        Comprobante comprobante = new Comprobante();
        
        String formapago = atributos.getNamedItem("FormaPago").getNodeValue();
        String fecha = atributos.getNamedItem("Fecha").getNodeValue().substring(0,10);
        float subtotal = Float.parseFloat(atributos.getNamedItem("SubTotal").getNodeValue());
        
        comprobante.addFecha(fecha);
        comprobante.addFormaDePago(formapago);
        comprobante.addSubtotal(subtotal);
                
        return comprobante;
    }
    
    private Node getComprobanteFromXML(String comprobanteFilePath) {
        Document comprobanteActualXML = null;
        try {
            comprobanteActualXML = this.readXMLDocument(comprobanteFilePath);
        } catch (SAXException ex) {
            Logger.getLogger(ComprobanteParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ComprobanteParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ComprobanteParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return comprobanteActualXML.getElementsByTagName("cfdi:Comprobante").item(0);
    }
    
    private Emisor crearEmisor(NamedNodeMap atributosEmisor) {
        String rfc = atributosEmisor.getNamedItem("Rfc").getNodeValue();
        String nombre = atributosEmisor.getNamedItem("Nombre").getNodeValue();
        String regimenFiscal = atributosEmisor.getNamedItem("RegimenFiscal").getNodeValue();
        
        return (Emisor) this.creadorEmisor.crearEmpresa(rfc, nombre, regimenFiscal, null);
    }
    
    private Receptor crearReceptor(NamedNodeMap atributosReceptor) {
        String rfc = atributosReceptor.getNamedItem("Rfc").getNodeValue();
        String nombre = atributosReceptor.getNamedItem("Nombre").getNodeValue();
        String usoCFDI = atributosReceptor.getNamedItem("UsoCFDI").getNodeValue();
        
        return (Receptor) this.creadorReceptor.crearEmpresa(rfc, nombre, null, usoCFDI);
    }
    
    private HashMap<String,Node> getNodeMap(String comprobanteFilePath) {
        HashMap<String,Node> result = new HashMap<>();
        Node comprobanteNodes = this.getComprobanteFromXML(comprobanteFilePath);
        result.put(comprobanteNodes.getNodeName(), comprobanteNodes);
        
        for(int i = 0; i < comprobanteNodes.getChildNodes().getLength(); i++) {
            Node actualNode = comprobanteNodes.getChildNodes().item(i);
            if (actualNode.getNodeName() != "#text") {
                result.put(actualNode.getNodeName(), actualNode);
            }
        }

        return result;
    }
    
    private void agregarImpuestosTrasladados(NodeList impuestosTrasladadosNodes, ConceptoIndividual conceptoIndividual) {
        for (int i = 0; i < impuestosTrasladadosNodes.getLength(); i++) {
            Node impuestoNode = impuestosTrasladadosNodes.item(i);
            
            String tipoImpuesto = impuestoNode.getAttributes().getNamedItem("Impuesto").getNodeValue();
            float base = Float.parseFloat(impuestoNode.getAttributes().getNamedItem("Base").getNodeValue());
            String tipoFactor = impuestoNode.getAttributes().getNamedItem("TipoFactor").getNodeValue();
            float tasaOCuota = Float.parseFloat(impuestoNode.getAttributes().getNamedItem("TasaOCuota").getNodeValue());
            float importeImpuesto = Float.parseFloat(impuestoNode.getAttributes().getNamedItem("Importe").getNodeValue());
            
            ImpuestoTrasladado impuestoActual = null;
            // Impuesto 002 = IVA
            if(tipoImpuesto.equals("002")) {
                impuestoActual = this.creadorIVA.crearImpuestoTrasladado(base, tipoFactor, tasaOCuota, importeImpuesto);
                
            } else {
                impuestoActual = this.creadorIEPS.crearImpuestoTrasladado(base, tipoFactor, tasaOCuota, importeImpuesto);
            }
            conceptoIndividual.addImpuestoTrasladado(impuestoActual); 
        }
    }
    
    private ConceptoIndividual crearConceptoIndividual(Node concepto) {
        int cantidad = Integer.parseInt(concepto.getAttributes().getNamedItem("Cantidad").getNodeValue());
        float importe = Float.parseFloat(concepto.getAttributes().getNamedItem("Importe").getNodeValue());
        float valorUnitario = Float.parseFloat(concepto.getAttributes().getNamedItem("ValorUnitario").getNodeValue());
        ConceptoIndividual conceptoIndividual = (ConceptoIndividual) this.creadorConceptoIndividual.crearConcepto(cantidad, importe, valorUnitario);
        
        // Se agrega cada impuesto trasladado
        NodeList impuestosTrasladadosNodes = concepto.getChildNodes().item(0).getChildNodes().item(0).getChildNodes();
        this.agregarImpuestosTrasladados(impuestosTrasladadosNodes, conceptoIndividual);
        return conceptoIndividual;
    }
    
    private Conceptos getConceptos(NodeList conceptos) {
        Conceptos result = new Conceptos();
        for(int i = 0; i < conceptos.getLength(); i++) {
            result.addConcepto(crearConceptoIndividual(conceptos.item(i)));
        }
        
        return result;
    }
    
    public ArrayList<Comprobante> parseComprobante(ArrayList<String> comprobanteFilePaths) {
        ArrayList<Comprobante> result = new ArrayList<>();
        for (String comprobanteFilePath : comprobanteFilePaths) {
            HashMap<String, Node> comprobanteNodeMap = getNodeMap(comprobanteFilePath);
            
            // Inicializa comprobante con datos generales
            NamedNodeMap atributosComprobante = comprobanteNodeMap.get("cfdi:Comprobante").getAttributes();
            Comprobante comprobanteActual = this.crearComprobante(atributosComprobante);
            
            // Se crea emisor y se agrega a comprobante
            NamedNodeMap atributosEmisor = comprobanteNodeMap.get("cfdi:Emisor").getAttributes();
            Emisor emisorActual = this.crearEmisor(atributosEmisor);
            comprobanteActual.addEmisor(emisorActual);
            
            // Se crea receptor y se agrega a comprobante
            NamedNodeMap atributosReceptor = comprobanteNodeMap.get("cfdi:Receptor").getAttributes();
            Receptor receptorActual = this.crearReceptor(atributosReceptor);
            comprobanteActual.addReceptor(receptorActual);
            
            // Se agregan los conceptos al comprobante.
            NodeList conceptos = comprobanteNodeMap.get("cfdi:Conceptos").getChildNodes();
            Conceptos conceptosComprobantes = this.getConceptos(conceptos);
            comprobanteActual.addConceptos(conceptosComprobantes);
            
            System.out.println(comprobanteActual.getConceptos().calcularSubtotal());
            System.out.println(comprobanteActual.getConceptos().calcularTotal());
            
            result.add(comprobanteActual);
        }
        return result;
    }
    
}
