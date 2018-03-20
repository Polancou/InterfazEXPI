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
@Table(name = "medico_paciente")
@XmlRootElement
public class MedicoPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombre_medico")
    private String nombreMedico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "telefono_medico")
    private String telefonoMedico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "direccion_medico")
    private String direccionMedico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medico")
    private List<Paciente> pacienteList;

    public MedicoPaciente() {
    }

    public MedicoPaciente(Integer id) {
        this.id = id;
    }

    public MedicoPaciente(Integer id, String nombreMedico, String telefonoMedico, String direccionMedico) {
        this.id = id;
        this.nombreMedico = nombreMedico;
        this.telefonoMedico = telefonoMedico;
        this.direccionMedico = direccionMedico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getTelefonoMedico() {
        return telefonoMedico;
    }

    public void setTelefonoMedico(String telefonoMedico) {
        this.telefonoMedico = telefonoMedico;
    }

    public String getDireccionMedico() {
        return direccionMedico;
    }

    public void setDireccionMedico(String direccionMedico) {
        this.direccionMedico = direccionMedico;
    }

    @XmlTransient
    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
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
        if (!(object instanceof MedicoPaciente)) {
            return false;
        }
        MedicoPaciente other = (MedicoPaciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.MedicoPaciente[ id=" + id + " ]";
    }
    
}
