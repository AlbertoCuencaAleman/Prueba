public class Abogado extends Empleado{

    public void mostrarMnesaje(){
        System.out.println("Estoy en el tribunal");
    }
    @Override
    public int getVacaciones() {
        return super.getVacaciones();
    }
    @Override
    public double getSalario() {
        return super.getSalario() + 10000;
    }

    @Override
    public int getHoras() {
        return super.getHoras() + 5;
    }

    @Override
    public String getMesVacaciones() {
        return "julio";
    }

}