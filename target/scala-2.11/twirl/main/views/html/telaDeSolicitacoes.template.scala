
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
                  DATE: Thu May 12 22:39:55 GMT-03:00 2016
                  SOURCE: C:/Users/Dandara/Desktop/ProjetoSI1/app/views/telaDeSolicitacoes.scala.html
                  HASH: 16610da11d2e1f1e9abe5ee8067d013d73c6ad2d
                  MATRIX: 790->1|942->58|972->63|1095->177|1134->178|1164->182|2419->1409|2448->1410|2483->1418|2616->1524|2644->1525|2678->1532|2711->1537|2740->1538|2772->1543|2816->1560|2844->1561|2873->1563|3200->1863|3269->1910|3351->1966|3399->1998|3438->1999|3478->2011|3866->2372|3886->2383|3937->2412|4001->2448|4176->2596|4196->2607|4231->2621|4343->2706|4363->2717|4418->2750|4528->2833|4548->2844|4604->2878|4827->3074|4847->3085|4903->3119|5012->3201|5032->3212|5089->3247|5467->3598|5487->3609|5516->3617|5585->3658|5637->3688|5736->3760|5756->3771|5785->3779|5852->3818|5906->3850|6232->4145|6281->4166|6317->4192|6357->4193|6408->4215|6462->4241|6516->4273|6578->4303|6629->4325
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|71->40|71->40|72->41|74->43|74->43|75->44|75->44|75->44|76->45|77->46|77->46|78->47|89->58|89->58|92->61|92->61|92->61|93->62|99->68|99->68|99->68|100->69|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|108->77|108->77|108->77|109->78|109->78|109->78|119->88|119->88|119->88|119->88|119->88|121->90|121->90|121->90|121->90|121->90|131->100|133->102|133->102|133->102|134->103|134->103|134->103|135->104|136->105
                  -- GENERATED --
              */
          