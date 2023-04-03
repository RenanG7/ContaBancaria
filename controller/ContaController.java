package contaBan.controller;

import java.util.ArrayList;


import contaBan.model.Conta;
import contaBan.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaConta = new ArrayList<Conta>();
	int numero = 0;
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarTodas() {
		for (var conta : listaConta) {
			conta.visualizar();
		}
	}
	@Override
	public void cadastrar(Conta conta) {
		listaConta.add(conta);
		System.out.println("\nA Conta número: "+ conta.getNumero() + " foi criada com sucesso! ");
		
	}
	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
    public int gerarNumero() {
    	return ++ numero;
    }
	

}
