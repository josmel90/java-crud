/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josmell
 */
@Entity
@Table(name = "SEL_DATOS_PERSONALES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SelDatosPersonales.findAll", query = "SELECT s FROM SelDatosPersonales s")
    , @NamedQuery(name = "SelDatosPersonales.findByIdPersonal", query = "SELECT s FROM SelDatosPersonales s WHERE s.idPersonal = :idPersonal")
    , @NamedQuery(name = "SelDatosPersonales.findByNombre", query = "SELECT s FROM SelDatosPersonales s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "SelDatosPersonales.findByApepat", query = "SELECT s FROM SelDatosPersonales s WHERE s.apepat = :apepat")
    , @NamedQuery(name = "SelDatosPersonales.findByApemat", query = "SELECT s FROM SelDatosPersonales s WHERE s.apemat = :apemat")
    , @NamedQuery(name = "SelDatosPersonales.findByFechanac", query = "SELECT s FROM SelDatosPersonales s WHERE s.fechanac = :fechanac")
    , @NamedQuery(name = "SelDatosPersonales.findByNacionalidad", query = "SELECT s FROM SelDatosPersonales s WHERE s.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "SelDatosPersonales.findByEstadoCivil", query = "SELECT s FROM SelDatosPersonales s WHERE s.estadoCivil = :estadoCivil")
    , @NamedQuery(name = "SelDatosPersonales.findByTipodoc", query = "SELECT s FROM SelDatosPersonales s WHERE s.tipodoc = :tipodoc")
    , @NamedQuery(name = "SelDatosPersonales.findByNumdoc", query = "SELECT s FROM SelDatosPersonales s WHERE s.numdoc = :numdoc")
    , @NamedQuery(name = "SelDatosPersonales.findByDireccion", query = "SELECT s FROM SelDatosPersonales s WHERE s.direccion = :direccion")
    , @NamedQuery(name = "SelDatosPersonales.findByUbigeo", query = "SELECT s FROM SelDatosPersonales s WHERE s.ubigeo = :ubigeo")
    , @NamedQuery(name = "SelDatosPersonales.findByReligion", query = "SELECT s FROM SelDatosPersonales s WHERE s.religion = :religion")
    , @NamedQuery(name = "SelDatosPersonales.findByTelefono", query = "SELECT s FROM SelDatosPersonales s WHERE s.telefono = :telefono")
    , @NamedQuery(name = "SelDatosPersonales.findByCelular", query = "SELECT s FROM SelDatosPersonales s WHERE s.celular = :celular")
    , @NamedQuery(name = "SelDatosPersonales.findByEmail", query = "SELECT s FROM SelDatosPersonales s WHERE s.email = :email")
    , @NamedQuery(name = "SelDatosPersonales.findByEstado", query = "SELECT s FROM SelDatosPersonales s WHERE s.estado = :estado")
    , @NamedQuery(name = "SelDatosPersonales.findByFechaCrea", query = "SELECT s FROM SelDatosPersonales s WHERE s.fechaCrea = :fechaCrea")
    , @NamedQuery(name = "SelDatosPersonales.findByUserCrea", query = "SELECT s FROM SelDatosPersonales s WHERE s.userCrea = :userCrea")
    , @NamedQuery(name = "SelDatosPersonales.findByFechaUpdt", query = "SELECT s FROM SelDatosPersonales s WHERE s.fechaUpdt = :fechaUpdt")
    , @NamedQuery(name = "SelDatosPersonales.findByUserUpdt", query = "SELECT s FROM SelDatosPersonales s WHERE s.userUpdt = :userUpdt")})
public class SelDatosPersonales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_PERSONAL")
    private String idPersonal;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "APEPAT")
    private String apepat;
    @Size(max = 50)
    @Column(name = "APEMAT")
    private String apemat;
    @Column(name = "FECHANAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechanac;
    @Size(max = 20)
    @Column(name = "NACIONALIDAD")
    private String nacionalidad;
    @Size(max = 20)
    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;
    @Size(max = 2)
    @Column(name = "TIPODOC")
    private String tipodoc;
    @Size(max = 20)
    @Column(name = "NUMDOC")
    private String numdoc;
    @Size(max = 100)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 20)
    @Column(name = "UBIGEO")
    private String ubigeo;
    @Size(max = 50)
    @Column(name = "RELIGION")
    private String religion;
    @Size(max = 20)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 20)
    @Column(name = "CELULAR")
    private String celular;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 1)
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCrea;
    @Size(max = 20)
    @Column(name = "USER_CREA")
    private String userCrea;
    @Column(name = "FECHA_UPDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUpdt;
    @Size(max = 20)
    @Column(name = "USER_UPDT")
    private String userUpdt;

    public SelDatosPersonales() {
    }

    public SelDatosPersonales(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(Date fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public String getUserCrea() {
        return userCrea;
    }

    public void setUserCrea(String userCrea) {
        this.userCrea = userCrea;
    }

    public Date getFechaUpdt() {
        return fechaUpdt;
    }

    public void setFechaUpdt(Date fechaUpdt) {
        this.fechaUpdt = fechaUpdt;
    }

    public String getUserUpdt() {
        return userUpdt;
    }

    public void setUserUpdt(String userUpdt) {
        this.userUpdt = userUpdt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonal != null ? idPersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SelDatosPersonales)) {
            return false;
        }
        SelDatosPersonales other = (SelDatosPersonales) object;
        if ((this.idPersonal == null && other.idPersonal != null) || (this.idPersonal != null && !this.idPersonal.equals(other.idPersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.SelDatosPersonales[ idPersonal=" + idPersonal + " ]";
    }
    
}
