
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hugo/Documentos/Projeto-Vumbora/ProjetoSI1/conf/routes
// @DATE:Wed May 11 20:34:04 BRT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAutenticacaoController AutenticacaoController = new controllers.ReverseAutenticacaoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCaronasController CaronasController = new controllers.ReverseCaronasController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseNotificacoesController NotificacoesController = new controllers.ReverseNotificacoesController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHorariosController HorariosController = new controllers.ReverseHorariosController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAutenticacaoController AutenticacaoController = new controllers.javascript.ReverseAutenticacaoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCaronasController CaronasController = new controllers.javascript.ReverseCaronasController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseNotificacoesController NotificacoesController = new controllers.javascript.ReverseNotificacoesController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHorariosController HorariosController = new controllers.javascript.ReverseHorariosController(RoutesPrefix.byNamePrefix());
  }

}
