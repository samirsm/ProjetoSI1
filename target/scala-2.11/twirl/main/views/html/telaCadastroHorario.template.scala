
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

	<!-- Custom Fonts -->
	<link
			href="assets/SBAdminTemplate/font-awesome/css/font-awesome.min.css"
			rel="stylesheet" type="text/css">

	<script type="text/javascript">




		function cadastrarNovoEndereco()"""),format.raw/*39.35*/("""{"""),format.raw/*39.36*/("""
			"""),format.raw/*40.4*/("""document.getElementById('cadastraHorarioBox').innerHTML = document.getElementById('cadastraEndereco').innerHTML;
		"""),format.raw/*41.3*/("""}"""),format.raw/*41.4*/("""

		"""),format.raw/*43.3*/("""function cadastrarNovoHorario()"""),format.raw/*43.34*/("""{"""),format.raw/*43.35*/("""
			"""),format.raw/*44.4*/("""document.getElementById('cadastraHorarioBox').innerHTML = document.getElementById('cadastraHorario').innerHTML;
		"""),format.raw/*45.3*/("""}"""),format.raw/*45.4*/("""

		"""),format.raw/*47.3*/("""function start()"""),format.raw/*47.19*/("""{"""),format.raw/*47.20*/("""
			"""),format.raw/*48.4*/("""cadastrarNovoHorario();
		"""),format.raw/*49.3*/("""}"""),format.raw/*49.4*/("""
		"""),format.raw/*50.3*/("""window.onload = start;
	</script>
</head>

<body>




