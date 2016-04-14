
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/CaronaUFCG20152/ProjetoSI1/conf/routes
// @DATE:Thu Apr 14 19:21:16 BRT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAutenticacaoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def efetuaLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutenticacaoController.efetuaLogout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:8
    def efetuaLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutenticacaoController.efetuaLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
        }
      """
    )
  
    // @LINE:7
    def cadastraUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutenticacaoController.cadastraUsuario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastroRealizado"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseCaronasController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def cadastraNovaCarona: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.cadastraNovaCarona",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseHorariosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def cadastraHorarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.cadastraHorarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
  }


}
