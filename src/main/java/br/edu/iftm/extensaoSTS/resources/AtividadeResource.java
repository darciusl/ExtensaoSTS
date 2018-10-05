package br.edu.iftm.extensaoSTS.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.extensaoSTS.domain.Atividade;
import br.edu.iftm.extensaoSTS.services.AtividadeService;

@RestController
@RequestMapping(value="/atividades")
public class AtividadeResource {
	
//	@RequestMapping(method=RequestMethod.GET)
//	public List<Atividade> listar() {
//		Atividade a1 = new Atividade(1,"visita tecnica gdg");
//		Atividade a2 = new Atividade(2, "simpós");
//		return Arrays.asList(a1, a2);
//	}
	
	@Autowired
	private AtividadeService service;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Atividade atividade = service.buscar(id);
		return ResponseEntity.ok().body(atividade);
	}
	

}
