package models;

import states.State;

public class UserStorie {
    private State estado;

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public void mover(Usuario usuario){
        estado.mover(usuario);
    }

    public State getEstado() {
        return estado;
    }

    @Override
    public String toString(){
        return estado.toString();
    }
}
