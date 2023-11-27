public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos, String redes){
        super(senha, numAmigos, redes);
    }

    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo(){
        System.out.println("Postou um vídeo no GooglePlus");
    }

    @Override
    public void postarComentario(){
        System.out.println("Postou um comentário no GooglePlus");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no GooglePlus");
    }
}
