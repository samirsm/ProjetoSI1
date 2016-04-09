
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/CaronaUFCG20152/ProjetoSI1/conf/routes
// @DATE:Sat Apr 09 00:50:08 BRT 2016

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
  AutenticacaoController_2: controllers.AutenticacaoController,
  // @LINE:7
  HorariosController_0: controllers.HorariosController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    AutenticacaoController_2: controllers.AutenticacaoController,
    // @LINE:7
    HorariosController_0: controllers.HorariosController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, AutenticacaoController_2, HorariosController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AutenticacaoController_2, HorariosController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.AutenticacaoController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HorariosController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastroRealizado""", """controllers.AutenticacaoController.cadastraUsuario"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastroHorarios""", """controllers.AutenticacaoController.efetuaLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AutenticacaoController.efetuaLogout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_AutenticacaoController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_AutenticacaoController_index0_invoker = createInvoker(
    AutenticacaoController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutenticacaoController",
      "index",
      Nil,
      "GET",
      """ Faz a chamada do Index de Autenticacao do Usuario""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HorariosController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HorariosController_index1_invoker = createInvoker(
    HorariosController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HorariosController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AutenticacaoController_cadastraUsuario2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastroRealizado")))
  )
  private[this] lazy val controllers_AutenticacaoController_cadastraUsuario2_invoker = createInvoker(
    AutenticacaoController_2.cadastraUsuario,
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

  // @LINE:9
  private[this] lazy val controllers_AutenticacaoController_efetuaLogin3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastroHorarios")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogin3_invoker = createInvoker(
    AutenticacaoController_2.efetuaLogin,
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

  // @LINE:11
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogout4_invoker = createInvoker(
    AutenticacaoController_2.efetuaLogout,
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
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_AutenticacaoController_index0_route(params) =>
      call { 
        controllers_AutenticacaoController_index0_invoker.call(AutenticacaoController_2.index)
      }
  
    // @LINE:7
    case controllers_HorariosController_index1_route(params) =>
      call { 
        controllers_HorariosController_index1_invoker.call(HorariosController_0.index)
      }
  
    // @LINE:8
    case controllers_AutenticacaoController_cadastraUsuario2_route(params) =>
      call { 
        controllers_AutenticacaoController_cadastraUsuario2_invoker.call(AutenticacaoController_2.cadastraUsuario)
      }
  
    // @LINE:9
    case controllers_AutenticacaoController_efetuaLogin3_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogin3_invoker.call(AutenticacaoController_2.efetuaLogin)
      }
  
    // @LINE:11
    case controllers_AutenticacaoController_efetuaLogout4_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogout4_invoker.call(AutenticacaoController_2.efetuaLogout)
      }
  
    // @LINE:15
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
