package ActividadTrimestral2Programacion;

public class Carrera {
    
    private int numeroDeVueltas, kmTotales;
    private Coche participante2;
    private Coche participante1;
    private Coche ganador;
    

  

    Carrera(Coche participante1, Coche participante2, int numeroDeVueltas, int kmTotales){
        this.numeroDeVueltas=numeroDeVueltas;
        this.kmTotales=kmTotales;
        this.participante1 = participante1;
        this.participante2 = participante2;
        
    }
        
        
    public void inicializarCarrera(){

        System.out.println("Participante1");
        participante1.datosParticipante();
        System.out.println("Participante2");
        participante2.datosParticipante();
        System.out.println("La carrera va a empezar, el circuito tiene las siguientes caracteristicas " + numeroDeVueltas + " vueltas y " + kmTotales + "km." );

        for (int i = 0; i < numeroDeVueltas; i++) {
            participante1.acelerar(kmTotales);
            participante2.acelerar(kmTotales);

            if (participante1.getKmRecorridos() >= kmTotales || participante2.getKmRecorridos() >= kmTotales) {
                break;
            }
        }

        if (participante1.getKmRecorridos() >= kmTotales) {
            ganador = participante1;
        } else if (participante2.getKmRecorridos() >= kmTotales) {
            ganador = participante2;
        }

        System.out.println("El ganador ha sido el coche con matrícula: " + ganador.getmatricula());
    }   
        
    
    
}

        
            


    

    

    




