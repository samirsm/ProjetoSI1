
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
<html lang="pt">

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
                          <a href="""),_display_(/*69.36*/notificacao/*69.47*/.getReferencia()),format.raw/*69.63*/(""">
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
                      """),_display_(/*82.24*/if(notificacoes.size() != 0)/*82.52*/{_display_(Seq[Any](format.raw/*82.53*/("""
                      """),format.raw/*83.23*/("""<a href="leTodasNotificacoes">"""),_display_(/*83.54*/Messages("global.notificacoes_lidas")),format.raw/*83.91*/("""</a>
                      """)))}/*84.25*/else/*84.30*/{_display_(Seq[Any](format.raw/*84.31*/("""
                      """),_display_(/*85.24*/Messages("global.sem_notificacoes")),format.raw/*85.59*/("""
                      """)))}),format.raw/*86.24*/("""

                  """),format.raw/*88.19*/("""</li>
              </ul>
          </li>
              <!-- end Notification -->

                <!-- Linguas -->
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
                <!-- end Linguas -->

                <!-- User options -->
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user fa-2x"></i> """),_display_(/*115.114*/usuarioLogado/*115.127*/.getNome()),format.raw/*115.137*/(""" """),format.raw/*115.138*/("""<b class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li>
                            <h5 class="media-heading" style="color: #888;"> """),_display_(/*119.78*/Messages("global.bairro")),format.raw/*119.103*/(""" """),format.raw/*119.104*/("""1: """),_display_(/*119.108*/usuarioLogado/*119.121*/.getEndereco().getBairro()),format.raw/*119.147*/("""</h5>
                        </li>
                     """),_display_(/*121.23*/if(usuarioLogado.getEnderecoAlternativo().getBairro() != usuarioLogado.getEndereco().getBairro())/*121.120*/{_display_(Seq[Any](format.raw/*121.121*/("""
                        """),format.raw/*122.25*/("""<li>
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*123.78*/Messages("global.bairro")),format.raw/*123.103*/(""" """),format.raw/*123.104*/("""2: """),_display_(/*123.108*/usuarioLogado/*123.121*/.getEnderecoAlternativo().getBairro()),format.raw/*123.158*/("""</h5>
                        </li>
                       """)))}),format.raw/*125.25*/("""
                         """),format.raw/*126.26*/("""<li>
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*127.78*/Messages("global.idioma")),format.raw/*127.103*/(""": """),_display_(/*127.106*/usuarioLogado/*127.119*/.getIdioma()),format.raw/*127.131*/("""</h5>
                        </li>
                      """),_display_(/*129.24*/if(usuarioLogado.getNumeroVagas() > 0)/*129.62*/{_display_(Seq[Any](format.raw/*129.63*/("""

                        """),format.raw/*131.25*/("""<li>
                            <h5 class="media-heading"style="color: #888;"> """),_display_(/*132.77*/Messages("global.vagas")),format.raw/*132.101*/(""": """),_display_(/*132.104*/usuarioLogado/*132.117*/.getNumeroVagas()),format.raw/*132.134*/("""</h5>
                        </li>
                      """)))}),format.raw/*134.24*/("""
                        """),format.raw/*135.25*/("""<li class="divider"></li>
                        <li>
                        	<a href="logout" color="#FFF"> """),_display_(/*137.58*/Messages("global.sair")),format.raw/*137.81*/("""</a>
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
                        <a href="""),_display_(/*153.34*/usuarioLogado/*153.47*/.getEnderecoPerfil()),format.raw/*153.67*/("""><td width="20%"><img src="assets/images/users/default.jpg" class="img-circle" style="border: 2px solid #888;" height="50" width="50"></i></td></br>"""),_display_(/*153.216*/usuarioLogado/*153.229*/.getNome()),format.raw/*153.239*/("""</a>
                    </li>
                    <li>
                        <a href="/"><i class="fa fa-fw fa-home fa-4x"></i></br><strong>"""),_display_(/*156.89*/Messages("global.home")),format.raw/*156.112*/("""</strong></a>
                    </li>
                    <li>
                        <a href="solicitacoes"><i class="fa fa-fw fa-paper-plane fa-3x"></i></br><strong>"""),_display_(/*159.107*/Messages("global.solicitacoes")),format.raw/*159.138*/("""</br><div style="color: #985f0d">"""),_display_(/*159.172*/if(usuarioLogado.getSolicitacoes().size() > 0)/*159.218*/{_display_(Seq[Any](format.raw/*159.219*/(""" """),format.raw/*159.220*/("""("""),_display_(/*159.222*/usuarioLogado/*159.235*/.getSolicitacoes().size()),format.raw/*159.260*/(""") """)))}),format.raw/*159.263*/("""</div></strong></a>
                    </li>
                    <li>
                        <a href="pendentes"><i class="fa fa-clock-o fa-3x"></i></br><strong>"""),_display_(/*162.94*/Messages("global.pendentes")),format.raw/*162.122*/("""</br><div style="color: #985f0d">"""),_display_(/*162.156*/if(usuarioLogado.getCaronasPendentes().size() > 0)/*162.206*/{_display_(Seq[Any](format.raw/*162.207*/(""" """),format.raw/*162.208*/("""("""),_display_(/*162.210*/usuarioLogado/*162.223*/.getCaronasPendentes().size()),format.raw/*162.252*/(""") """)))}),format.raw/*162.255*/("""</div></strong></a>
                    </li>
                    <li>
                        <a href="horarios"><i class="fa fa-calendar fa-3x"></i></br><strong>"""),_display_(/*165.94*/Messages("global.horarios")),format.raw/*165.121*/("""</strong></a>
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
                                        <h3 class="page-header" style="color: #FFF">"""),_display_(/*183.86*/Messages("global.minhas_caronas")),format.raw/*183.119*/("""</h3>
                                        <ol class="breadcrumb">
                                          """),_display_(/*185.44*/if(usuarioLogado.getCaronas().size() == 0)/*185.86*/{_display_(Seq[Any](format.raw/*185.87*/("""
                                            """),format.raw/*186.45*/("""<li class="active">
                                                """),_display_(/*187.50*/Messages("global.sem_caronas")),format.raw/*187.80*/("""
                                            """),format.raw/*188.45*/("""</li>
                                          """)))}),format.raw/*189.44*/("""
                                        """),format.raw/*190.41*/("""</ol>
                                    </div>
                                </div>
                        </div>
                      </div>

                    <!-- INICIO DO CARD -->
                    """),_display_(/*197.22*/for(carona <- usuarioLogado.getCaronas()) yield /*197.63*/{_display_(Seq[Any](format.raw/*197.64*/("""
                    """),format.raw/*198.21*/("""<div>
                        <div class="panel panel-blue-ida">
                            <div class="panel-heading">
                                <h1 class="panel-title">
                                		<table class="table">
                  									    <tbody>
                  											<tr>
                  												<th><div><img src="assets/images/users/default.jpg" id="show-option" title=""""),_display_(/*205.108*/carona/*205.114*/.getMotorista().getNome()),format.raw/*205.139*/("""" class="img-circle" style="border: 2px solid #FFF;" height="50" width="50"></i></div></th>
                  												<th><i class="fa fa-car fa-1x "></i> """),_display_(/*206.69*/carona/*206.75*/.getTipo()),format.raw/*206.85*/("""</th>
                  												<th><div><img src="assets/SBAdminTemplate/img/vagasBranco.png" align="left" height="20" width="20"></i>"""),_display_(/*207.135*/if(carona.getVagasDisponiveis == 0)/*207.170*/ {_display_(Seq[Any](format.raw/*207.172*/(""" """),_display_(/*207.174*/Messages("global.cheia"))))}/*207.200*/else/*207.204*/{_display_(Seq[Any](format.raw/*207.205*/(""" """),_display_(/*207.207*/carona/*207.213*/.getVagasDisponiveis()),format.raw/*207.235*/(""" """)))}),format.raw/*207.237*/("""</div></th>
                  												<th><i class="fa fa-clock-o fa-1x"></i> """),_display_(/*208.72*/carona/*208.78*/.getHorario.getHora()),format.raw/*208.99*/("""</th>
                      										</tr>
                  									    </tbody>
                  									</table>

                                </h1>
                            </div>
                            <div class="panel-body">
                              """),_display_(/*216.32*/if(carona.getPassageiros().size != 0)/*216.69*/{_display_(Seq[Any](format.raw/*216.70*/("""
                                """),format.raw/*217.33*/("""<div class="col-xs-12">
                                  <table class="table">
                                      <tbody>
                                        <tr>
                                         """),_display_(/*221.43*/for(passageiro <- carona.getPassageiros()) yield /*221.85*/{_display_(Seq[Any](format.raw/*221.86*/("""
                                              """),format.raw/*222.47*/("""<th><div><img src="assets/images/users/default.jpg" id="show-option" title=""""),_display_(/*222.124*/passageiro/*222.134*/.getNome()),format.raw/*222.144*/("""" class="img-circle" style="border: 2px solid #82b1ff" height="40" width="40"></i></div></th>
                                            """)))}),format.raw/*223.46*/("""
                                        """),format.raw/*224.41*/("""</tr>
                                      </tbody>

                                  </table>
                                </div>
                              """)))}/*229.33*/else/*229.38*/{_display_(Seq[Any](format.raw/*229.39*/("""
                              """),format.raw/*230.31*/("""<div class="col-xs-12">
                                <table class="table">
                                    <tbody>
                                    <tr>
                                      <th> """),_display_(/*234.45*/Messages("global.sem_passageiros")),format.raw/*234.79*/("""</th>
                                      </tr>
                                    </tbody>
                                </table>
                              </div>
                            """)))}),format.raw/*239.30*/("""


                            """),format.raw/*242.29*/("""</div>
                        </div>
                    </div>
                  """)))}),format.raw/*245.20*/("""
                """),format.raw/*246.17*/("""</li><!-- FIM DO CARD -->
                </ul>
            </div>

            <!-- /.navbar-collapse -->
        </nav>
    </div>

    """),_display_(/*254.6*/content),format.raw/*254.13*/("""
    """),format.raw/*255.5*/("""<!-- /#wrapper -->
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
                  DATE: Thu May 12 22:39:54 GMT-03:00 2016
                  SOURCE: C:/Users/Dandara/Desktop/ProjetoSI1/app/views/main.scala.html
                  HASH: 4ca6efd4653642b4e90f8e1b9bc47d37b1c85e14
                  MATRIX: 787->1|1002->120|1032->124|1281->346|1307->351|1902->918|1931->919|1972->932|2200->1132|2229->1133|2269->1145|2302->1150|2331->1151|2368->1161|2417->1183|2445->1184|2483->1195|2527->1211|2556->1212|2593->1222|2674->1276|2702->1277|2737->1285|3508->2029|3556->2061|3595->2062|3647->2086|3739->2151|3759->2162|3796->2178|4010->2365|4030->2376|4081->2405|4220->2517|4240->2528|4275->2542|4447->2683|4495->2703|4601->2782|4638->2810|4677->2811|4729->2835|4787->2866|4845->2903|4893->2933|4906->2938|4945->2939|4997->2964|5053->2999|5109->3024|5159->3046|6559->4417|6583->4430|6616->4440|6647->4441|6859->4625|6907->4650|6938->4651|6971->4655|6995->4668|7044->4694|7132->4754|7240->4851|7281->4852|7336->4878|7447->4961|7495->4986|7526->4987|7559->4991|7583->5004|7643->5041|7737->5103|7793->5130|7904->5213|7952->5238|7984->5241|8008->5254|8043->5266|8132->5327|8180->5365|8220->5366|8277->5394|8387->5476|8434->5500|8466->5503|8490->5516|8530->5533|8623->5594|8678->5620|8820->5734|8865->5757|9444->6308|9467->6321|9509->6341|9687->6490|9711->6503|9744->6513|9919->6660|9965->6683|10168->6857|10222->6888|10285->6922|10342->6968|10383->6969|10414->6970|10445->6972|10469->6985|10517->7010|10553->7013|10748->7180|10799->7208|10862->7242|10923->7292|10964->7293|10995->7294|11026->7296|11050->7309|11102->7338|11138->7341|11333->7508|11383->7535|12214->8338|12270->8371|12413->8486|12465->8528|12505->8529|12580->8575|12678->8645|12730->8675|12805->8721|12887->8771|12958->8813|13207->9034|13265->9075|13305->9076|13356->9098|13806->9519|13823->9525|13871->9550|14060->9711|14076->9717|14108->9727|14278->9868|14324->9903|14366->9905|14397->9907|14436->9933|14451->9937|14492->9938|14523->9940|14540->9946|14585->9968|14620->9970|14732->10054|14748->10060|14791->10081|15105->10367|15152->10404|15192->10405|15255->10439|15500->10656|15559->10698|15599->10699|15676->10747|15782->10824|15803->10834|15836->10844|16008->10984|16079->11026|16271->11199|16285->11204|16325->11205|16386->11237|16625->11448|16681->11482|16920->11689|16983->11723|17102->11810|17149->11828|17323->11975|17352->11982|17386->11988
                  LINES: 27->1|32->1|34->3|43->12|43->12|62->31|62->31|63->32|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|77->46|98->67|98->67|98->67|99->68|100->69|100->69|100->69|103->72|103->72|103->72|105->74|105->74|105->74|109->78|110->79|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|117->86|119->88|146->115|146->115|146->115|146->115|150->119|150->119|150->119|150->119|150->119|150->119|152->121|152->121|152->121|153->122|154->123|154->123|154->123|154->123|154->123|154->123|156->125|157->126|158->127|158->127|158->127|158->127|158->127|160->129|160->129|160->129|162->131|163->132|163->132|163->132|163->132|163->132|165->134|166->135|168->137|168->137|184->153|184->153|184->153|184->153|184->153|184->153|187->156|187->156|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|190->159|193->162|193->162|193->162|193->162|193->162|193->162|193->162|193->162|193->162|193->162|196->165|196->165|214->183|214->183|216->185|216->185|216->185|217->186|218->187|218->187|219->188|220->189|221->190|228->197|228->197|228->197|229->198|236->205|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|238->207|238->207|238->207|238->207|238->207|238->207|238->207|238->207|239->208|239->208|239->208|247->216|247->216|247->216|248->217|252->221|252->221|252->221|253->222|253->222|253->222|253->222|254->223|255->224|260->229|260->229|260->229|261->230|265->234|265->234|270->239|273->242|276->245|277->246|285->254|285->254|286->255
                  -- GENERATED --
              */
          