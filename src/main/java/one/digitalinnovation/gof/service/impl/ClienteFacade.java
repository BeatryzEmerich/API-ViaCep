package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteFacade {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ViaCepService viaCepService;

    public Iterable<Cliente> buscarTodosClientes() {
       return clienteService.buscarTodos(); // Não retorna valor
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteService.buscarPorId(id); // Não retorna valor
    }

    public void inserirClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = viaCepService.consultarCep(cep);

        if (endereco != null) {
            cliente.setEndereco(endereco);
            clienteService.inserir(cliente); // Método void
        } else {
            throw new RuntimeException("CEP não encontrado");
        }
    }

    public void atualizarCliente(Long id, Cliente cliente) {
        Cliente clienteBd = buscarClientePorId(id);
        if (clienteBd != null) {
            cliente.setId(id);
            String cep = cliente.getEndereco().getCep();
            Endereco endereco = viaCepService.consultarCep(cep);

            if (endereco != null) {
                cliente.setEndereco(endereco);
                clienteService.atualizar(id, cliente); // Método void
            } else {
                throw new RuntimeException("CEP não encontrado");
            }
        } else {
            throw new RuntimeException("Cliente não encontrado");
        }
    }

    public void deletarCliente(Long id) {
        clienteService.deletar(id); // Método void
    }
}