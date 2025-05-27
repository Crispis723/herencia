public class EmpleadoPorComision extends  Empleado{
    private double comision;
    private int undidades;

    public EmpleadoPorComision (String nombre, String apellido, double salario, double comision){
        super (nombre, apellido, salario);
        this.comision=comision;
    }
    public double calcularPago(){
        return getSalario() + (comision*undidades);
    }

    public  void  sumarVentas(int undidades){
        this.undidades=this.undidades +undidades;
    }

    public  void reiniciarVentas(){
        undidades=0;
    }
}