<div class="container-fluid">
	<div class="nav navbar-nav top-information">

		<div id="cadastraHorarioBox" style=" padding-left: 20px; padding-right: 20px; width: 96%; border: 2px solid #888; border-radius: 20px; vertical-align: center; background: rgb(000, 00, 00); background: rgba(000, 00, 00, 0.5); color: white; color: white;">
		</div>


		<div id="cadastraHorario" style="display: none">
			"""),_display_(/*67.5*/helper/*67.11*/.form(action = routes.HorariosController.cadastra())/*67.63*/{_display_(Seq[Any](format.raw/*67.64*/("""
			"""),format.raw/*68.4*/("""<h2 style="text-align: center;">"""),_display_(/*68.37*/Messages("horarios.cadastre")),format.raw/*68.66*/("""</h2>
			<div class="row">
				<div class="col-sm-4">
					<div class="form-group">
						<label>"""),_display_(/*72.15*/Messages("horarios.hora")),format.raw/*72.40*/("""</label> <select name="hora"class="form-control">
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
						<label>"""),_display_(/*85.15*/Messages("horarios.dia")),format.raw/*85.39*/("""</label> <select name="diaDaSemana" class="form-control">
						<option>Segunda</option>
						<option>Terça</option>
						<option>Quarta</option>
						<option>Quinta</option>
						<option>Sexta</option>
					</select>
					</div>
				</div>
				<div class="form-group" align="left">
					<label class="radio-inline"> </br> <input type="radio" name="tipo" value="ida" checked="checked">"""),_display_(/*95.104*/Messages("global.ida")),format.raw/*95.126*/("""
					"""),format.raw/*96.6*/("""</label> <label class="radio-inline"> </br> <input type="radio" name="tipo" value="volta">"""),_display_(/*96.97*/Messages("global.volta")),format.raw/*96.121*/("""
				"""),format.raw/*97.5*/("""</label> <label class="checkbox-inline"> </br> <input type="submit"
																	  value="+" class="btn btn-success btn-l"
																	  style="float: right" onclick="adicionaHorario()"></input>
				</label>
				</div>

				<div class="row">
					<div class="col-sm-6">
						<a class="btn" onclick="cadastrarNovoEndereco()" align="left">"""),_display_(/*105.70*/Messages("horarios.novo_endereco")),format.raw/*105.104*/("""</a>
					</div>
				</div>

			</div>
		</div>
		""")))}),format.raw/*111.4*/("""

		"""),format.raw/*113.3*/("""<div id="cadastraEndereco" style="display: none">
			"""),_display_(/*114.5*/helper/*114.11*/.form(action = routes.HorariosController.cadastraNovoEndereco())/*114.75*/{_display_(Seq[Any](format.raw/*114.76*/("""

			"""),format.raw/*116.4*/("""<h2 style="text-align: center;">"""),_display_(/*116.37*/Messages("horarios.cadastre_endereco")),format.raw/*116.75*/("""</h2>
			<div class="row">
				<div class="col-sm-4">
					<div class="form-group">
						<label for="usr">"""),_display_(/*120.25*/Messages("horarios.rua")),format.raw/*120.49*/("""</label>
						<input type="text" name="Rua" class="form-control">
					</div>
				</div>
				<div class="col-sm-4">
					<div class="form-group">
						<label>"""),_display_(/*126.15*/Messages("horarios.bairro")),format.raw/*126.42*/("""</label> <select name="Bairros" class="form-control">
						"""),_display_(/*127.8*/for(bairro <- bairros) yield /*127.30*/{_display_(Seq[Any](format.raw/*127.31*/("""
						"""),format.raw/*128.7*/("""<option>
							"""),_display_(/*129.9*/bairro),format.raw/*129.15*/("""
						"""),format.raw/*130.7*/("""</option>
						""")))}),format.raw/*131.8*/("""

					"""),format.raw/*133.6*/("""</select>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="form-group" >
						<label class="checkbox-inline"> </br> <input type="submit"
																	 value="Cadastrar" class="btn btn-warning btn-l"></input>
						</label>
					</div>
				</div>
				""")))}),format.raw/*143.6*/("""
				"""),format.raw/*144.5*/("""<div class="row">
					<div class="col-sm-12">
						<a class="btn" onclick="cadastrarNovoHorario()" align="left">"""),_display_(/*146.69*/Messages("horarios.voltar")),format.raw/*146.96*/("""</a>
					</div>
				</div>
			</div>
		</div>

		<div>
			<h3 class="page-header" style="color: #FFF; font-size: 18px">
				<i class="fa fa-calendar fa-2x"></i>&nbsp """),_display_(/*154.48*/Messages("horarios.cadastrados")),format.raw/*154.80*/("""
			"""),format.raw/*155.4*/("""</h3>
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
							<th><i class="fa fa-calendar"></i> """),_display_(/*168.44*/Messages("horarios.ida")),format.raw/*168.68*/("""</th>
							<th><i class="fa fa-clock-o"></th>
						</tr>
						</thead>
						<tbody>
						"""),_display_(/*173.8*/for(horario <- horariosExistentesIda) yield /*173.45*/{_display_(Seq[Any](format.raw/*173.46*/("""
						"""),format.raw/*174.7*/("""<tr>
							<th>"""),_display_(/*175.13*/horario/*175.20*/.getDia()),format.raw/*175.29*/("""</th>
							<th>"""),_display_(/*176.13*/horario/*176.20*/.getHora()),format.raw/*176.30*/("""</th>
						</tr>
						""")))}),format.raw/*178.8*/("""
						"""),format.raw/*179.7*/("""</tbody>
					</table>
				</div>
				<div class="col-xs-6">
					<table class="table">
						<thead>
						<tr>
							<th><i class="fa fa-calendar"></i> """),_display_(/*186.44*/Messages("horarios.volta")),format.raw/*186.70*/("""</th>
							<th><i class="fa fa-clock-o"></th>
						</tr>
						</thead>
						<tbody>
						"""),_display_(/*191.8*/for(horarioVolta <- horariosExistentesVolta) yield /*191.52*/{_display_(Seq[Any](format.raw/*191.53*/("""
						"""),format.raw/*192.7*/("""<tr>
							<th>"""),_display_(/*193.13*/horarioVolta/*193.25*/.getDia()),format.raw/*193.34*/("""</th>
							<th>"""),_display_(/*194.13*/horarioVolta/*194.25*/.getHora()),format.raw/*194.35*/("""</th>
						</tr>
						""")))}),format.raw/*196.8*/("""
						"""),format.raw/*197.7*/("""</tbody>
					</table>
				</div>

				<div class="row-xs-12">
					"""),_display_(/*202.7*/helper/*202.13*/.form(action = routes.HorariosController.cadastraHorarios())/*202.73*/{_display_(Seq[Any](format.raw/*202.74*/("""
					"""),format.raw/*203.6*/("""<div class="col-xs-12">
						<div class="form-group" align="right">
							<label class="checkbox-inline"> </br> <input type="submit"
																		 value="""),_display_(/*206.27*/Messages("horarios.concluir")),format.raw/*206.56*/(""" """),format.raw/*206.57*/("""class="btn btn-warning btn-l"></input>
							</label>

						</div>
					</div>
					""")))}),format.raw/*211.7*/("""
				"""),format.raw/*212.5*/("""</div>

			</div>
		</div>
	</div>
