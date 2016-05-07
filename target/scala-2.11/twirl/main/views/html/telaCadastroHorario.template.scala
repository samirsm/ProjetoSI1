
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
						<option>"""),_display_(/*86.16*/Messages("dias.segunda")),format.raw/*86.40*/("""</option>
						<option>"""),_display_(/*87.16*/Messages("dias.terca")),format.raw/*87.38*/("""</option>
						<option>"""),_display_(/*88.16*/Messages("dias.quarta")),format.raw/*88.39*/("""</option>
						<option>"""),_display_(/*89.16*/Messages("dias.quinta")),format.raw/*89.39*/("""</option>
						<option>"""),_display_(/*90.16*/Messages("dias.sexta")),format.raw/*90.38*/("""</option>
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
																	 value="""),_display_(/*139.26*/Messages("horarios.cadastrar_endereco")),format.raw/*139.65*/(""" """),format.raw/*139.66*/("""class="btn btn-warning btn-l"></input>
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
							<th><i class="fa fa-clock-o"></i> </th>
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
                  DATE: Sat May 07 02:04:43 BRT 2016
                  SOURCE: /home/pedropfo/workspace/ProjetoSI1/app/views/telaCadastroHorario.scala.html
                  HASH: 1dcdac62035877bb8169c3dcf668f05cbf4a83ae
                  MATRIX: 847->1|1123->181|1151->184|1259->283|1298->284|1325->285|2228->1160|2257->1161|2288->1165|2430->1280|2458->1281|2489->1285|2548->1316|2577->1317|2608->1321|2749->1435|2777->1436|2808->1440|2852->1456|2881->1457|2912->1461|2965->1487|2993->1488|3023->1491|3503->1945|3518->1951|3579->2003|3618->2004|3649->2008|3709->2041|3759->2070|3884->2168|3930->2193|4273->2509|4318->2533|4418->2606|4463->2630|4515->2655|4558->2677|4610->2702|4654->2725|4706->2750|4750->2773|4802->2798|4845->2820|5066->3013|5110->3035|5143->3041|5261->3132|5307->3156|5339->3161|5715->3509|5772->3543|5854->3594|5886->3598|5967->3652|5983->3658|6057->3722|6097->3723|6130->3728|6191->3761|6251->3799|6387->3907|6433->3931|6622->4092|6671->4119|6759->4180|6798->4202|6838->4203|6873->4210|6917->4227|6945->4233|6980->4240|7028->4257|7063->4264|7272->4445|7333->4484|7363->4485|7476->4567|7509->4572|7652->4687|7701->4714|7897->4882|7951->4914|7983->4918|8267->5174|8313->5198|8441->5299|8495->5336|8535->5337|8570->5344|8615->5361|8632->5368|8663->5377|8709->5395|8726->5402|8758->5412|8814->5437|8849->5444|9033->5600|9081->5626|9204->5722|9265->5766|9305->5767|9340->5774|9385->5791|9407->5803|9438->5812|9484->5830|9506->5842|9538->5852|9594->5877|9629->5884|9725->5953|9741->5959|9811->6019|9851->6020|9885->6026|10074->6187|10125->6216|10155->6217|10273->6304|10306->6309|10417->6389
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|70->39|70->39|71->40|72->41|72->41|74->43|74->43|74->43|75->44|76->45|76->45|78->47|78->47|78->47|79->48|80->49|80->49|81->50|98->67|98->67|98->67|98->67|99->68|99->68|99->68|103->72|103->72|116->85|116->85|117->86|117->86|118->87|118->87|119->88|119->88|120->89|120->89|121->90|121->90|126->95|126->95|127->96|127->96|127->96|128->97|136->105|136->105|142->111|144->113|145->114|145->114|145->114|145->114|147->116|147->116|147->116|151->120|151->120|157->126|157->126|158->127|158->127|158->127|159->128|160->129|160->129|161->130|162->131|164->133|170->139|170->139|170->139|174->143|175->144|177->146|177->146|185->154|185->154|186->155|199->168|199->168|204->173|204->173|204->173|205->174|206->175|206->175|206->175|207->176|207->176|207->176|209->178|210->179|217->186|217->186|222->191|222->191|222->191|223->192|224->193|224->193|224->193|225->194|225->194|225->194|227->196|228->197|233->202|233->202|233->202|233->202|234->203|237->206|237->206|237->206|242->211|243->212|254->223
                  -- GENERATED --
              */
          