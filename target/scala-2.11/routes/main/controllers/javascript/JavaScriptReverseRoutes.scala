
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/samirsmedeiros/ProjetoSI1/conf/routes
// @DATE:Fri Apr 22 17:59:19 BRT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
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

  
    // @LINE:13
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

  // @LINE:10
  class ReverseCaronasController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def solicitaAgendamento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.solicitaAgendamento",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitaCarona" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:19
    def recusaPedido: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.recusaPedido",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recusaPedido" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:14
    def exibeDetalhes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.exibeDetalhes",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exibeDetalhes" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:15
    def buscarCaronas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.buscarCaronas",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "atualizaCaronas"})
        }
      """
    )
  
    // @LINE:10
    def cadastraNovaCarona: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.cadastraNovaCarona",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:18
    def confirmaAgendamento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.confirmaAgendamento",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aceitaPedido" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseNotificacoesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def exibeSolicitacoes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NotificacoesController.exibeSolicitacoes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitacoes"})
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

  // @LINE:9
  class ReverseHorariosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def cadastraNovoEndereco: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.cadastraNovoEndereco",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastraNovoEndereco"})
        }
      """
    )
  
    // @LINE:11
    def cadastraHorarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.cadastraHorarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastraHorarios"})
        }
      """
    )
  
    // @LINE:9
    def cadastra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.cadastra",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastra"})
        }
      """
    )
  
  }


}
