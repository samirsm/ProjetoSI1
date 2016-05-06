package controllers;

import models.Usuario;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.*;
import play.mvc.Result;
import play.mvc.Security;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;

public class Secured extends Security.Authenticator {
	
	@Override
	public String getUsername(Context ctx) {
		String email = ctx.session().get("email");
		String matricula = ctx.session().get("matricula");
		
		LoggerSistema loggerAutenticacao = new LoggerSistema();
		loggerAutenticacao.registraAcao(Acao.ERRO, email);
		
		if (email != null){
			return email;
		} else return matricula;
		
    }
	
	@Override
    public Result onUnauthorized(Http.Context context) {
		return redirect(routes.HomeController.index());
    }

}
