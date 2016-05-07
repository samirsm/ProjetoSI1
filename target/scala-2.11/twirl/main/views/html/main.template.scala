
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Usuario,List[Carona],List[Notificacao],String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioLogado: Usuario, caronasOfertadas: List[Carona], notificacoes: List[Notificacao], title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>"""),_display_(/*12.13*/title),format.raw/*12.18*/("""</title>

    <!-- Bootstrap Core CSS' -->
    <link href="assets/SBAdminTemplate/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="assets/SBAdminTemplate/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="assets/SBAdminTemplate/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="assets/SBAdminTemplate/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <html lang="pt-br">

</head>

<style type="text/css">
    	    	body"""),format.raw/*31.15*/("""{"""),format.raw/*31.16*/("""
    	    		"""),format.raw/*32.12*/("""background-image: url("assets/CreativeTemplate/img/fundoCarro.png");
    	    		background-size: cover;
       				background-repeat: no-repeat;
       				background-attachment: fixed;
    	    	"""),format.raw/*36.11*/("""}"""),format.raw/*36.12*/("""
    	    	"""),format.raw/*37.11*/("""input"""),format.raw/*37.16*/("""{"""),format.raw/*37.17*/("""
    				"""),format.raw/*38.9*/("""color: black;
    			"""),format.raw/*39.8*/("""}"""),format.raw/*39.9*/("""

    			"""),format.raw/*41.8*/("""input[type=file]"""),format.raw/*41.24*/("""{"""),format.raw/*41.25*/("""
    				"""),format.raw/*42.9*/("""margin-left: 35%;
    				margin-right: 35%;
    			"""),format.raw/*44.8*/("""}"""),format.raw/*44.9*/("""

    """),format.raw/*46.5*/("""</style>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-blue navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->


            <a class="navbar-brand" href="/"><img src="assets/SBAdminTemplate/img/logo vumbora.png" height="40px" width="180px"></a>

            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">

              <!-- Notification -->
          <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell fa-2x"></i> <b class="caret"></b></a>
              <ul class="dropdown-menu message-dropdown">

                  """),_display_(/*67.20*/for(notificacao <- notificacoes) yield /*67.52*/{_display_(Seq[Any](format.raw/*67.53*/("""
                      """),format.raw/*68.23*/("""<li class="message-preview">
                          <a href="solicitacoes">
                              <div class="media">
                                  <div class="media-body">
                                      <h5 class="media-heading"><strong>"""),_display_(/*72.74*/notificacao/*72.85*/.getUsuarioOrigem().getNome()),format.raw/*72.114*/("""</strong>
                                      </h5>
                                      <p class="small">"""),_display_(/*74.57*/notificacao/*74.68*/.getMensagem()),format.raw/*74.82*/("""</p>
                                  </div>
                              </div>
                          </a>
                      """)))}),format.raw/*78.24*/("""
                  """),format.raw/*79.19*/("""</li>

                  <li class="message-footer">
                      <a href="#" >"""),_display_(/*82.37*/Messages("global.exibir_todas")),format.raw/*82.68*/("""</a>
                  </li>
              </ul>
          </li>
              <!-- end Notification -->

                <!-- User options -->
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user fa-2x"></i> """),_display_(/*90.114*/usuarioLogado/*90.127*/.getNome()),format.raw/*90.137*/(""" """),format.raw/*90.138*/("""<b class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li>
                            <h5 class="media-heading" style="color: #888;"> """),_display_(/*94.78*/Messages("global.bairro")),format.raw/*94.103*/(""" """),format.raw/*94.104*/("""1: """),_display_(/*94.108*/usuarioLogado/*94.121*/.getEndereco().getBairro()),format.raw/*94.147*/("""</h5>
                        </li>
                     """),_display_(/*96.23*/if(usuarioLogado.getEnderecoAlternativo().getBairro() != usuarioLogado.getEndereco().getBairro())/*96.120*/{_display_(Seq[Any](format.raw/*96.121*/("""
                        """),format.raw/*97.25*/("""<li>
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*98.78*/Messages("global.bairro")),format.raw/*98.103*/(""" """),format.raw/*98.104*/("""2: """),_display_(/*98.108*/usuarioLogado/*98.121*/.getEnderecoAlternativo().getBairro()),format.raw/*98.158*/("""</h5>
                        </li>
                       """)))}),format.raw/*100.25*/("""
                         """),format.raw/*101.26*/("""<li>
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*102.78*/Messages("global.idioma")),format.raw/*102.103*/(""": """),_display_(/*102.106*/usuarioLogado/*102.119*/.getIdioma()),format.raw/*102.131*/("""</h5>
                        </li>
                      """),_display_(/*104.24*/if(usuarioLogado.getNumeroVagas() > 0)/*104.62*/{_display_(Seq[Any](format.raw/*104.63*/("""

                        """),format.raw/*106.25*/("""<li>
                            <h5 class="media-heading"style="color: #888;"> """),_display_(/*107.77*/Messages("global.vagas")),format.raw/*107.101*/(""": """),_display_(/*107.104*/usuarioLogado/*107.117*/.getNumeroVagas()),format.raw/*107.134*/("""</h5>
                        </li>
                      """)))}),format.raw/*109.24*/("""
                        """),format.raw/*110.25*/("""<li class="divider"></li>
                        <li>
                        	<a href="logout"> """),_display_(/*112.45*/Messages("global.sair")),format.raw/*112.68*/("""</a>
                        </li>
                    </ul>
                </li>
                <!-- end User options -->
              </ul>
    </nav>

    <nav class="navbar" role="navigation">

            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                </br>
                </br>
                    <li>
                        <a href="/"><td width="20%"><img src="assets/images/users/default.jpg" class="img-circle" style="border: 2px solid #888;" height="50" width="50"></i></td></br>"""),_display_(/*128.185*/usuarioLogado/*128.198*/.getNome()),format.raw/*128.208*/("""</a>
                    </li>
                    <li>
                        <a href="/"><i class="fa fa-fw fa-home fa-3x"></i></br>Home</a>
                    </li>
                    <li>
                        <a href="solicitacoes"><i class="fa fa-fw fa-paper-plane fa-3x"></i> </br>"""),_display_(/*134.100*/Messages("global.solicitacoes")),format.raw/*134.131*/("""</a>
                    </li>
                </ul>
            </div>
    </nav>

            <!-- A BARRA DO OUTRO LADO -->
    <nav class="navbar" role="navigation">
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side2-nav">

                    <li>
                        <div class="container-fluid">
                            <div class="row-xs-12">
                        <!-- Page Heading -->
                                <div class="row">
                                    <div class="col-lg-12">
                                        <h3 class="page-header" style="color: #FFF">"""),_display_(/*152.86*/Messages("global.minhas_caronas")),format.raw/*152.119*/("""</h3>
                                        <ol class="breadcrumb">
                                          """),_display_(/*154.44*/if(usuarioLogado.getCaronasMotorista().size() == 0)/*154.95*/{_display_(Seq[Any](format.raw/*154.96*/("""
                                            """),format.raw/*155.45*/("""<li class="active">
                                                """),_display_(/*156.50*/Messages("global.sem_caronas")),format.raw/*156.80*/("""
                                            """),format.raw/*157.45*/("""</li>
                                          """)))}),format.raw/*158.44*/("""
                                        """),format.raw/*159.41*/("""</ol>
                                    </div>
                                </div>
                        </div>
                      </div>

                    <!-- INICIO DO CARD -->
                    """),_display_(/*166.22*/for(carona <- usuarioLogado.getCaronasMotorista()) yield /*166.72*/{_display_(Seq[Any](format.raw/*166.73*/("""
                    """),format.raw/*167.21*/("""<div class="row-sm-4">
                        <div class="panel panel-blue-ida">
                            <div class="panel-heading">
                                <h1 class="panel-title">
                                		<table class="table">
									    <tbody>
											<tr>
												<th><i class="fa fa-car fa-1x "></i> """),_display_(/*174.51*/carona/*174.57*/.getTipo()),format.raw/*174.67*/("""</th>
												<th><div><img src="assets/SBAdminTemplate/img/vagasBranco.png" align="left" height="20" width="20"></i> """),_display_(/*175.118*/carona/*175.124*/.getVagasDisponiveis()),format.raw/*175.146*/("""</div></th>
												<th><i class="fa fa-clock-o fa-1x"></i> """),_display_(/*176.54*/carona/*176.60*/.getHorario.getHora()),format.raw/*176.81*/("""</th>
												<th><i class="fa fa-calendar fa-1x"></i> """),_display_(/*177.55*/carona/*177.61*/.getHorario.getDia()),format.raw/*177.81*/("""</th>
    										</tr>
									    </tbody>
									</table>

                                </h1>
                            </div>
                            <div class="panel-body">
                              """),_display_(/*185.32*/if(carona.getPassageiros().size != 0)/*185.69*/{_display_(Seq[Any](format.raw/*185.70*/("""
                                """),format.raw/*186.33*/("""Passageiros dessa carona:
                                """),_display_(/*187.34*/for(passageiro <- carona.getPassageiros()) yield /*187.76*/{_display_(Seq[Any](format.raw/*187.77*/("""
                                    """),_display_(/*188.38*/passageiro/*188.48*/.getNome()),format.raw/*188.58*/("""
                                """)))}),format.raw/*189.34*/("""
                              """)))}/*190.33*/else/*190.38*/{_display_(Seq[Any](format.raw/*190.39*/("""
                                """),_display_(/*191.34*/Messages("global.sem_passageiros")),format.raw/*191.68*/("""
                              """)))}),format.raw/*192.32*/("""

                            """),format.raw/*194.29*/("""</div>
                        </div>
                    </div>
                  """)))}),format.raw/*197.20*/("""
                """),format.raw/*198.17*/("""</li><!-- FIM DO CARD -->
                </ul>
            </div>

            <!-- /.navbar-collapse -->
        </nav>
    </div>

    """),_display_(/*206.6*/content),format.raw/*206.13*/("""
    """),format.raw/*207.5*/("""<!-- /#wrapper -->
    <!-- jQuery -->
    <script src="assets/SBAdminTemplate/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="assets/SBAdminTemplate/js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="assets/SBAdminTemplate/js/plugins/morris/raphael.min.js"></script>
    <script src="assets/SBAdminTemplate/js/plugins/morris/morris.min.js"></script>
    <script src="assets/SBAdminTemplate/js/plugins/morris/morris-data.js"></script>
</body>

</html>
"""))
      }
    }
  }

  def render(usuarioLogado:Usuario,caronasOfertadas:List[Carona],notificacoes:List[Notificacao],title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(usuarioLogado,caronasOfertadas,notificacoes,title)(content)

  def f:((Usuario,List[Carona],List[Notificacao],String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (usuarioLogado,caronasOfertadas,notificacoes,title) => (content) => apply(usuarioLogado,caronasOfertadas,notificacoes,title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat May 07 01:06:34 BRT 2016
                  SOURCE: /home/pedropfo/workspace/ProjetoSI1/app/views/main.scala.html
                  HASH: 8f93c2548ca71248364c2dd2b0d49d8d72bcc94a
                  MATRIX: 787->1|1002->120|1030->122|1270->335|1296->340|1872->888|1901->889|1941->901|2165->1097|2194->1098|2233->1109|2266->1114|2295->1115|2331->1124|2379->1145|2407->1146|2443->1155|2487->1171|2516->1172|2552->1181|2631->1233|2659->1234|2692->1240|3442->1963|3490->1995|3529->1996|3580->2019|3868->2280|3888->2291|3939->2320|4076->2430|4096->2441|4131->2455|4299->2592|4346->2611|4462->2700|4514->2731|4837->3026|4860->3039|4892->3049|4922->3050|5129->3230|5176->3255|5206->3256|5238->3260|5261->3273|5309->3299|5394->3357|5501->3454|5541->3455|5594->3480|5703->3562|5750->3587|5780->3588|5812->3592|5835->3605|5894->3642|5986->3702|6041->3728|6151->3810|6199->3835|6231->3838|6255->3851|6290->3863|6377->3922|6425->3960|6465->3961|6520->3987|6629->4068|6676->4092|6708->4095|6732->4108|6772->4125|6863->4184|6917->4209|7044->4308|7089->4331|7804->5017|7828->5030|7861->5040|8184->5334|8238->5365|9042->6141|9098->6174|9239->6287|9300->6338|9340->6339|9414->6384|9511->6453|9563->6483|9637->6528|9718->6577|9788->6618|10030->6832|10097->6882|10137->6883|10187->6904|10553->7242|10569->7248|10601->7258|10753->7381|10770->7387|10815->7409|10908->7474|10924->7480|10967->7501|11055->7561|11071->7567|11113->7587|11365->7811|11412->7848|11452->7849|11514->7882|11601->7941|11660->7983|11700->7984|11766->8022|11786->8032|11818->8042|11884->8076|11936->8109|11950->8114|11990->8115|12052->8149|12108->8183|12172->8215|12231->8245|12347->8329|12393->8346|12559->8485|12588->8492|12621->8497
                  LINES: 27->1|32->1|34->3|43->12|43->12|62->31|62->31|63->32|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|77->46|98->67|98->67|98->67|99->68|103->72|103->72|103->72|105->74|105->74|105->74|109->78|110->79|113->82|113->82|121->90|121->90|121->90|121->90|125->94|125->94|125->94|125->94|125->94|125->94|127->96|127->96|127->96|128->97|129->98|129->98|129->98|129->98|129->98|129->98|131->100|132->101|133->102|133->102|133->102|133->102|133->102|135->104|135->104|135->104|137->106|138->107|138->107|138->107|138->107|138->107|140->109|141->110|143->112|143->112|159->128|159->128|159->128|165->134|165->134|183->152|183->152|185->154|185->154|185->154|186->155|187->156|187->156|188->157|189->158|190->159|197->166|197->166|197->166|198->167|205->174|205->174|205->174|206->175|206->175|206->175|207->176|207->176|207->176|208->177|208->177|208->177|216->185|216->185|216->185|217->186|218->187|218->187|218->187|219->188|219->188|219->188|220->189|221->190|221->190|221->190|222->191|222->191|223->192|225->194|228->197|229->198|237->206|237->206|238->207
                  -- GENERATED --
              */
          