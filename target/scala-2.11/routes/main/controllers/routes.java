
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/Área de Trabalho/ProjetoSI1/caronaUFCG20152/conf/routes
// @DATE:Wed Mar 30 00:51:29 BRT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAutenticacaoController AutenticacaoController = new controllers.ReverseAutenticacaoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAutenticacaoController AutenticacaoController = new controllers.javascript.ReverseAutenticacaoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
