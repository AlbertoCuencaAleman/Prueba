public class Abogado extends Empleado{
    @Override
    public int getVacaciones() {
        return super.getVacaciones();
    }
    @Override
    public double getSalario() {
        return super.getSalario() + 10000;
    }

}