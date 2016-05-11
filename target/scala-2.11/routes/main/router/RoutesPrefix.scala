
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pedropfo/workspace/ProjetoSI1/conf/routes
// @DATE:Wed May 11 02:05:06 BRT 2016


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
