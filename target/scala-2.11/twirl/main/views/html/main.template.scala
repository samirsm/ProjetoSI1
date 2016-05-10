
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

              <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-language fa-2x"></i><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <h5 class="media-heading" style="color: #888;"><a href="redefineIdioma?id=1">Português</a></h5>
                        </li>
                        <li>
                           	<h5 class="media-heading" style="color: #888;"><a href="redefineIdioma?id=2">English</a></h5>
                        </li>
                        <li>
                            <h5 class="media-heading" style="color: #888;"><a href="redefineIdioma?id=3">Español</a></h5>
                        </li>
                        <li>
                            <h5 class="media-heading" style="color: #888;"><a href="redefineIdioma?id=4">Italiano</a></h5>
                        </li>
                    </ul>
                </li>

              <!-- Notification -->
          <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell fa-2x"></i> <b class="caret"></b></a>
              <ul class="dropdown-menu message-dropdown">

                  """),_display_(/*85.20*/for(notificacao <- notificacoes) yield /*85.52*/{_display_(Seq[Any](format.raw/*85.53*/("""
                      """),format.raw/*86.23*/("""<li class="message-preview">
                          <a href="""),_display_(/*87.36*/notificacao/*87.47*/.getReferencia()),format.raw/*87.63*/(""">
                              <div class="media">
                                  <div class="media-body">
                                      <h5 class="media-heading"><strong>"""),_display_(/*90.74*/notificacao/*90.85*/.getUsuarioOrigem().getNome()),format.raw/*90.114*/("""</strong>
                                      </h5>
                                      <p class="small">"""),_display_(/*92.57*/notificacao/*92.68*/.getMensagem()),format.raw/*92.82*/("""</p>
                                  </div>
                              </div>
                          </a>
                      """)))}),format.raw/*96.24*/("""
                  """),format.raw/*97.19*/("""</li>

                  <li class="message-footer">
                      """),_display_(/*100.24*/if(notificacoes.size() != 0)/*100.52*/{_display_(Seq[Any](format.raw/*100.53*/("""
                      """),format.raw/*101.23*/("""<a href="leTodasNotificacoes">"""),_display_(/*101.54*/Messages("global.notificacoes_lidas")),format.raw/*101.91*/("""</a>
                      """)))}/*102.25*/else/*102.30*/{_display_(Seq[Any](format.raw/*102.31*/("""
                      """),_display_(/*103.24*/Messages("global.sem_notificacoes")),format.raw/*103.59*/("""
                      """)))}),format.raw/*104.24*/("""

                  """),format.raw/*106.19*/("""</li>
              </ul>
          </li>
              <!-- end Notification -->

                <!-- User options -->
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user fa-2x"></i> """),_display_(/*113.114*/usuarioLogado/*113.127*/.getNome()),format.raw/*113.137*/(""" """),format.raw/*113.138*/("""<b class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li>
                            <h5 class="media-heading" style="color: #888;"> """),_display_(/*117.78*/Messages("global.bairro")),format.raw/*117.103*/(""" """),format.raw/*117.104*/("""1: """),_display_(/*117.108*/usuarioLogado/*117.121*/.getEndereco().getBairro()),format.raw/*117.147*/("""</h5>
                        </li>
                     """),_display_(/*119.23*/if(usuarioLogado.getEnderecoAlternativo().getBairro() != usuarioLogado.getEndereco().getBairro())/*119.120*/{_display_(Seq[Any](format.raw/*119.121*/("""
                        """),format.raw/*120.25*/("""<li>
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*121.78*/Messages("global.bairro")),format.raw/*121.103*/(""" """),format.raw/*121.104*/("""2: """),_display_(/*121.108*/usuarioLogado/*121.121*/.getEnderecoAlternativo().getBairro()),format.raw/*121.158*/("""</h5>
                        </li>
                       """)))}),format.raw/*123.25*/("""
                         """),format.raw/*124.26*/("""<li>
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*125.78*/Messages("global.idioma")),format.raw/*125.103*/(""": """),_display_(/*125.106*/usuarioLogado/*125.119*/.getIdioma()),format.raw/*125.131*/("""</h5>
                        </li>
                      """),_display_(/*127.24*/if(usuarioLogado.getNumeroVagas() > 0)/*127.62*/{_display_(Seq[Any](format.raw/*127.63*/("""

                        """),format.raw/*129.25*/("""<li>
                            <h5 class="media-heading"style="color: #888;"> """),_display_(/*130.77*/Messages("global.vagas")),format.raw/*130.101*/(""": """),_display_(/*130.104*/usuarioLogado/*130.117*/.getNumeroVagas()),format.raw/*130.134*/("""</h5>
                        </li>
                      """)))}),format.raw/*132.24*/("""
                        """),format.raw/*133.25*/("""<li class="divider"></li>
                        <li>
                        	<a href="logout" color="#FFF"> """),_display_(/*135.58*/Messages("global.sair")),format.raw/*135.81*/("""</a>
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
                        <a href="/"><td width="20%"><img src="assets/images/users/default.jpg" class="img-circle" style="border: 2px solid #888;" height="50" width="50"></i></td></br>"""),_display_(/*151.185*/usuarioLogado/*151.198*/.getNome()),format.raw/*151.208*/("""</a>
                    </li>
                    <li>
                        <a href="/"><i class="fa fa-fw fa-home fa-3x"></i></br>Home</a>
                    </li>
                    <li>
                        <a href="solicitacoes"><i class="fa fa-fw fa-paper-plane fa-3x"></i> </br>"""),_display_(/*157.100*/Messages("global.solicitacoes")),format.raw/*157.131*/("""</a>
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
                                        <h3 class="page-header" style="color: #FFF">"""),_display_(/*178.86*/Messages("global.minhas_caronas")),format.raw/*178.119*/("""</h3>
                                        <ol class="breadcrumb">
                                          """),_display_(/*180.44*/if(usuarioLogado.getCaronas().size() == 0)/*180.86*/{_display_(Seq[Any](format.raw/*180.87*/("""
                                            """),format.raw/*181.45*/("""<li class="active">
                                                """),_display_(/*182.50*/Messages("global.sem_caronas")),format.raw/*182.80*/("""
                                            """),format.raw/*183.45*/("""</li>
                                          """)))}),format.raw/*184.44*/("""
                                        """),format.raw/*185.41*/("""</ol>
                                    </div>
                                </div>
                        </div>
                      </div>

                    <!-- INICIO DO CARD -->
                    """),_display_(/*192.22*/for(carona <- usuarioLogado.getCaronas()) yield /*192.63*/{_display_(Seq[Any](format.raw/*192.64*/("""
                    """),format.raw/*193.21*/("""<div>
                        <div class="panel panel-blue-ida">
                            <div class="panel-heading">
                                <h1 class="panel-title">
                                		<table class="table">
                  									    <tbody>
                  											<tr>
                  												<th><div><img src="assets/images/users/default.jpg" id="show-option" title=""""),_display_(/*200.108*/carona/*200.114*/.getMotorista().getNome()),format.raw/*200.139*/("""" class="img-circle" style="border: 2px solid #FFF;" height="50" width="50"></i></div></th>
                  												<th><i class="fa fa-car fa-1x "></i> """),_display_(/*201.69*/carona/*201.75*/.getTipo()),format.raw/*201.85*/("""</th>
                  												<th><div><img src="assets/SBAdminTemplate/img/vagasBranco.png" align="left" height="20" width="20"></i>"""),_display_(/*202.135*/carona/*202.141*/.getVagasDisponiveis()),format.raw/*202.163*/("""</div></th>
                  												<th><i class="fa fa-clock-o fa-1x"></i> """),_display_(/*203.72*/carona/*203.78*/.getHorario.getHora()),format.raw/*203.99*/("""</th>
                      										</tr>
                  									    </tbody>
                  									</table>

                                </h1>
                            </div>
                            <div class="panel-body">
                              """),_display_(/*211.32*/if(carona.getPassageiros().size != 0)/*211.69*/{_display_(Seq[Any](format.raw/*211.70*/("""
                                """),format.raw/*212.33*/("""<div class="col-xs-12">
                                  <table class="table">
                                      <tbody>
                                        <tr>
                                          """),_display_(/*216.44*/for(passageiro <- carona.getPassageiros()) yield /*216.86*/{_display_(Seq[Any](format.raw/*216.87*/("""
                                              """),format.raw/*217.47*/("""<th><div><img src="assets/images/users/default.jpg" id="show-option" title=""""),_display_(/*217.124*/passageiro/*217.134*/.getNome()),format.raw/*217.144*/("""" class="img-circle" style="border: 2px solid #82b1ff" height="40" width="40"></i></div></th>
                                            """)))}),format.raw/*218.46*/("""
                                        """),format.raw/*219.41*/("""</tr>
                                      </tbody>

                                  </table>
                                </div>
                              """)))}/*224.33*/else/*224.38*/{_display_(Seq[Any](format.raw/*224.39*/("""
                              """),format.raw/*225.31*/("""<div class="col-xs-12">
                                <table class="table">
                                    <tbody>
                                    <tr>
                                      <th> """),_display_(/*229.45*/Messages("global.sem_passageiros")),format.raw/*229.79*/("""</th>
                                      </tr>
                                    </tbody>
                                </table>
                              </div>
                            """)))}),format.raw/*234.30*/("""


                            """),format.raw/*237.29*/("""</div>
                        </div>
                    </div>
                  """)))}),format.raw/*240.20*/("""
                """),format.raw/*241.17*/("""</li><!-- FIM DO CARD -->
                </ul>
            </div>

            <!-- /.navbar-collapse -->
        </nav>
    </div>

    """),_display_(/*249.6*/content),format.raw/*249.13*/("""
    """),format.raw/*250.5*/("""<!-- /#wrapper -->
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
                  DATE: Mon May 09 22:14:07 BRT 2016
                  SOURCE: /home/pedropfo/workspace/ProjetoSI1/app/views/main.scala.html
                  HASH: c639b1d4f249785f3fa7399fc9e1d49fe14f693a
                  MATRIX: 787->1|1002->120|1030->122|1270->335|1296->340|1872->888|1901->889|1941->901|2165->1097|2194->1098|2233->1109|2266->1114|2295->1115|2331->1124|2379->1145|2407->1146|2443->1155|2487->1171|2516->1172|2552->1181|2631->1233|2659->1234|2692->1240|4442->2963|4490->2995|4529->2996|4580->3019|4671->3083|4691->3094|4728->3110|4939->3294|4959->3305|5010->3334|5147->3444|5167->3455|5202->3469|5370->3606|5417->3625|5521->3701|5559->3729|5599->3730|5651->3753|5710->3784|5769->3821|5817->3850|5831->3855|5871->3856|5923->3880|5980->3915|6036->3939|6085->3959|6386->4231|6410->4244|6443->4254|6474->4255|6682->4435|6730->4460|6761->4461|6794->4465|6818->4478|6867->4504|6953->4562|7061->4659|7102->4660|7156->4685|7266->4767|7314->4792|7345->4793|7378->4797|7402->4810|7462->4847|7554->4907|7609->4933|7719->5015|7767->5040|7799->5043|7823->5056|7858->5068|7945->5127|7993->5165|8033->5166|8088->5192|8197->5273|8244->5297|8276->5300|8300->5313|8340->5330|8431->5389|8485->5414|8625->5526|8670->5549|9385->6235|9409->6248|9442->6258|9765->6552|9819->6583|10772->7508|10828->7541|10969->7654|11021->7696|11061->7697|11135->7742|11232->7811|11284->7841|11358->7886|11439->7935|11509->7976|11751->8190|11809->8231|11849->8232|11899->8253|12342->8667|12359->8673|12407->8698|12595->8858|12611->8864|12643->8874|12812->9014|12829->9020|12874->9042|12985->9125|13001->9131|13044->9152|13350->9430|13397->9467|13437->9468|13499->9501|13741->9715|13800->9757|13840->9758|13916->9805|14022->9882|14043->9892|14076->9902|14247->10041|14317->10082|14504->10250|14518->10255|14558->10256|14618->10287|14853->10494|14909->10528|15143->10730|15203->10761|15319->10845|15365->10862|15531->11001|15560->11008|15593->11013
                  LINES: 27->1|32->1|34->3|43->12|43->12|62->31|62->31|63->32|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|77->46|116->85|116->85|116->85|117->86|118->87|118->87|118->87|121->90|121->90|121->90|123->92|123->92|123->92|127->96|128->97|131->100|131->100|131->100|132->101|132->101|132->101|133->102|133->102|133->102|134->103|134->103|135->104|137->106|144->113|144->113|144->113|144->113|148->117|148->117|148->117|148->117|148->117|148->117|150->119|150->119|150->119|151->120|152->121|152->121|152->121|152->121|152->121|152->121|154->123|155->124|156->125|156->125|156->125|156->125|156->125|158->127|158->127|158->127|160->129|161->130|161->130|161->130|161->130|161->130|163->132|164->133|166->135|166->135|182->151|182->151|182->151|188->157|188->157|209->178|209->178|211->180|211->180|211->180|212->181|213->182|213->182|214->183|215->184|216->185|223->192|223->192|223->192|224->193|231->200|231->200|231->200|232->201|232->201|232->201|233->202|233->202|233->202|234->203|234->203|234->203|242->211|242->211|242->211|243->212|247->216|247->216|247->216|248->217|248->217|248->217|248->217|249->218|250->219|255->224|255->224|255->224|256->225|260->229|260->229|265->234|268->237|271->240|272->241|280->249|280->249|281->250
                  -- GENERATED --
              */
          