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
@Table(name = "habitos_tension")
@XmlRootElement
public class HabitosTension implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String bruxismo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "seccion_labial")
    private String seccionLabial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "respirador_bucal")
    private String respiradorBucal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String unicofagia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "succion_lingual")
    private String succionLingual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String objetos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "habitosTension")
    private List<Atm> atmList;

    public HabitosTension() {
    }

    public HabitosTension(Integer id) {
        this.id = id;
    }

    public HabitosTension(Integer id, String bruxismo, String seccionLabial, String respiradorBucal, String unicofagia, String succionLingual, String objetos) {
        this.id = id;
        this.bruxismo = bruxismo;
        this.seccionLabial = seccionLabial;
        this.respiradorBucal = respiradorBucal;
        this.unicofagia = unicofagia;
        this.succionLingual = succionLingual;
        this.objetos = objetos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBruxismo() {
        return bruxismo;
    }

    public void setBruxismo(String bruxismo) {
        this.bruxismo = bruxismo;
    }

    public String getSeccionLabial() {
        return seccionLabial;
    }

    public void setSeccionLabial(String seccionLabial) {
        this.seccionLabial = seccionLabial;
    }

    public String getRespiradorBucal() {
        return respiradorBucal;
    }

    public void setRespiradorBucal(String respiradorBucal) {
        this.respiradorBucal = respiradorBucal;
    }

    public String getUnicofagia() {
        return unicofagia;
    }

    public void setUnicofagia(String unicofagia) {
        this.unicofagia = unicofagia;
    }

    public String getSuccionLingual() {
        return succionLingual;
    }

    public void setSuccionLingual(String succionLingual) {
        this.succionLingual = succionLingual;
    }

    public String getObjetos() {
        return objetos;
    }

    public void setObjetos(String objetos) {
        this.objetos = objetos;
    }

    @XmlTransient
    public List<Atm> getAtmList() {
        return atmList;
    }

    public void setAtmList(List<Atm> atmList) {
        this.atmList = atmList;
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
        if (!(object instanceof HabitosTension)) {
            return false;
        }
        HabitosTension other = (HabitosTension) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.HabitosTension[ id=" + id + " ]";
    }
    
}
