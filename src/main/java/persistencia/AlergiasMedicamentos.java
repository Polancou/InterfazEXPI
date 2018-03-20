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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author polancou
 */
@MappedSuperclass
@Table(name = "alergias_medicamentos")
@XmlRootElement
public class AlergiasMedicamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    private int penicilina;
    @Basic(optional = false)
    @NotNull
    private int barbituricos;
    @Basic(optional = false)
    @NotNull
    private int aspirina;
    @Basic(optional = false)
    @NotNull
    private int sulfas;
    @Basic(optional = false)
    @NotNull
    private int cortisona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alergiasMedicamentos")
    private List<PreguntasPaciente> preguntasPacienteList;

    public AlergiasMedicamentos() {
    }

    public AlergiasMedicamentos(Integer id) {
        this.id = id;
    }

    public AlergiasMedicamentos(Integer id, int penicilina, int barbituricos, int aspirina, int sulfas, int cortisona) {
        this.id = id;
        this.penicilina = penicilina;
        this.barbituricos = barbituricos;
        this.aspirina = aspirina;
        this.sulfas = sulfas;
        this.cortisona = cortisona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPenicilina() {
        return penicilina;
    }

    public void setPenicilina(int penicilina) {
        this.penicilina = penicilina;
    }

    public int getBarbituricos() {
        return barbituricos;
    }

    public void setBarbituricos(int barbituricos) {
        this.barbituricos = barbituricos;
    }

    public int getAspirina() {
        return aspirina;
    }

    public void setAspirina(int aspirina) {
        this.aspirina = aspirina;
    }

    public int getSulfas() {
        return sulfas;
    }

    public void setSulfas(int sulfas) {
        this.sulfas = sulfas;
    }

    public int getCortisona() {
        return cortisona;
    }

    public void setCortisona(int cortisona) {
        this.cortisona = cortisona;
    }

    @XmlTransient
    public List<PreguntasPaciente> getPreguntasPacienteList() {
        return preguntasPacienteList;
    }

    public void setPreguntasPacienteList(List<PreguntasPaciente> preguntasPacienteList) {
        this.preguntasPacienteList = preguntasPacienteList;
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
        if (!(object instanceof AlergiasMedicamentos)) {
            return false;
        }
        AlergiasMedicamentos other = (AlergiasMedicamentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.AlergiasMedicamentos[ id=" + id + " ]";
    }
    
}
