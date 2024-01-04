package dev.thepaulcode;

import dev.thepaulcode.jpa.FabricaConexao;
import dev.thepaulcode.model.Servico;
import dev.thepaulcode.repository.ServicoRepository;
import java.util.List;

public class JpaPrsolarServicosApplication {
    public static void main(String[] args) {
       FabricaConexao.conectar();
        //listarServicos();
        //salvarServico();
        buscarServicoPorId();
        //alterarServico();
       // excluirServico();
    }

    // INÍCIO Operações CRUD - CAMADA SERVIÇOS
    static void salvarServico(){

        // Serviços prestados
        Servico servico = new Servico();

        servico.setDescricao("LAUDO TERMOGRÁFICO NO PAINEL ELÉTRICO");
        servico.setValor(2250.0);

        // Salvar serviço no no DB
        ServicoRepository servicoRepository = new ServicoRepository();

        servicoRepository.salvar(servico);

    }

    static void alterarServico(){

        ServicoRepository servicoRepository = new ServicoRepository();

        Servico servico = servicoRepository.buscarPorId(0);

        // Alterar serviços prestados
        //Servico servico = new Servico();

        // servico.setId(buscarServicoPorId());
        servico.setDescricao("NOVA CONFIGURAÇÃO MONITORAMENTO WI-FI DA PLANTA SOLAR");
        servico.setValor(150.00);

        // Salvar serviço no no DB

        servicoRepository.alterar(servico);
        buscarServicoPorId();

    }

    static void listarServicos(){

        ServicoRepository servicoRepository = new ServicoRepository();

        List<Servico> servicos = servicoRepository.listar();
        for(Servico s: servicos){
            System.out.println(s.getDescricao());
        }
    }

    static void excluirServico(){
        ServicoRepository servicoRepository = new ServicoRepository();
        servicoRepository.excluir(3);

    }

    static Servico buscarServicoPorId(){
        ServicoRepository servicoRepository = new ServicoRepository();
        Servico servico =null;
        System.out.println("Serviço por ID:" + servicoRepository.buscarPorId(1));
        servico = servicoRepository.buscarPorId(1);
        return servico;
    }

    // FIM Operações CRUD - CAMADA SERVIÇOS

}
