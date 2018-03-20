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
@Table(name = "relacion_incisal")
@XmlRootElement
public class RelacionIncisal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    private int horizontal;
    @Basic(optional = false)
    @NotNull
    private int vertical;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "relacionIncisal")
    private List<AnalisisOclusion> analisisOclusionList;

    public RelacionIncisal() {
    }

    public RelacionIncisal(Integer id) {
        this.id = id;
    }

    public RelacionIncisal(Integer id, int horizontal, int vertical) {
        this.id = id;
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    @XmlTransient
    public List<AnalisisOclusion> getAnalisisOclusionList() {
        return analisisOclusionList;
    }

    public void setAnalisisOclusionList(List<AnalisisOclusion> analisisOclusionList) {
        this.analisisOclusionList = analisisOclusionList;
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
        if (!(object instanceof RelacionIncisal)) {
            return false;
        }
        RelacionIncisal other = (RelacionIncisal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.RelacionIncisal[ id=" + id + " ]";
    }
    
}
