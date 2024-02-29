package ActividadTrimestral2Programacion;

public class Entrada {

 public static void main(String[] args) {
    
  Coche participante1 = new Coche("bmw", "s3", "0001bmw", 150, 0);
  Coche participante2 = new Coche("mercedes", "gls", "0002mcd", 95, 0);

  Carrera gp = new Carrera(participante1, participante2, 20, 5000);

  
  
  gp.inicializarCarrera();
  
 }
 
    
}
