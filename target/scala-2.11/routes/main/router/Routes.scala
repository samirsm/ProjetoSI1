
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pedropfo/workspace/ProjetoSI1/conf/routes
// @DATE:Mon May 09 23:14:46 BRT 2016

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
  // @LINE:8
  HorariosController_2: controllers.HorariosController,
  // @LINE:12
  CaronasController_1: controllers.CaronasController,
  // @LINE:14
  NotificacoesController_0: controllers.NotificacoesController,
  // @LINE:34
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_3: controllers.HomeController,
    // @LINE:6
    AutenticacaoController_4: controllers.AutenticacaoController,
    // @LINE:8
    HorariosController_2: controllers.HorariosController,
    // @LINE:12
    CaronasController_1: controllers.CaronasController,
    // @LINE:14
    NotificacoesController_0: controllers.NotificacoesController,
    // @LINE:34
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AutenticacaoController.efetuaLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AutenticacaoController.efetuaLogout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.CaronasController.cadastraNovaCarona"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """horarios""", """controllers.HomeController.editaHorarios()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitacoes""", """controllers.NotificacoesController.exibeSolicitacoes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pendentes""", """controllers.CaronasController.exibeCaronasPendentes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastraHorarios""", """controllers.HorariosController.cadastraHorarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """excluiHorarioVolta""", """controllers.HorariosController.excluiHorarioVolta(dia:String ?= "", hora:Integer ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """excluiHorarioIda""", """controllers.HorariosController.excluiHorarioIda(dia:String ?= "", hora:Integer ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastraNovoEndereco""", """controllers.HorariosController.cadastraNovoEndereco"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exibeDetalhes""", """controllers.CaronasController.exibeDetalhes(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atualizaCaronas""", """controllers.CaronasController.buscarCaronas()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """solicitaCarona""", """controllers.CaronasController.solicitaCarona(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aceitaPedido""", """controllers.CaronasController.aceitaPedido(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recusaPedido""", """controllers.CaronasController.recusaPedido(id:Long)"""),
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
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout5_invoker = createInvoker(
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

  // @LINE:12
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

  // @LINE:13
  private[this] lazy val controllers_HomeController_editaHorarios7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("horarios")))
  )
  private[this] lazy val controllers_HomeController_editaHorarios7_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_NotificacoesController_exibeSolicitacoes8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitacoes")))
  )
  private[this] lazy val controllers_NotificacoesController_exibeSolicitacoes8_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_CaronasController_exibeCaronasPendentes9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pendentes")))
  )
  private[this] lazy val controllers_CaronasController_exibeCaronasPendentes9_invoker = createInvoker(
    CaronasController_1.exibeCaronasPendentes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CaronasController",
      "exibeCaronasPendentes",
      Nil,
      "GET",
      """""",
      this.prefix + """pendentes"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HorariosController_cadastraHorarios10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastraHorarios")))
  )
  private[this] lazy val controllers_HorariosController_cadastraHorarios10_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_HorariosController_excluiHorarioVolta11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("excluiHorarioVolta")))
  )
  private[this] lazy val controllers_HorariosController_excluiHorarioVolta11_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_HorariosController_excluiHorarioIda12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("excluiHorarioIda")))
  )
  private[this] lazy val controllers_HorariosController_excluiHorarioIda12_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_HorariosController_cadastraNovoEndereco13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastraNovoEndereco")))
  )
  private[this] lazy val controllers_HorariosController_cadastraNovoEndereco13_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_CaronasController_exibeDetalhes14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exibeDetalhes")))
  )
  private[this] lazy val controllers_CaronasController_exibeDetalhes14_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_CaronasController_buscarCaronas15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atualizaCaronas")))
  )
  private[this] lazy val controllers_CaronasController_buscarCaronas15_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_CaronasController_solicitaCarona16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("solicitaCarona")))
  )
  private[this] lazy val controllers_CaronasController_solicitaCarona16_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_CaronasController_aceitaPedido17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aceitaPedido")))
  )
  private[this] lazy val controllers_CaronasController_aceitaPedido17_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_CaronasController_recusaPedido18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recusaPedido")))
  )
  private[this] lazy val controllers_CaronasController_recusaPedido18_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_NotificacoesController_leTodasNotificacoes19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leTodasNotificacoes")))
  )
  private[this] lazy val controllers_NotificacoesController_leTodasNotificacoes19_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_NotificacoesController_leNotificacao20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leNotificacao")))
  )
  private[this] lazy val controllers_NotificacoesController_leNotificacao20_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_HomeController_redefineIdioma21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("redefineIdioma")))
  )
  private[this] lazy val controllers_HomeController_redefineIdioma21_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned22_invoker = createInvoker(
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
    case controllers_HorariosController_cadastra3_route(params) =>
      call { 
        controllers_HorariosController_cadastra3_invoker.call(HorariosController_2.cadastra)
      }
  
    // @LINE:9
    case controllers_AutenticacaoController_efetuaLogin4_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogin4_invoker.call(AutenticacaoController_4.efetuaLogin())
      }
  
    // @LINE:10
    case controllers_AutenticacaoController_efetuaLogout5_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogout5_invoker.call(AutenticacaoController_4.efetuaLogout)
      }
  
    // @LINE:12
    case controllers_CaronasController_cadastraNovaCarona6_route(params) =>
      call { 
        controllers_CaronasController_cadastraNovaCarona6_invoker.call(CaronasController_1.cadastraNovaCarona)
      }
  
    // @LINE:13
    case controllers_HomeController_editaHorarios7_route(params) =>
      call { 
        controllers_HomeController_editaHorarios7_invoker.call(HomeController_3.editaHorarios())
      }
  
    // @LINE:14
    case controllers_NotificacoesController_exibeSolicitacoes8_route(params) =>
      call { 
        controllers_NotificacoesController_exibeSolicitacoes8_invoker.call(NotificacoesController_0.exibeSolicitacoes())
      }
  
    // @LINE:15
    case controllers_CaronasController_exibeCaronasPendentes9_route(params) =>
      call { 
        controllers_CaronasController_exibeCaronasPendentes9_invoker.call(CaronasController_1.exibeCaronasPendentes())
      }
  
    // @LINE:17
    case controllers_HorariosController_cadastraHorarios10_route(params) =>
      call { 
        controllers_HorariosController_cadastraHorarios10_invoker.call(HorariosController_2.cadastraHorarios)
      }
  
    // @LINE:18
    case controllers_HorariosController_excluiHorarioVolta11_route(params) =>
      call(params.fromQuery[String]("dia", Some("")), params.fromQuery[Integer]("hora", Some(0))) { (dia, hora) =>
        controllers_HorariosController_excluiHorarioVolta11_invoker.call(HorariosController_2.excluiHorarioVolta(dia, hora))
      }
  
    // @LINE:19
    case controllers_HorariosController_excluiHorarioIda12_route(params) =>
      call(params.fromQuery[String]("dia", Some("")), params.fromQuery[Integer]("hora", Some(0))) { (dia, hora) =>
        controllers_HorariosController_excluiHorarioIda12_invoker.call(HorariosController_2.excluiHorarioIda(dia, hora))
      }
  
    // @LINE:20
    case controllers_HorariosController_cadastraNovoEndereco13_route(params) =>
      call { 
        controllers_HorariosController_cadastraNovoEndereco13_invoker.call(HorariosController_2.cadastraNovoEndereco)
      }
  
    // @LINE:22
    case controllers_CaronasController_exibeDetalhes14_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_exibeDetalhes14_invoker.call(CaronasController_1.exibeDetalhes(id))
      }
  
    // @LINE:23
    case controllers_CaronasController_buscarCaronas15_route(params) =>
      call { 
        controllers_CaronasController_buscarCaronas15_invoker.call(CaronasController_1.buscarCaronas())
      }
  
    // @LINE:24
    case controllers_CaronasController_solicitaCarona16_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_solicitaCarona16_invoker.call(CaronasController_1.solicitaCarona(id))
      }
  
    // @LINE:25
    case controllers_CaronasController_aceitaPedido17_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_aceitaPedido17_invoker.call(CaronasController_1.aceitaPedido(id))
      }
  
    // @LINE:26
    case controllers_CaronasController_recusaPedido18_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CaronasController_recusaPedido18_invoker.call(CaronasController_1.recusaPedido(id))
      }
  
    // @LINE:28
    case controllers_NotificacoesController_leTodasNotificacoes19_route(params) =>
      call { 
        controllers_NotificacoesController_leTodasNotificacoes19_invoker.call(NotificacoesController_0.leTodasNotificacoes())
      }
  
    // @LINE:29
    case controllers_NotificacoesController_leNotificacao20_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_NotificacoesController_leNotificacao20_invoker.call(NotificacoesController_0.leNotificacao(id))
      }
  
    // @LINE:31
    case controllers_HomeController_redefineIdioma21_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_HomeController_redefineIdioma21_invoker.call(HomeController_3.redefineIdioma(id))
      }
  
    // @LINE:34
    case controllers_Assets_versioned22_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned22_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
