package es.joseljg.formularioproducto;


import java.io.Serializable;
import java.util.Objects;

public class Envio implements Serializable {
    //------------------------------------------------
    private String idProducto;
    private String nombre;
    private String direccion;
    private String telefono;
    private String tipoEnvio;
    //-------------------------------------------------
    public Envio(String idProducto, String nombre, String direccion, String telefono, String tipoEnvio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoEnvio = tipoEnvio;
    }
    //------------------------------------------------
    public String getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTipoEnvio() {
        return tipoEnvio;
    }
    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }
    //----------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Envio)) return false;
        Envio envio = (Envio) o;
        return idProducto.equals(envio.idProducto) && direccion.equals(envio.direccion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idProducto, direccion);
    }
    //-----------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Envio{" +
                "idProducto='" + idProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", tipoEnvio='" + tipoEnvio + '\'' +
                '}';
    }
    //----------------------------------------------------------------------------------------
}
