import java.nio.channels.ConnectionPendingException;

public class Carta {
  public String remitente;
  public String destinatario;
  public String contenido;

  public Carta (String remitente, String destinatario, String contenido){
    this.remitente = remitente;
    this.destinatario = destinatario;
    this.contenido = contenido;

  }
  public String getContenido(){
    return this.contenido;
  }
}
