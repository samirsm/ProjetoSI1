
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

class telaDeSolicitacoes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Usuario,List[Carona],List[Notificacao],List[Notificacao],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioLogado: Usuario, caronas: List[Carona], solicitacoes: List[Notificacao], notificacoes: List[Notificacao]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.115*/("""

"""),_display_(/*3.2*/main(usuarioLogado: Usuario, caronas, notificacoes, "Vumbora")/*3.64*/{_display_(Seq[Any](format.raw/*3.65*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">

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


            <!-- /.row -->
            </br>
"""),_display_(/*62.2*/for(solicitacao <- solicitacoes) yield /*62.34*/{_display_(Seq[Any](format.raw/*62.35*/("""
          """),format.raw/*63.11*/("""<div class="col">
                  <div class="col-lg-12">
                      <div class="panel panel-blue-volta">
                          <div class="panel-heading">
                              <div class="row">
                                  <div class="col-xs-3">
                                      <i class="fa fa-user fa-5x"></i></br> """),_display_(/*69.78*/solicitacao/*69.89*/.getUsuario().getNome()),format.raw/*69.112*/("""
                                  """),format.raw/*70.35*/("""</div>
                                  <div class="col-xs-9 text-left">
                                      <div class="fa fa-commenting-o"> """),_display_(/*72.73*/solicitacao/*72.84*/.getMensagem()),format.raw/*72.98*/("""</div>
                                      <div><i class="fa fa-map-marker"></i> """),_display_(/*73.78*/solicitacao/*73.89*/.getUsuario().getEndereco()),format.raw/*73.116*/("""</div>
                                      <div><i class="fa fa-calendar"></i> """),_display_(/*74.76*/solicitacao/*74.87*/.getCarona().getHorario().getDia()),format.raw/*74.121*/("""</div>

                                  </div>
                                  <div class="col-xs-9 text-right">
                                      <div><i class="fa fa-calendar"></i> """),_display_(/*78.76*/solicitacao/*78.87*/.getCarona().getHorario().getDia()),format.raw/*78.121*/("""</div>
                                      <div><i class="fa fa-clock-o"></i> """),_display_(/*79.75*/solicitacao/*79.86*/.getCarona().getHorario().getHora()),format.raw/*79.121*/("""</div>
                                  </div>
                              </div>
                          </div>
                          <div>
                              <div class="panel-footer">

                                  <div style="text-align: right;">


                                      <a href="recusaPedido?id="""),_display_(/*89.65*/solicitacao/*89.76*/.getId()),format.raw/*89.84*/("""" class="btn btn-m fa fa-thumbs-o-down">"""),_display_(/*89.125*/Messages("solicitacoes.negar")),format.raw/*89.155*/("""</a>

                                      <a href="aceitaPedido?id="""),_display_(/*91.65*/solicitacao/*91.76*/.getId()),format.raw/*91.84*/("""" class="btn btn-m fa fa-thumbs-o-up">"""),_display_(/*91.123*/Messages("solicitacoes.aceitar")),format.raw/*91.155*/("""</a>

                                  </div>
                                  <div class="clearfix"></div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
              <!-- /.row -->
""")))}),format.raw/*101.2*/("""

                """),_display_(/*103.18*/if(solicitacoes.isEmpty())/*103.44*/{_display_(Seq[Any](format.raw/*103.45*/("""
                    """),format.raw/*104.21*/("""<div text-align="center">"""),_display_(/*104.47*/Messages("solicitacoes.nenhuma")),format.raw/*104.79*/("""</div></br>
                """)))}),format.raw/*105.18*/("""
                    """),format.raw/*106.21*/("""<!-- /.row -->
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

  def render(usuarioLogado:Usuario,caronas:List[Carona],solicitacoes:List[Notificacao],notificacoes:List[Notificacao]): play.twirl.api.HtmlFormat.Appendable = apply(usuarioLogado,caronas,solicitacoes,notificacoes)

  def f:((Usuario,List[Carona],List[Notificacao],List[Notificacao]) => play.twirl.api.HtmlFormat.Appendable) = (usuarioLogado,caronas,solicitacoes,notificacoes) => apply(usuarioLogado,caronas,solicitacoes,notificacoes)

  def ref: this.type = this

}


}

/**/
object telaDeSolicitacoes extends telaDeSolicitacoes_Scope0.telaDeSolicitacoes
              /*
                  -- GENERATED --
                  DATE: Sat May 14 01:40:02 BRT 2016
                  SOURCE: /home/hugo/Documentos/Projeto-Vumbora/ProjetoSI1/app/views/telaDeSolicitacoes.scala.html
                  HASH: 4b1111303fa054e288485488ae60cef1298b4198
                  MATRIX: 821->1|1030->114|1058->117|1128->179|1166->180|1194->182|2414->1374|2443->1375|2477->1382|2608->1486|2636->1487|2669->1493|2702->1498|2731->1499|2762->1503|2805->1519|2833->1520|2861->1521|3130->1764|3178->1796|3217->1797|3256->1808|3638->2163|3658->2174|3703->2197|3766->2232|3939->2378|3959->2389|3994->2403|4105->2487|4125->2498|4174->2525|4283->2607|4303->2618|4359->2652|4578->2844|4598->2855|4654->2889|4762->2970|4782->2981|4839->3016|5207->3357|5227->3368|5256->3376|5325->3417|5377->3447|5474->3517|5494->3528|5523->3536|5590->3575|5644->3607|5960->3892|6007->3911|6043->3937|6083->3938|6133->3959|6187->3985|6241->4017|6302->4046|6352->4067
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|71->40|71->40|72->41|74->43|74->43|75->44|75->44|75->44|76->45|77->46|77->46|78->47|93->62|93->62|93->62|94->63|100->69|100->69|100->69|101->70|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|109->78|109->78|109->78|110->79|110->79|110->79|120->89|120->89|120->89|120->89|120->89|122->91|122->91|122->91|122->91|122->91|132->101|134->103|134->103|134->103|135->104|135->104|135->104|136->105|137->106
                  -- GENERATED --
              */
          