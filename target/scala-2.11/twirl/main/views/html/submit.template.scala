
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object submit_Scope0 {
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

class submit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(created: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/main(s"Tutorial")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h1>Bem-vindo """),_display_(/*4.20*/created/*4.27*/.email),format.raw/*4.33*/("""</h1>
""")))}))
      }
    }
  }

  def render(created:User): play.twirl.api.HtmlFormat.Appendable = apply(created)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (created) => apply(created)

  def ref: this.type = this

}


}

/**/
object submit extends submit_Scope0.submit
              /*
                  -- GENERATED --
                  DATE: Sun Feb 21 14:38:14 BRT 2016
                  SOURCE: /home/paulovss/CaronaUFCG20152/app/views/submit.scala.html
                  HASH: 9c58bb9daa639ab7d487b445d182e58e4262be94
                  MATRIX: 745->1|855->16|885->21|910->38|949->40|981->46|1022->61|1037->68|1063->74
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4
                  -- GENERATED --
              */
          