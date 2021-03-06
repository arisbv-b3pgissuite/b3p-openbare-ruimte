/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Roy Braam
 */
@Entity
public class MaatregelGepland {
    @Id
    private Long id;
    @ManyToOne
    private Maatregel maatregel;
    
    private Integer hoeveelheid;
    
    private String objectType;
    
    private Integer bronId;
    
    private String featureId;
    
    @OneToMany(fetch= FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn (name="maatregel")    
    private List<MaatregelEigenschap> eigenschappen;

    @OneToMany(fetch= FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn (name="maatregel")
    private List<MaatregelCustomInput> customInputs;
    
    public void addEigenschap(MaatregelEigenschap me){
        if (eigenschappen==null){
            eigenschappen = new ArrayList<MaatregelEigenschap>();
        }
        eigenschappen.add(me);
    }
        
    public void addCustomInput(MaatregelCustomInput mci) {
        if (this.customInputs==null){
            this.customInputs = new ArrayList<MaatregelCustomInput>();
        }
        this.customInputs.add(mci);
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Maatregel getMaatregel() {
        return maatregel;
    }
    
    public void setMaatregel(Maatregel maatregel) {
        this.maatregel = maatregel;
    }

    public Integer getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(Integer hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public List<MaatregelEigenschap> getEigenschappen() {
        return eigenschappen;
    }

    public void setEigenschappen(List<MaatregelEigenschap> eigenschappen) {
        this.eigenschappen = eigenschappen;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Integer getBronId() {
        return bronId;
    }

    public void setBronId(Integer bronId) {
        this.bronId = bronId;
    }

    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }
    
    public List<MaatregelCustomInput> getCustomInputs() {
        return customInputs;
    }

    public void setCustomInputs(List<MaatregelCustomInput> customInputs) {
        this.customInputs = customInputs;
    }
    //</editor-fold>


    
}
