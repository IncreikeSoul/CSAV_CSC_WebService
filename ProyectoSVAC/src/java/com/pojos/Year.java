package com.pojos;
// Generated Apr 27, 2018 1:46:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Year generated by hbm2java
 */
public class Year  implements java.io.Serializable {


     private Integer codigoYear;
     private String nombreYear;
     private Set<Mes> meses = new HashSet<Mes>(0);

    public Year() {
    }

    public Year(String nombreYear, Set<Mes> meses) {
       this.nombreYear = nombreYear;
       this.meses = meses;
    }
   
    public Integer getCodigoYear() {
        return this.codigoYear;
    }
    
    public void setCodigoYear(Integer codigoYear) {
        this.codigoYear = codigoYear;
    }
    public String getNombreYear() {
        return this.nombreYear;
    }
    
    public void setNombreYear(String nombreYear) {
        this.nombreYear = nombreYear;
    }
    public Set<Mes> getMeses() {
        return this.meses;
    }
    
    public void setMeses(Set<Mes> meses) {
        this.meses = meses;
    }




}


