package models;

public class Usuario {
    private CargoEnum cargo;

    public Usuario(CargoEnum cargoEnum) {
        cargo = cargoEnum;
    }

    public CargoEnum getCargo() {
        return cargo;
    }

    public void setCargo(CargoEnum cargo) {
        this.cargo = cargo;
    }
}
