package db_Online;
// Generated 1-mar-2018 12.26.47 by Hibernate Tools 4.3.1



/**
 * Omaggio generated by hbm2java
 */
public class Omaggio  implements java.io.Serializable {


     private int idOmaggio;
     private String nomeOmaggio;
     private String descrizione;
     private int costo;

    public Omaggio() {
    }

    public Omaggio(int idOmaggio, String nomeOmaggio, String descrizione, int costo) {
       this.idOmaggio = idOmaggio;
       this.nomeOmaggio = nomeOmaggio;
       this.descrizione = descrizione;
       this.costo = costo;
    }
   
    public int getIdOmaggio() {
        return this.idOmaggio;
    }
    
    public void setIdOmaggio(int idOmaggio) {
        this.idOmaggio = idOmaggio;
    }
    public String getNomeOmaggio() {
        return this.nomeOmaggio;
    }
    
    public void setNomeOmaggio(String nomeOmaggio) {
        this.nomeOmaggio = nomeOmaggio;
    }
    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public int getCosto() {
        return this.costo;
    }
    
    public void setCosto(int costo) {
        this.costo = costo;
    }




}

