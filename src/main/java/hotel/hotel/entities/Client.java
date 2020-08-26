package hotel.hotel.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "client")
@Data
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "dateNaissance", nullable = false)
    private Date dateNaissance;

    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "dateAjout", nullable = false)
    private Date dateAjout;

    @Column(name = "dateModif")
    private Date dateModif;

    @Column(name = "dateDelete")
    private Date dateDelete;

}
