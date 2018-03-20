/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author polancou
 */
@MappedSuperclass
@Table(name = "examen_orofacial")
@XmlRootElement
public class ExamenOrofacial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "cara", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cara cara;
    @JoinColumn(name = "sistema_estomatognatico", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SistemaEstomatognatico sistemaEstomatognatico;
    @JoinColumn(name = "paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Paciente paciente;

    public ExamenOrofacial() {
    }

    public ExamenOrofacial(Integer id) {
        this.id = id;
    }

    public ExamenOrofacial(Integer id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cara getCara() {
        return cara;
    }

    public void setCara(Cara cara) {
        this.cara = cara;
    }

    public SistemaEstomatognatico getSistemaEstomatognatico() {
        return sistemaEstomatognatico;
    }

    public void setSistemaEstomatognatico(SistemaEstomatognatico sistemaEstomatognatico) {
        this.sistemaEstomatognatico = sistemaEstomatognatico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
        if (!(object instanceof ExamenOrofacial)) {
            return false;
        }
        ExamenOrofacial other = (ExamenOrofacial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.ExamenOrofacial[ id=" + id + " ]";
    }
    
}
