/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Roy Braam
 */
@Entity
@Table(name="mrl_eigenschap_custom_in")
public class MaatregelEigenschapCustomInput extends CustomInput{    
    @Id
    private Long id;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="maatregel_eigenschap", insertable=false, updatable=false)
    private MaatregelEigenschap maatregelEigenschap;
    
    public MaatregelEigenschap getMaatregelEigenschap() {
        return maatregelEigenschap;
    }

    public void setMaatregelEigenschap(MaatregelEigenschap maatregelEigenschap) {
        this.maatregelEigenschap = maatregelEigenschap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
