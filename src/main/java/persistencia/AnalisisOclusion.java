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
@Table(name = "analisis_oclusion")
@XmlRootElement
public class AnalisisOclusion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String clasificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "proteccion_canina")
    private String proteccionCanina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "funcion_grupo")
    private String funcionGrupo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "proteccion_mutua")
    private String proteccionMutua;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "mordida_abierta")
    private String mordidaAbierta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String sobremordida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "contacto_dentatorio")
    private String contactoDentatorio;
    @JoinColumn(name = "movimiento_mandibular", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MovimientoMandibular movimientoMandibular;
    @JoinColumn(name = "relacion_incisal", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private RelacionIncisal relacionIncisal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "analisisOclusion")
    private List<SistemaEstomatognatico> sistemaEstomatognaticoList;

    public AnalisisOclusion() {
    }

    public AnalisisOclusion(Integer id) {
        this.id = id;
    }

    public AnalisisOclusion(Integer id, String clasificacion, String proteccionCanina, String funcionGrupo, String proteccionMutua, String mordidaAbierta, String sobremordida, String contactoDentatorio) {
        this.id = id;
        this.clasificacion = clasificacion;
        this.proteccionCanina = proteccionCanina;
        this.funcionGrupo = funcionGrupo;
        this.proteccionMutua = proteccionMutua;
        this.mordidaAbierta = mordidaAbierta;
        this.sobremordida = sobremordida;
        this.contactoDentatorio = contactoDentatorio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getProteccionCanina() {
        return proteccionCanina;
    }

    public void setProteccionCanina(String proteccionCanina) {
        this.proteccionCanina = proteccionCanina;
    }

    public String getFuncionGrupo() {
        return funcionGrupo;
    }

    public void setFuncionGrupo(String funcionGrupo) {
        this.funcionGrupo = funcionGrupo;
    }

    public String getProteccionMutua() {
        return proteccionMutua;
    }

    public void setProteccionMutua(String proteccionMutua) {
        this.proteccionMutua = proteccionMutua;
    }

    public String getMordidaAbierta() {
        return mordidaAbierta;
    }

    public void setMordidaAbierta(String mordidaAbierta) {
        this.mordidaAbierta = mordidaAbierta;
    }

    public String getSobremordida() {
        return sobremordida;
    }

    public void setSobremordida(String sobremordida) {
        this.sobremordida = sobremordida;
    }

    public String getContactoDentatorio() {
        return contactoDentatorio;
    }

    public void setContactoDentatorio(String contactoDentatorio) {
        this.contactoDentatorio = contactoDentatorio;
    }

    public MovimientoMandibular getMovimientoMandibular() {
        return movimientoMandibular;
    }

    public void setMovimientoMandibular(MovimientoMandibular movimientoMandibular) {
        this.movimientoMandibular = movimientoMandibular;
    }

    public RelacionIncisal getRelacionIncisal() {
        return relacionIncisal;
    }

    public void setRelacionIncisal(RelacionIncisal relacionIncisal) {
        this.relacionIncisal = relacionIncisal;
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
        if (!(object instanceof AnalisisOclusion)) {
            return false;
        }
        AnalisisOclusion other = (AnalisisOclusion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.AnalisisOclusion[ id=" + id + " ]";
    }
    
}
