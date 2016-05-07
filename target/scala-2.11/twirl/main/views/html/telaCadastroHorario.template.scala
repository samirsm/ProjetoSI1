
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object telaCadastroHorario_Scope0 {
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

class telaCadastroHorario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Usuario,Form[Horario],List[Horario],List[Horario],List[String],List[Notificacao],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario, novoHorario: Form[Horario], horariosExistentesIda: List[Horario], horariosExistentesVolta: List[Horario], bairros: List[String], notificacoes: List[Notificacao]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.182*/("""

"""),_display_(/*3.2*/main(usuario, usuario.getCaronasMotorista(), notificacoes, "Primeiro acesso: Cadastro de horários")/*3.101*/{_display_(Seq[Any](format.raw/*3.102*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">

	<link rel="icon" type="img/ico"
		  href="assets/SBAdminTemplate/img/favicon.ico">

	<!-- Bootstrap Core CSS' -->
	<link href="assets/SBAdminTemplate/css/bootstrap.min.css"
		  rel="stylesheet">

	<!-- Custom CSS -->
	<link href="assets/SBAdminTemplate/css/sb-admin.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="assets/SBAdminTemplate/css/plugins/morris.css"


	rel="stylesheet">

<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

	<!-- Morris Charts CSS -->
	<link href="assets/SBAdminTemplate/css/plugins/morris.css"
		  rel="stylesheet">

	<!-- Custom Fonts -->
	<link
			href="assets/SBAdminTemplate/font-awesome/css/font-awesome.min.css"
			rel="stylesheet" type="text/css">

	<script type="text/javascript">



		function cadastrarNovoEndereco()"""),format.raw/*48.35*/("""{"""),format.raw/*48.36*/("""
			"""),format.raw/*49.4*/("""document.getElementById('cadastraHorarioBox').innerHTML = document.getElementById('cadastraEndereco').innerHTML;
		"""),format.raw/*50.3*/("""}"""),format.raw/*50.4*/("""

		"""),format.raw/*52.3*/("""function cadastrarNovoHorario()"""),format.raw/*52.34*/("""{"""),format.raw/*52.35*/("""
			"""),format.raw/*53.4*/("""document.getElementById('cadastraHorarioBox').innerHTML = document.getElementById('cadastraHorario').innerHTML;
		"""),format.raw/*54.3*/("""}"""),format.raw/*54.4*/("""

		"""),format.raw/*56.3*/("""function start()"""),format.raw/*56.19*/("""{"""),format.raw/*56.20*/("""
			"""),format.raw/*57.4*/("""cadastrarNovoHorario();
		"""),format.raw/*58.3*/("""}"""),format.raw/*58.4*/("""
		"""),format.raw/*59.3*/("""window.onload = start;
	</script>
	<script>
	$(function() """),format.raw/*62.15*/("""{"""),format.raw/*62.16*/("""
	    """),format.raw/*63.6*/("""$( "#show-option" ).tooltip("""),format.raw/*63.34*/("""{"""),format.raw/*63.35*/("""
	        """),format.raw/*64.10*/("""show: """),format.raw/*64.16*/("""{"""),format.raw/*64.17*/("""
	        """),format.raw/*65.10*/("""effect: "slideDown",
	        delay: 300
	        """),format.raw/*67.10*/("""}"""),format.raw/*67.11*/("""
	    """),format.raw/*68.6*/("""}"""),format.raw/*68.7*/(""");
	"""),format.raw/*69.2*/("""}"""),format.raw/*69.3*/(""");
	</script>
</head>

<body>




<div class="container-fluid">
	<div class="nav navbar-nav top-information">

		<div id="cadastraHorarioBox" style=" padding-left: 20px; padding-right: 20px; width: 96%; border: 2px solid #888; border-radius: 20px; vertical-align: center; background: rgb(000, 00, 00); background: rgba(000, 00, 00, 0.5); color: white; color: white;">
		</div>


		<div id="cadastraHorario" style="display: none">
			"""),_display_(/*86.5*/helper/*86.11*/.form(action = routes.HorariosController.cadastra())/*86.63*/{_display_(Seq[Any](format.raw/*86.64*/("""
			"""),format.raw/*87.4*/("""<h2 style="text-align: center;">"""),_display_(/*87.37*/Messages("horarios.cadastre")),format.raw/*87.66*/("""</h2>
			<div class="row">
				<div class="col-sm-4">
					<div class="form-group">
						<label>"""),_display_(/*91.15*/Messages("horarios.hora")),format.raw/*91.40*/("""</label> <select name="hora"class="form-control">
						<option>08</option>
						<option>10</option>
						<option>12</option>
						<option>14</option>
						<option>16</option>
						<option>18</option>
					</select>
					</div>
				</div>

				<div class="col-sm-4">
					<div class="form-group">
						<label>"""),_display_(/*104.15*/Messages("horarios.dia")),format.raw/*104.39*/("""</label> <select name="diaDaSemana" class="form-control">
						<option>"""),_display_(/*105.16*/Messages("dias.segunda")),format.raw/*105.40*/("""</option>
						<option>"""),_display_(/*106.16*/Messages("dias.terca")),format.raw/*106.38*/("""</option>
						<option>"""),_display_(/*107.16*/Messages("dias.quarta")),format.raw/*107.39*/("""</option>
						<option>"""),_display_(/*108.16*/Messages("dias.quinta")),format.raw/*108.39*/("""</option>
						<option>"""),_display_(/*109.16*/Messages("dias.sexta")),format.raw/*109.38*/("""</option>
					</select>
					</div>
				</div>
				<div class="form-group" align="left">
					<label class="radio-inline"> </br> <input type="radio" name="tipo" value="ida" checked="checked">"""),_display_(/*114.104*/Messages("global.ida")),format.raw/*114.126*/("""
					"""),format.raw/*115.6*/("""</label> <label class="radio-inline"> </br> <input type="radio" name="tipo" value="volta">"""),_display_(/*115.97*/Messages("global.volta")),format.raw/*115.121*/("""
				"""),format.raw/*116.5*/("""</label> <label class="checkbox-inline"> </br> <input type="submit"
																	  value="+" class="btn btn-success btn-l"
																	  style="float: right" onclick="adicionaHorario()"></input>
				</label>
				</div>

				<div class="row">
					<div class="col-sm-6">
						<a class="btn" onclick="cadastrarNovoEndereco()" align="left">"""),_display_(/*124.70*/Messages("horarios.novo_endereco")),format.raw/*124.104*/("""</a>
					</div>
				</div>

			</div>
		</div>
		""")))}),format.raw/*130.4*/("""

		"""),format.raw/*132.3*/("""<div id="cadastraEndereco" style="display: none">
			"""),_display_(/*133.5*/helper/*133.11*/.form(action = routes.HorariosController.cadastraNovoEndereco())/*133.75*/{_display_(Seq[Any](format.raw/*133.76*/("""

			"""),format.raw/*135.4*/("""<h2 style="text-align: center;">"""),_display_(/*135.37*/Messages("horarios.cadastre_endereco")),format.raw/*135.75*/("""</h2>
			<div class="row">
				<div class="col-sm-4">
					<div class="form-group">
						<label for="usr">"""),_display_(/*139.25*/Messages("horarios.rua")),format.raw/*139.49*/("""</label>
						<input type="text" name="Rua" class="form-control">
					</div>
				</div>
				<div class="col-sm-4">
					<div class="form-group">
						<label>"""),_display_(/*145.15*/Messages("horarios.bairro")),format.raw/*145.42*/("""</label> <select name="Bairros" class="form-control">
						"""),_display_(/*146.8*/for(bairro <- bairros) yield /*146.30*/{_display_(Seq[Any](format.raw/*146.31*/("""
						"""),format.raw/*147.7*/("""<option>
							"""),_display_(/*148.9*/bairro),format.raw/*148.15*/("""
						"""),format.raw/*149.7*/("""</option>
						""")))}),format.raw/*150.8*/("""

					"""),format.raw/*152.6*/("""</select>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="form-group" >
						<label class="checkbox-inline"> </br> <input type="submit"
																	 value="""),_display_(/*158.26*/Messages("horarios.cadastrar_endereco")),format.raw/*158.65*/(""" """),format.raw/*158.66*/("""class="btn btn-warning btn-l"></input>
						</label>
					</div>
				</div>
				""")))}),format.raw/*162.6*/("""
				"""),format.raw/*163.5*/("""<div class="row">
					<div class="col-sm-12">
						<a class="btn" onclick="cadastrarNovoHorario()" align="left">"""),_display_(/*165.69*/Messages("horarios.voltar")),format.raw/*165.96*/("""</a>
					</div>
				</div>
			</div>
		</div>

		<div>
			<h3 class="page-header" style="color: #FFF; font-size: 18px">
					<img src="assets/CreativeTemplate/img/agendamentos.png" height="40" width="40"></i>&nbsp """),_display_(/*173.96*/Messages("horarios.cadastrados")),format.raw/*173.128*/("""
			"""),format.raw/*174.4*/("""</h3>
		</div>
	</div>
</div>

<div id="wrapper">
		<div id="page-wrapper">
			<div class="container-fluid">
					<div class="row-xs-12">
							<div class="col-xs-6">
									<table class="table">
									    <thead>
									        <tr>
												<th><i class="fa fa-calendar"></i> """),_display_(/*187.49*/Messages("horarios.ida")),format.raw/*187.73*/("""</th>
												<th>       </th>
												<th><i class="fa fa-clock-o"></i></th>
												<th>       </th>
											</tr>
									    </thead>
									    <tbody>
												"""),_display_(/*194.14*/for(horario <- horariosExistentesIda) yield /*194.51*/{_display_(Seq[Any](format.raw/*194.52*/("""
													"""),format.raw/*195.14*/("""<tr>
														<th>"""),_display_(/*196.20*/horario/*196.27*/.getDia()),format.raw/*196.36*/("""</th>
														<th>       </th>
														<th>"""),_display_(/*198.20*/horario/*198.27*/.getHora()),format.raw/*198.37*/("""</th>
														<th><a href="excluiHorarioIda?dia="""),_display_(/*199.50*/horario/*199.57*/.getDia()),format.raw/*199.66*/("""&hora="""),_display_(/*199.73*/horario/*199.80*/.getHora()),format.raw/*199.90*/("""" id="show-option" title="Excluir"><i class="fa fa-close"></i></a></th>
													</tr>
												""")))}),format.raw/*201.14*/("""
									    """),format.raw/*202.14*/("""</tbody>
									</table>
							</div>
							<div class="col-xs-6">
									<table class="table">
									    <thead>
									        <tr>
												<th><i class="fa fa-calendar"></i> """),_display_(/*209.49*/Messages("horarios.volta")),format.raw/*209.75*/("""</th>
												<th>       </th>
												<th><i class="fa fa-clock-o"></i></th>
												<th>       </th>
											</tr>
									    </thead>
									    <tbody>
												"""),_display_(/*216.14*/for(horarioVolta <- horariosExistentesVolta) yield /*216.58*/{_display_(Seq[Any](format.raw/*216.59*/("""
													"""),format.raw/*217.14*/("""<tr>
														<th>"""),_display_(/*218.20*/horarioVolta/*218.32*/.getDia()),format.raw/*218.41*/("""</th>
														<th>       </th>
														<th>"""),_display_(/*220.20*/horarioVolta/*220.32*/.getHora()),format.raw/*220.42*/("""</th>
														<th><a href="excluiHorarioVolta?dia="""),_display_(/*221.52*/horarioVolta/*221.64*/.getDia()),format.raw/*221.73*/("""&hora="""),_display_(/*221.80*/horarioVolta/*221.92*/.getHora()),format.raw/*221.102*/("""" data-toggle="tooltip" title="Excluir"><i class="fa fa-close"></i></a></th>
													</tr>
												""")))}),format.raw/*223.14*/("""
									    """),format.raw/*224.14*/("""</tbody>
									</table>
							</div>

						<div class="row-xs-12">
							"""),_display_(/*229.9*/helper/*229.15*/.form(action = routes.HorariosController.cadastraHorarios())/*229.75*/{_display_(Seq[Any](format.raw/*229.76*/("""
								"""),format.raw/*230.9*/("""<div class="col-xs-12">
									<div class="form-group" align="right">
										<label class="checkbox-inline"> </br> <input type="submit"
											value="Concluido" class="btn btn-warning btn-l"></input>
										</label>

									</div>
								</div>
								""")))}),format.raw/*238.10*/("""
							"""),format.raw/*239.8*/("""</div>

						</div>
					</div>

				</div>

			</div>
		</div>
	</div>
</div>
<!-- /#wrapper -->

</body>

</html>
""")))}),format.raw/*255.2*/("""
"""))
      }
    }
  }

  def render(usuario:Usuario,novoHorario:Form[Horario],horariosExistentesIda:List[Horario],horariosExistentesVolta:List[Horario],bairros:List[String],notificacoes:List[Notificacao]): play.twirl.api.HtmlFormat.Appendable = apply(usuario,novoHorario,horariosExistentesIda,horariosExistentesVolta,bairros,notificacoes)

  def f:((Usuario,Form[Horario],List[Horario],List[Horario],List[String],List[Notificacao]) => play.twirl.api.HtmlFormat.Appendable) = (usuario,novoHorario,horariosExistentesIda,horariosExistentesVolta,bairros,notificacoes) => apply(usuario,novoHorario,horariosExistentesIda,horariosExistentesVolta,bairros,notificacoes)

  def ref: this.type = this

}


}

