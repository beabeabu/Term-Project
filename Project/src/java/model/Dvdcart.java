/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kuroc
 */
@Entity
@Table(name = "DVDCART")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dvdcart.findAll", query = "SELECT d FROM Dvdcart d"),
    @NamedQuery(name = "Dvdcart.findByName", query = "SELECT d FROM Dvdcart d WHERE d.name = :name"),
    @NamedQuery(name = "Dvdcart.findByRate", query = "SELECT d FROM Dvdcart d WHERE d.rate = :rate"),
    @NamedQuery(name = "Dvdcart.findByYears", query = "SELECT d FROM Dvdcart d WHERE d.years = :years"),
    @NamedQuery(name = "Dvdcart.findByPrice", query = "SELECT d FROM Dvdcart d WHERE d.price = :price"),
    @NamedQuery(name = "Dvdcart.findByQuantity", query = "SELECT d FROM Dvdcart d WHERE d.quantity = :quantity")})
public class Dvdcart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "NAME")
    private String name;
    @Size(max = 20)
    @Column(name = "RATE")
    private String rate;
    @Column(name = "YEARS")
    private Integer years;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "QUANTITY")
    private Integer quantity;

    public Dvdcart() {
    }

    public Dvdcart(String name) {
        this.name = name;
    }

    public String getCDvdnames() {
        return name;
    }

    public void setCDvdnames(String name) {
        this.name = name;
    }

    public String getCRate() {
        return rate;
    }

    public void setCRate(String rate) {
        this.rate = rate;
    }

    public Integer getCYears() {
        return years;
    }

    public void setCYears(Integer years) {
        this.years = years;
    }

    public Double getCPrice() {
        return price;
    }

    public void setCPrice(Double price) {
        this.price = price;
    }

    public Integer getCQuantity() {
        return quantity;
    }

    public void setCQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dvdcart)) {
            return false;
        }
        Dvdcart other = (Dvdcart) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Dvdcart[ name=" + name + " ]";
    }
    
}
