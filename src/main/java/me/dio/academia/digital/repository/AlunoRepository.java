package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

  /**
   *
   * @param dataDeNascimento: data de nascimento dos alunos
   * @return lista com todos os alunos com a data de nascimento passada como parâmetro da função
   */
  List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
  
  /**
   * @param cpf: cpf do aluno
   * @return um aluno com o cpf passado como parâmetro da função
   */
  Aluno findByCpf(String cpf);
  
  /**
   * @param nome: nome do aluno
   * @return lista com todos os alunos com o nome passado como parâmetro da função
   */
  List<Aluno> findByNome(String nome);
  
  /**
   * @param bairro: bairro do aluno
   * @return lista com todos os alunos com o bairro passado como parâmetro da função
   */
  List<Aluno> findByBairro(String bairro);
  
  /**
   * @param nome:   nome do aluno
   * @param bairro: bairro do aluno
   * @return lista com todos os alunos com o nome e bairro passados como parâmetro da função
   */
  
  List<Aluno> findByNomeAndBairro(String nome, String bairro);
  
  /**
   * @param nome:             nome do aluno
   * @param dataDeNascimento: data de nascimento do aluno
   * @return lista com todos os alunos com o nome e data de nascimento passados como parâmetro da função
   */
  
  List<Aluno> findByNomeAndDataDeNascimento(String nome, LocalDate dataDeNascimento);
  
  /**
   * @param bairro:           bairro do aluno
   * @param dataDeNascimento: data de nascimento do aluno
   * @return lista com todos os alunos com o bairro e data de nascimento passados como parâmetro da função
   */
  
  List<Aluno> findByBairroAndDataDeNascimento(String bairro, LocalDate dataDeNascimento);
  
  /**
   * @param nome:             nome do aluno
   * @param bairro:           bairro do aluno
   * @param dataDeNascimento: data de nascimento do aluno
   * @return lista com todos os alunos com o nome, bairro e data de nascimento passados como parâmetro da função
   */
  
  List<Aluno> findByNomeAndBairroAndDataDeNascimento(String nome, String bairro, LocalDate dataDeNascimento);

}
