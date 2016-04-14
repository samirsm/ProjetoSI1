
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/CaronaUFCG20152/ProjetoSI1/conf/routes
// @DATE:Thu Apr 14 19:21:16 BRT 2016

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
  HomeController_2: controllers.HomeController,
  // @LINE:7
  AutenticacaoController_3: controllers.AutenticacaoController,
  // @LINE:9
  CaronasController_0: controllers.CaronasController,
  // @LINE:10
  HorariosController_1: controllers.HorariosController,
  // @LINE:16
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:7
    AutenticacaoController_3: controllers.AutenticacaoController,
    // @LINE:9
    CaronasController_0: controllers.CaronasController,
    // @LINE:10
    HorariosController_1: controllers.HorariosController,
    // @LINE:16
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_2, AutenticacaoController_3, CaronasController_0, HorariosController_1, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, AutenticacaoController_3, CaronasController_0, HorariosController_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastroRealizado""", """controllers.AutenticacaoController.cadastraUsuario"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.AutenticacaoController.efetuaLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.CaronasController.cadastraNovaCarona"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HorariosController.cadastraHorarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AutenticacaoController.efetuaLogout"""),
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
    HomeController_2.index,
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
    AutenticacaoController_3.cadastraUsuario,
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
    AutenticacaoController_3.efetuaLogin,
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
  private[this] lazy val controllers_CaronasController_cadastraNovaCarona3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_CaronasController_cadastraNovaCarona3_invoker = createInvoker(
    CaronasController_0.cadastraNovaCarona,
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

  // @LINE:10
  private[this] lazy val controllers_HorariosController_cadastraHorarios4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HorariosController_cadastraHorarios4_invoker = createInvoker(
    HorariosController_1.cadastraHorarios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HorariosController",
      "cadastraHorarios",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout5_invoker = createInvoker(
    AutenticacaoController_3.efetuaLogout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutenticacaoController",
      "efetuaLogout",
      Nil,
      "GET",
      """POST   /uploadFotoUsuario          controllers.AutenticacaoController.uploadFotoUsuario""",
      this.prefix + """logout"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_AutenticacaoController_cadastraUsuario1_route(params) =>
      call { 
        controllers_AutenticacaoController_cadastraUsuario1_invoker.call(AutenticacaoController_3.cadastraUsuario)
      }
  
    // @LINE:8
    case controllers_AutenticacaoController_efetuaLogin2_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogin2_invoker.call(AutenticacaoController_3.efetuaLogin)
      }
  
    // @LINE:9
    case controllers_CaronasController_cadastraNovaCarona3_route(params) =>
      call { 
        controllers_CaronasController_cadastraNovaCarona3_invoker.call(CaronasController_0.cadastraNovaCarona)
      }
  
    // @LINE:10
    case controllers_HorariosController_cadastraHorarios4_route(params) =>
      call { 
        controllers_HorariosController_cadastraHorarios4_invoker.call(HorariosController_1.cadastraHorarios)
      }
  
    // @LINE:12
    case controllers_AutenticacaoController_efetuaLogout5_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogout5_invoker.call(AutenticacaoController_3.efetuaLogout)
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
