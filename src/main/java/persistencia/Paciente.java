/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String folio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    private int edad;
    @Basic(optional = false)
    @NotNull
    private int sexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nacim")
    @Temporal(TemporalType.DATE)
    private Date fechaNacim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    private String telefono;
    @Basic(optional = false)
    @NotNull
    private int estatura;
    @Basic(optional = false)
    @NotNull
    private int peso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nivel_estudios")
    private String nivelEstudios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_salud")
    private int estadoSalud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "porque_solicita")
    private String porqueSolicita;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String observaciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    private List<PreguntasPaciente> preguntasPacienteList;
    @JoinColumn(name = "domicilio", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DireccionPaciente domicilio;
    @JoinColumn(name = "medico", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MedicoPaciente medico;
    @JoinColumn(name = "ocupacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TrabajoPaciente ocupacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    private List<ExamenOrofacial> examenOrofacialList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
    private List<Odontograma> odontogramaList;

    public Paciente() {
    }

    public Paciente(Integer id) {
        this.id = id;
    }

    public Paciente(Integer id, String folio, String nombre, int edad, int sexo, Date fechaNacim, String telefono, int estatura, int peso, String estadoCivil, String nivelEstudios, int estadoSalud, String porqueSolicita, String observaciones) {
        this.id = id;
        this.folio = folio;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacim = fechaNacim;
        this.telefono = telefono;
        this.estatura = estatura;
        this.peso = peso;
        this.estadoCivil = estadoCivil;
        this.nivelEstudios = nivelEstudios;
        this.estadoSalud = estadoSalud;
        this.porqueSolicita = porqueSolicita;
        this.observaciones = observaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(Date fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public int getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(int estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getPorqueSolicita() {
        return porqueSolicita;
    }

    public void setPorqueSolicita(String porqueSolicita) {
        this.porqueSolicita = porqueSolicita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public List<PreguntasPaciente> getPreguntasPacienteList() {
        return preguntasPacienteList;
    }

    public void setPreguntasPacienteList(List<PreguntasPaciente> preguntasPacienteList) {
        this.preguntasPacienteList = preguntasPacienteList;
    }

    public DireccionPaciente getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DireccionPaciente domicilio) {
        this.domicilio = domicilio;
    }

    public MedicoPaciente getMedico() {
        return medico;
    }

    public void setMedico(MedicoPaciente medico) {
        this.medico = medico;
    }

    public TrabajoPaciente getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(TrabajoPaciente ocupacion) {
        this.ocupacion = ocupacion;
    }

    @XmlTransient
    public List<ExamenOrofacial> getExamenOrofacialList() {
        return examenOrofacialList;
    }

    public void setExamenOrofacialList(List<ExamenOrofacial> examenOrofacialList) {
        this.examenOrofacialList = examenOrofacialList;
    }

    @XmlTransient
    public List<Odontograma> getOdontogramaList() {
        return odontogramaList;
    }

    public void setOdontogramaList(List<Odontograma> odontogramaList) {
        this.odontogramaList = odontogramaList;
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Paciente[ id=" + id + " ]";
    }
    
}
