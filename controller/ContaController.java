package contaBan.controller;

import java.util.ArrayList;

import contaBan.model.Conta;
import contaBan.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaConta = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		if (conta != null)
			conta.visualizar();
		else
			System.out.println("\nConta Número: " + numero + " não foi encontrado!");
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
		System.out.println("\nA Conta número: " + conta.getNumero() + " foi criada com sucesso! ");

	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		if (buscaConta != null) {
			listaConta.set(listaConta.indexOf(buscaConta), conta);
			System.out.println("\nConta numero: " + conta.getNumero() + "foi atualizada com sucesso! ");
		} else
			System.out.println("\nConta numero: " + conta.getNumero() + "não foi encontrada!");
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		if (conta != null) {
			if (listaConta.remove(conta) == true)
				System.out.println("\nA Conta número " + numero + " foi deletada com sucesso! ");
		} else
			System.out.println("\nA Conta numero: " + numero + " não foi encontrada! ");
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		if (conta != null) {
			if (((Conta) conta).sacar(valor) == true)
				System.out.println("\nO saque da conta de numero: " + numero + "foi efetuado com sucesso!!");
		} else
			System.out.println("\nA conta de numero: " + numero + " não foi encontrada!! ");

	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("\nO deposito na conta nume: " + numero + " foi efetuado com sucesso!");
		} else
			System.out.println("\nA conta de número: " + numero
					+ " não foi encontrada ou a conta destino não é uma conta corrente!");

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);

		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA transferencia foi efetuada com sucesso! ");
			}
		} else
			System.out.println("\nA contra de Origem e/ou Destino não foram encontrada! ");

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaConta) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

	public int retornaTipo(int numero) {
		for (var conta : listaConta) {
			if (((Conta) conta).getNumero() == numero) {
				return conta.getTipo();
			}
		}
		return 0;
	}
}
