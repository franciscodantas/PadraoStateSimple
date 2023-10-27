package states;

import models.UserStorie;
import models.Usuario;

public class ToDo implements State{
    UserStorie storie;

    @Override
    public void setUS(UserStorie userStorie) {
        storie = userStorie;
    }

    @Override
    public void mover(Usuario usuario) {
        State estado = new InProgresss();
        estado.setUS(storie);
        storie.setEstado(estado);
    }

    @Override
    public String toString() {
        return "ToDo";
    }
}
