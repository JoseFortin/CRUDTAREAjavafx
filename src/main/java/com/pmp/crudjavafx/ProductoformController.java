/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.pmp.crudjavafx;

import com.pmp.dao.Producto;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author ME
 */
public class ProductoformController implements Initializable {

    @FXML
    private TextField txtlibro;
    @FXML
    private TextField txtDescripcion;
    @FXML
    private TextField txtCategoria;
    @FXML
    private TextField txtautor;
    @FXML
    private TextField txtPrecio;
    @FXML
    private TextField txtCantidad;
    @FXML
    private RadioButton rdbEstadoActivo;
    @FXML
    private ToggleGroup estado;
    @FXML
    private RadioButton rdbEstadoInactivo;
    @FXML
    private Button btnConfirmar;
    @FXML
    private Button btnCancelar;
    
    private boolean confirmarAccion = false;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnConfirmar_click(ActionEvent event) {
        this.confirmarAccion = true;
        App.closeModal(event);
    }

    @FXML
    private void btnCancelar_click(ActionEvent event) {
        this.confirmarAccion = false;
        App.closeModal(event);
    }
    
    private Producto _libro;
    
    public void setProductoObject(Producto libro) {
        _libro = libro;
        refreshUX();
    }
    
    private void refreshUX() {
        txtlibro.setText(_libro.getlibro());
        txtDescripcion.setText(_libro.getDescripcion());
        txtCategoria.setText(_libro.getCategoria());
        txtautor.setText(_libro.getautor());
        txtPrecio.setText(Double.toString(_libro.getPrecio()));
        txtCantidad.setText(Double.toString(_libro.getCantidad()));
        
        boolean estadoEsA = _libro.getEstado().equals("A");
        
        rdbEstadoActivo.setSelected(estadoEsA);
        rdbEstadoInactivo.setSelected(!estadoEsA);
    }
    
    public void setMode(String mode) {
        switch (mode) {
            case "INSERTAR":
            case "ACTUALIZAR":                
                break;
            case "ELIMINAR", "MOSTRAR":
                txtlibro.setEditable(false);
                txtDescripcion.setEditable(false);
                txtCategoria.setEditable(false);
                txtautor.setEditable(false);
                txtPrecio.setEditable(false);
                txtCantidad.setEditable(false);
                
                rdbEstadoActivo.setDisable(true);
                rdbEstadoInactivo.setDisable(true);
                
                if (mode == "MOSTRAR")
                    btnConfirmar.setVisible(false);
                break;
        }
    }
    
    public Producto getProductoObject() {
        refreshObjFromUx();
        return _libro;
    }
    
    public void refreshObjFromUx() {
        _libro.setlibro(txtlibro.getText());
        _libro.setDescripcion(txtDescripcion.getText());
        _libro.setCategoria(txtCategoria.getText());
        _libro.setautor(txtautor.getText());
        _libro.setPrecio(Double.parseDouble(txtPrecio.getText()));
        _libro.setCantidad(Double.parseDouble(txtCantidad.getText()));
        
        _libro.setEstado(rdbEstadoActivo.isSelected()?"A":"I");
    }
    
    public boolean esConfirmarAccion() {
        return confirmarAccion;
    }   
}
