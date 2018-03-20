/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author polancou
 */
@MappedSuperclass
@Table(name = "estado_diente")
@XmlRootElement
public class EstadoDiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "espacio_arriba")
    private int espacioArriba;
    @Basic(optional = false)
    @NotNull
    @Column(name = "espacio_derecho")
    private int espacioDerecho;
    @Basic(optional = false)
    @NotNull
    @Column(name = "espacio_abajo")
    private int espacioAbajo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "espacio_izquierdo")
    private int espacioIzquierdo;
    @JoinColumn(name = "id_odontograma", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Odontograma idOdontograma;
    @JoinColumn(name = "id_diente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Dientes idDiente;

    public EstadoDiente() {
    }

    public EstadoDiente(Integer id) {
        this.id = id;
    }

    public EstadoDiente(Integer id, int espacioArriba, int espacioDerecho, int espacioAbajo, int espacioIzquierdo) {
        this.id = id;
        this.espacioArriba = espacioArriba;
        this.espacioDerecho = espacioDerecho;
        this.espacioAbajo = espacioAbajo;
        this.espacioIzquierdo = espacioIzquierdo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEspacioArriba() {
        return espacioArriba;
    }

    public void setEspacioArriba(int espacioArriba) {
        this.espacioArriba = espacioArriba;
    }

    public int getEspacioDerecho() {
        return espacioDerecho;
    }

    public void setEspacioDerecho(int espacioDerecho) {
        this.espacioDerecho = espacioDerecho;
    }

    public int getEspacioAbajo() {
        return espacioAbajo;
    }

    public void setEspacioAbajo(int espacioAbajo) {
        this.espacioAbajo = espacioAbajo;
    }

    public int getEspacioIzquierdo() {
        return espacioIzquierdo;
    }

    public void setEspacioIzquierdo(int espacioIzquierdo) {
        this.espacioIzquierdo = espacioIzquierdo;
    }

    public Odontograma getIdOdontograma() {
        return idOdontograma;
    }

    public void setIdOdontograma(Odontograma idOdontograma) {
        this.idOdontograma = idOdontograma;
    }

    public Dientes getIdDiente() {
        return idDiente;
    }

    public void setIdDiente(Dientes idDiente) {
        this.idDiente = idDiente;
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
        if (!(object instanceof EstadoDiente)) {
            return false;
        }
        EstadoDiente other = (EstadoDiente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.EstadoDiente[ id=" + id + " ]";
    }
    
}
