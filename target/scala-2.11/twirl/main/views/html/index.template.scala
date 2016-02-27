
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Vumbora - Um sistema de caronas diferenciado")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    """),format.raw/*4.5*/("""<h1> Formulário </h1>

    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.Application.submit(), args = 'class -> "userForm")/*6.84*/ {_display_(Seq[Any](format.raw/*6.86*/("""
        """),_display_(/*7.10*/helper/*7.16*/.input(userForm("email"))/*7.41*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*7.70*/("""
            """),format.raw/*8.13*/("""<input type="email" name=""""),_display_(/*8.40*/name),format.raw/*8.44*/("""" id=""""),_display_(/*8.51*/id),format.raw/*8.53*/("""" class="form-control" placeholder="Digite o e-mail" autofocus """),_display_(/*8.117*/toHtmlArgs(args)),format.raw/*8.133*/(""" """),format.raw/*8.134*/(""">
        """)))}),format.raw/*9.10*/("""

        """),format.raw/*11.9*/("""<label for="password">Senha:</label>
        <input type="password" class="form-control" >

        <br>
        <label for="mobileOS">Sistema Operacional:</label>
        <select class="form-control" id="exampleSelect1">
            <option>Selecione...</option>
            <option>Android</option>
            <option>iOS</option>
            <option>Windows Phone</option>
        </select>

        <br>
        <label for="gender">Gênero:</label>
        <div class="radio">
            <label>
                <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                Masculino
            </label>
        </div>
        <div class="radio">
            <label>
                <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                Feminino
            </label>
        </div>


        <br>
        <input type="submit" class="btn btn-primary" value="Send">
    """)))}),format.raw/*41.6*/("""

    """),format.raw/*43.5*/("""<br>
    <br>
<!-- Exemplo com AngularJS-->
    <div ng-app>
        <h1>Bem-vindo ao Java Play + Bootstrap + AngularJS</h1>
        <form role="form">
            <div class="form-group">
                <label for="sometext">Digite algo:</label>
                <input id="sometext" class="form-control" ng-model="sometext" autofocus>
            </div>
        </form>
        <div class="alert alert-success" ng-show="sometext">
            <strong>Você digitou:</strong> """),format.raw/*55.44*/("""{"""),format.raw/*55.45*/("""{"""),format.raw/*55.46*/(""" """),format.raw/*55.47*/("""sometext """),format.raw/*55.56*/("""}"""),format.raw/*55.57*/("""}"""),format.raw/*55.58*/("""
        """),format.raw/*56.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Feb 24 14:08:13 GMT-03:00 2016
                  SOURCE: C:/Users/Dandara/Desktop/ProjetoSI20152/ProjetoSI1/app/views/index.scala.html
                  HASH: 54f44bbc19b8e8d34767a764726a6af1192459d7
                  MATRIX: 749->1|866->23|896->28|956->80|995->82|1027->88|1082->118|1096->124|1176->196|1215->198|1252->209|1266->215|1299->240|1365->269|1406->283|1459->310|1483->314|1516->321|1538->323|1629->387|1666->403|1695->404|1737->416|1776->428|2791->1413|2826->1421|3342->1909|3371->1910|3400->1911|3429->1912|3466->1921|3495->1922|3524->1923|3561->1933
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|39->8|39->8|39->8|40->9|42->11|72->41|74->43|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56
                  -- GENERATED --
              */
          