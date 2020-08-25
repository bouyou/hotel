package hotel.hotel.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "chambre")
//@Data
public class Chambre implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "numero", nullable = false)
    private String numero;

    @Column(name = "nbPax", nullable = false)
    private Integer nbPax;

    @Column(name = "dateModif", nullable = false)
    private Date dateModif;

    @Column(name = "dateDelete")
    private Date dateDelete;

    @Column(name = "id_hotel", nullable = false)
    private Integer idHotel;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getNbPax() {
        return nbPax;
    }

    public void setNbPax(Integer nbPax) {
        this.nbPax = nbPax;
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

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }
}
