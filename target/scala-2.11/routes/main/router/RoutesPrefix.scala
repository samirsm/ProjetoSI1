
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Dandara/Desktop/ProjetoSI20152/ProjetoSI1/conf/routes
// @DATE:Wed Feb 24 14:08:13 GMT-03:00 2016


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
