public class Usuario {

    private String nome;
    private String email;
    private RedeSocial[] redeSociais;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public RedeSocial[] getRedeSociais() {
        return redeSociais;
    }

    public Usuario(String nome, String email, RedeSocial[] redeSociais) {
        this.nome = nome;
        this.email = email;
        this.redeSociais = redeSociais;
    }
    public void postarFoto(){
        System.out.println("O(a) usuário(a) " + nome + " postou uma foto no " + redeSociais[1].redes + " com o email " + getEmail());
    }

    public void postarVideo(){
        System.out.println("O(a) usuário(a) " + nome + " postou um vídeo no " + redeSociais[1].redes + " com o email " + getEmail());
    }

    public void postarComentario(){
        System.out.println("O(a) usuário(a) " + nome + " postou um comentário no " + redeSociais[1].redes + " com o email " + getEmail());
    }

    public void curtirPublicacao(){
        System.out.println("O(a) usuário(a) " + nome + " curtiu uma publicação no " + redeSociais[0].redes + " com o email " + getEmail());
    }
    public void compartilhar(){
        System.out.println("O(a) usuário(a) " + nome + " compartilhou no " + redeSociais[0].redes + " com o email " + getEmail());
    }
    public void fazStreaming(){
        System.out.println("O(a) usuário(a) " + nome + " realizou uma vídeo conferência no " + redeSociais[0].redes + " com o email " + getEmail());
    }
}