
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/CaronaUFCG20152/ProjetoSI1/conf/routes
// @DATE:Sun Apr 03 19:03:52 BRT 2016

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
  AutenticacaoController_1: controllers.AutenticacaoController,
  // @LINE:11
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    AutenticacaoController_1: controllers.AutenticacaoController,
    // @LINE:11
    Assets_0: controllers.Assets
  ) = this(errorHandler, AutenticacaoController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AutenticacaoController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.AutenticacaoController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AutenticacaoController.efetuaLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastro""", """controllers.AutenticacaoController.cadastraUsuario"""),
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
    AutenticacaoController_1.index,
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
  private[this] lazy val controllers_AutenticacaoController_efetuaLogin1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AutenticacaoController_efetuaLogin1_invoker = createInvoker(
    AutenticacaoController_1.efetuaLogin,
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

  // @LINE:8
  private[this] lazy val controllers_AutenticacaoController_cadastraUsuario2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastro")))
  )
  private[this] lazy val controllers_AutenticacaoController_cadastraUsuario2_invoker = createInvoker(
    AutenticacaoController_1.cadastraUsuario,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AutenticacaoController",
      "cadastraUsuario",
      Nil,
      "POST",
      """""",
      this.prefix + """cadastro"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_AutenticacaoController_index0_invoker.call(AutenticacaoController_1.index)
      }
  
    // @LINE:7
    case controllers_AutenticacaoController_efetuaLogin1_route(params) =>
      call { 
        controllers_AutenticacaoController_efetuaLogin1_invoker.call(AutenticacaoController_1.efetuaLogin)
      }
  
    // @LINE:8
    case controllers_AutenticacaoController_cadastraUsuario2_route(params) =>
      call { 
        controllers_AutenticacaoController_cadastraUsuario2_invoker.call(AutenticacaoController_1.cadastraUsuario)
      }
  
    // @LINE:11
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
