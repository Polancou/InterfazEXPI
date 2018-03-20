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
@Table(name = "hallazgos_radiograficos")
@XmlRootElement
public class HallazgosRadiograficos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_rx")
    private int tipoRx;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "soporte_oseo")
    private String soporteOseo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "relacion_corona_raiz")
    private String relacionCoronaRaiz;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "altura_reborde")
    private String alturaReborde;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "engrosamiento_ligamento_periodontal")
    private String engrosamientoLigamentoPeriodontal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String interpretacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hallazgosRadiograficos")
    private List<SistemaEstomatognatico> sistemaEstomatognaticoList;

    public HallazgosRadiograficos() {
    }

    public HallazgosRadiograficos(Integer id) {
        this.id = id;
    }

    public HallazgosRadiograficos(Integer id, int tipoRx, String soporteOseo, String relacionCoronaRaiz, String alturaReborde, String engrosamientoLigamentoPeriodontal, String interpretacion) {
        this.id = id;
        this.tipoRx = tipoRx;
        this.soporteOseo = soporteOseo;
        this.relacionCoronaRaiz = relacionCoronaRaiz;
        this.alturaReborde = alturaReborde;
        this.engrosamientoLigamentoPeriodontal = engrosamientoLigamentoPeriodontal;
        this.interpretacion = interpretacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTipoRx() {
        return tipoRx;
    }

    public void setTipoRx(int tipoRx) {
        this.tipoRx = tipoRx;
    }

    public String getSoporteOseo() {
        return soporteOseo;
    }

    public void setSoporteOseo(String soporteOseo) {
        this.soporteOseo = soporteOseo;
    }

    public String getRelacionCoronaRaiz() {
        return relacionCoronaRaiz;
    }

    public void setRelacionCoronaRaiz(String relacionCoronaRaiz) {
        this.relacionCoronaRaiz = relacionCoronaRaiz;
    }

    public String getAlturaReborde() {
        return alturaReborde;
    }

    public void setAlturaReborde(String alturaReborde) {
        this.alturaReborde = alturaReborde;
    }

    public String getEngrosamientoLigamentoPeriodontal() {
        return engrosamientoLigamentoPeriodontal;
    }

    public void setEngrosamientoLigamentoPeriodontal(String engrosamientoLigamentoPeriodontal) {
        this.engrosamientoLigamentoPeriodontal = engrosamientoLigamentoPeriodontal;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
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
        if (!(object instanceof HallazgosRadiograficos)) {
            return false;
        }
        HallazgosRadiograficos other = (HallazgosRadiograficos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.HallazgosRadiograficos[ id=" + id + " ]";
    }
    
}
