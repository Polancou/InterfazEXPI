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
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author polancou
 */
@MappedSuperclass
@XmlRootElement
public class Cara implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String forma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String labios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "bordes_bermellon")
    private String bordesBermellon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cara")
    private List<ExamenOrofacial> examenOrofacialList;

    public Cara() {
    }

    public Cara(Integer id) {
        this.id = id;
    }

    public Cara(Integer id, String forma, String labios, String bordesBermellon) {
        this.id = id;
        this.forma = forma;
        this.labios = labios;
        this.bordesBermellon = bordesBermellon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getLabios() {
        return labios;
    }

    public void setLabios(String labios) {
        this.labios = labios;
    }

    public String getBordesBermellon() {
        return bordesBermellon;
    }

    public void setBordesBermellon(String bordesBermellon) {
        this.bordesBermellon = bordesBermellon;
    }

    @XmlTransient
    public List<ExamenOrofacial> getExamenOrofacialList() {
        return examenOrofacialList;
    }

    public void setExamenOrofacialList(List<ExamenOrofacial> examenOrofacialList) {
        this.examenOrofacialList = examenOrofacialList;
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
        if (!(object instanceof Cara)) {
            return false;
        }
        Cara other = (Cara) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Cara[ id=" + id + " ]";
    }
    
}
