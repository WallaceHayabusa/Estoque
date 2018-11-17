package com.trabalho.dweb.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trabalho.dweb.estoque.model.Produto;
import com.trabalho.dweb.estoque.model.Usuario;
import com.trabalho.dweb.estoque.service.ProdutoService;
import com.trabalho.dweb.estoque.service.UsuarioService;


@Controller
@RequestMapping(value= {"/", "/index"})
public class IndexController {

	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	private String warning = "";
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(Model model) {
		
		String mensagem = "Controle de Estoque";
		
		model.addAttribute("mensagem", mensagem);
		
		return "index";
	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(Model model) {
		
		String titulo = "Dashboard";
		
		model.addAttribute("titulo", titulo);
		model.addAttribute("produtos", produtoService.getTodosProdutos());
		
		return "dashboard";
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public String cadastro(Model model) {
		
		String titulo = "Cadastro de Produtos";
		
		model.addAttribute("titulo", titulo);
		
		return "cadastro";
	}
	
	@RequestMapping(value = "/cadastro-usuario", method = RequestMethod.GET)
	public String cadastroUsuário(Model model) {
		
		String mensagem = "Cadastro de Usuário";
		
		model.addAttribute("mensagem", mensagem);
		
		return "cadastro-usuario";
	}
	
	
	@RequestMapping(value = "/logar", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("usuario") Usuario usuario) {
		
		ModelAndView model = new ModelAndView("index");
		
		List<Usuario> usuariosCadastrados = usuarioService.getTodosUsuarios();
		
		if (!usuariosCadastrados.isEmpty() || !usuario.getLogin().equals("") && !usuario.getSenha().equals("")) {
			
			for (Usuario usuarioCadastrado : usuariosCadastrados) {
				if (usuarioCadastrado != null && usuario.getLogin().equals(usuarioCadastrado.getLogin()) && usuario.getSenha().equals(usuarioCadastrado.getSenha())) {
					
					model.addObject("warning", "Login realizado com sucesso. Bem vindo " + usuario.getLogin() + "!");
					model.addObject("usuarioLogado", usuarioCadastrado.getLogin());

					return new ModelAndView("redirect:/dashboard");
				}
			}
			model.addObject(warning, "Não foi possível realizar o login.");
		}
		
		return new ModelAndView();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public ModelAndView salvar(@ModelAttribute("produto") Produto produto) {
		ModelAndView model = new ModelAndView("index");
		
		produtoService.cadastrar(produto);
		
		model.addObject("produto",	produto);
	
		return new ModelAndView("redirect:/dashboard");
	}
	
//	@RequestMapping(value = "/editar",method = RequestMethod.PUT)
//	public 
	
	
	@RequestMapping(value = "/salvar-usuario", method = RequestMethod.POST)
	public ModelAndView salvarUsuário(@ModelAttribute ("usuário") Usuario usuario) {
		ModelAndView model = new ModelAndView("cadastro-usuario");
		
		usuarioService.cadastrar(usuario);
		
		model.addObject("usuario", usuario);
		
		return new ModelAndView("redirect:/index");
	}
	
}
