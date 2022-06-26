package Reto4;

/**
 *
 * @author Usuario
 */
import java.time.*;
import java.util.Date;
import java.time.temporal.ChronoUnit;

public class Seguro {
    private String nombreEmpresa;
    private String descripcion;
    private int idPanel;
    private Instant fechaInicio;
    private LocalDateTime fechaFin;
    private long diasCobertura;

    public Seguro() {
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdPanel(int idPanel) {
        this.idPanel = idPanel;
    }

    public void setFechaInicio(Instant fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }  
    
    public void diasVenta(){
        long diasCobertur = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        diasCobertura = diasCobertur;
    }  

    public Instant getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public long getDiasCobertura() {
        return diasCobertura;
    }
    
    
}

