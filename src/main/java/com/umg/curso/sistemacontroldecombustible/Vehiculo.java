/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.curso.sistemacontroldecombustible;




public class Vehiculo {

    /**
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    
    
    //vehiculo
    public String Placa;
    private String Marca;
    private String Modelo;
    private int CapacidadTanque;
    
    private String Fecha;
    private int CantidadLitros;
    private int KilometrosActual;
    private int PrecioLitro;
    private int KilometrosViejo;
 
    
    
    
       
   public void agregarCarga(String fecha, int cantidadLitros, int kilometrosActual1, int precioLitro) {
        this.KilometrosViejo = this.KilometrosActual;
        this.Fecha = fecha;
        this.CantidadLitros = cantidadLitros;
        this.KilometrosActual = kilometrosActual1;
        this.PrecioLitro = precioLitro;  
    }
   
   
    
    public String Tostring() {
        return "Placa: " + Placa + "\n" +
               "Marca: " + Marca + "\n" +
               "Modelo: " + Modelo + "\n" +
               "Capacidad del Tanque: " + CapacidadTanque + "L\n\n";
               
    }
    
    
    
    public String TostringC() {
         
    double consumo = 0;
    String mensajeConsumo = "";

    if (KilometrosViejo != 0 && KilometrosActual != KilometrosViejo) { 
        int KilometrosRecorridos = KilometrosActual - KilometrosViejo;

        
        if (KilometrosRecorridos > 0 && CantidadLitros > 0) {
            consumo = (double) KilometrosRecorridos / CantidadLitros; 

            if (consumo < 5 || consumo > 20) {
                mensajeConsumo = "Consumo fuera de rango";
            }
        } else {
            consumo = 0; 
        }
    }


    return "Placa: " + Placa + "\n" +
           "Marca: " + Marca + "\n" +
           "Modelo: " + Modelo + "\n" +
           "Capacidad del Tanque: " + CapacidadTanque + "L\n\n" +
           "Última Carga de Combustible:\n" +
           (Fecha == null ? "No hay carga registrada." : 
           "Fecha: " + Fecha + "\n" +
           "Litros: " + CantidadLitros +"L"+ "\n" +
           "Kilómetros: " + KilometrosActual + "Km"+ "\n" +
           "Precio por Litro: Q" + PrecioLitro + "\n" +
           "Consumo (km/L): " + (consumo == 0 ? "No disponible" : String.format("%.2f", consumo)) + 
           (mensajeConsumo.isEmpty() ? "" : "\n" + mensajeConsumo));
                
    }
               
               
    
    
    
     public static class VehiculoBuilder{
        private Vehiculo vehiculo;
        
        public VehiculoBuilder(){
            vehiculo = new Vehiculo();
        }
        public VehiculoBuilder Placa(String Placa){
            vehiculo.setPlaca(Placa);
            return this;
        }
        public VehiculoBuilder Marca(String Marca){
            vehiculo.Marca=Marca;
            return this;
        }
        public VehiculoBuilder Modelo(String Modelo){
            vehiculo.Modelo=Modelo;
            return this;
        }
        public VehiculoBuilder Tanque(int CapacidadTanque){
            vehiculo.CapacidadTanque=CapacidadTanque;
            return this;
        }
        public VehiculoBuilder agregarCarga(String fecha, int cantidadLitros, int kilometrosActual, int precioLitro) {
            vehiculo.agregarCarga(fecha, cantidadLitros, kilometrosActual, precioLitro);
            return this;
        }
        public Vehiculo Contruir(){
            return vehiculo;
        }
        
        
    }
            
}
