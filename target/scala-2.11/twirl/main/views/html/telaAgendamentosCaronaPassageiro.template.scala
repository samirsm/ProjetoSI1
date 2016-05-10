
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

            <div class="container-fluid" >
				<div class="row-xs-12">
                <!-- Page Heading -->
                <!-- /.row -->


               <!-- /.row -->


                <!-- /.row -->

                                <!-- /.row -->

                 <div style="text-align: center; color: #FFF; font-family: 'Calibri Light';" >

                <div style="font-size: 36px;"><p style="font-size: 34px;"><br>"""),_display_(/*30.80*/Messages("agendamento.marcar")),format.raw/*30.110*/(""" """),_display_(/*30.112*/carona/*30.118*/.getMotorista().getNome()),format.raw/*30.143*/("""<br><br></p></div>

                <p><img src="assets/SBAdminTemplate/img/trajeto carona ilustracao.png" width="500" height="95"  alt=""/></p>

                <p style="font-size: 18px;"><b>"""),_display_(/*34.49*/Messages("agendamento.tipo")),format.raw/*34.77*/(""" """),format.raw/*34.78*/("""</b>"""),_display_(/*34.83*/carona/*34.89*/.getTipo()),format.raw/*34.99*/("""</p>
                <p style="font-size: 18px;"><b>"""),_display_(/*35.49*/Messages("agendamento.dia")),format.raw/*35.76*/(""" """),format.raw/*35.77*/("""</b>"""),_display_(/*35.82*/carona/*35.88*/.getHorario().getDia()),format.raw/*35.110*/("""</p>
                <p style="font-size: 18px;"><b>"""),_display_(/*36.49*/Messages("agendamento.hora")),format.raw/*36.77*/(""" """),format.raw/*36.78*/("""</b>"""),_display_(/*36.83*/carona/*36.89*/.getHorario().getHora()),format.raw/*36.112*/("""</p>
                <p style="font-size: 18px;"><b>"""),_display_(/*37.49*/Messages("global.vagas")),format.raw/*37.73*/(""": </b>"""),_display_(/*37.80*/carona/*37.86*/.getVagasDisponiveis()),format.raw/*37.108*/("""</p>


                <div class="row-sm-12">
        						<div class="col-sm-6">
                      <td align="rigth"><a href="/" class="btn btn-warning btn-l" style="float: center; font-size: 18px;"><b>"""),_display_(/*42.127*/Messages("agendamento.voltar")),format.raw/*42.157*/("""</a> </td><td></td>
                    </div>

        						<div class="col-sm-6">
                      <td align="rigth"><a href="solicitaCarona?id="""),_display_(/*46.69*/carona/*46.75*/.getId()),format.raw/*46.83*/("""" class="btn btn-warning btn'l" style="float: center; font-size: 18px;"><b>"""),_display_(/*46.159*/Messages("agendamento.solicitar")),format.raw/*46.192*/("""</a>
                    </div>
        			</div>
            </br>
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

""")))}),format.raw/*65.2*/("""
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
                  DATE: Sun May 08 03:06:24 BRT 2016
                  SOURCE: /home/pedropfo/workspace/ProjetoSI1/app/views/telaAgendamentosCaronaPassageiro.scala.html
                  HASH: 169d56428be9910a5efafa013d90915d3ebc12b0
                  MATRIX: 838->1|1039->106|1067->109|1151->185|1189->186|1217->188|1784->728|1836->758|1866->760|1882->766|1929->791|2150->985|2199->1013|2228->1014|2260->1019|2275->1025|2306->1035|2386->1088|2434->1115|2463->1116|2495->1121|2510->1127|2554->1149|2634->1202|2683->1230|2712->1231|2744->1236|2759->1242|2804->1265|2884->1318|2929->1342|2963->1349|2978->1355|3022->1377|3260->1587|3312->1617|3492->1770|3507->1776|3536->1784|3640->1860|3695->1893|4051->2219
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|61->30|61->30|61->30|61->30|61->30|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|73->42|73->42|77->46|77->46|77->46|77->46|77->46|96->65
                  -- GENERATED --
              */
          