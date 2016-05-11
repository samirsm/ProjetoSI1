
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
                  DATE: Wed May 11 15:42:30 BRT 2016
                  SOURCE: /home/paulovss/CaronaUFCG20152/ProjetoSI1/app/views/telaLoginCadastro.scala.html
                  HASH: 30993294aef48e002beebde9c7b3e9c713779e0b
                  MATRIX: 802->1|993->97|1021->100|1061->132|1099->133|1127->135|2871->1851|2900->1852|2935->1860|3136->2034|3164->2035|3198->2042|3231->2047|3260->2048|3292->2053|3336->2070|3364->2071|3395->2075|3429->2081|3458->2082|3490->2087|3534->2104|3562->2105|3594->2110|3638->2126|3667->2127|3699->2132|3770->2176|3798->2177|3832->2184|3946->2270|3975->2271|4010->2279|4044->2286|4103->2324|4139->2333|4167->2334|4200->2340|4289->2401|4318->2402|4353->2410|4387->2417|4443->2452|4476->2458|4504->2459|4537->2465|4641->2541|4670->2542|4703->2548|4802->2620|4830->2621|4862->2626|4910->2646|4939->2647|4972->2653|5072->2726|5100->2727|5136->2736|5183->2755|5212->2756|5243->2760|5383->2873|5411->2874|5447->2883|5491->2899|5520->2900|5550->2903|5687->3013|5715->3014|5751->3023|5795->3039|5824->3040|5860->3049|5903->3065|5931->3066|5967->3075|6444->3524|6498->3556|6671->3701|6725->3733|6865->3844|6920->3876|7076->4003|7131->4035|7293->4168|7348->4200|7798->4623|7814->4629|7883->4688|7924->4690|7957->4695|8058->4769|8074->4775|8213->4891|8246->4897|8262->4903|8397->5015|8430->5020|8540->5099|8573->5104|8638->5141|8697->5178|8835->5289|8851->5295|8924->5358|8965->5360|8998->5365|9165->5504|9181->5510|9311->5617|9359->5637|9375->5643|9514->5759|9562->5779|9578->5785|9723->5907|9814->5970|9830->5976|9944->6067|9992->6087|10008->6093|10143->6205|10191->6225|10207->6231|10330->6331|10398->6371|10414->6377|10537->6477|10582->6494|10598->6500|10795->6674|10863->6714|10917->6746|10947->6747|11062->6834|11121->6871|11173->6892|11205->6896|12390->8050
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|71->40|71->40|72->41|76->45|76->45|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|80->49|81->50|82->51|82->51|84->53|84->53|84->53|85->54|87->56|87->56|89->58|92->61|92->61|93->62|93->62|93->62|94->63|94->63|95->64|97->66|97->66|98->67|98->67|98->67|99->68|99->68|100->69|103->72|103->72|104->73|105->74|105->74|106->75|106->75|106->75|107->76|108->77|108->77|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|120->89|120->89|122->91|135->104|135->104|136->105|136->105|137->106|137->106|139->108|139->108|141->110|141->110|153->122|153->122|153->122|153->122|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|158->127|159->128|159->128|159->128|163->132|163->132|163->132|163->132|164->133|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|173->142|173->142|173->142|174->143|174->143|174->143|175->144|175->144|175->144|178->147|178->147|178->147|179->148|179->148|179->148|181->150|181->150|181->150|183->152|183->152|185->154|186->155|210->179
                  -- GENERATED --
              */
          