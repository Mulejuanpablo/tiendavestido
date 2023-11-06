package com.chloe.chloeback.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alquiler implements Serializable { 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long cliente_id;
    private Long vestido_id;
    private Long evento_id;
    private String fechaentrega;
    private String fechadevolucion;
    private Long precio;
    private Long seña;
    private Long resto;
    @Override
    public String toString() {
        return "Alquiler [id=" + id + ", cliente_id=" + cliente_id + ", vestido_id=" + vestido_id + ", evento_id="
                + evento_id + ", fechaentrega=" + fechaentrega + ", fechadevolucion=" + fechadevolucion + ", precio="
                + precio + ", seña=" + seña + ", resto=" + resto + "]";
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCliente_id() {
        return cliente_id;
    }
    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }
    public Long getVestido_id() {
        return vestido_id;
    }
    public void setVestido_id(Long vestido_id) {
        this.vestido_id = vestido_id;
    }
    public Long getEvento_id() {
        return evento_id;
    }
    public void setEvento_id(Long evento_id) {
        this.evento_id = evento_id;
    }
    public String getFechaentrega() {
        return fechaentrega;
    }
    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }
    public String getFechadevolucion() {
        return fechadevolucion;
    }
    public void setFechadevolucion(String fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
    public Long getPrecio() {
        return precio;
    }
    public void setPrecio(Long precio) {
        this.precio = precio;
    }
    public Long getSeña() {
        return seña;
    }
    public void setSeña(Long seña) {
        this.seña = seña;
    }
    public Long getResto() {
        return resto;
    }
    public void setResto(Long resto) {
        this.resto = resto;
    }
    public Alquiler(Long id, Long cliente_id, Long vestido_id, Long evento_id, String fechaentrega,
            String fechadevolucion, Long precio, Long seña, Long resto) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.vestido_id = vestido_id;
        this.evento_id = evento_id;
        this.fechaentrega = fechaentrega;
        this.fechadevolucion = fechadevolucion;
        this.precio = precio;
        this.seña = seña;
        this.resto = resto;
    }
}
