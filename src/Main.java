import models.CargoEnum;
import models.UserStorie;
import models.Usuario;
import states.Done;
import states.State;
import states.ToDo;

public class Main {
    public static void main(String[] args) {
        State estado = new ToDo();
        UserStorie userStorie = new UserStorie();
        estado.setUS(userStorie);
        userStorie.setEstado(estado);

        // Começa em ToDo
        System.out.println(userStorie.toString());

        // InProgress
        userStorie.mover(new Usuario(CargoEnum.DESENVOLVEDOR));
        System.out.println(userStorie.toString());

        // ToVerify
        userStorie.mover(new Usuario(CargoEnum.DESENVOLVEDOR));
        System.out.println(userStorie.toString());

        // Mantem ToVerify
        userStorie.mover(new Usuario(CargoEnum.DESENVOLVEDOR));
        System.out.println(userStorie.toString());

        // Vai para Done
        userStorie.mover(new Usuario(CargoEnum.SCRUMASTER));
        System.out.println(userStorie.toString());

        // Fica em Done
        userStorie.mover(new Usuario(CargoEnum.SCRUMASTER));
        System.out.println(userStorie.toString());
    }
}