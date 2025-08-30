package  br.com.dio.desafio.dominio;

// Uso de classes abstratas obriga que sempre use os métodos dentro dela
// Não dá para instanciar uma classe abstrata em usar os métodos contidos nela
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
