
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulovss/CaronaUFCG20152/ProjetoSI1/conf/routes
// @DATE:Thu Apr 14 19:21:16 BRT 2016


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
