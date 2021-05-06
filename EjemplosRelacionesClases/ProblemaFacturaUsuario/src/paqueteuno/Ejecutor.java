package paqueteuno;
import paquetedos.Usuario;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear el objeto Usuario
        Usuario usuario = new Usuario();
        
        usuario.establecerNombre("Joseph");
        usuario.establecerApellido("Ramirez");
        usuario.establecerIdentificacion("1900775972");
        
        // Crear el objeto FacturaTelefonica
        FacturaTelefonica factura = new FacturaTelefonica("0996162496", 100, 0.5, usuario);
        
        factura.calcularValorFactura();
        
        System.out.printf("Factura de Teléfono\n" +
                "Nombre: %s\n" +
                "Apellido: %s\n" +
                "Identificación: %s\n" +
                "Número de teléfono: %s\n" +
                "Minutos mensuales: %.2f\n" +
                "Valor por minuto: %.2f\n" +
                "Valor a cancelar: %.2f\n",
                factura.obtenerUsuario().obtenerNombre(),
                factura.obtenerUsuario().obtenerApellido(),
                factura.obtenerUsuario().obtenerIdentificacion(),
                factura.obtenerNumeroTelefono(),
                factura.obtenerMinutosMes(),
                factura.obtenerValorMinuto(),
                factura.obtenerValorFactura());
    }
}
