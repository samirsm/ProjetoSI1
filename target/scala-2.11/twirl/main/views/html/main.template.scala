
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*9.70*/routes/*9.76*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*9.128*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">

        <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
        <script type="text/javascript" src=""""),_display_(/*13.46*/routes/*13.52*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*13.102*/(""""></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*17.10*/content),format.raw/*17.17*/("""
    """),format.raw/*18.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Feb 24 14:08:14 GMT-03:00 2016
                  SOURCE: C:/Users/Dandara/Desktop/ProjetoSI20152/ProjetoSI1/app/views/main.scala.html
                  HASH: 39144a727adf1dc8783739f0d3674994f655184e
                  MATRIX: 748->1|873->31|903->35|994->100|1019->105|1108->168|1122->174|1184->215|1283->288|1297->294|1370->346|1459->408|1474->414|1535->453|1710->601|1725->607|1797->657|1859->692|1874->698|1936->739|2033->809|2061->816|2094->822
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|44->13|44->13|44->13|45->14|45->14|45->14|48->17|48->17|49->18
                  -- GENERATED --
              */
          