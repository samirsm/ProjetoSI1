
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/CaronaUFCG20152/ProjetoSI1/conf/routes
// @DATE:Sat Apr 09 02:44:46 BRT 2016

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
  HomeController_1: controllers.HomeController,
  // @LINE:7
  AutenticacaoController_3: controllers.AutenticacaoController,
  // @LINE:9
  HorariosController_0: controllers.HorariosController,
  // @LINE:15
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:7
    AutenticacaoController_3: controllers.AutenticacaoController,
    // @LINE:9
    HorariosController_0: controllers.HorariosController,
    // @LINE:15
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_1, AutenticacaoController_3, HorariosController_0, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, AutenticacaoController_3, HorariosController_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastroRealizado""", """controllers.AutenticacaoController.cadastraUsuario"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastroHorarios""", """controllers.AutenticacaoController.efetuaLogin"""),
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
    HomeController_1.index,
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastroHorarios")))
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
      this.prefix + """cadastroHorarios"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HorariosController_cadastraHorarios3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HorariosController_cadastraHorarios3_invoker = createInvoker(
    HorariosController_0.cadastraHorarios,
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

  // @LINE:11
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout4_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
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
    case controllers_HorariosController_cadastraHorarios3_route(params) =>
      call { 
        controllers_HorariosController_cadastraHorarios3_invoker.call(HorariosController_0.cadastraHorarios)
      }
  
    // @LINE:11
    case controllers_AutenticacaoController_efetuaLogout4_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogout4_invoker.call(AutenticacaoController_3.efetuaLogout)
      }
  
    // @LINE:15
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
