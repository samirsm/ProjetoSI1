
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hugo/Documentos/Projeto-Vumbora/ProjetoSI1/conf/routes
// @DATE:Sat May 14 01:40:00 BRT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
