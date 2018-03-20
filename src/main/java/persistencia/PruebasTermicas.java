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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author polancou
 */
@MappedSuperclass
@Table(name = "pruebas_termicas")
@XmlRootElement
public class PruebasTermicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pruebasSensTermica")
    private List<ExamenOral> examenOralList;
    @JoinColumn(name = "frio", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PruebasFrio frio;
    @JoinColumn(name = "calor", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PruebasCalor calor;

    public PruebasTermicas() {
    }

    public PruebasTermicas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public List<ExamenOral> getExamenOralList() {
        return examenOralList;
    }

    public void setExamenOralList(List<ExamenOral> examenOralList) {
        this.examenOralList = examenOralList;
    }

    public PruebasFrio getFrio() {
        return frio;
    }

    public void setFrio(PruebasFrio frio) {
        this.frio = frio;
    }

    public PruebasCalor getCalor() {
        return calor;
    }

    public void setCalor(PruebasCalor calor) {
        this.calor = calor;
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
        if (!(object instanceof PruebasTermicas)) {
            return false;
        }
        PruebasTermicas other = (PruebasTermicas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.PruebasTermicas[ id=" + id + " ]";
    }
    
}
