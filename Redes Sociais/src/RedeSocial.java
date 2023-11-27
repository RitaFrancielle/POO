public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;
    protected String redes;

    public RedeSocial(String senha, int numAmigos, String redes){
        this.senha = senha;
        this.numAmigos = numAmigos;
        this.redes = redes;
        }

    public abstract void postarFoto ();

    public abstract void postarVideo ();

    public abstract void postarComentario ();

    public void curtirPublicacao() {
    }
}