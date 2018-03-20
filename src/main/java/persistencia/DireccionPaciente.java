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
@Table(name = "direccion_paciente")
@XmlRootElement
public class DireccionPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String calle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String colonia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "domicilio")
    private List<Paciente> pacienteList;

    public DireccionPaciente() {
    }

    public DireccionPaciente(Integer id) {
        this.id = id;
    }

    public DireccionPaciente(Integer id, String pais, String estado, String ciudad, String calle, String colonia) {
        this.id = id;
        this.pais = pais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.calle = calle;
        this.colonia = colonia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
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
        if (!(object instanceof DireccionPaciente)) {
            return false;
        }
        DireccionPaciente other = (DireccionPaciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.DireccionPaciente[ id=" + id + " ]";
    }
    
}
