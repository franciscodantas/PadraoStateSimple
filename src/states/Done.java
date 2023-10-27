package states;

import models.UserStorie;
import models.Usuario;

public class Done implements State {
    UserStorie storie;
    @Override
    public void setUS(UserStorie userStorie) {
        storie = userStorie;
    }

    @Override
    public void mover(Usuario usuario) {
        // Faz nada
    }

    @Override
    public String toString() {
        return "Done";
    }
}
