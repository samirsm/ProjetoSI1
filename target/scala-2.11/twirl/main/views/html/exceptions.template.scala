
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object exceptions_Scope0 {
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

class exceptions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(erro: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/erro),format.raw/*3.6*/("""
"""))
      }
    }
  }

  def render(erro:String): play.twirl.api.HtmlFormat.Appendable = apply(erro)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (erro) => apply(erro)

  def ref: this.type = this

}


}

/**/
object exceptions extends exceptions_Scope0.exceptions
              /*
                  -- GENERATED --
                  DATE: Thu May 12 22:39:54 GMT-03:00 2016
                  SOURCE: C:/Users/Dandara/Desktop/ProjetoSI1/app/views/exceptions.scala.html
                  HASH: 10723a8d7ddba54df4e0fe8f98efeff9b9f210ac
                  MATRIX: 755->1|864->15|894->20|917->24
                  LINES: 27->1|32->1|34->3|34->3
                  -- GENERATED --
              */
          