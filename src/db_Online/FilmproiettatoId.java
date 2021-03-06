package db_Online;
// Generated 1-mar-2018 12.26.47 by Hibernate Tools 4.3.1



/**
 * FilmproiettatoId generated by hbm2java
 */
public class FilmproiettatoId  implements java.io.Serializable {


     private int idFilmProiettato;
     private int idCinema;

    public FilmproiettatoId() {
    }

    public FilmproiettatoId(int idFilmProiettato, int idCinema) {
       this.idFilmProiettato = idFilmProiettato;
       this.idCinema = idCinema;
    }
   
    public int getIdFilmProiettato() {
        return this.idFilmProiettato;
    }
    
    public void setIdFilmProiettato(int idFilmProiettato) {
        this.idFilmProiettato = idFilmProiettato;
    }
    public int getIdCinema() {
        return this.idCinema;
    }
    
    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FilmproiettatoId) ) return false;
		 FilmproiettatoId castOther = ( FilmproiettatoId ) other; 
         
		 return (this.getIdFilmProiettato()==castOther.getIdFilmProiettato())
 && (this.getIdCinema()==castOther.getIdCinema());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdFilmProiettato();
         result = 37 * result + this.getIdCinema();
         return result;
   }   

    @Override
    public String toString() {
        return "FilmproiettatoId{" + "idFilmProiettato=" + idFilmProiettato + ", idCinema=" + idCinema + '}';
    }


}


