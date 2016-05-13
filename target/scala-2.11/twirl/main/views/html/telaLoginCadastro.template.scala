
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object telaLoginCadastro_Scope0 {
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

class telaLoginCadastro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Dados],Form[Endereco],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formularioAutenticacao: Form[Dados], formularioEndereco: Form[Endereco], bairros: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.98*/("""

"""),_display_(/*3.2*/index(Messages("global.titulo"))/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
   		<meta name="viewport" content="width=device-width, initial-scale=1">
    	<meta name="description" content="">
    	<meta name="author" content="">

    	<!-- <title>Vumbora</title> Pesquisar DAO Pattern -->

			<script
				src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
			<script
				src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
			<script
				src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
			<linkrel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"/>

	    <!-- Bootstrap Core CSS -->
	    <link rel="stylesheet" href="assets/CreativeTemplate/css/bootstrap.min.css" type="text/css">
			<link href="assets/CreativeTemplate/js/bootstrap-switch/dist/css/bootstrap3/bootstrap-switch.css" rel="stylesheet">

	    <!-- Custom Fonts -->
	    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
	    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
	    <link rel="stylesheet" href="assets/CreativeTemplate/font-awesome/css/font-awesome.min.css" type="text/css">

	    <!-- Plugin CSS -->
	    <link rel="stylesheet" href="assets/CreativeTemplate/css/animate.min.css" type="text/css">

	    <!-- Custom CSS -->
	    <link rel="stylesheet" href="assets/CreativeTemplate/css/creative.css" type="text/css">

	    <style type="text/css">
	    	body"""),format.raw/*40.11*/("""{"""),format.raw/*40.12*/("""
	    		"""),format.raw/*41.8*/("""background-image: url("assets/CreativeTemplate/img/fundoCarro.png");
					background-size: cover;
					background-repeat: no-repeat;
					background-attachment: fixed;
	    	"""),format.raw/*45.7*/("""}"""),format.raw/*45.8*/("""
	    	"""),format.raw/*46.7*/("""input"""),format.raw/*46.12*/("""{"""),format.raw/*46.13*/("""
				"""),format.raw/*47.5*/("""color: black;
			"""),format.raw/*48.4*/("""}"""),format.raw/*48.5*/("""
			"""),format.raw/*49.4*/("""select"""),format.raw/*49.10*/("""{"""),format.raw/*49.11*/("""
				"""),format.raw/*50.5*/("""color: black;
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""

			"""),format.raw/*53.4*/("""input[type=file]"""),format.raw/*53.20*/("""{"""),format.raw/*53.21*/("""
				"""),format.raw/*54.5*/("""margin-left: 35%;
				margin-right: 35%;
			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/("""

	    """),format.raw/*58.6*/("""</style>

	    <script type="text/javascript">
	    	function alertaCadastroEfetuado()"""),format.raw/*61.40*/("""{"""),format.raw/*61.41*/("""
	    		"""),format.raw/*62.8*/("""alert("""),_display_(/*62.15*/Messages("ela_login.sucesso_cadastro")),format.raw/*62.53*/(""");
	    	"""),format.raw/*63.7*/("""}"""),format.raw/*63.8*/("""
	    """),format.raw/*64.6*/("""</script>
	    <script>
			function loginEfetuadoComSucesso()"""),format.raw/*66.38*/("""{"""),format.raw/*66.39*/("""
	    		"""),format.raw/*67.8*/("""alert("""),_display_(/*67.15*/Messages("ela_login.sucesso_login")),format.raw/*67.50*/(""");
			"""),format.raw/*68.4*/("""}"""),format.raw/*68.5*/("""
	    """),format.raw/*69.6*/("""</script>

	    <script type="text/javascript">
       function passageiro()"""),format.raw/*72.29*/("""{"""),format.raw/*72.30*/("""
		   """),format.raw/*73.6*/("""document.getElementById('infoMotorista').style.visibility = 'hidden';
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""
	   """),format.raw/*75.5*/("""function motorista()"""),format.raw/*75.25*/("""{"""),format.raw/*75.26*/("""
		   """),format.raw/*76.6*/("""document.getElementById('infoMotorista').style.visibility = 'visible';
		"""),format.raw/*77.3*/("""}"""),format.raw/*77.4*/("""

       """),format.raw/*79.8*/("""function cadastro()"""),format.raw/*79.27*/("""{"""),format.raw/*79.28*/("""
			"""),format.raw/*80.4*/("""document.getElementById('loginCadastroBox').innerHTML = document.getElementById('divCadastro').innerHTML;
       """),format.raw/*81.8*/("""}"""),format.raw/*81.9*/("""

       """),format.raw/*83.8*/("""function login()"""),format.raw/*83.24*/("""{"""),format.raw/*83.25*/("""
		"""),format.raw/*84.3*/("""document.getElementById('loginCadastroBox').innerHTML = document.getElementById('divLogin').innerHTML;
       """),format.raw/*85.8*/("""}"""),format.raw/*85.9*/("""

       """),format.raw/*87.8*/("""function start()"""),format.raw/*87.24*/("""{"""),format.raw/*87.25*/("""
       	"""),format.raw/*88.9*/("""login();
       """),format.raw/*89.8*/("""}"""),format.raw/*89.9*/("""

       """),format.raw/*91.8*/("""window.onload = start;
    </script>
	<link rel="icon" type="img/ico" href="assets/SBAdminTemplate/img/favicon.ico">
	</head>
	<body>
	<br/>
	<img src="assets/CreativeTemplate/img/logo_curso.png" style="margin-left: 20px;">

	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-5" align="left" style="margin-left: 20px;">
				<h1 class="text-faded">
					<span style="color: #F33"><br/>
       		      <span style="color: #F63">"""),_display_(/*104.43*/Messages("tela_login.cabecalho")),format.raw/*104.75*/("""</span><span style="color: rgba(255,102,51,0.7)"><span style="color: rgba(255,51,51,0.7)"> </span></span></h1>
		        <h2 class="text-faded">"""),_display_(/*105.35*/Messages("tela_login.subtitulo")),format.raw/*105.67*/("""</h2>
				<img src="assets/CreativeTemplate/img/checkmark.png" align="left" width="30"><h4 class="text-faded">"""),_display_(/*106.106*/Messages("tela_login.listagem1")),format.raw/*106.138*/("""</h4>
				<br/>
		        <img src="assets/CreativeTemplate/img/checkmark.png" align="left" width="30"><h4 class="text-faded">"""),_display_(/*108.112*/Messages("tela_login.listagem2")),format.raw/*108.144*/("""</h4>
		        <br/>
		        <img src="assets/CreativeTemplate/img/checkmark.png" align="left" width="30"><h4 class="text-faded">"""),_display_(/*110.112*/Messages("tela_login.listagem3")),format.raw/*110.144*/("""</h4>
			</div>

		<div class="col-lg-2">
			<div class="container-fluid">
			</div>
		</div>
		<div id="loginCadastroBox" class="col-lg-4" style="border: 1px solid #888; border-radius: 20px; width: 500px; vertical-align: center; background: #000; filter:alpha(opacity=80); opacity: 0.8;  margin-left: 15%; text-align: center; color: white;">
	    </div>

			<div id="divLogin" style="display: none; margin-top: 5%;" >

		"""),_display_(/*122.4*/helper/*122.10*/.form(action = routes.AutenticacaoController.efetuaLogin())/*122.69*/ {_display_(Seq[Any](format.raw/*122.71*/("""
				"""),format.raw/*123.5*/("""<img src="assets/CreativeTemplate/img/logo_vumbora.png" width="300">
				"""),_display_(/*124.6*/helper/*124.12*/.inputText(formularioAutenticacao("matricula"), '_label -> Messages("tela_login.login"), '_showConstraints -> false)),format.raw/*124.128*/("""
				"""),_display_(/*125.6*/helper/*125.12*/.inputPassword(formularioAutenticacao("senha"), '_label -> Messages("global.senha"), '_showConstraints -> false)),format.raw/*125.124*/("""
				"""),format.raw/*126.5*/("""<input type="submit" value="Login" class="btn btn-default btn-xl"></input>
			""")))}),format.raw/*127.5*/("""
				"""),format.raw/*128.5*/("""<a class="btn" onclick="cadastro()">"""),_display_(/*128.42*/Messages("tela_login.nao_cadastrado")),format.raw/*128.79*/("""</a>
			</div>
</div>
		<div id="divCadastro" style="display: none; margin-top: 0px; margin: 0px auto;" >
				"""),_display_(/*132.6*/helper/*132.12*/.form(action = routes.AutenticacaoController.cadastraUsuario())/*132.75*/ {_display_(Seq[Any](format.raw/*132.77*/("""
				"""),format.raw/*133.5*/("""<img src="assets/CreativeTemplate/img/logo_vumbora.png" width="300">
				<div class="row-sm-12">
						<div class="col-sm-6">
							<div>"""),_display_(/*136.14*/helper/*136.20*/.inputText(formularioAutenticacao("nome"), '_label ->  Messages("global.nome"), '_showConstraints -> false)),format.raw/*136.127*/("""</div>
							<div>"""),_display_(/*137.14*/helper/*137.20*/.inputText(formularioAutenticacao("matricula"), '_label -> Messages("global.matricula"), '_showConstraints -> false)),format.raw/*137.136*/("""</div>
							<div>"""),_display_(/*138.14*/helper/*138.20*/.inputText(formularioAutenticacao("numeroDeTelefone"), '_label -> Messages("global.telefone"), '_showConstraints -> false)),format.raw/*138.142*/("""</div>
						</div>

						<div class="col-sm-6">
							<div>"""),_display_(/*142.14*/helper/*142.20*/.inputText(formularioAutenticacao("email"), '_label -> "Email", '_showConstraints -> false)),format.raw/*142.111*/("""</div>
							<div>"""),_display_(/*143.14*/helper/*143.20*/.inputPassword(formularioAutenticacao("senha"), '_label -> Messages("global.senha"), '_showConstraints -> false)),format.raw/*143.132*/("""</div>
							<div>"""),_display_(/*144.14*/helper/*144.20*/.inputText(formularioEndereco("rua"), '_label -> Messages("global.rua"), '_showConstraints -> false)),format.raw/*144.120*/("""</div>
						</div>
			</div>
				<div>"""),_display_(/*147.11*/helper/*147.17*/.select(formularioEndereco("bairro"), helper.options(bairros), '_label -> Messages("global.bairro"))),format.raw/*147.117*/("""</div>
				<div>"""),_display_(/*148.11*/helper/*148.17*/.select(formularioAutenticacao("numeroVagas"), helper.options(Seq(Messages("tela_login.sem_carro"),"1","2","3","4","5","6","7","8")), '_label -> Messages("tela_login.vagas"))),format.raw/*148.191*/("""</div>

				<input type="submit" value="""),_display_(/*150.33*/Messages("tela_login.cadastrar")),format.raw/*150.65*/(""" """),format.raw/*150.66*/("""class="btn btn-default btn-xl"></input>
			</br>
				<a class="btn" onclick="login()">"""),_display_(/*152.39*/Messages("tela_login.sou_cadastrado")),format.raw/*152.76*/("""</a>
				</div>
				""")))}),format.raw/*154.6*/("""
			"""),format.raw/*155.4*/("""</div>
		</div>

	<div style="position: fixed; bottom: 1%; right: 35%;  vertical-align: bottom; margin-left: 80px; text-align: center; color: lightgray; font-size: medium" >
		<a href="redefineIdioma?id=1">Português</a>   -   <a href="redefineIdioma?id=2">English</a>   -   <a href="redefineIdioma?id=3">Español</a>   -   <a href="redefineIdioma?id=4">Italiano</a>
	</div>

		<!-- jQuery -->
	    <script src="assets/CreativeTemplate/js/jquery.js"></script>

	    <!-- Bootstrap Core JavaScript -->
	    <script src="assets/CreativeTemplate/js/bootstrap.min.js"></script>
	    <script src="assets/CreativeTemplate/js/bootstrap-switch/dist/js/bootstrap-switch.js"></script>
	    <script src="assets/CreativeTemplate/js/bootstrap-switch/dist/js/bootstrap-switch.min.js"></script>

	    <!-- Plugin JavaScript -->
	    <script src="assets/CreativeTemplate/js/jquery.easing.min.js"></script>
	    <script src="assets/CreativeTemplate/js/jquery.fittext.js"></script>
	    <script src="assets/CreativeTemplate/js/wow.min.js"></script>

	    <!-- Custom Theme JavaScript -->
	    <script src="assets/CreativeTemplate/js/creative.js"></script>
	</body>
</html>
""")))}),format.raw/*179.2*/("""
"""))
      }
    }
  }

  def render(formularioAutenticacao:Form[Dados],formularioEndereco:Form[Endereco],bairros:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(formularioAutenticacao,formularioEndereco,bairros)

  def f:((Form[Dados],Form[Endereco],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (formularioAutenticacao,formularioEndereco,bairros) => apply(formularioAutenticacao,formularioEndereco,bairros)

  def ref: this.type = this

}


}

/**/
object telaLoginCadastro extends telaLoginCadastro_Scope0.telaLoginCadastro
              /*
                  -- GENERATED --
                  DATE: Thu May 12 22:39:55 GMT-03:00 2016
                  SOURCE: C:/Users/Dandara/Desktop/ProjetoSI1/app/views/telaLoginCadastro.scala.html
                  HASH: 2dc134d3d0548b297aeecd34ec1bfd6d9c20de4c
                  MATRIX: 802->1|993->97|1023->102|1063->134|1101->135|1131->139|2910->1890|2939->1891|2975->1900|3180->2078|3208->2079|3243->2087|3276->2092|3305->2093|3338->2099|3383->2117|3411->2118|3443->2123|3477->2129|3506->2130|3539->2136|3584->2154|3612->2155|3646->2162|3690->2178|3719->2179|3752->2185|3825->2231|3853->2232|3889->2241|4006->2330|4035->2331|4071->2340|4105->2347|4164->2385|4201->2395|4229->2396|4263->2403|4354->2466|4383->2467|4419->2476|4453->2483|4509->2518|4543->2525|4571->2526|4605->2533|4712->2612|4741->2613|4775->2620|4875->2693|4903->2694|4936->2700|4984->2720|5013->2721|5047->2728|5148->2802|5176->2803|5214->2814|5261->2833|5290->2834|5322->2839|5463->2953|5491->2954|5529->2965|5573->2981|5602->2982|5633->2986|5771->3097|5799->3098|5837->3109|5881->3125|5910->3126|5947->3136|5991->3153|6019->3154|6057->3165|6547->3627|6601->3659|6775->3805|6829->3837|6970->3949|7025->3981|7183->4110|7238->4142|7402->4277|7457->4309|7919->4744|7935->4750|8004->4809|8045->4811|8079->4817|8181->4892|8197->4898|8336->5014|8370->5021|8386->5027|8521->5139|8555->5145|8666->5225|8700->5231|8765->5268|8824->5305|8966->5420|8982->5426|9055->5489|9096->5491|9130->5497|9300->5639|9316->5645|9446->5752|9495->5773|9511->5779|9650->5895|9699->5916|9715->5922|9860->6044|9955->6111|9971->6117|10085->6208|10134->6229|10150->6235|10285->6347|10334->6368|10350->6374|10473->6474|10544->6517|10560->6523|10683->6623|10729->6641|10745->6647|10942->6821|11012->6863|11066->6895|11096->6896|11213->6985|11272->7022|11326->7045|11359->7050|12568->8228
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|71->40|71->40|72->41|76->45|76->45|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|80->49|81->50|82->51|82->51|84->53|84->53|84->53|85->54|87->56|87->56|89->58|92->61|92->61|93->62|93->62|93->62|94->63|94->63|95->64|97->66|97->66|98->67|98->67|98->67|99->68|99->68|100->69|103->72|103->72|104->73|105->74|105->74|106->75|106->75|106->75|107->76|108->77|108->77|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|120->89|120->89|122->91|135->104|135->104|136->105|136->105|137->106|137->106|139->108|139->108|141->110|141->110|153->122|153->122|153->122|153->122|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|158->127|159->128|159->128|159->128|163->132|163->132|163->132|163->132|164->133|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|173->142|173->142|173->142|174->143|174->143|174->143|175->144|175->144|175->144|178->147|178->147|178->147|179->148|179->148|179->148|181->150|181->150|181->150|183->152|183->152|185->154|186->155|210->179
                  -- GENERATED --
              */
          