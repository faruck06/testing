/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "usuario_proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioProyecto.findAll", query = "SELECT u FROM UsuarioProyecto u"),
    @NamedQuery(name = "UsuarioProyecto.findByIdUsuarioProyecto", query = "SELECT u FROM UsuarioProyecto u WHERE u.idUsuarioProyecto = :idUsuarioProyecto"),
    @NamedQuery(name = "UsuarioProyecto.findByNombre", query = "SELECT u FROM UsuarioProyecto u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "UsuarioProyecto.findByTipo", query = "SELECT u FROM UsuarioProyecto u WHERE u.tipo = :tipo")})
public class UsuarioProyecto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_proyecto")
    private Long idUsuarioProyecto;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioProyecto", fetch = FetchType.LAZY)
    private Collection<ReporteDiario> reporteDiarioCollection;

    public UsuarioProyecto() {
    }

    public UsuarioProyecto(Long idUsuarioProyecto) {
        this.idUsuarioProyecto = idUsuarioProyecto;
    }

    public UsuarioProyecto(Long idUsuarioProyecto, String nombre, String tipo) {
        this.idUsuarioProyecto = idUsuarioProyecto;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Long getIdUsuarioProyecto() {
        return idUsuarioProyecto;
    }

    public void setIdUsuarioProyecto(Long idUsuarioProyecto) {
        this.idUsuarioProyecto = idUsuarioProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<ReporteDiario> getReporteDiarioCollection() {
        return reporteDiarioCollection;
    }

    public void setReporteDiarioCollection(Collection<ReporteDiario> reporteDiarioCollection) {
        this.reporteDiarioCollection = reporteDiarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioProyecto != null ? idUsuarioProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioProyecto)) {
            return false;
        }
        UsuarioProyecto other = (UsuarioProyecto) object;
        if ((this.idUsuarioProyecto == null && other.idUsuarioProyecto != null) || (this.idUsuarioProyecto != null && !this.idUsuarioProyecto.equals(other.idUsuarioProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testing.UsuarioProyecto[ idUsuarioProyecto=" + idUsuarioProyecto + " ]";
    }
    
}
