package db_Online;
// Generated 1-mar-2018 12.26.47 by Hibernate Tools 4.3.1



/**
 * Poltrona generated by hbm2java
 */
public class Poltrona  implements java.io.Serializable {


     private PoltronaId id;
     private int idSala;
     private boolean occupato;

    public Poltrona() {
    }

    public Poltrona(PoltronaId id, int idSala, boolean occupato) {
       this.id = id;
       this.idSala = idSala;
       this.occupato = occupato;
    }
   
    public PoltronaId getId() {
        return this.id;
    }
    
    public void setId(PoltronaId id) {
        this.id = id;
    }
    public int getIdSala() {
        return this.idSala;
    }
    
    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    public boolean isOccupato() {
        return this.occupato;
    }
    
    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }




}


