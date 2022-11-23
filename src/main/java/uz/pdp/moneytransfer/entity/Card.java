package uz.pdp.moneytransfer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    @Column(nullable = false, unique = true)
    private String number;

    @Column(nullable = false)
    private Double balance;

    @Column(nullable = false)
    private String expired_date;

    private Boolean active;

}
