/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pmp.crudjavafx;
import com.pmp.dao.Producto;
import java.util.HashSet;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author ME
 */
public class ProductoAdapter {

    public String getlibro() {
        return libro.get();
    }

    public void setNombreProducto(String nombreProducto) {
        this.libro.set(nombreProducto);
    }


    public String getDescripcion() {
        return descripcion.get();
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }


    public String getCategoria() {
        return categoria.get();
    }

    public void setCategoria(String categoria) {
        this.categoria.set(categoria);
    }


    public String getautor() {
        return autor.get();
    }

    public void setMarca(String autor) {
        this.autor.set(autor);
    }


    public Double getPrecio() {
        return precio.get();
    }

    public void setPrecio(Double precio) {
        this.precio.set(precio);
    }


    public Double getCantidad() {
        return cantidad.get();
    }

    public void setCantidad(Double cantidad) {
        this.cantidad.set(cantidad);
    }


    public String getEstado() {
        return estado.get();
    }

    public void setEstado(String estado) {
        this.estado.set(estado);
    }


    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }
    
    private Producto _libro;
    
    public Producto getproducto() {
        _libro.setlibro(libro.get());
        _libro.setDescripcion(descripcion.get());
        _libro.setCategoria(categoria.get());
        _libro.setautor(autor.get());
        _libro.setPrecio(precio.get());
        _libro.setCantidad(cantidad.get());
        _libro.setEstado(estado.get());
        _libro.setId(id.get());
        
        return this._libro;
    }
    
    public ProductoAdapter() {
        this._libro = new Producto();
        libro = new SimpleStringProperty("");
        descripcion = new SimpleStringProperty("");
        categoria = new SimpleStringProperty("");
        autor = new SimpleStringProperty("");
        precio = new SimpleDoubleProperty(0);
        cantidad = new SimpleDoubleProperty(0);
        estado = new SimpleStringProperty("");
    }
    
    public ProductoAdapter(Producto _libro) {
        this._libro = _libro;
        libro = new SimpleStringProperty("");
        descripcion = new SimpleStringProperty("");
        categoria = new SimpleStringProperty("");
        autor = new SimpleStringProperty("");
        precio = new SimpleDoubleProperty(0);
        cantidad = new SimpleDoubleProperty(0);
        estado = new SimpleStringProperty("");
        id = new SimpleIntegerProperty(0);
        
        libro.set(_libro.getlibro());
        descripcion.set(_libro.getDescripcion());
        categoria.set(_libro.getCategoria());
        autor.set(_libro.getautor());
        precio.set(_libro.getPrecio());
        cantidad.set(_libro.getCantidad());
        estado.set(_libro.getEstado());
        id.set(_libro.getId());
    }
    
    private SimpleStringProperty libro;
    private SimpleStringProperty descripcion;
    private SimpleStringProperty categoria;
    private SimpleStringProperty autor;
    private SimpleDoubleProperty precio;
    private SimpleDoubleProperty cantidad;
    private SimpleStringProperty estado;
    private SimpleIntegerProperty id;
}
