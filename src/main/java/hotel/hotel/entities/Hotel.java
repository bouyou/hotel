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

    @Column(name = "dateModif", nullable = false)
    private Date dateModif;

    @Column(name = "dateDelete", nullable = false)
    private Date dateDelete;

}
