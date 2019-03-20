
package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.dominio.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer> {

}