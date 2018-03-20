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
@Table(name = "pruebas_frio")
@XmlRootElement
public class PruebasFrio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String organo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String normal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String fugaz;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String ninguno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String persistente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String incremento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String irradiado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String drecremento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "frio")
    private List<PruebasTermicas> pruebasTermicasList;

    public PruebasFrio() {
    }

    public PruebasFrio(Integer id) {
        this.id = id;
    }

    public PruebasFrio(Integer id, String organo, String normal, String fugaz, String ninguno, String persistente, String incremento, String irradiado, String drecremento) {
        this.id = id;
        this.organo = organo;
        this.normal = normal;
        this.fugaz = fugaz;
        this.ninguno = ninguno;
        this.persistente = persistente;
        this.incremento = incremento;
        this.irradiado = irradiado;
        this.drecremento = drecremento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgano() {
        return organo;
    }

    public void setOrgano(String organo) {
        this.organo = organo;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getFugaz() {
        return fugaz;
    }

    public void setFugaz(String fugaz) {
        this.fugaz = fugaz;
    }

    public String getNinguno() {
        return ninguno;
    }

    public void setNinguno(String ninguno) {
        this.ninguno = ninguno;
    }

    public String getPersistente() {
        return persistente;
    }

    public void setPersistente(String persistente) {
        this.persistente = persistente;
    }

    public String getIncremento() {
        return incremento;
    }

    public void setIncremento(String incremento) {
        this.incremento = incremento;
    }

    public String getIrradiado() {
        return irradiado;
    }

    public void setIrradiado(String irradiado) {
        this.irradiado = irradiado;
    }

    public String getDrecremento() {
        return drecremento;
    }

    public void setDrecremento(String drecremento) {
        this.drecremento = drecremento;
    }

    @XmlTransient
    public List<PruebasTermicas> getPruebasTermicasList() {
        return pruebasTermicasList;
    }

    public void setPruebasTermicasList(List<PruebasTermicas> pruebasTermicasList) {
        this.pruebasTermicasList = pruebasTermicasList;
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
        if (!(object instanceof PruebasFrio)) {
            return false;
        }
        PruebasFrio other = (PruebasFrio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.PruebasFrio[ id=" + id + " ]";
    }
    
}
