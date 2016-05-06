package controllers;

import java.util.Arrays;

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
		
		LoggerSistema l = new LoggerSistema();
		l.registraAcao(Acao.INFO, ctx.toString());
		
		String matricula = SistemaUsuarioLogin.getInstance().getTokenAuth();
		String email = SistemaUsuarioLogin.getInstance().getTokenAuth();
		
		if (email != null){
			return email;
		} else if(matricula != null)
			return matricula;
		else return null;
    }
	
	@Override
    public Result onUnauthorized(Context context) {
		return redirect(routes.HomeController.index());
    }

}
