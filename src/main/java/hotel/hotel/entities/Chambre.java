package hotel.hotel.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "chambre")
@Data
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

    @Column(name = "dateAjout", nullable = false)
    private Date dateAjout;

    @Column(name = "dateModif")
    private Date dateModif;

    @Column(name = "dateDelete")
    private Date dateDelete;

    @Column(name = "id_hotel", nullable = false)
    private Integer idHotel;

}
