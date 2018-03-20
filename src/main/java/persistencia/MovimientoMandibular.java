/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author polancou
 */
@MappedSuperclass
@Table(name = "movimiento_mandibular")
@XmlRootElement
public class MovimientoMandibular implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String protusivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String derecho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String izquierdo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movimientoMandibular")
    private List<AnalisisOclusion> analisisOclusionList;

    public MovimientoMandibular() {
    }

    public MovimientoMandibular(Integer id) {
        this.id = id;
    }

    public MovimientoMandibular(Integer id, String protusivo, String derecho, String izquierdo) {
        this.id = id;
        this.protusivo = protusivo;
        this.derecho = derecho;
        this.izquierdo = izquierdo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProtusivo() {
        return protusivo;
    }

    public void setProtusivo(String protusivo) {
        this.protusivo = protusivo;
    }

    public String getDerecho() {
        return derecho;
    }

    public void setDerecho(String derecho) {
        this.derecho = derecho;
    }

    public String getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(String izquierdo) {
        this.izquierdo = izquierdo;
    }

    @XmlTransient
    public List<AnalisisOclusion> getAnalisisOclusionList() {
        return analisisOclusionList;
    }

    public void setAnalisisOclusionList(List<AnalisisOclusion> analisisOclusionList) {
        this.analisisOclusionList = analisisOclusionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientoMandibular)) {
            return false;
        }
        MovimientoMandibular other = (MovimientoMandibular) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.MovimientoMandibular[ id=" + id + " ]";
    }
    
}
