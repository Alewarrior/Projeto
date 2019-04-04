package br.com.senac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Curso;
import br.com.senac.repositorio.CursoRepositorio;
import br.com.senac.servico.exception.ObjectNotFoundException;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepositorio repoCurso;
	
	public Curso buscar(Integer id) throws ObjectNotFoundException {
		Optional<Curso> objCurso = repoCurso.findById(id);
		return objCurso.orElseThrow(() -> new ObjectNotFoundException("Curso não encontrada!" + id + ", Tipo:"
				+ Curso.class.getName()));
	}
	
	public Curso inserir(Curso curso) {
		//estou colocando um objeto novo entao o id precisa ser null
		curso.setId(null);
		return repoCurso.save(curso);
	}
	
	public Curso alterar(Curso objCurso) throws ObjectNotFoundException {
		Curso objCursoEncontrado = buscar(objCurso.getId());
		objCursoEncontrado.setNome(objCurso.getNome());
		objCursoEncontrado.setPreco(objCurso.getPreco());
		objCursoEncontrado.setCategorias(objCurso.getCategorias());
		
		return repoCurso.save(objCursoEncontrado);
			
	}
	
	public void excluir(Integer id) {
		repoCurso.deleteById(id);
	}
	
	public List<Curso> listaCursos(){
		return repoCurso.findAll();
	}
	
}