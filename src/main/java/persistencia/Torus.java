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
public class Torus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String maxilar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String madibula;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "torus")
    private List<Atm> atmList;

    public Torus() {
    }

    public Torus(Integer id) {
        this.id = id;
    }

    public Torus(Integer id, String maxilar, String madibula) {
        this.id = id;
        this.maxilar = maxilar;
        this.madibula = madibula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaxilar() {
        return maxilar;
    }

    public void setMaxilar(String maxilar) {
        this.maxilar = maxilar;
    }

    public String getMadibula() {
        return madibula;
    }

    public void setMadibula(String madibula) {
        this.madibula = madibula;
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
        if (!(object instanceof Torus)) {
            return false;
        }
        Torus other = (Torus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Torus[ id=" + id + " ]";
    }
    
}
