
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pedropfo/workspace/ProjetoSI1/conf/routes
// @DATE:Wed May 11 02:05:06 BRT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:35
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseAutenticacaoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def efetuaLogout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:7
    def efetuaLogin(): Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "index")
      
      }
    
    }
  
    // @LINE:6
    def cadastraUsuario(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cadastroRealizado")
    }
  
  }

  // @LINE:12
  class ReverseCaronasController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def aceitaPedido(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "aceitaPedido" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:27
    def recusaPedido(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recusaPedido" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:23
    def exibeDetalhes(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "exibeDetalhes" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:24
    def buscarCaronas(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "atualizaCaronas")
    }
  
    // @LINE:25
    def solicitaCarona(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "solicitaCarona" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:12
    def cadastraNovaCarona(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:16
    def exibeCaronasPendentes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pendentes")
    }
  
  }

  // @LINE:15
  class ReverseNotificacoesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def leNotificacao(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "leNotificacao" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:15
    def exibeSolicitacoes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "solicitacoes")
    }
  
    // @LINE:29
    def leTodasNotificacoes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "leTodasNotificacoes")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def editaHorarios(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "horarios")
    }
  
    // @LINE:32
    def redefineIdioma(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "redefineIdioma" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:5
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def exibePerfilUsuario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "perfil" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
  }

  // @LINE:8
  class ReverseHorariosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def cadastraNovoEndereco(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cadastraNovoEndereco")
    }
  
    // @LINE:18
    def cadastraHorarios(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cadastraHorarios")
    }
  
    // @LINE:20
    def excluiHorarioIda(dia:String = "", hora:Integer = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "excluiHorarioIda" + queryString(List(if(dia == "") None else Some(implicitly[QueryStringBindable[String]].unbind("dia", dia)), if(hora == 0) None else Some(implicitly[QueryStringBindable[Integer]].unbind("hora", hora)))))
    }
  
    // @LINE:8
    def cadastra(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cadastra")
    }
  
    // @LINE:19
    def excluiHorarioVolta(dia:String = "", hora:Integer = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "excluiHorarioVolta" + queryString(List(if(dia == "") None else Some(implicitly[QueryStringBindable[String]].unbind("dia", dia)), if(hora == 0) None else Some(implicitly[QueryStringBindable[Integer]].unbind("hora", hora)))))
    }
  
  }


}
