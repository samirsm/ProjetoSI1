
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/Área de Trabalho/ProjetoSI1/caronaUFCG20152/conf/routes
// @DATE:Wed Mar 30 00:51:29 BRT 2016


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
