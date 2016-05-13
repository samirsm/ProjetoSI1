
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Dandara/Desktop/ProjetoSI1/conf/routes
// @DATE:Thu May 12 22:39:54 GMT-03:00 2016


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
