/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author abrahamharos
 */
public class RifCalculatorUI {
    public RifCalculatorUI(){}
    
    public void run() {
        this.egresosView();
    }
    
    private void ingresosView() {
    
    }
    
    public void egresosView() {
        FacturasView egresosView = new FacturasView("Recibidas");
        egresosView.setVisible(true);
    }
    
    private void resumenView() {
        
    }
}
