/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author polancou
 */
@MappedSuperclass
@Table(name = "preguntas_paciente")
@XmlRootElement
public class PreguntasPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p5;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p6;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p7;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p8;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p9;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p10;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p11;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p12;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p13;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p14;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p15;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p16;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p17;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p18;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p19;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p20;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p21;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p22;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p23;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p24;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p25;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p26;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p27;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p28;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p29;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p30;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p31;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p32;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    private String p33;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String otros;
    @JoinColumn(name = "alergias_medicamentos", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AlergiasMedicamentos alergiasMedicamentos;
    @JoinColumn(name = "paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Paciente paciente;
    @JoinColumn(name = "padecimientos", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Padecimientos padecimientos;

    public PreguntasPaciente() {
    }

    public PreguntasPaciente(Integer id) {
        this.id = id;
    }

    public PreguntasPaciente(Integer id, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, String p19, String p20, String p21, String p22, String p23, String p24, String p25, String p26, String p27, String p28, String p29, String p30, String p31, String p32, String p33, String otros) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
        this.p10 = p10;
        this.p11 = p11;
        this.p12 = p12;
        this.p13 = p13;
        this.p14 = p14;
        this.p15 = p15;
        this.p16 = p16;
        this.p17 = p17;
        this.p18 = p18;
        this.p19 = p19;
        this.p20 = p20;
        this.p21 = p21;
        this.p22 = p22;
        this.p23 = p23;
        this.p24 = p24;
        this.p25 = p25;
        this.p26 = p26;
        this.p27 = p27;
        this.p28 = p28;
        this.p29 = p29;
        this.p30 = p30;
        this.p31 = p31;
        this.p32 = p32;
        this.p33 = p33;
        this.otros = otros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public String getP5() {
        return p5;
    }

    public void setP5(String p5) {
        this.p5 = p5;
    }

    public String getP6() {
        return p6;
    }

    public void setP6(String p6) {
        this.p6 = p6;
    }

    public String getP7() {
        return p7;
    }

    public void setP7(String p7) {
        this.p7 = p7;
    }

    public String getP8() {
        return p8;
    }

    public void setP8(String p8) {
        this.p8 = p8;
    }

    public String getP9() {
        return p9;
    }

    public void setP9(String p9) {
        this.p9 = p9;
    }

    public String getP10() {
        return p10;
    }

    public void setP10(String p10) {
        this.p10 = p10;
    }

    public String getP11() {
        return p11;
    }

    public void setP11(String p11) {
        this.p11 = p11;
    }

    public String getP12() {
        return p12;
    }

    public void setP12(String p12) {
        this.p12 = p12;
    }

    public String getP13() {
        return p13;
    }

    public void setP13(String p13) {
        this.p13 = p13;
    }

    public String getP14() {
        return p14;
    }

    public void setP14(String p14) {
        this.p14 = p14;
    }

    public String getP15() {
        return p15;
    }

    public void setP15(String p15) {
        this.p15 = p15;
    }

    public String getP16() {
        return p16;
    }

    public void setP16(String p16) {
        this.p16 = p16;
    }

    public String getP17() {
        return p17;
    }

    public void setP17(String p17) {
        this.p17 = p17;
    }

    public String getP18() {
        return p18;
    }

    public void setP18(String p18) {
        this.p18 = p18;
    }

    public String getP19() {
        return p19;
    }

    public void setP19(String p19) {
        this.p19 = p19;
    }

    public String getP20() {
        return p20;
    }

    public void setP20(String p20) {
        this.p20 = p20;
    }

    public String getP21() {
        return p21;
    }

    public void setP21(String p21) {
        this.p21 = p21;
    }

    public String getP22() {
        return p22;
    }

    public void setP22(String p22) {
        this.p22 = p22;
    }

    public String getP23() {
        return p23;
    }

    public void setP23(String p23) {
        this.p23 = p23;
    }

    public String getP24() {
        return p24;
    }

    public void setP24(String p24) {
        this.p24 = p24;
    }

    public String getP25() {
        return p25;
    }

    public void setP25(String p25) {
        this.p25 = p25;
    }

    public String getP26() {
        return p26;
    }

    public void setP26(String p26) {
        this.p26 = p26;
    }

    public String getP27() {
        return p27;
    }

    public void setP27(String p27) {
        this.p27 = p27;
    }

    public String getP28() {
        return p28;
    }

    public void setP28(String p28) {
        this.p28 = p28;
    }

    public String getP29() {
        return p29;
    }

    public void setP29(String p29) {
        this.p29 = p29;
    }

    public String getP30() {
        return p30;
    }

    public void setP30(String p30) {
        this.p30 = p30;
    }

    public String getP31() {
        return p31;
    }

    public void setP31(String p31) {
        this.p31 = p31;
    }

    public String getP32() {
        return p32;
    }

    public void setP32(String p32) {
        this.p32 = p32;
    }

    public String getP33() {
        return p33;
    }

    public void setP33(String p33) {
        this.p33 = p33;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public AlergiasMedicamentos getAlergiasMedicamentos() {
        return alergiasMedicamentos;
    }

    public void setAlergiasMedicamentos(AlergiasMedicamentos alergiasMedicamentos) {
        this.alergiasMedicamentos = alergiasMedicamentos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Padecimientos getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(Padecimientos padecimientos) {
        this.padecimientos = padecimientos;
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
        if (!(object instanceof PreguntasPaciente)) {
            return false;
        }
        PreguntasPaciente other = (PreguntasPaciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.PreguntasPaciente[ id=" + id + " ]";
    }
    
}
