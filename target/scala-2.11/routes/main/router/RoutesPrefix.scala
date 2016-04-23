
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/samirsmedeiros/ProjetoSI1/conf/routes
// @DATE:Fri Apr 22 17:59:19 BRT 2016


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
