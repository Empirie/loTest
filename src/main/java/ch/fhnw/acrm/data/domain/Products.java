package ch.fhnw.acrm.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//model
@Entity
public class Products {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double palletSize;
}
