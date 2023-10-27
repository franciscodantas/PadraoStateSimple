package states;

import models.CargoEnum;
import models.UserStorie;
import models.Usuario;

public class InProgresss implements State{
    UserStorie storie;
    @Override
    public void setUS(UserStorie userStorie) {
        storie = userStorie;
    }

    @Override
    public void mover(Usuario usuario) {
        if (usuario.getCargo().equals(CargoEnum.DESENVOLVEDOR)) {
            State estado = new ToVerify();
            estado.setUS(storie);
            storie.setEstado(estado);
        }
    }

    @Override
    public String toString() {
        return "InProgress";
    }
}