/**/
object telaCadastroHorario extends telaCadastroHorario_Scope0.telaCadastroHorario
              /*
                  -- GENERATED --
                  DATE: Sat May 07 05:33:49 BRT 2016
                  SOURCE: /Users/samirsmedeiros/ProjetoSI1/app/views/telaCadastroHorario.scala.html
                  HASH: 4e2489d9a390c82da244418a330c3d2d09b0381d
                  MATRIX: 847->1|1123->181|1151->184|1259->283|1298->284|1325->285|2567->1499|2596->1500|2627->1504|2769->1619|2797->1620|2828->1624|2887->1655|2916->1656|2947->1660|3088->1774|3116->1775|3147->1779|3191->1795|3220->1796|3251->1800|3304->1826|3332->1827|3362->1830|3448->1888|3477->1889|3510->1895|3566->1923|3595->1924|3633->1934|3667->1940|3696->1941|3734->1951|3812->2001|3841->2002|3874->2008|3902->2009|3933->2013|3961->2014|4421->2448|4436->2454|4497->2506|4536->2507|4567->2511|4627->2544|4677->2573|4802->2671|4848->2696|5192->3012|5238->3036|5339->3109|5385->3133|5438->3158|5482->3180|5535->3205|5580->3228|5633->3253|5678->3276|5731->3301|5775->3323|5997->3516|6042->3538|6076->3544|6195->3635|6242->3659|6275->3664|6651->4012|6708->4046|6790->4097|6822->4101|6903->4155|6919->4161|6993->4225|7033->4226|7066->4231|7127->4264|7187->4302|7323->4410|7369->4434|7558->4595|7607->4622|7695->4683|7734->4705|7774->4706|7809->4713|7853->4730|7881->4736|7916->4743|7964->4760|7999->4767|8208->4948|8269->4987|8299->4988|8412->5070|8445->5075|8588->5190|8637->5217|8881->5433|8936->5465|8968->5469|9286->5759|9332->5783|9548->5971|9602->6008|9642->6009|9685->6023|9737->6047|9754->6054|9785->6063|9869->6119|9886->6126|9918->6136|10001->6191|10018->6198|10049->6207|10084->6214|10101->6221|10133->6231|10269->6335|10312->6349|10533->6542|10581->6568|10797->6756|10858->6800|10898->6801|10941->6815|10993->6839|11015->6851|11046->6860|11130->6916|11152->6928|11184->6938|11269->6995|11291->7007|11322->7016|11357->7023|11379->7035|11412->7045|11553->7154|11596->7168|11703->7248|11719->7254|11789->7314|11829->7315|11866->7324|12167->7593|12203->7601|12352->7719
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|79->48|79->48|80->49|81->50|81->50|83->52|83->52|83->52|84->53|85->54|85->54|87->56|87->56|87->56|88->57|89->58|89->58|90->59|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|98->67|98->67|99->68|99->68|100->69|100->69|117->86|117->86|117->86|117->86|118->87|118->87|118->87|122->91|122->91|135->104|135->104|136->105|136->105|137->106|137->106|138->107|138->107|139->108|139->108|140->109|140->109|145->114|145->114|146->115|146->115|146->115|147->116|155->124|155->124|161->130|163->132|164->133|164->133|164->133|164->133|166->135|166->135|166->135|170->139|170->139|176->145|176->145|177->146|177->146|177->146|178->147|179->148|179->148|180->149|181->150|183->152|189->158|189->158|189->158|193->162|194->163|196->165|196->165|204->173|204->173|205->174|218->187|218->187|225->194|225->194|225->194|226->195|227->196|227->196|227->196|229->198|229->198|229->198|230->199|230->199|230->199|230->199|230->199|230->199|232->201|233->202|240->209|240->209|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|251->220|251->220|252->221|252->221|252->221|252->221|252->221|252->221|254->223|255->224|260->229|260->229|260->229|260->229|261->230|269->238|270->239|286->255
                  -- GENERATED --
              */
          