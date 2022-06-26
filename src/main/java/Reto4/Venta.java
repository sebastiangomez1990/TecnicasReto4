package Reto4;

/**
 *
 * @author Usuario
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Venta{
    private int idPanel;
    private Instant fechaHoraVenta;
    private String tipoDocumentoComprador;
    private int nroDocumentoComprador;
    private String nombreComprador;
    private double valorPagar;
    private String descripcionUso;
    private LocalDateTime fechaHoraHoy;
    private long diasVenta;

    
    public Venta() {
    }

    public void setIdPanel(int idPanel) {
        this.idPanel = idPanel;
    }

    public void setTipoDocumentoComprador(String tipoDocumentoComprador) {
        this.tipoDocumentoComprador = tipoDocumentoComprador;
    }

    public void setNroDocumentoComprador(int nroDocumentoComprador) {
        this.nroDocumentoComprador = nroDocumentoComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public void setDescripcionUso(String descripcionUso) {
        this.descripcionUso = descripcionUso;
    }

    public void diasVenta(){
        long diasVent = ChronoUnit.DAYS.between(fechaHoraVenta, fechaHoraHoy);
        diasVenta = diasVent;
        System.out.println(fechaHoraVenta);
        System.out.println(fechaHoraHoy);
        System.out.println(diasVenta);
        
    }  

    public Instant getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }

    public LocalDateTime getFechaHoraHoy() {
        return fechaHoraHoy;
    }

    public long getDiasVenta() {
        return diasVenta;
    }
    
    
    
}
