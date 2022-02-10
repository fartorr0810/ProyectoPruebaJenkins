package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.model.Usuario;

class UsuarioTests {
	Usuario user;
	
	@BeforeEach
	void init() {
		user=new Usuario("Jonh Cena","TITIRITIII");
	}
	
	@Test
	void test() {
		assertEquals("TITIRITII", user.getPassword());
	}
	
}
