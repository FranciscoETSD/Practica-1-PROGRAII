import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        //CLIENTE

        Cliente Cliente = new Cliente();
        Cliente.IdCliente = 1;
        Cliente.Nombre = "Tadeo";
        Cliente.PrimerApellido ="Saavedra";
        Cliente.SegundoApellido = "Diaz";

        //BILLETE

        Billete billete = new Billete();
        billete.idBillete = 1;
        billete.fechaEmision = Calendar.getInstance().getTime();
        billete.precioTotal = 150.25;
        billete.cliente = "Tadeo";
        billete.Origen = "Cochabamba";
        billete.Destino = "Santa Cruz";
        billete.categoria = "Bissnes Class Premium";

        //PLAZA

        Plaza plaza = new Plaza();
        plaza.idpasaje = 1;
        plaza.vuelos = 1;
        plaza.categoria = "Bissnes Class Premium";
        plaza.numerodeplaza = 1;
        plaza.tarifa = 3.876;

        //CIUDAD

        Ciudad ciudad = new Ciudad();
        ciudad.idCiudad = 1;
        ciudad.nombre = "Santa Cruz";

        //AEROPUERTO

        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.nombre = "Barajas";
        aeropuerto.codigoAeropuerto = "vv";
        aeropuerto.ciudad ="Cochabamba";

        //VUELOS

        Vuelos vuelos = new Vuelos();
        vuelos.codigoVuelo = "342";
        vuelos.billetes = 1;
        vuelos.Origen = "Cochabamba";
        vuelos.destino = "Santa Cruz";
        vuelos.salida = Calendar.getInstance().getTime();

        //---------FELIZ VIAJE---------//

        System.out.println("Cliente");
        System.out.println("id: " + Cliente.IdCliente);
        System.out.println("Nombre:" + Cliente.Nombre);
        System.out.println("Primer Apellido:" + Cliente.PrimerApellido);
        System.out.println("Segundo Apellido:" + Cliente.SegundoApellido);


        System.out.println("Billete");
        System.out.println("id:" + billete.idBillete);
        System.out.println("Fecha de emision:" + billete.fechaEmision);
        System.out.println("Precio Total:" + billete.precioTotal);
        System.out.println("Cliente:" + billete.cliente);
        System.out.println("Origen:" + billete.Origen);
        System.out.println("Destino:" + billete.Destino);
        System.out.println("Categoria:" + billete.categoria);


        System.out.println("Plaza");
        System.out.println("Plaza:" + plaza.idpasaje);
        System.out.println("Plaza:" + plaza.vuelos);
        System.out.println("Plaza:" + plaza.categoria);
        System.out.println("Plaza:" + plaza.numerodeplaza);
        System.out.println("Plaza:" + plaza.idpasaje);
        System.out.println("Plaza:" + plaza.tarifa);


        System.out.println("Ciudad");
        System.out.println("Ciudad" + ciudad.idCiudad);
        System.out.println("Nombre de la ciudad" + ciudad.nombre);


        System.out.println("Aeropuerto");
        System.out.println("Nombre del Aeropuerto:" + aeropuerto.nombre);
        System.out.println("Codigo del Aeropuerto:" + aeropuerto.codigoAeropuerto);
        System.out.println("Nombre de la ciudad:" + aeropuerto.ciudad);


        System.out.println("Vuelo");
        System.out.println("Codigo de vuelo:" + vuelos.codigoVuelo);
        System.out.println("Numero de billete:" + vuelos.billetes);
        System.out.println("Origen:" + vuelos.Origen);
        System.out.println("Destino:" + vuelos.destino);





    }
}
