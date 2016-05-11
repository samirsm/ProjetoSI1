
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object telaDeSolicitacoes_Scope0 {
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

class telaDeSolicitacoes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Usuario,List[Notificacao],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioLogado: Usuario, solicitacoes: List[Notificacao]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main(usuarioLogado, usuarioLogado.getCaronas(), usuarioLogado.getNotificacoesNaoLidas(), "Solicitações de Carona")/*3.116*/{_display_(Seq[Any](format.raw/*3.117*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="pt">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Vumbora</title>

<link rel="icon" type="img/ico" href="assets/SBAdminTemplate/img/favicon.ico">

<!-- Bootstrap Core CSS' -->
<link href="assets/SBAdminTemplate/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="assets/SBAdminTemplate/css/sb-admin.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="assets/SBAdminTemplate/css/plugins/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="assets/SBAdminTemplate/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<style type="text/css">
    	body"""),format.raw/*40.10*/("""{"""),format.raw/*40.11*/("""
    		"""),format.raw/*41.7*/("""background-image: url("assets/CreativeTemplate/img/fundoCarro.png");
    		background-size: cover;
    	"""),format.raw/*43.6*/("""}"""),format.raw/*43.7*/("""
    	"""),format.raw/*44.6*/("""input"""),format.raw/*44.11*/("""{"""),format.raw/*44.12*/("""
			"""),format.raw/*45.4*/("""color: black;
		"""),format.raw/*46.3*/("""}"""),format.raw/*46.4*/("""
"""),format.raw/*47.1*/("""</style>

</head>

<body>
  <div id="wrapper">
  <div id="page-wrapper">
    <div class="container-fluid">
			<div class="row-xs-12">
            <!-- Page Heading -->
            <!-- /.row -->
                <div style="font-size: x-large; text-align: center; font: bold; color: #F33">"""),_display_(/*58.95*/Messages("solicitacoes.solicitacoes_cabecalho")),format.raw/*58.142*/("""</div>
            <!-- /.row -->
            </br>
"""),_display_(/*61.2*/for(solicitacao <- solicitacoes) yield /*61.34*/{_display_(Seq[Any](format.raw/*61.35*/("""
          """),format.raw/*62.11*/("""<div class="col">
                  <div class="col-lg-12">
                      <div class="panel panel-blue-volta">
                          <div class="panel-heading">
                              <div class="row">
                                  <div class="col-xs-3">
                                      <i class="fa fa-user fa-5x"></i></br> """),_display_(/*68.78*/solicitacao/*68.89*/.getUsuarioOrigem().getNome()),format.raw/*68.118*/("""
                                  """),format.raw/*69.35*/("""</div>
                                  <div class="col-xs-9 text-left">
                                      <div class="fa fa-commenting-o"> """),_display_(/*71.73*/solicitacao/*71.84*/.getMensagem()),format.raw/*71.98*/("""</div>
                                      <div><i class="fa fa-map-marker"></i> """),_display_(/*72.78*/solicitacao/*72.89*/.getUsuarioOrigem().getEndereco()),format.raw/*72.122*/("""</div>
                                      <div><i class="fa fa-calendar"></i> """),_display_(/*73.76*/solicitacao/*73.87*/.getCarona().getHorario().getDia()),format.raw/*73.121*/("""</div>

                                  </div>
                                  <div class="col-xs-9 text-right">
                                      <div><i class="fa fa-calendar"></i> """),_display_(/*77.76*/solicitacao/*77.87*/.getCarona().getHorario().getDia()),format.raw/*77.121*/("""</div>
                                      <div><i class="fa fa-clock-o"></i> """),_display_(/*78.75*/solicitacao/*78.86*/.getCarona().getHorario().getHora()),format.raw/*78.121*/("""</div>
                                  </div>
                              </div>
                          </div>
                          <div>
                              <div class="panel-footer">

                                  <div style="text-align: right;">


                                      <a href="recusaPedido?id="""),_display_(/*88.65*/solicitacao/*88.76*/.getId()),format.raw/*88.84*/("""" class="btn btn-m fa fa-thumbs-o-down">"""),_display_(/*88.125*/Messages("solicitacoes.negar")),format.raw/*88.155*/("""</a>

                                      <a href="aceitaPedido?id="""),_display_(/*90.65*/solicitacao/*90.76*/.getId()),format.raw/*90.84*/("""" class="btn btn-m fa fa-thumbs-o-up">"""),_display_(/*90.123*/Messages("solicitacoes.aceitar")),format.raw/*90.155*/("""</a>

                                  </div>
                                  <div class="clearfix"></div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
              <!-- /.row -->
""")))}),format.raw/*100.2*/("""

                """),_display_(/*102.18*/if(solicitacoes.isEmpty())/*102.44*/{_display_(Seq[Any](format.raw/*102.45*/("""
                    """),format.raw/*103.21*/("""<div text-align="center">"""),_display_(/*103.47*/Messages("solicitacoes.nenhuma")),format.raw/*103.79*/("""</div></br>
                """)))}),format.raw/*104.18*/("""
                    """),format.raw/*105.21*/("""<!-- /.row -->
      </div>
      <!-- /#page-wrapper -->

  </div>
  <!-- /#wrapper -->

</body>

</html>
""")))}))
      }
    }
  }

  def render(usuarioLogado:Usuario,solicitacoes:List[Notificacao]): play.twirl.api.HtmlFormat.Appendable = apply(usuarioLogado,solicitacoes)

  def f:((Usuario,List[Notificacao]) => play.twirl.api.HtmlFormat.Appendable) = (usuarioLogado,solicitacoes) => apply(usuarioLogado,solicitacoes)

  def ref: this.type = this

}


}

/**/
object telaDeSolicitacoes extends telaDeSolicitacoes_Scope0.telaDeSolicitacoes
              /*
                  -- GENERATED --
                  DATE: Wed May 11 02:14:58 BRT 2016
                  SOURCE: /home/pedropfo/workspace/ProjetoSI1/app/views/telaDeSolicitacoes.scala.html
                  HASH: 164f13fe3f1632e30d817e5a9fbe75868a22eaef
                  MATRIX: 790->1|942->58|970->61|1093->175|1132->176|1160->178|2380->1370|2409->1371|2443->1378|2574->1482|2602->1483|2635->1489|2668->1494|2697->1495|2728->1499|2771->1515|2799->1516|2827->1517|3143->1806|3212->1853|3291->1906|3339->1938|3378->1939|3417->1950|3799->2305|3819->2316|3870->2345|3933->2380|4106->2526|4126->2537|4161->2551|4272->2635|4292->2646|4347->2679|4456->2761|4476->2772|4532->2806|4751->2998|4771->3009|4827->3043|4935->3124|4955->3135|5012->3170|5380->3511|5400->3522|5429->3530|5498->3571|5550->3601|5647->3671|5667->3682|5696->3690|5763->3729|5817->3761|6133->4046|6180->4065|6216->4091|6256->4092|6306->4113|6360->4139|6414->4171|6475->4200|6525->4221
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|71->40|71->40|72->41|74->43|74->43|75->44|75->44|75->44|76->45|77->46|77->46|78->47|89->58|89->58|92->61|92->61|92->61|93->62|99->68|99->68|99->68|100->69|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|108->77|108->77|108->77|109->78|109->78|109->78|119->88|119->88|119->88|119->88|119->88|121->90|121->90|121->90|121->90|121->90|131->100|133->102|133->102|133->102|134->103|134->103|134->103|135->104|136->105
                  -- GENERATED --
              */
          