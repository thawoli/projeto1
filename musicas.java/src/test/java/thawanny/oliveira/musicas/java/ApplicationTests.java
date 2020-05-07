package thawanny.oliveira.musicas.java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
public class ApplicationTests {

	public static void main (String [] args) {
		SpringApplication.run (ApplicationTests.class, args)

		generos g = new Generos ();
				g.setGeneros ();
				g.setNome ();
				g.setLançamentos();
				g.setAno ();

         System.out.println(g);


	}

}
