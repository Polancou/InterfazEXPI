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
@Table(name = "forma_residual")
@XmlRootElement
public class FormaResidual implements Serializable {

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
    private String mandibular;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formaResidual")
    private List<Atm> atmList;

    public FormaResidual() {
    }

    public FormaResidual(Integer id) {
        this.id = id;
    }

    public FormaResidual(Integer id, String maxilar, String mandibular) {
        this.id = id;
        this.maxilar = maxilar;
        this.mandibular = mandibular;
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

    public String getMandibular() {
        return mandibular;
    }

    public void setMandibular(String mandibular) {
        this.mandibular = mandibular;
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
        if (!(object instanceof FormaResidual)) {
            return false;
        }
        FormaResidual other = (FormaResidual) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.FormaResidual[ id=" + id + " ]";
    }
    
}
