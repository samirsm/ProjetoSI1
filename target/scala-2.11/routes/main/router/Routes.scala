
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pedropfo/workspace/ProjetoSI1/conf/routes
// @DATE:Thu May 05 02:30:48 BRT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:7
  AutenticacaoController_4: controllers.AutenticacaoController,
  // @LINE:9
  HorariosController_2: controllers.HorariosController,
  // @LINE:10
  CaronasController_1: controllers.CaronasController,
  // @LINE:17
  NotificacoesController_0: controllers.NotificacoesController,
  // @LINE:23
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:7
    AutenticacaoController_4: controllers.AutenticacaoController,
    // @LINE:9
    HorariosController_2: controllers.HorariosController,
    // @LINE:10
    CaronasController_1: controllers.CaronasController,
    // @LINE:17
    NotificacoesController_0: controllers.NotificacoesController,
    // @LINE:23
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_3, AutenticacaoController_4, HorariosController_2, CaronasController_1, NotificacoesController_0, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, AutenticacaoController_4, HorariosController_2, CaronasController_1, NotificacoesController_0, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastroRealizado""", """controllers.AutenticacaoController.cadastraUsuario"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.AutenticacaoController.efetuaLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastra""", """controllers.HorariosController.cadastra"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.CaronasController.cadastraNovaCarona"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastraHorarios""", """controllers.HorariosController.cadastraHorarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastraNovoEndereco""", """controllers.HorariosController.cadastraNovoEndereco"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AutenticacaoController.efetuaLogout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exibeDetalhes""", """controllers.CaronasController.exibeDetalhes(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizaCaronas""", """controllers.CaronasController.buscarCaronas()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitaCarona""", """controllers.CaronasController.solicitaAgendamento(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitacoes""", """controllers.NotificacoesController.exibeSolicitacoes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aceitaPedido""", """controllers.CaronasController.confirmaAgendamento(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recusaPedido""", """controllers.CaronasController.recusaPedido(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """redefineIdioma""", """controllers.HomeController.redefineIdioma"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ Faz a chamada do Index de Autenticacao do Usuario""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AutenticacaoController_cadastraUsuario1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastroRealizado")))
  )
  private[this] lazy val controllers_AutenticacaoController_cadastraUsuario1_invoker = createInvoker(
    AutenticacaoController_4.cadastraUsuario,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutenticacaoController",
      "cadastraUsuario",
      Nil,
      "POST",
      """""",
      this.prefix + """cadastroRealizado"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AutenticacaoController_efetuaLogin2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogin2_invoker = createInvoker(
    AutenticacaoController_4.efetuaLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutenticacaoController",
      "efetuaLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """index"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HorariosController_cadastra3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastra")))
  )
  private[this] lazy val controllers_HorariosController_cadastra3_invoker = createInvoker(
    HorariosController_2.cadastra,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HorariosController",
      "cadastra",
      Nil,
      "POST",
      """""",
      this.prefix + """cadastra"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_CaronasController_cadastraNovaCarona4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_CaronasController_cadastraNovaCarona4_invoker = createInvoker(
    CaronasController_1.cadastraNovaCarona,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "cadastraNovaCarona",
      Nil,
      "POST",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HorariosController_cadastraHorarios5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastraHorarios")))
  )
  private[this] lazy val controllers_HorariosController_cadastraHorarios5_invoker = createInvoker(
    HorariosController_2.cadastraHorarios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HorariosController",
      "cadastraHorarios",
      Nil,
      "GET",
      """""",
      this.prefix + """cadastraHorarios"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HorariosController_cadastraNovoEndereco6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastraNovoEndereco")))
  )
  private[this] lazy val controllers_HorariosController_cadastraNovoEndereco6_invoker = createInvoker(
    HorariosController_2.cadastraNovoEndereco,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HorariosController",
      "cadastraNovoEndereco",
      Nil,
      "GET",
      """""",
      this.prefix + """cadastraNovoEndereco"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout7_invoker = createInvoker(
    AutenticacaoController_4.efetuaLogout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutenticacaoController",
      "efetuaLogout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CaronasController_exibeDetalhes8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exibeDetalhes")))
  )
  private[this] lazy val controllers_CaronasController_exibeDetalhes8_invoker = createInvoker(
    CaronasController_1.exibeDetalhes(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "exibeDetalhes",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """exibeDetalhes"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CaronasController_buscarCaronas9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizaCaronas")))
  )
  private[this] lazy val controllers_CaronasController_buscarCaronas9_invoker = createInvoker(
    CaronasController_1.buscarCaronas(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "buscarCaronas",
      Nil,
      "POST",
      """""",
      this.prefix + """atualizaCaronas"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CaronasController_solicitaAgendamento10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitaCarona")))
  )
  private[this] lazy val controllers_CaronasController_solicitaAgendamento10_invoker = createInvoker(
    CaronasController_1.solicitaAgendamento(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "solicitaAgendamento",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """solicitaCarona"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_NotificacoesController_exibeSolicitacoes11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitacoes")))
  )
  private[this] lazy val controllers_NotificacoesController_exibeSolicitacoes11_invoker = createInvoker(
    NotificacoesController_0.exibeSolicitacoes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NotificacoesController",
      "exibeSolicitacoes",
      Nil,
      "GET",
      """""",
      this.prefix + """solicitacoes"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CaronasController_confirmaAgendamento12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aceitaPedido")))
  )
  private[this] lazy val controllers_CaronasController_confirmaAgendamento12_invoker = createInvoker(
    CaronasController_1.confirmaAgendamento(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "confirmaAgendamento",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """aceitaPedido"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CaronasController_recusaPedido13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recusaPedido")))
  )
  private[this] lazy val controllers_CaronasController_recusaPedido13_invoker = createInvoker(
    CaronasController_1.recusaPedido(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "recusaPedido",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """recusaPedido"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_redefineIdioma14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("redefineIdioma")))
  )
  private[this] lazy val controllers_HomeController_redefineIdioma14_invoker = createInvoker(
    HomeController_3.redefineIdioma,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "redefineIdioma",
      Nil,
      "GET",
      """""",
      this.prefix + """redefineIdioma"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:7
    case controllers_AutenticacaoController_cadastraUsuario1_route(params) =>
      call { 
        controllers_AutenticacaoController_cadastraUsuario1_invoker.call(AutenticacaoController_4.cadastraUsuario)
      }
  
    // @LINE:8
    case controllers_AutenticacaoController_efetuaLogin2_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogin2_invoker.call(AutenticacaoController_4.efetuaLogin)
      }
  
    // @LINE:9
    case controllers_HorariosController_cadastra3_route(params) =>
      call { 
        controllers_HorariosController_cadastra3_invoker.call(HorariosController_2.cadastra)
      }
  
    // @LINE:10
    case controllers_CaronasController_cadastraNovaCarona4_route(params) =>
      call { 
        controllers_CaronasController_cadastraNovaCarona4_invoker.call(CaronasController_1.cadastraNovaCarona)
      }
  
    // @LINE:11
    case controllers_HorariosController_cadastraHorarios5_route(params) =>
      call { 
        controllers_HorariosController_cadastraHorarios5_invoker.call(HorariosController_2.cadastraHorarios)
      }
  
    // @LINE:12
    case controllers_HorariosController_cadastraNovoEndereco6_route(params) =>
      call { 
        controllers_HorariosController_cadastraNovoEndereco6_invoker.call(HorariosController_2.cadastraNovoEndereco)
      }
  
    // @LINE:13
    case controllers_AutenticacaoController_efetuaLogout7_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogout7_invoker.call(AutenticacaoController_4.efetuaLogout)
      }
  
    // @LINE:14
    case controllers_CaronasController_exibeDetalhes8_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_exibeDetalhes8_invoker.call(CaronasController_1.exibeDetalhes(id))
      }
  
    // @LINE:15
    case controllers_CaronasController_buscarCaronas9_route(params) =>
      call { 
        controllers_CaronasController_buscarCaronas9_invoker.call(CaronasController_1.buscarCaronas())
      }
  
    // @LINE:16
    case controllers_CaronasController_solicitaAgendamento10_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_solicitaAgendamento10_invoker.call(CaronasController_1.solicitaAgendamento(id))
      }
  
    // @LINE:17
    case controllers_NotificacoesController_exibeSolicitacoes11_route(params) =>
      call { 
        controllers_NotificacoesController_exibeSolicitacoes11_invoker.call(NotificacoesController_0.exibeSolicitacoes())
      }
  
    // @LINE:18
    case controllers_CaronasController_confirmaAgendamento12_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_confirmaAgendamento12_invoker.call(CaronasController_1.confirmaAgendamento(id))
      }
  
    // @LINE:19
    case controllers_CaronasController_recusaPedido13_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_recusaPedido13_invoker.call(CaronasController_1.recusaPedido(id))
      }
  
    // @LINE:20
    case controllers_HomeController_redefineIdioma14_route(params) =>
      call { 
        controllers_HomeController_redefineIdioma14_invoker.call(HomeController_3.redefineIdioma)
      }
  
    // @LINE:23
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
