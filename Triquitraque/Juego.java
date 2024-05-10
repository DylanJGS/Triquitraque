
package Triquitraque;


public class Juego {
    public String turno; 
    public Boolean enJuego;
    public String nombreTurno;
    
   

    public Juego() {
    }

    public Juego(String turno, Boolean enJuego, String NombreTurno) {
        this.turno = turno;
        this.enJuego = enJuego;
        this.nombreTurno = NombreTurno;
    }
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Boolean getEnJuego() {
        return enJuego;
    }

    public void setEnJuego(Boolean enJuego) {
        this.enJuego = enJuego;
    }

    public String getNombreTurno() {
        return nombreTurno;
    }

    public void setNombreTurno(String NombreTurno) {
        this.nombreTurno = NombreTurno;
    }
    
    
    
    public void cambioTurno(){
        if(turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }
    }

    
    public void cambioNombreTurno(Jugador jugador1, Jugador jugador2){
        if(nombreTurno.equals(jugador1.getNombre())){
            this.nombreTurno=jugador2.getNombre();
        }else{
            this.nombreTurno=jugador1.getNombre();
        }
        
    }
    
    
}