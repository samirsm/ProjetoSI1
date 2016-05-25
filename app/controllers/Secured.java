package controllers;

import java.util.Arrays;
import java.util.Date;

import javax.security.auth.login.Configuration;

import models.Usuario;
import play.api.PlayConfig;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.*;
import play.mvc.Result;
import play.mvc.Security;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;

public class Secured extends Security.Authenticator {
	
	private final long CONVERSAO_MILISSEGUNDOS = 1000;
	private final long CONVERSAO_MINUTOS = 60;
	private final long CONVERSAO_HORAS = 60;
	private final long TEMPO_COOKIE_HORAS = 24;
	
	private LoggerSistema loggerSecured;
	
	public Secured(){
		loggerSecured = new LoggerSistema();
	}
	
	@Override
	public String getUsername(Context ctx) {
        if(isSessionValida())
        	return SistemaUsuarioLogin.getInstance().getTokenAuth();
        
        return null;
    }

	@Override
    public Result onUnauthorized(Context context) {
		return redirect(routes.HomeController.login());
    }

	@SuppressWarnings("deprecation")
	private boolean isSessionValida() {
		String previousTick = SistemaUsuarioLogin.getInstance().getUserTime();
	    if (previousTick != null && !previousTick.equals("")) {
	        long previousT = Long.valueOf(previousTick);
	        long currentT = new Date().getTime();
	        long timeout = CONVERSAO_MILISSEGUNDOS * CONVERSAO_MINUTOS * CONVERSAO_HORAS * TEMPO_COOKIE_HORAS;
	        if ((currentT - previousT) > timeout) {
	            // session expired
	            SistemaUsuarioLogin.getInstance().efetuaLogout();
	           
	            loggerSecured.registraAcao(Acao.SESSAO_EXPIRADA);
	            
	            return false;
	        }
	    }
	    loggerSecured.registraAcao(Acao.INFO, "PASSOU");
	    return true;
	}	    

}
