
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


            <a class="navbar-brand" href="redefineIdioma"><img src="assets/SBAdminTemplate/img/logo vumbora.png" height="40px" width="180px"></a>

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
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*102.78*/Messages("global.idioma")),format.raw/*102.103*/(""": """),_display_(/*102.106*/usuarioLogado/*102.119*/.getNome()),format.raw/*102.129*/("""</h5>
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
                                """),format.raw/*191.33*/("""Ainda não há passageiros cadastrados nessa carona.
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
                  DATE: Thu May 05 02:30:48 BRT 2016
                  SOURCE: /home/pedropfo/workspace/ProjetoSI1/app/views/main.scala.html
                  HASH: a7c9edb512358c2e9233c3eb4e22c6a732cae58a
                  MATRIX: 787->1|1002->120|1030->122|1270->335|1296->340|1872->888|1901->889|1941->901|2165->1097|2194->1098|2233->1109|2266->1114|2295->1115|2331->1124|2379->1145|2407->1146|2443->1155|2487->1171|2516->1172|2552->1181|2631->1233|2659->1234|2692->1240|3455->1976|3503->2008|3542->2009|3593->2032|3881->2293|3901->2304|3952->2333|4089->2443|4109->2454|4144->2468|4312->2605|4359->2624|4475->2713|4527->2744|4850->3039|4873->3052|4905->3062|4935->3063|5142->3243|5189->3268|5219->3269|5251->3273|5274->3286|5322->3312|5407->3370|5514->3467|5554->3468|5607->3493|5716->3575|5763->3600|5793->3601|5825->3605|5848->3618|5907->3655|5999->3715|6054->3741|6164->3823|6212->3848|6244->3851|6268->3864|6301->3874|6388->3933|6436->3971|6476->3972|6531->3998|6640->4079|6687->4103|6719->4106|6743->4119|6783->4136|6874->4195|6928->4220|7055->4319|7100->4342|7815->5028|7839->5041|7872->5051|8195->5345|8249->5376|9053->6152|9109->6185|9250->6298|9311->6349|9351->6350|9425->6395|9522->6464|9574->6494|9648->6539|9729->6588|9799->6629|10041->6843|10108->6893|10148->6894|10198->6915|10564->7253|10580->7259|10612->7269|10764->7392|10781->7398|10826->7420|10919->7485|10935->7491|10978->7512|11066->7572|11082->7578|11124->7598|11376->7822|11423->7859|11463->7860|11525->7893|11612->7952|11671->7994|11711->7995|11777->8033|11797->8043|11829->8053|11895->8087|11947->8120|11961->8125|12001->8126|12063->8159|12177->8241|12236->8271|12352->8355|12398->8372|12564->8511|12593->8518|12626->8523
                  LINES: 27->1|32->1|34->3|43->12|43->12|62->31|62->31|63->32|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|77->46|98->67|98->67|98->67|99->68|103->72|103->72|103->72|105->74|105->74|105->74|109->78|110->79|113->82|113->82|121->90|121->90|121->90|121->90|125->94|125->94|125->94|125->94|125->94|125->94|127->96|127->96|127->96|128->97|129->98|129->98|129->98|129->98|129->98|129->98|131->100|132->101|133->102|133->102|133->102|133->102|133->102|135->104|135->104|135->104|137->106|138->107|138->107|138->107|138->107|138->107|140->109|141->110|143->112|143->112|159->128|159->128|159->128|165->134|165->134|183->152|183->152|185->154|185->154|185->154|186->155|187->156|187->156|188->157|189->158|190->159|197->166|197->166|197->166|198->167|205->174|205->174|205->174|206->175|206->175|206->175|207->176|207->176|207->176|208->177|208->177|208->177|216->185|216->185|216->185|217->186|218->187|218->187|218->187|219->188|219->188|219->188|220->189|221->190|221->190|221->190|222->191|223->192|225->194|228->197|229->198|237->206|237->206|238->207
                  -- GENERATED --
              */
          