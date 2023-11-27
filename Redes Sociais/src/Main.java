public class Main {

    public static void main(String[] args) {

        Facebook facebook = new Facebook("545357", 3000, "Facebook");
        Instagram instagram = new Instagram("323680", 1000, "Instagram");

        RedeSocial[] redes = new RedeSocial[2];
        redes[0] = facebook;
        redes[1] = instagram;

        Usuario usuario = new Usuario("Chris", "chris@gmail.com", redes);
        String nomeDoUsuario = usuario.getNome();
        String emailDoUsuario = usuario.getEmail();

        usuario.postarFoto();
        usuario.postarVideo();
        usuario.postarComentario();
        System.out.println("");
        usuario.curtirPublicacao();
        usuario.compartilhar();
        usuario.fazStreaming();
    }
}