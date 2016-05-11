
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

"""),_display_(/*3.2*/main(usuario, usuario.getCaronas(), notificacoes, "Cadastre seus Horários")/*3.77*/{_display_(Seq[Any](format.raw/*3.78*/("""
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
                  DATE: Wed May 11 15:42:30 BRT 2016
                  SOURCE: /home/paulovss/CaronaUFCG20152/ProjetoSI1/app/views/telaCadastroHorario.scala.html
                  HASH: 3928982785e08eb59c9de4a8ae9e4b3905741598
                  MATRIX: 847->1|1123->181|1151->184|1234->259|1272->260|1299->261|2541->1475|2570->1476|2601->1480|2743->1595|2771->1596|2802->1600|2861->1631|2890->1632|2921->1636|3062->1750|3090->1751|3121->1755|3165->1771|3194->1772|3225->1776|3278->1802|3306->1803|3336->1806|3422->1864|3451->1865|3484->1871|3540->1899|3569->1900|3607->1910|3641->1916|3670->1917|3708->1927|3786->1977|3815->1978|3848->1984|3876->1985|3907->1989|3935->1990|4395->2424|4410->2430|4471->2482|4510->2483|4541->2487|4601->2520|4651->2549|4776->2647|4822->2672|5166->2988|5212->3012|5313->3085|5359->3109|5412->3134|5456->3156|5509->3181|5554->3204|5607->3229|5652->3252|5705->3277|5749->3299|5971->3492|6016->3514|6050->3520|6169->3611|6216->3635|6249->3640|6625->3988|6682->4022|6764->4073|6796->4077|6877->4131|6893->4137|6967->4201|7007->4202|7040->4207|7101->4240|7161->4278|7297->4386|7343->4410|7532->4571|7581->4598|7669->4659|7708->4681|7748->4682|7783->4689|7827->4706|7855->4712|7890->4719|7938->4736|7973->4743|8182->4924|8243->4963|8273->4964|8386->5046|8419->5051|8562->5166|8611->5193|8855->5409|8910->5441|8942->5445|9260->5735|9306->5759|9522->5947|9576->5984|9616->5985|9659->5999|9711->6023|9728->6030|9759->6039|9843->6095|9860->6102|9892->6112|9975->6167|9992->6174|10023->6183|10058->6190|10075->6197|10107->6207|10243->6311|10286->6325|10507->6518|10555->6544|10771->6732|10832->6776|10872->6777|10915->6791|10967->6815|10989->6827|11020->6836|11104->6892|11126->6904|11158->6914|11243->6971|11265->6983|11296->6992|11331->6999|11353->7011|11386->7021|11527->7130|11570->7144|11677->7224|11693->7230|11763->7290|11803->7291|11840->7300|12141->7569|12177->7577|12326->7695
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|79->48|79->48|80->49|81->50|81->50|83->52|83->52|83->52|84->53|85->54|85->54|87->56|87->56|87->56|88->57|89->58|89->58|90->59|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|98->67|98->67|99->68|99->68|100->69|100->69|117->86|117->86|117->86|117->86|118->87|118->87|118->87|122->91|122->91|135->104|135->104|136->105|136->105|137->106|137->106|138->107|138->107|139->108|139->108|140->109|140->109|145->114|145->114|146->115|146->115|146->115|147->116|155->124|155->124|161->130|163->132|164->133|164->133|164->133|164->133|166->135|166->135|166->135|170->139|170->139|176->145|176->145|177->146|177->146|177->146|178->147|179->148|179->148|180->149|181->150|183->152|189->158|189->158|189->158|193->162|194->163|196->165|196->165|204->173|204->173|205->174|218->187|218->187|225->194|225->194|225->194|226->195|227->196|227->196|227->196|229->198|229->198|229->198|230->199|230->199|230->199|230->199|230->199|230->199|232->201|233->202|240->209|240->209|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|251->220|251->220|252->221|252->221|252->221|252->221|252->221|252->221|254->223|255->224|260->229|260->229|260->229|260->229|261->230|269->238|270->239|286->255
                  -- GENERATED --
              */
          