/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medy.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import med.jj.Producto;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class FormProductoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Producto producto = new Producto();
        producto.setDescripcion("Paracetamol");
        System.out.println(producto.getDescripcion());
    }    
    
}
