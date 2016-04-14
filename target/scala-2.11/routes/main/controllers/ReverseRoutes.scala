
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/CaronaUFCG20152/ProjetoSI1/conf/routes
// @DATE:Thu Apr 14 19:21:16 BRT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseAutenticacaoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def efetuaLogout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:8
    def efetuaLogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "index")
    }
  
    // @LINE:7
    def cadastraUsuario(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cadastroRealizado")
    }
  
  }

  // @LINE:9
  class ReverseCaronasController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def cadastraNovaCarona(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "home")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseHorariosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def cadastraHorarios(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
  }


}
