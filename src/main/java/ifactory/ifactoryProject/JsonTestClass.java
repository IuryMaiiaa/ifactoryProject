package ifactory.ifactoryProject;

import ifactory.ifactoryProject.model.Cliente;
import ifactory.ifactoryProject.model.Endereco;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonTestClass {

	public List<Cliente> mockUsers() {
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Cliente c = new Cliente();
		Endereco e = new Endereco();
		
		
		c = new Cliente();
		e = new Endereco();
		c.setId(1);
		c.setNome("Daniel");
		e.setBairro("Alto");
		e.setRua("Carlos Je.");
		c.setEndereco(e);
		listaClientes.add(c);
		
		c = new Cliente();
		e = new Endereco();
		c.setId(2);
		c.setNome("Lucas");
		e.setBairro("Bairro2");
		e.setRua("Antonio Pedro");
		e.setComplemento("Complementando...");
		c.setEndereco(e);
		listaClientes.add(c);
		
		
		c = new Cliente();
		e = new Endereco();
		c.setId(1);
		c.setNome("Paiva");
		e.setBairro("Baijo");
		e.setRua("Das Dores");
		c.setEndereco(e);
		listaClientes.add(c);

		
		return listaClientes;
	}
	
	public String userToJson() throws JsonProcessingException {
		List<Cliente> clientes = mockUsers();
		Gson gson = new Gson();
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(clientes);
		
		return gson.toJson(clientes);
	}

}
