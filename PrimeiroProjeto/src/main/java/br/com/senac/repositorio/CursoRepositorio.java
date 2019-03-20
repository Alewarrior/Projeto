
package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.dominio.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Integer> {

}