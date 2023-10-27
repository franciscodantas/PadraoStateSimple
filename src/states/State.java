package states;

import models.UserStorie;
import models.Usuario;

public interface State {
    void setUS(UserStorie userStorie);

    void mover(Usuario usuario);
}
