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
@Table(name = "sistema_estomatognatico")
@XmlRootElement
public class SistemaEstomatognatico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sistemaEstomatognatico")
    private List<ExamenOrofacial> examenOrofacialList;
    @JoinColumn(name = "atm", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Atm atm;
    @JoinColumn(name = "examen_oral", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ExamenOral examenOral;
    @JoinColumn(name = "analisis_oclusion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AnalisisOclusion analisisOclusion;
    @JoinColumn(name = "hallazgos_radiograficos", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private HallazgosRadiograficos hallazgosRadiograficos;

    public SistemaEstomatognatico() {
    }

    public SistemaEstomatognatico(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public List<ExamenOrofacial> getExamenOrofacialList() {
        return examenOrofacialList;
    }

    public void setExamenOrofacialList(List<ExamenOrofacial> examenOrofacialList) {
        this.examenOrofacialList = examenOrofacialList;
    }

    public Atm getAtm() {
        return atm;
    }

    public void setAtm(Atm atm) {
        this.atm = atm;
    }

    public ExamenOral getExamenOral() {
        return examenOral;
    }

    public void setExamenOral(ExamenOral examenOral) {
        this.examenOral = examenOral;
    }

    public AnalisisOclusion getAnalisisOclusion() {
        return analisisOclusion;
    }

    public void setAnalisisOclusion(AnalisisOclusion analisisOclusion) {
        this.analisisOclusion = analisisOclusion;
    }

    public HallazgosRadiograficos getHallazgosRadiograficos() {
        return hallazgosRadiograficos;
    }

    public void setHallazgosRadiograficos(HallazgosRadiograficos hallazgosRadiograficos) {
        this.hallazgosRadiograficos = hallazgosRadiograficos;
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
        if (!(object instanceof SistemaEstomatognatico)) {
            return false;
        }
        SistemaEstomatognatico other = (SistemaEstomatognatico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.SistemaEstomatognatico[ id=" + id + " ]";
    }
    
}
