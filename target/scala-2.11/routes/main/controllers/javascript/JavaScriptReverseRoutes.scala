
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/CaronaUFCG20152/ProjetoSI1/conf/routes
// @DATE:Wed May 11 15:42:29 BRT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:35
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAutenticacaoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def efetuaLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutenticacaoController.efetuaLogout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:7
    def efetuaLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutenticacaoController.efetuaLogin",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
          }
        
        }
      """
    )
  
    // @LINE:6
    def cadastraUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AutenticacaoController.cadastraUsuario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastroRealizado"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseCaronasController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def aceitaPedido: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.aceitaPedido",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aceitaPedido" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:27
    def recusaPedido: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.recusaPedido",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recusaPedido" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:23
    def exibeDetalhes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.exibeDetalhes",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exibeDetalhes" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:24
    def buscarCaronas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.buscarCaronas",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "atualizaCaronas"})
        }
      """
    )
  
    // @LINE:25
    def solicitaCarona: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.solicitaCarona",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitaCarona" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:12
    def cadastraNovaCarona: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.cadastraNovaCarona",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:16
    def exibeCaronasPendentes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CaronasController.exibeCaronasPendentes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pendentes"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseNotificacoesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def leNotificacao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NotificacoesController.leNotificacao",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leNotificacao" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:15
    def exibeSolicitacoes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NotificacoesController.exibeSolicitacoes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "solicitacoes"})
        }
      """
    )
  
    // @LINE:29
    def leTodasNotificacoes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NotificacoesController.leTodasNotificacoes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leTodasNotificacoes"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def editaHorarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.editaHorarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "horarios"})
        }
      """
    )
  
    // @LINE:32
    def redefineIdioma: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.redefineIdioma",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "redefineIdioma" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def exibePerfilUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.exibePerfilUsuario",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "perfil" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseHorariosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def cadastraNovoEndereco: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.cadastraNovoEndereco",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastraNovoEndereco"})
        }
      """
    )
  
    // @LINE:18
    def cadastraHorarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.cadastraHorarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastraHorarios"})
        }
      """
    )
  
    // @LINE:20
    def excluiHorarioIda: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.excluiHorarioIda",
      """
        function(dia0,hora1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "excluiHorarioIda" + _qS([(dia0 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dia", dia0)), (hora1 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("hora", hora1))])})
        }
      """
    )
  
    // @LINE:8
    def cadastra: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.cadastra",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastra"})
        }
      """
    )
  
    // @LINE:19
    def excluiHorarioVolta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HorariosController.excluiHorarioVolta",
      """
        function(dia0,hora1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "excluiHorarioVolta" + _qS([(dia0 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dia", dia0)), (hora1 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("hora", hora1))])})
        }
      """
    )
  
  }


}
