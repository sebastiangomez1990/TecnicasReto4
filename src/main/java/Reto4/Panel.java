package Reto4;

/**
 *
 * @author Usuario
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Panel {
    private int id;
    private String idSerie;
    private String descripcion;
    private String tipo;
    private String modelo;
    private LocalDate anioFabricacion;
    private int precio;
    

    public Panel(int id, String idSerie, String descripcion, String tipo, String modelo, int precio) {
        this.id = id;
        this.idSerie = idSerie;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public Panel() {
        this.id = 254165870;
        this.idSerie = "PA20221";
        this.descripcion = "Panel";
        this.tipo = "policristalino";
        this.modelo = "max";
        this.precio = 1000000;
    }
    
    /* AYUDA!!!!
    public void estado(){
        int uso = fechaActual - anioFabricaicon;
        if (0=<anioFabricacion=<1){
        return "Es nuevo"
    }
    }
    */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getIdSerie() {
        return idSerie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdSerie(String idSerie) {
        this.idSerie = idSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
