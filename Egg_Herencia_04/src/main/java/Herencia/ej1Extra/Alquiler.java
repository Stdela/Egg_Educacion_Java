package Herencia.ej1Extra;

//En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

//se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
//devolución, la posición del amarre y el barco que lo ocupará.
public class Alquiler {

    protected String nombre;
    protected Long documento;
    protected Date fechaPrestamo = new Date();
    protected Date fechaDevolucion = new Date();

    public Alquiler() {
    }

    public Alquiler(String nombre, Long documento, Date fechaPrestamo, Date fechaDevolucion) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + '}';
    }

    public void setearFechas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dia de prestamo ");
        int dia1 = scanner.nextInt();
        System.out.println("Ingrese mes de prestamo ");
        int mes1 = scanner.nextInt();
        System.out.println("Ingrese año de prestamo ");
        int anio1 = scanner.nextInt();

        this.fechaPrestamo.setDate(20);
        this.fechaPrestamo.setMonth(02);
        this.fechaPrestamo.setYear(2021);
        System.out.println("Ingrese dia de devolucion ");
        int dia2 = scanner.nextInt();
        System.out.println("Ingrese mes de devolucion ");
        int mes2 = scanner.nextInt();
        System.out.println("Ingrese anio de devolucion ");
        int anio2 = scanner.nextInt();
        this.fechaDevolucion.setDate(dia2 + 1);
        this.fechaDevolucion.setMonth(mes2 + 1);
        this.fechaDevolucion.setYear(anio2 - 1900);

    }

    public int diasdePrestamo() {
        if (this.fechaDevolucion.getMonth() > this.fechaPrestamo.getMonth()) {
            int aux1 = this.fechaDevolucion.getDate() + 30 - this.getFechaPrestamo().getDate();
            return aux1;
        } else {
            int aux1 = this.fechaDevolucion.getDate() - this.getFechaPrestamo().getDate();
            return aux1;
        }
    }

    public void crearAlquiler() {
        this.documento = 409980980932L;
        this.nombre = "Marco Polo";
        this.fechaPrestamo.setDate(20);
        this.fechaPrestamo.setMonth(02);
        this.fechaPrestamo.setYear(2021);
        System.out.println("Ingrese dia de devolucion ");
//        int dia2 = scanner.nextInt();
        System.out.println("Ingrese mes de devolucion ");
//        int mes2 = scanner.nextInt();
        System.out.println("Ingrese anio de devolucion ");
//        int anio2 = scanner.nextInt();
        this.fechaDevolucion.setDate(24);
        this.fechaDevolucion.setMonth(2);
        this.fechaDevolucion.setYear(2021);
        this.diasdePrestamo();

    }

    public void costoTotal(ArrayList<Barco> listaBarcos) {
        for (Barco listaBarco : listaBarcos) {
            if (listaBarco instanceof BarcoMotor) {
                BarcoMotor barcoMotor = (BarcoMotor) listaBarco;
                System.out.println(barcoMotor);
                System.out.println(this.diasdePrestamo() * barcoMotor.getEslora() * 10 + barcoMotor.getCaballosFuerza());
            }
            if (listaBarco instanceof Velero) {
                Velero velerin = (Velero) listaBarco;
                System.out.println(velerin);
                System.out.println(this.diasdePrestamo() * velerin.getEslora() * 10 + velerin.getNumeroMastil());

            }
            if (listaBarco instanceof Yate) {
                Yate yate = (Yate) listaBarco;
                System.out.println(yate);
                System.out.println(this.diasdePrestamo() * yate.getEslora() * 10 + yate.getCaballosFuerza() + yate.getCamarotes());
            }
            if (listaBarco instanceof Barco) {
                Barco barco = (Barco) listaBarco;
                System.out.println(barco);
                System.out.println(this.diasdePrestamo() * barco.getEslora() * 10);

            }
        }
    }
}
