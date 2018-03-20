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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "examen_oral")
@XmlRootElement
public class ExamenOral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "lesion_pulpar")
    private String lesionPulpar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "exposicion_pulpar")
    private String exposicionPulpar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String inflamacion;
    @JoinColumn(name = "pruebas_sens_termica", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PruebasTermicas pruebasSensTermica;
    @JoinColumn(name = "dolor", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Dolor dolor;
    @JoinColumn(name = "pruebas_sens_periodontal", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PruebaPercusion pruebasSensPeriodontal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examenOral")
    private List<SistemaEstomatognatico> sistemaEstomatognaticoList;

    public ExamenOral() {
    }

    public ExamenOral(Integer id) {
        this.id = id;
    }

    public ExamenOral(Integer id, String lesionPulpar, String exposicionPulpar, String inflamacion) {
        this.id = id;
        this.lesionPulpar = lesionPulpar;
        this.exposicionPulpar = exposicionPulpar;
        this.inflamacion = inflamacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLesionPulpar() {
        return lesionPulpar;
    }

    public void setLesionPulpar(String lesionPulpar) {
        this.lesionPulpar = lesionPulpar;
    }

    public String getExposicionPulpar() {
        return exposicionPulpar;
    }

    public void setExposicionPulpar(String exposicionPulpar) {
        this.exposicionPulpar = exposicionPulpar;
    }

    public String getInflamacion() {
        return inflamacion;
    }

    public void setInflamacion(String inflamacion) {
        this.inflamacion = inflamacion;
    }

    public PruebasTermicas getPruebasSensTermica() {
        return pruebasSensTermica;
    }

    public void setPruebasSensTermica(PruebasTermicas pruebasSensTermica) {
        this.pruebasSensTermica = pruebasSensTermica;
    }

    public Dolor getDolor() {
        return dolor;
    }

    public void setDolor(Dolor dolor) {
        this.dolor = dolor;
    }

    public PruebaPercusion getPruebasSensPeriodontal() {
        return pruebasSensPeriodontal;
    }

    public void setPruebasSensPeriodontal(PruebaPercusion pruebasSensPeriodontal) {
        this.pruebasSensPeriodontal = pruebasSensPeriodontal;
    }

    @XmlTransient
    public List<SistemaEstomatognatico> getSistemaEstomatognaticoList() {
        return sistemaEstomatognaticoList;
    }

    public void setSistemaEstomatognaticoList(List<SistemaEstomatognatico> sistemaEstomatognaticoList) {
        this.sistemaEstomatognaticoList = sistemaEstomatognaticoList;
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
        if (!(object instanceof ExamenOral)) {
            return false;
        }
        ExamenOral other = (ExamenOral) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.ExamenOral[ id=" + id + " ]";
    }
    
}
