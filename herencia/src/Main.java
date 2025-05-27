public  class  Main{
    public static void main(String[] args) {
        EmpleadoPorComision c =new   EmpleadoPorComision("Sr.","Ventas",5.50,1.00);
        c.sumarVentas(5);
        System.out.println("Nombre: " + c.getNombre());
        System.out.println("Apellido:" + c.getApellido());
        System.out.println("Pago Base: $" + c.getSalario());
        System.out.println("Pago Total: $" + c.calcularPago());
    }
}