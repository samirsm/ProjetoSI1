
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
                        	<a href="logout" color="#FFF"> """),_display_(/*112.58*/Messages("global.sair")),format.raw/*112.81*/("""</a>
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
                    <li>
                        <a href="horarios"><i class="fa fa-calendar fa-3x"></i></br> Horários</a>
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
                                        <h3 class="page-header" style="color: #FFF">"""),_display_(/*155.86*/Messages("global.minhas_caronas")),format.raw/*155.119*/("""</h3>
                                        <ol class="breadcrumb">
                                          """),_display_(/*157.44*/if(usuarioLogado.getCaronasMotorista().size() == 0)/*157.95*/{_display_(Seq[Any](format.raw/*157.96*/("""
                                            """),format.raw/*158.45*/("""<li class="active">
                                                """),_display_(/*159.50*/Messages("global.sem_caronas")),format.raw/*159.80*/("""
                                            """),format.raw/*160.45*/("""</li>
                                          """)))}),format.raw/*161.44*/("""
                                        """),format.raw/*162.41*/("""</ol>
                                    </div>
                                </div>
                        </div>
                      </div>

                    <!-- INICIO DO CARD -->
                    """),_display_(/*169.22*/for(carona <- usuarioLogado.getCaronasMotorista()) yield /*169.72*/{_display_(Seq[Any](format.raw/*169.73*/("""
                    """),format.raw/*170.21*/("""<div>
                        <div class="panel panel-blue-ida">
                            <div class="panel-heading">
                                <h1 class="panel-title">
                                		<table class="table">
                  									    <tbody>
                  											<tr>
                  												<th><div><img src="assets/images/users/default.jpg" id="show-option" title=""""),_display_(/*177.108*/carona/*177.114*/.getMotorista().getNome()),format.raw/*177.139*/("""" class="img-circle" style="border: 2px solid #FFF;" height="50" width="50"></i></div></th>
                  												<th><i class="fa fa-car fa-1x "></i> """),_display_(/*178.69*/carona/*178.75*/.getTipo()),format.raw/*178.85*/("""</th>
                  												<th><div><img src="assets/SBAdminTemplate/img/vagasBranco.png" align="left" height="20" width="20"></i>"""),_display_(/*179.135*/carona/*179.141*/.getVagasDisponiveis()),format.raw/*179.163*/("""</div></th>
                  												<th><i class="fa fa-clock-o fa-1x"></i> """),_display_(/*180.72*/carona/*180.78*/.getHorario.getHora()),format.raw/*180.99*/("""</th>
                      										</tr>
                  									    </tbody>
                  									</table>

                                </h1>
                            </div>
                            <div class="panel-body">
                              """),_display_(/*188.32*/if(carona.getPassageiros().size != 0)/*188.69*/{_display_(Seq[Any](format.raw/*188.70*/("""
                                """),format.raw/*189.33*/("""<div class="col-xs-12">
                                  <table class="table">
                                      <tbody>
                                        <tr>
                                          """),_display_(/*193.44*/for(passageiro <- carona.getPassageiros()) yield /*193.86*/{_display_(Seq[Any](format.raw/*193.87*/("""
                                              """),format.raw/*194.47*/("""<th><div><img src="assets/images/users/default.jpg" id="show-option" title=""""),_display_(/*194.124*/passageiro/*194.134*/.getNome()),format.raw/*194.144*/("""" class="img-circle" style="border: 2px solid #82b1ff" height="40" width="40"></i></div></th>
                                            """)))}),format.raw/*195.46*/("""
                                        """),format.raw/*196.41*/("""</tr>
                                      </tbody>

                                  </table>
                                </div>
                              """)))}/*201.33*/else/*201.38*/{_display_(Seq[Any](format.raw/*201.39*/("""
                              """),format.raw/*202.31*/("""<div class="col-xs-12">
                                <table class="table">
                                    <tbody>
                                    <tr>
                                      <th> """),_display_(/*206.45*/Messages("global.sem_passageiros")),format.raw/*206.79*/("""</th>
                                      </tr>
                                    </tbody>
                                </table>
                              </div>
                            """)))}),format.raw/*211.30*/("""


                            """),format.raw/*214.29*/("""</div>
                        </div>
                    </div>
                  """)))}),format.raw/*217.20*/("""
                """),format.raw/*218.17*/("""</li><!-- FIM DO CARD -->
                </ul>
            </div>

            <!-- /.navbar-collapse -->
        </nav>
    </div>

    """),_display_(/*226.6*/content),format.raw/*226.13*/("""
    """),format.raw/*227.5*/("""<!-- /#wrapper -->
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
                  DATE: Sat May 07 05:34:47 BRT 2016
                  SOURCE: /Users/samirsmedeiros/ProjetoSI1/app/views/main.scala.html
                  HASH: adbb4ce970f33b56048fe336cb7c6184cbaf9107
                  MATRIX: 787->1|1002->120|1030->122|1270->335|1296->340|1872->888|1901->889|1941->901|2165->1097|2194->1098|2233->1109|2266->1114|2295->1115|2331->1124|2379->1145|2407->1146|2443->1155|2487->1171|2516->1172|2552->1181|2631->1233|2659->1234|2692->1240|3442->1963|3490->1995|3529->1996|3580->2019|3868->2280|3888->2291|3939->2320|4076->2430|4096->2441|4131->2455|4299->2592|4346->2611|4462->2700|4514->2731|4837->3026|4860->3039|4892->3049|4922->3050|5129->3230|5176->3255|5206->3256|5238->3260|5261->3273|5309->3299|5394->3357|5501->3454|5541->3455|5594->3480|5703->3562|5750->3587|5780->3588|5812->3592|5835->3605|5894->3642|5986->3702|6041->3728|6151->3810|6199->3835|6231->3838|6255->3851|6290->3863|6377->3922|6425->3960|6465->3961|6520->3987|6629->4068|6676->4092|6708->4095|6732->4108|6772->4125|6863->4184|6917->4209|7057->4321|7102->4344|7817->5030|7841->5043|7874->5053|8197->5347|8251->5378|9204->6303|9260->6336|9401->6449|9462->6500|9502->6501|9576->6546|9673->6615|9725->6645|9799->6690|9880->6739|9950->6780|10192->6994|10259->7044|10299->7045|10349->7066|10792->7480|10809->7486|10857->7511|11045->7671|11061->7677|11093->7687|11262->7827|11279->7833|11324->7855|11435->7938|11451->7944|11494->7965|11800->8243|11847->8280|11887->8281|11949->8314|12191->8528|12250->8570|12290->8571|12366->8618|12472->8695|12493->8705|12526->8715|12697->8854|12767->8895|12954->9063|12968->9068|13008->9069|13068->9100|13303->9307|13359->9341|13593->9543|13653->9574|13769->9658|13815->9675|13981->9814|14010->9821|14043->9826
                  LINES: 27->1|32->1|34->3|43->12|43->12|62->31|62->31|63->32|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|77->46|98->67|98->67|98->67|99->68|103->72|103->72|103->72|105->74|105->74|105->74|109->78|110->79|113->82|113->82|121->90|121->90|121->90|121->90|125->94|125->94|125->94|125->94|125->94|125->94|127->96|127->96|127->96|128->97|129->98|129->98|129->98|129->98|129->98|129->98|131->100|132->101|133->102|133->102|133->102|133->102|133->102|135->104|135->104|135->104|137->106|138->107|138->107|138->107|138->107|138->107|140->109|141->110|143->112|143->112|159->128|159->128|159->128|165->134|165->134|186->155|186->155|188->157|188->157|188->157|189->158|190->159|190->159|191->160|192->161|193->162|200->169|200->169|200->169|201->170|208->177|208->177|208->177|209->178|209->178|209->178|210->179|210->179|210->179|211->180|211->180|211->180|219->188|219->188|219->188|220->189|224->193|224->193|224->193|225->194|225->194|225->194|225->194|226->195|227->196|232->201|232->201|232->201|233->202|237->206|237->206|242->211|245->214|248->217|249->218|257->226|257->226|258->227
                  -- GENERATED --
              */
          