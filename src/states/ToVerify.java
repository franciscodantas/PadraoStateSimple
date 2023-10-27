package states;

import models.CargoEnum;
import models.UserStorie;
import models.Usuario;

public class ToVerify implements State{
    UserStorie storie;
    @Override
    public void setUS(UserStorie userStorie) {
        storie = userStorie;
    }

    @Override
    public void mover(Usuario usuario) {
        if (usuario.getCargo().equals(CargoEnum.SCRUMASTER)) {
            State estado = new Done();
            estado.setUS(storie);
            storie.setEstado(estado);
        }
    }

    @Override
    public String toString() {
        return "ToVerify";
    }
}
