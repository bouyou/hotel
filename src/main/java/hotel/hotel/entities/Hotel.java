package hotel.hotel.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table(name = "hotel")
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nbChambre", nullable = false)
    private Integer nbChambre;

    @Column(name = "dateAjout", nullable = false)
    private Date dateAjout;

    @Column(name = "dateModif")
    private Date dateModif;

    @Column(name = "dateDelete")
    private Date dateDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNbChambre() {
        return nbChambre;
    }

    public void setNbChambre(Integer nbChambre) {
        this.nbChambre = nbChambre;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
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

}
