package pe.edu.upeu.tres_enraya.excepciones;

public class JuegoNoEncontradoException extends RuntimeException {
    public JuegoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
