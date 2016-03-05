
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hugo/ProjetoSI1/conf/routes
// @DATE:Wed Mar 02 09:51:03 BRT 2016


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