</div>
<!-- /#wrapper -->

</body>

</html>
""")))}),format.raw/*223.2*/("""
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
                  DATE: Thu May 05 01:32:30 BRT 2016
                  SOURCE: /home/pedropfo/workspace/ProjetoSI1/app/views/telaCadastroHorario.scala.html
                  HASH: 7e701130fd11b40c2afea359199c47619805e3b9
                  MATRIX: 847->1|1123->181|1151->184|1259->283|1298->284|1325->285|2228->1160|2257->1161|2288->1165|2430->1280|2458->1281|2489->1285|2548->1316|2577->1317|2608->1321|2749->1435|2777->1436|2808->1440|2852->1456|2881->1457|2912->1461|2965->1487|2993->1488|3023->1491|3503->1945|3518->1951|3579->2003|3618->2004|3649->2008|3709->2041|3759->2070|3884->2168|3930->2193|4273->2509|4318->2533|4736->2923|4780->2945|4813->2951|4931->3042|4977->3066|5009->3071|5385->3419|5442->3453|5524->3504|5556->3508|5637->3562|5653->3568|5727->3632|5767->3633|5800->3638|5861->3671|5921->3709|6057->3817|6103->3841|6292->4002|6341->4029|6429->4090|6468->4112|6508->4113|6543->4120|6587->4137|6615->4143|6650->4150|6698->4167|6733->4174|7038->4448|7071->4453|7214->4568|7263->4595|7459->4763|7513->4795|7545->4799|7829->5055|7875->5079|7998->5175|8052->5212|8092->5213|8127->5220|8172->5237|8189->5244|8220->5253|8266->5271|8283->5278|8315->5288|8371->5313|8406->5320|8590->5476|8638->5502|8761->5598|8822->5642|8862->5643|8897->5650|8942->5667|8964->5679|8995->5688|9041->5706|9063->5718|9095->5728|9151->5753|9186->5760|9282->5829|9298->5835|9368->5895|9408->5896|9442->5902|9631->6063|9682->6092|9712->6093|9830->6180|9863->6185|9974->6265
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|70->39|70->39|71->40|72->41|72->41|74->43|74->43|74->43|75->44|76->45|76->45|78->47|78->47|78->47|79->48|80->49|80->49|81->50|98->67|98->67|98->67|98->67|99->68|99->68|99->68|103->72|103->72|116->85|116->85|126->95|126->95|127->96|127->96|127->96|128->97|136->105|136->105|142->111|144->113|145->114|145->114|145->114|145->114|147->116|147->116|147->116|151->120|151->120|157->126|157->126|158->127|158->127|158->127|159->128|160->129|160->129|161->130|162->131|164->133|174->143|175->144|177->146|177->146|185->154|185->154|186->155|199->168|199->168|204->173|204->173|204->173|205->174|206->175|206->175|206->175|207->176|207->176|207->176|209->178|210->179|217->186|217->186|222->191|222->191|222->191|223->192|224->193|224->193|224->193|225->194|225->194|225->194|227->196|228->197|233->202|233->202|233->202|233->202|234->203|237->206|237->206|237->206|242->211|243->212|254->223
                  -- GENERATED --
              */
          