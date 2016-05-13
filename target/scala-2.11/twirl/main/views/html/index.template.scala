
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.34*/("""

"""),format.raw/*11.4*/("""

    """),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""<head>
     <link rel="icon" type="img/ico" href="assets/SBAdminTemplate/img/favicon.ico">
     <title>"""),_display_(/*19.14*/message),format.raw/*19.21*/("""</title>
   </head>
   
   <body>
     """),_display_(/*23.7*/content),format.raw/*23.14*/("""
   """),format.raw/*24.4*/("""</body>
"""))
      }
    }
  }

  def render(message:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(message)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (message) => (content) => apply(message)(content)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu May 12 22:39:54 GMT-03:00 2016
                  SOURCE: C:/Users/Dandara/Desktop/ProjetoSI1/app/views/index.scala.html
                  HASH: 14dd7b956944ba25fdedcda5f872355b7c13ad28
                  MATRIX: 842->99|969->131|1000->337|1035->471|1068->477|1201->583|1229->590|1299->634|1327->641|1359->646
                  LINES: 30->5|35->5|37->11|39->16|40->17|42->19|42->19|46->23|46->23|47->24
                  -- GENERATED --
              */
          