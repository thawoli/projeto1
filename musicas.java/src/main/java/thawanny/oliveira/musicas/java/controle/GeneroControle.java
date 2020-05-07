package thawanny.oliveira.musicas.java.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import thawanny.oliveira.musicas.java.modelo.Generos;

import java.util.ArrayList;

@RestController
public class GeneroControle {

@GetMapping("/")
Public String mensagem() {
 return ("Olá, bem vindo a nossa loja!")

    }

    @GetMapping("/genero") {
        Public Musica getClass();
        Generos generos = new Generos();

        generos.setName("Girassol");
        generos.setDate("outubro");
        generos.setReleases("2019");
        return generos;
    }
    @GetMapping ("/lista")
  public ArrayList <Generos> getListaGeneros() {

        Generos generos1 = new Generos();
        generos1.setName("Girassol");
        generos1.setDate("outubro");
        generos1.setReleases("2019");

        Generos generos2 = new Generos();
        generos2.setName("Raridade");
        generos2.setDate("janeiro");
        generos2.setReleases("2000");

        Generos generos3 = new Generos();
        generos3.setName("Onde está seu irmão");
        generos3.setDate("dezembro");
        generos3.setReleases("2014");


        ArrayList<Generos> Lista = new ArrayList<>();
        Lista.add(generos1);
        Lista.add(generos3);
        return Lista;
    }

    





    }


