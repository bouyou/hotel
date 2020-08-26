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

}
