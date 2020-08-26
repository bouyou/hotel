package hotel.hotel.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "reservation")
@Data
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "numReserv", nullable = false)
    private Integer numReserv;

    @Column(name = "nbPers", nullable = false)
    private Integer nbPers;

    @Column(name = "prix", nullable = false)
    private Float prix;

    @Column(name = "nbCb", nullable = false)
    private String nbCb;

    @Column(name = "dateArrivee", nullable = false)
    private Date dateArrivee;

    @Column(name = "dateReserv", nullable = false)
    private Date dateReserv;

    @Column(name = "dateModif")
    private Date dateModif;

    @Column(name = "dateDelete")
    private Date dateDelete;

    @Column(name = "id_chambre", nullable = false)
    private Integer idChambre;

    @Column(name = "id_client", nullable = false)
    private Integer idClient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumReserv() {
        return numReserv;
    }

    public void setNumReserv(Integer numReserv) {
        this.numReserv = numReserv;
    }

    public Integer getNbPers() {
        return nbPers;
    }

    public void setNbPers(Integer nbPers) {
        this.nbPers = nbPers;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getNbCb() {
        return nbCb;
    }

    public void setNbCb(String nbCb) {
        this.nbCb = nbCb;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Date getDateReserv() {
        return dateReserv;
    }

    public void setDateReserv(Date dateReserv) {
        this.dateReserv = dateReserv;
    }

    public Date getDateModif() {
        return dateModif;
    }

    public void setDateModif(Date dateModif) {
        this.dateModif = dateModif;
    }

    public Date getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Date dateDelete) {
        this.dateDelete = dateDelete;
    }

    public Integer getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Integer idChambre) {
        this.idChambre = idChambre;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
}
