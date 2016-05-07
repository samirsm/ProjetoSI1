
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
                           	<h5 class="media-heading" style="color: #888;">Ingles</h5>
                       </li>
                       <li>
                           	<h5 class="media-heading" style="color: #888;">Portugues</h5>
                       </li>
                    </ul>
                </li>

              <!-- Notification -->
          <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell fa-2x"></i> <b class="caret"></b></a>
              <ul class="dropdown-menu message-dropdown">

                  """),_display_(/*79.20*/for(notificacao <- notificacoes) yield /*79.52*/{_display_(Seq[Any](format.raw/*79.53*/("""
                      """),format.raw/*80.23*/("""<li class="message-preview">
                          <a href="solicitacoes">
                              <div class="media">
                                  <div class="media-body">
                                      <h5 class="media-heading"><strong>"""),_display_(/*84.74*/notificacao/*84.85*/.getUsuarioOrigem().getNome()),format.raw/*84.114*/("""</strong>
                                      </h5>
                                      <p class="small">"""),_display_(/*86.57*/notificacao/*86.68*/.getMensagem()),format.raw/*86.82*/("""</p>
                                  </div>
                              </div>
                          </a>
                      """)))}),format.raw/*90.24*/("""
                  """),format.raw/*91.19*/("""</li>

                  <li class="message-footer">
                      <a href="#" >"""),_display_(/*94.37*/Messages("global.exibir_todas")),format.raw/*94.68*/("""</a>
                  </li>
              </ul>
          </li>
              <!-- end Notification -->

                <!-- User options -->
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user fa-2x"></i> """),_display_(/*102.114*/usuarioLogado/*102.127*/.getNome()),format.raw/*102.137*/(""" """),format.raw/*102.138*/("""<b class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li>
                            <h5 class="media-heading" style="color: #888;"> """),_display_(/*106.78*/Messages("global.bairro")),format.raw/*106.103*/(""" """),format.raw/*106.104*/("""1: """),_display_(/*106.108*/usuarioLogado/*106.121*/.getEndereco().getBairro()),format.raw/*106.147*/("""</h5>
                        </li>
                     """),_display_(/*108.23*/if(usuarioLogado.getEnderecoAlternativo().getBairro() != usuarioLogado.getEndereco().getBairro())/*108.120*/{_display_(Seq[Any](format.raw/*108.121*/("""
                        """),format.raw/*109.25*/("""<li>
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*110.78*/Messages("global.bairro")),format.raw/*110.103*/(""" """),format.raw/*110.104*/("""2: """),_display_(/*110.108*/usuarioLogado/*110.121*/.getEnderecoAlternativo().getBairro()),format.raw/*110.158*/("""</h5>
                        </li>
                       """)))}),format.raw/*112.25*/("""
                         """),format.raw/*113.26*/("""<li>
                           	<h5 class="media-heading" style="color: #888;"> """),_display_(/*114.78*/Messages("global.idioma")),format.raw/*114.103*/(""": """),_display_(/*114.106*/usuarioLogado/*114.119*/.getIdioma()),format.raw/*114.131*/("""</h5>
                        </li>
                      """),_display_(/*116.24*/if(usuarioLogado.getNumeroVagas() > 0)/*116.62*/{_display_(Seq[Any](format.raw/*116.63*/("""

                        """),format.raw/*118.25*/("""<li>
                            <h5 class="media-heading"style="color: #888;"> """),_display_(/*119.77*/Messages("global.vagas")),format.raw/*119.101*/(""": """),_display_(/*119.104*/usuarioLogado/*119.117*/.getNumeroVagas()),format.raw/*119.134*/("""</h5>
                        </li>
                      """)))}),format.raw/*121.24*/("""
                        """),format.raw/*122.25*/("""<li class="divider"></li>
                        <li>
                        	<a href="logout" color="#FFF"> """),_display_(/*124.58*/Messages("global.sair")),format.raw/*124.81*/("""</a>
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
                        <a href="/"><td width="20%"><img src="assets/images/users/default.jpg" class="img-circle" style="border: 2px solid #888;" height="50" width="50"></i></td></br>"""),_display_(/*140.185*/usuarioLogado/*140.198*/.getNome()),format.raw/*140.208*/("""</a>
                    </li>
                    <li>
                        <a href="/"><i class="fa fa-fw fa-home fa-3x"></i></br>Home</a>
                    </li>
                    <li>
                        <a href="solicitacoes"><i class="fa fa-fw fa-paper-plane fa-3x"></i> </br>"""),_display_(/*146.100*/Messages("global.solicitacoes")),format.raw/*146.131*/("""</a>
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
                                        <h3 class="page-header" style="color: #FFF">"""),_display_(/*167.86*/Messages("global.minhas_caronas")),format.raw/*167.119*/("""</h3>
                                        <ol class="breadcrumb">
                                          """),_display_(/*169.44*/if(usuarioLogado.getCaronasMotorista().size() == 0)/*169.95*/{_display_(Seq[Any](format.raw/*169.96*/("""
                                            """),format.raw/*170.45*/("""<li class="active">
                                                """),_display_(/*171.50*/Messages("global.sem_caronas")),format.raw/*171.80*/("""
                                            """),format.raw/*172.45*/("""</li>
                                          """)))}),format.raw/*173.44*/("""
                                        """),format.raw/*174.41*/("""</ol>
                                    </div>
                                </div>
                        </div>
                      </div>

                    <!-- INICIO DO CARD -->
                    """),_display_(/*181.22*/for(carona <- usuarioLogado.getCaronasMotorista()) yield /*181.72*/{_display_(Seq[Any](format.raw/*181.73*/("""
                    """),format.raw/*182.21*/("""<div>
                        <div class="panel panel-blue-ida">
                            <div class="panel-heading">
                                <h1 class="panel-title">
                                		<table class="table">
                  									    <tbody>
                  											<tr>
                  												<th><div><img src="assets/images/users/default.jpg" id="show-option" title=""""),_display_(/*189.108*/carona/*189.114*/.getMotorista().getNome()),format.raw/*189.139*/("""" class="img-circle" style="border: 2px solid #FFF;" height="50" width="50"></i></div></th>
                  												<th><i class="fa fa-car fa-1x "></i> """),_display_(/*190.69*/carona/*190.75*/.getTipo()),format.raw/*190.85*/("""</th>
                  												<th><div><img src="assets/SBAdminTemplate/img/vagasBranco.png" align="left" height="20" width="20"></i>"""),_display_(/*191.135*/carona/*191.141*/.getVagasDisponiveis()),format.raw/*191.163*/("""</div></th>
                  												<th><i class="fa fa-clock-o fa-1x"></i> """),_display_(/*192.72*/carona/*192.78*/.getHorario.getHora()),format.raw/*192.99*/("""</th>
                      										</tr>
                  									    </tbody>
                  									</table>

                                </h1>
                            </div>
                            <div class="panel-body">
                              """),_display_(/*200.32*/if(carona.getPassageiros().size != 0)/*200.69*/{_display_(Seq[Any](format.raw/*200.70*/("""
                                """),format.raw/*201.33*/("""<div class="col-xs-12">
                                  <table class="table">
                                      <tbody>
                                        <tr>
                                          """),_display_(/*205.44*/for(passageiro <- carona.getPassageiros()) yield /*205.86*/{_display_(Seq[Any](format.raw/*205.87*/("""
                                              """),format.raw/*206.47*/("""<th><div><img src="assets/images/users/default.jpg" id="show-option" title=""""),_display_(/*206.124*/passageiro/*206.134*/.getNome()),format.raw/*206.144*/("""" class="img-circle" style="border: 2px solid #82b1ff" height="40" width="40"></i></div></th>
                                            """)))}),format.raw/*207.46*/("""
                                        """),format.raw/*208.41*/("""</tr>
                                      </tbody>

                                  </table>
                                </div>
                              """)))}/*213.33*/else/*213.38*/{_display_(Seq[Any](format.raw/*213.39*/("""
                              """),format.raw/*214.31*/("""<div class="col-xs-12">
                                <table class="table">
                                    <tbody>
                                    <tr>
                                      <th> """),_display_(/*218.45*/Messages("global.sem_passageiros")),format.raw/*218.79*/("""</th>
                                      </tr>
                                    </tbody>
                                </table>
                              </div>
                            """)))}),format.raw/*223.30*/("""


                            """),format.raw/*226.29*/("""</div>
                        </div>
                    </div>
                  """)))}),format.raw/*229.20*/("""
                """),format.raw/*230.17*/("""</li><!-- FIM DO CARD -->
                </ul>
            </div>

            <!-- /.navbar-collapse -->
        </nav>
    </div>

    """),_display_(/*238.6*/content),format.raw/*238.13*/("""
    """),format.raw/*239.5*/("""<!-- /#wrapper -->
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
                  DATE: Sat May 07 06:11:05 BRT 2016
                  SOURCE: /Users/samirsmedeiros/ProjetoSI1/app/views/main.scala.html
                  HASH: 0829f85acc20cecc7f59279a24374a5a206c3fd1
                  MATRIX: 787->1|1002->120|1030->122|1270->335|1296->340|1872->888|1901->889|1941->901|2165->1097|2194->1098|2233->1109|2266->1114|2295->1115|2331->1124|2379->1145|2407->1146|2443->1155|2487->1171|2516->1172|2552->1181|2631->1233|2659->1234|2692->1240|4000->2521|4048->2553|4087->2554|4138->2577|4426->2838|4446->2849|4497->2878|4634->2988|4654->2999|4689->3013|4857->3150|4904->3169|5020->3258|5072->3289|5396->3584|5420->3597|5453->3607|5484->3608|5692->3788|5740->3813|5771->3814|5804->3818|5828->3831|5877->3857|5963->3915|6071->4012|6112->4013|6166->4038|6276->4120|6324->4145|6355->4146|6388->4150|6412->4163|6472->4200|6564->4260|6619->4286|6729->4368|6777->4393|6809->4396|6833->4409|6868->4421|6955->4480|7003->4518|7043->4519|7098->4545|7207->4626|7254->4650|7286->4653|7310->4666|7350->4683|7441->4742|7495->4767|7635->4879|7680->4902|8395->5588|8419->5601|8452->5611|8775->5905|8829->5936|9782->6861|9838->6894|9979->7007|10040->7058|10080->7059|10154->7104|10251->7173|10303->7203|10377->7248|10458->7297|10528->7338|10770->7552|10837->7602|10877->7603|10927->7624|11370->8038|11387->8044|11435->8069|11623->8229|11639->8235|11671->8245|11840->8385|11857->8391|11902->8413|12013->8496|12029->8502|12072->8523|12378->8801|12425->8838|12465->8839|12527->8872|12769->9086|12828->9128|12868->9129|12944->9176|13050->9253|13071->9263|13104->9273|13275->9412|13345->9453|13532->9621|13546->9626|13586->9627|13646->9658|13881->9865|13937->9899|14171->10101|14231->10132|14347->10216|14393->10233|14559->10372|14588->10379|14621->10384
                  LINES: 27->1|32->1|34->3|43->12|43->12|62->31|62->31|63->32|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|77->46|110->79|110->79|110->79|111->80|115->84|115->84|115->84|117->86|117->86|117->86|121->90|122->91|125->94|125->94|133->102|133->102|133->102|133->102|137->106|137->106|137->106|137->106|137->106|137->106|139->108|139->108|139->108|140->109|141->110|141->110|141->110|141->110|141->110|141->110|143->112|144->113|145->114|145->114|145->114|145->114|145->114|147->116|147->116|147->116|149->118|150->119|150->119|150->119|150->119|150->119|152->121|153->122|155->124|155->124|171->140|171->140|171->140|177->146|177->146|198->167|198->167|200->169|200->169|200->169|201->170|202->171|202->171|203->172|204->173|205->174|212->181|212->181|212->181|213->182|220->189|220->189|220->189|221->190|221->190|221->190|222->191|222->191|222->191|223->192|223->192|223->192|231->200|231->200|231->200|232->201|236->205|236->205|236->205|237->206|237->206|237->206|237->206|238->207|239->208|244->213|244->213|244->213|245->214|249->218|249->218|254->223|257->226|260->229|261->230|269->238|269->238|270->239
                  -- GENERATED --
              */
          