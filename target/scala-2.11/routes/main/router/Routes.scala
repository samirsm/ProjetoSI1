
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pedropfo/workspace/ProjetoSI1/conf/routes
// @DATE:Mon May 09 22:27:57 BRT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_3: controllers.HomeController,
  // @LINE:6
  AutenticacaoController_4: controllers.AutenticacaoController,
  // @LINE:10
  HorariosController_2: controllers.HorariosController,
  // @LINE:11
  CaronasController_1: controllers.CaronasController,
  // @LINE:18
  NotificacoesController_0: controllers.NotificacoesController,
  // @LINE:30
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_3: controllers.HomeController,
    // @LINE:6
    AutenticacaoController_4: controllers.AutenticacaoController,
    // @LINE:10
    HorariosController_2: controllers.HorariosController,
    // @LINE:11
    CaronasController_1: controllers.CaronasController,
    // @LINE:18
    NotificacoesController_0: controllers.NotificacoesController,
    // @LINE:30
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """horarios""", """controllers.HomeController.editaHorarios()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AutenticacaoController.efetuaLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastra""", """controllers.HorariosController.cadastra"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.CaronasController.cadastraNovaCarona"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastraHorarios""", """controllers.HorariosController.cadastraHorarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastraNovoEndereco""", """controllers.HorariosController.cadastraNovoEndereco"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AutenticacaoController.efetuaLogout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exibeDetalhes""", """controllers.CaronasController.exibeDetalhes(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizaCaronas""", """controllers.CaronasController.buscarCaronas()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitaCarona""", """controllers.CaronasController.solicitaCarona(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitacoes""", """controllers.NotificacoesController.exibeSolicitacoes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aceitaPedido""", """controllers.CaronasController.aceitaPedido(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recusaPedido""", """controllers.CaronasController.recusaPedido(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """excluiHorarioVolta""", """controllers.HorariosController.excluiHorarioVolta(dia:String ?= "", hora:Integer ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """excluiHorarioIda""", """controllers.HorariosController.excluiHorarioIda(dia:String ?= "", hora:Integer ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """leTodasNotificacoes""", """controllers.NotificacoesController.leTodasNotificacoes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """leNotificacao""", """controllers.NotificacoesController.leNotificacao(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """redefineIdioma""", """controllers.HomeController.redefineIdioma(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
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

  // @LINE:6
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

  // @LINE:7
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

  // @LINE:8
  private[this] lazy val controllers_HomeController_editaHorarios3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("horarios")))
  )
  private[this] lazy val controllers_HomeController_editaHorarios3_invoker = createInvoker(
    HomeController_3.editaHorarios(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editaHorarios",
      Nil,
      "GET",
      """""",
      this.prefix + """horarios"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AutenticacaoController_efetuaLogin4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogin4_invoker = createInvoker(
    AutenticacaoController_4.efetuaLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutenticacaoController",
      "efetuaLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HorariosController_cadastra5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastra")))
  )
  private[this] lazy val controllers_HorariosController_cadastra5_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_CaronasController_cadastraNovaCarona6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_CaronasController_cadastraNovaCarona6_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_HorariosController_cadastraHorarios7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastraHorarios")))
  )
  private[this] lazy val controllers_HorariosController_cadastraHorarios7_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_HorariosController_cadastraNovoEndereco8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastraNovoEndereco")))
  )
  private[this] lazy val controllers_HorariosController_cadastraNovoEndereco8_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout9_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_CaronasController_exibeDetalhes10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exibeDetalhes")))
  )
  private[this] lazy val controllers_CaronasController_exibeDetalhes10_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_CaronasController_buscarCaronas11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizaCaronas")))
  )
  private[this] lazy val controllers_CaronasController_buscarCaronas11_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_CaronasController_solicitaCarona12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitaCarona")))
  )
  private[this] lazy val controllers_CaronasController_solicitaCarona12_invoker = createInvoker(
    CaronasController_1.solicitaCarona(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "solicitaCarona",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """solicitaCarona"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_NotificacoesController_exibeSolicitacoes13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitacoes")))
  )
  private[this] lazy val controllers_NotificacoesController_exibeSolicitacoes13_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_CaronasController_aceitaPedido14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aceitaPedido")))
  )
  private[this] lazy val controllers_CaronasController_aceitaPedido14_invoker = createInvoker(
    CaronasController_1.aceitaPedido(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "aceitaPedido",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """aceitaPedido"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CaronasController_recusaPedido15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recusaPedido")))
  )
  private[this] lazy val controllers_CaronasController_recusaPedido15_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_HorariosController_excluiHorarioVolta16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("excluiHorarioVolta")))
  )
  private[this] lazy val controllers_HorariosController_excluiHorarioVolta16_invoker = createInvoker(
    HorariosController_2.excluiHorarioVolta(fakeValue[String], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HorariosController",
      "excluiHorarioVolta",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """excluiHorarioVolta"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HorariosController_excluiHorarioIda17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("excluiHorarioIda")))
  )
  private[this] lazy val controllers_HorariosController_excluiHorarioIda17_invoker = createInvoker(
    HorariosController_2.excluiHorarioIda(fakeValue[String], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HorariosController",
      "excluiHorarioIda",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """excluiHorarioIda"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_NotificacoesController_leTodasNotificacoes18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leTodasNotificacoes")))
  )
  private[this] lazy val controllers_NotificacoesController_leTodasNotificacoes18_invoker = createInvoker(
    NotificacoesController_0.leTodasNotificacoes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NotificacoesController",
      "leTodasNotificacoes",
      Nil,
      "GET",
      """""",
      this.prefix + """leTodasNotificacoes"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_NotificacoesController_leNotificacao19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leNotificacao")))
  )
  private[this] lazy val controllers_NotificacoesController_leNotificacao19_invoker = createInvoker(
    NotificacoesController_0.leNotificacao(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NotificacoesController",
      "leNotificacao",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """leNotificacao"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_redefineIdioma20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("redefineIdioma")))
  )
  private[this] lazy val controllers_HomeController_redefineIdioma20_invoker = createInvoker(
    HomeController_3.redefineIdioma(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "redefineIdioma",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """redefineIdioma"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
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
  
    // @LINE:5
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:6
    case controllers_AutenticacaoController_cadastraUsuario1_route(params) =>
      call { 
        controllers_AutenticacaoController_cadastraUsuario1_invoker.call(AutenticacaoController_4.cadastraUsuario)
      }
  
    // @LINE:7
    case controllers_AutenticacaoController_efetuaLogin2_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogin2_invoker.call(AutenticacaoController_4.efetuaLogin)
      }
  
    // @LINE:8
    case controllers_HomeController_editaHorarios3_route(params) =>
      call { 
        controllers_HomeController_editaHorarios3_invoker.call(HomeController_3.editaHorarios())
      }
  
    // @LINE:9
    case controllers_AutenticacaoController_efetuaLogin4_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogin4_invoker.call(AutenticacaoController_4.efetuaLogin())
      }
  
    // @LINE:10
    case controllers_HorariosController_cadastra5_route(params) =>
      call { 
        controllers_HorariosController_cadastra5_invoker.call(HorariosController_2.cadastra)
      }
  
    // @LINE:11
    case controllers_CaronasController_cadastraNovaCarona6_route(params) =>
      call { 
        controllers_CaronasController_cadastraNovaCarona6_invoker.call(CaronasController_1.cadastraNovaCarona)
      }
  
    // @LINE:12
    case controllers_HorariosController_cadastraHorarios7_route(params) =>
      call { 
        controllers_HorariosController_cadastraHorarios7_invoker.call(HorariosController_2.cadastraHorarios)
      }
  
    // @LINE:13
    case controllers_HorariosController_cadastraNovoEndereco8_route(params) =>
      call { 
        controllers_HorariosController_cadastraNovoEndereco8_invoker.call(HorariosController_2.cadastraNovoEndereco)
      }
  
    // @LINE:14
    case controllers_AutenticacaoController_efetuaLogout9_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogout9_invoker.call(AutenticacaoController_4.efetuaLogout)
      }
  
    // @LINE:15
    case controllers_CaronasController_exibeDetalhes10_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_exibeDetalhes10_invoker.call(CaronasController_1.exibeDetalhes(id))
      }
  
    // @LINE:16
    case controllers_CaronasController_buscarCaronas11_route(params) =>
      call { 
        controllers_CaronasController_buscarCaronas11_invoker.call(CaronasController_1.buscarCaronas())
      }
  
    // @LINE:17
    case controllers_CaronasController_solicitaCarona12_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_solicitaCarona12_invoker.call(CaronasController_1.solicitaCarona(id))
      }
  
    // @LINE:18
    case controllers_NotificacoesController_exibeSolicitacoes13_route(params) =>
      call { 
        controllers_NotificacoesController_exibeSolicitacoes13_invoker.call(NotificacoesController_0.exibeSolicitacoes())
      }
  
    // @LINE:19
    case controllers_CaronasController_aceitaPedido14_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_aceitaPedido14_invoker.call(CaronasController_1.aceitaPedido(id))
      }
  
    // @LINE:20
    case controllers_CaronasController_recusaPedido15_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_recusaPedido15_invoker.call(CaronasController_1.recusaPedido(id))
      }
  
    // @LINE:21
    case controllers_HorariosController_excluiHorarioVolta16_route(params) =>
      call(params.fromQuery[String]("dia", Some("")), params.fromQuery[Integer]("hora", Some(0))) { (dia, hora) =>
        controllers_HorariosController_excluiHorarioVolta16_invoker.call(HorariosController_2.excluiHorarioVolta(dia, hora))
      }
  
    // @LINE:22
    case controllers_HorariosController_excluiHorarioIda17_route(params) =>
      call(params.fromQuery[String]("dia", Some("")), params.fromQuery[Integer]("hora", Some(0))) { (dia, hora) =>
        controllers_HorariosController_excluiHorarioIda17_invoker.call(HorariosController_2.excluiHorarioIda(dia, hora))
      }
  
    // @LINE:23
    case controllers_NotificacoesController_leTodasNotificacoes18_route(params) =>
      call { 
        controllers_NotificacoesController_leTodasNotificacoes18_invoker.call(NotificacoesController_0.leTodasNotificacoes())
      }
  
    // @LINE:24
    case controllers_NotificacoesController_leNotificacao19_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_NotificacoesController_leNotificacao19_invoker.call(NotificacoesController_0.leNotificacao(id))
      }
  
    // @LINE:27
    case controllers_HomeController_redefineIdioma20_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_HomeController_redefineIdioma20_invoker.call(HomeController_3.redefineIdioma(id))
      }
  
    // @LINE:30
    case controllers_Assets_versioned21_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
