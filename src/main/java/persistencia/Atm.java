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
public class Atm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    private int crepitacion;
    @Basic(optional = false)
    @NotNull
    private int sensibilidad;
    @Basic(optional = false)
    @NotNull
    private int dolor;
    @Basic(optional = false)
    @NotNull
    private int subluxacion;
    @Basic(optional = false)
    @NotNull
    private int desviacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "tamano_lengua")
    private String tamanoLengua;
    @JoinColumn(name = "forma_residual", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private FormaResidual formaResidual;
    @JoinColumn(name = "torus", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Torus torus;
    @JoinColumn(name = "habitos_tension", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private HabitosTension habitosTension;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atm")
    private List<SistemaEstomatognatico> sistemaEstomatognaticoList;

    public Atm() {
    }

    public Atm(Integer id) {
        this.id = id;
    }

    public Atm(Integer id, int crepitacion, int sensibilidad, int dolor, int subluxacion, int desviacion, String tamanoLengua) {
        this.id = id;
        this.crepitacion = crepitacion;
        this.sensibilidad = sensibilidad;
        this.dolor = dolor;
        this.subluxacion = subluxacion;
        this.desviacion = desviacion;
        this.tamanoLengua = tamanoLengua;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCrepitacion() {
        return crepitacion;
    }

    public void setCrepitacion(int crepitacion) {
        this.crepitacion = crepitacion;
    }

    public int getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(int sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public int getDolor() {
        return dolor;
    }

    public void setDolor(int dolor) {
        this.dolor = dolor;
    }

    public int getSubluxacion() {
        return subluxacion;
    }

    public void setSubluxacion(int subluxacion) {
        this.subluxacion = subluxacion;
    }

    public int getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(int desviacion) {
        this.desviacion = desviacion;
    }

    public String getTamanoLengua() {
        return tamanoLengua;
    }

    public void setTamanoLengua(String tamanoLengua) {
        this.tamanoLengua = tamanoLengua;
    }

    public FormaResidual getFormaResidual() {
        return formaResidual;
    }

    public void setFormaResidual(FormaResidual formaResidual) {
        this.formaResidual = formaResidual;
    }

    public Torus getTorus() {
        return torus;
    }

    public void setTorus(Torus torus) {
        this.torus = torus;
    }

    public HabitosTension getHabitosTension() {
        return habitosTension;
    }

    public void setHabitosTension(HabitosTension habitosTension) {
        this.habitosTension = habitosTension;
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
        if (!(object instanceof Atm)) {
            return false;
        }
        Atm other = (Atm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Atm[ id=" + id + " ]";
    }
    
}
