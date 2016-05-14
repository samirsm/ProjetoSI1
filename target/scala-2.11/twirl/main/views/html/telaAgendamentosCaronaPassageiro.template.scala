
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object telaAgendamentosCaronaPassageiro_Scope0 {
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

class telaAgendamentosCaronaPassageiro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Usuario,List[Carona],List[Notificacao],Carona,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioLogado: Usuario, caronasOfertadas: List[Carona], notificacoes: List[Notificacao], carona: Carona):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.107*/("""

"""),_display_(/*3.2*/main(usuarioLogado, caronasOfertadas, notificacoes, "Agendamento de carona")/*3.78*/{_display_(Seq[Any](format.raw/*3.79*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
</head>

<body>
  <div id="wrapper">
        <div id="page-wrapper">

            <div class="container-fluid" style="background-color: #696969;">
				<div class="row-xs-12">
                <!-- Page Heading -->
                <!-- /.row -->


               <!-- /.row -->


                <!-- /.row -->

                                <!-- /.row -->

                 <div style="text-align: center; color: #FFF; font-family: 'Calibri Light';" >

                <div style="font-size: 36px;"><p style="font-size: 34px;"><br>"""),_display_(/*30.80*/Messages("agendamento.marcar")),format.raw/*30.110*/(""" """),_display_(/*30.112*/carona/*30.118*/.getUsuario().getNome()),format.raw/*30.141*/("""<br><br></p></div>

                <p><img src="assets/SBAdminTemplate/img/trajeto carona ilustracao.png" width="500" height="95"  alt=""/></p>

                <p style="font-size: 18px;"><b>"""),_display_(/*34.49*/Messages("agendamento.tipo")),format.raw/*34.77*/(""" """),format.raw/*34.78*/("""</b>"""),_display_(/*34.83*/carona/*34.89*/.getTipo()),format.raw/*34.99*/("""</p>
                <p style="font-size: 18px;"><b>"""),_display_(/*35.49*/Messages("agendamento.dia")),format.raw/*35.76*/(""" """),format.raw/*35.77*/("""</b>"""),_display_(/*35.82*/carona/*35.88*/.getHorario().getDia()),format.raw/*35.110*/("""</p>
                <p style="font-size: 18px;"><b>"""),_display_(/*36.49*/Messages("agendamento.hora")),format.raw/*36.77*/(""" """),format.raw/*36.78*/("""</b>"""),_display_(/*36.83*/carona/*36.89*/.getHorario().getHora()),format.raw/*36.112*/("""</p>
                <p style="font-size: 18px;"><b>"""),_display_(/*37.49*/Messages("global.vagas")),format.raw/*37.73*/(""": </b>"""),_display_(/*37.80*/carona/*37.86*/.getVagasDisponiveis()),format.raw/*37.108*/("""</p>

                <td colspan="3" style="font-family: 'Calibri Light'">&nbsp;</td>
                <td align="rigth"><a href="/" class="btn btn-warning btn-l" style="float: center; font-size: 22px;												font-family: 'Calibri Light';"><b>"""),_display_(/*40.162*/Messages("agendamento.voltar")),format.raw/*40.192*/("""</a> </td><td></td>
                <td align="rigth"><a href="solicitaCarona?id="""),_display_(/*41.63*/carona/*41.69*/.getId()),format.raw/*41.77*/("""" class="btn btn-warning btn'l" style="float: center; font-size: 22px; font-family: 'Calibri Light';"><b>"""),_display_(/*41.183*/Messages("agendamento.solicitar")),format.raw/*41.216*/("""</a>
                <p>&nbsp;</p></td>
                </div>
                <!-- /.row -->

                <!-- /.row -->
				</div>
            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->
      </div>
      <!-- /wrapper -->
</body>
</html>

""")))}),format.raw/*58.2*/("""
"""))
      }
    }
  }

  def render(usuarioLogado:Usuario,caronasOfertadas:List[Carona],notificacoes:List[Notificacao],carona:Carona): play.twirl.api.HtmlFormat.Appendable = apply(usuarioLogado,caronasOfertadas,notificacoes,carona)

  def f:((Usuario,List[Carona],List[Notificacao],Carona) => play.twirl.api.HtmlFormat.Appendable) = (usuarioLogado,caronasOfertadas,notificacoes,carona) => apply(usuarioLogado,caronasOfertadas,notificacoes,carona)

  def ref: this.type = this

}


}

/**/
object telaAgendamentosCaronaPassageiro extends telaAgendamentosCaronaPassageiro_Scope0.telaAgendamentosCaronaPassageiro
              /*
                  -- GENERATED --
                  DATE: Sat May 14 01:47:25 BRT 2016
                  SOURCE: /home/hugo/Documentos/Projeto-Vumbora/ProjetoSI1/app/views/telaAgendamentosCaronaPassageiro.scala.html
                  HASH: 26b405e86b58c7f90915307dd60167f51badf07b
                  MATRIX: 838->1|1039->106|1067->109|1151->185|1189->186|1217->188|1818->762|1870->792|1900->794|1916->800|1961->823|2182->1017|2231->1045|2260->1046|2292->1051|2307->1057|2338->1067|2418->1120|2466->1147|2495->1148|2527->1153|2542->1159|2586->1181|2666->1234|2715->1262|2744->1263|2776->1268|2791->1274|2836->1297|2916->1350|2961->1374|2995->1381|3010->1387|3054->1409|3330->1657|3382->1687|3491->1769|3506->1775|3535->1783|3669->1889|3724->1922|4052->2220
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|61->30|61->30|61->30|61->30|61->30|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|71->40|71->40|72->41|72->41|72->41|72->41|72->41|89->58
                  -- GENERATED --
              */
          