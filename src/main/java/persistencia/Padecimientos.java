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
public class Padecimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String hepatitis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "enfermedades_veneras")
    private String enfermedadesVeneras;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String embolia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String varicela;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String asma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String ictericia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "infarto_miocardio")
    private String infartoMiocardio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String epilepsia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "fiebre_reumatica")
    private String fiebreReumatica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "hipertension_arterial")
    private String hipertensionArterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String tuberculosis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "angina_pecho")
    private String anginaPecho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String diabetes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String sarampiom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String cancer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "padecimientos")
    private List<PreguntasPaciente> preguntasPacienteList;

    public Padecimientos() {
    }

    public Padecimientos(Integer id) {
        this.id = id;
    }

    public Padecimientos(Integer id, String hepatitis, String enfermedadesVeneras, String embolia, String varicela, String asma, String ictericia, String infartoMiocardio, String epilepsia, String fiebreReumatica, String hipertensionArterial, String tuberculosis, String anginaPecho, String diabetes, String sarampiom, String cancer) {
        this.id = id;
        this.hepatitis = hepatitis;
        this.enfermedadesVeneras = enfermedadesVeneras;
        this.embolia = embolia;
        this.varicela = varicela;
        this.asma = asma;
        this.ictericia = ictericia;
        this.infartoMiocardio = infartoMiocardio;
        this.epilepsia = epilepsia;
        this.fiebreReumatica = fiebreReumatica;
        this.hipertensionArterial = hipertensionArterial;
        this.tuberculosis = tuberculosis;
        this.anginaPecho = anginaPecho;
        this.diabetes = diabetes;
        this.sarampiom = sarampiom;
        this.cancer = cancer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHepatitis() {
        return hepatitis;
    }

    public void setHepatitis(String hepatitis) {
        this.hepatitis = hepatitis;
    }

    public String getEnfermedadesVeneras() {
        return enfermedadesVeneras;
    }

    public void setEnfermedadesVeneras(String enfermedadesVeneras) {
        this.enfermedadesVeneras = enfermedadesVeneras;
    }

    public String getEmbolia() {
        return embolia;
    }

    public void setEmbolia(String embolia) {
        this.embolia = embolia;
    }

    public String getVaricela() {
        return varicela;
    }

    public void setVaricela(String varicela) {
        this.varicela = varicela;
    }

    public String getAsma() {
        return asma;
    }

    public void setAsma(String asma) {
        this.asma = asma;
    }

    public String getIctericia() {
        return ictericia;
    }

    public void setIctericia(String ictericia) {
        this.ictericia = ictericia;
    }

    public String getInfartoMiocardio() {
        return infartoMiocardio;
    }

    public void setInfartoMiocardio(String infartoMiocardio) {
        this.infartoMiocardio = infartoMiocardio;
    }

    public String getEpilepsia() {
        return epilepsia;
    }

    public void setEpilepsia(String epilepsia) {
        this.epilepsia = epilepsia;
    }

    public String getFiebreReumatica() {
        return fiebreReumatica;
    }

    public void setFiebreReumatica(String fiebreReumatica) {
        this.fiebreReumatica = fiebreReumatica;
    }

    public String getHipertensionArterial() {
        return hipertensionArterial;
    }

    public void setHipertensionArterial(String hipertensionArterial) {
        this.hipertensionArterial = hipertensionArterial;
    }

    public String getTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(String tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public String getAnginaPecho() {
        return anginaPecho;
    }

    public void setAnginaPecho(String anginaPecho) {
        this.anginaPecho = anginaPecho;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getSarampiom() {
        return sarampiom;
    }

    public void setSarampiom(String sarampiom) {
        this.sarampiom = sarampiom;
    }

    public String getCancer() {
        return cancer;
    }

    public void setCancer(String cancer) {
        this.cancer = cancer;
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
        if (!(object instanceof Padecimientos)) {
            return false;
        }
        Padecimientos other = (Padecimientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Padecimientos[ id=" + id + " ]";
    }
    
}
