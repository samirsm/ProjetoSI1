
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewUsuario_Scope0 {
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

class viewUsuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Usuario,Form[Carona],List[Carona],List[String],List[Notificacao],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarioLogado: Usuario, novaCarona: Form[Carona], caronasOfertadas: List[Carona], bairros: List[String], notificacoes: List[Notificacao]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.140*/("""

"""),_display_(/*3.2*/main(usuarioLogado, caronasOfertadas, notificacoes, "Sistema Vumbora de Caronas")/*3.83*/ {_display_(Seq[Any](format.raw/*3.85*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap Core CSS' -->
    <link href="assets/SBAdminTemplate/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="assets/SBAdminTemplate/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="assets/SBAdminTemplate/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="assets/SBAdminTemplate/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">


           function publicarCaronaBox()"""),format.raw/*30.40*/("""{"""),format.raw/*30.41*/("""
             """),format.raw/*31.14*/("""if("""),_display_(/*31.18*/usuarioLogado/*31.31*/.getNumeroVagas()),format.raw/*31.48*/(""" """),format.raw/*31.49*/("""> 0)"""),format.raw/*31.53*/("""{"""),format.raw/*31.54*/("""
               """),format.raw/*32.16*/("""document.getElementById('publicarCaronaBox').innerHTML = document.getElementById('publicarCarona').innerHTML;
             """),format.raw/*33.14*/("""}"""),format.raw/*33.15*/("""
           """),format.raw/*34.12*/("""}"""),format.raw/*34.13*/("""

           """),format.raw/*36.12*/("""// Função será implementada em uma próxima versão, onde haverá outras possibilidade de buscas.
           function buscarCaronaBox()"""),format.raw/*37.38*/("""{"""),format.raw/*37.39*/("""
    		"""),format.raw/*38.7*/("""document.getElementById('publicarCaronaBox').innerHTML = document.getElementById('buscarCarona').innerHTML;
           """),format.raw/*39.12*/("""}"""),format.raw/*39.13*/("""

           """),format.raw/*41.12*/("""function start()"""),format.raw/*41.28*/("""{"""),format.raw/*41.29*/("""

           """),format.raw/*43.12*/("""}"""),format.raw/*43.13*/("""

           """),format.raw/*45.12*/("""function estouComSorte()"""),format.raw/*45.36*/("""{"""),format.raw/*45.37*/("""
             """),format.raw/*46.14*/("""var horaVar = document.getElementById("hora").value;
             var dias = document.getElementById("diaDaSemanaBusca").value;
             var bairro = document.getElementById("bairro").value;

             if ((horaVar == "Não quero pesquisar por hora") && (dias == "Escolha uma hora primeiro") && (bairro == "Não quero pesquisar por bairro"))"""),format.raw/*50.151*/("""{"""),format.raw/*50.152*/("""
               """),format.raw/*51.16*/("""document.getElementById("botaoBuscar").value = "Estou com sorte";
             """),format.raw/*52.14*/("""}"""),format.raw/*52.15*/(""" """),format.raw/*52.16*/("""else """),format.raw/*52.21*/("""{"""),format.raw/*52.22*/("""
               """),format.raw/*53.16*/("""document.getElementById("botaoBuscar").value = "Buscar";
             """),format.raw/*54.14*/("""}"""),format.raw/*54.15*/("""
           """),format.raw/*55.12*/("""}"""),format.raw/*55.13*/("""

           """),format.raw/*57.12*/("""function habilitaDias()"""),format.raw/*57.35*/("""{"""),format.raw/*57.36*/("""
             """),format.raw/*58.14*/("""var horaVar = document.getElementById("hora").value;

             if(horaVar == "Não quero pesquisar por hora")"""),format.raw/*60.59*/("""{"""),format.raw/*60.60*/("""
               """),format.raw/*61.16*/("""document.getElementById('diaDaSemanaBusca').disabled = true;
             """),format.raw/*62.14*/("""}"""),format.raw/*62.15*/(""" """),format.raw/*62.16*/("""else"""),format.raw/*62.20*/("""{"""),format.raw/*62.21*/("""
               """),format.raw/*63.16*/("""document.getElementById('diaDaSemanaBusca').disabled = false;
             """),format.raw/*64.14*/("""}"""),format.raw/*64.15*/("""

           """),format.raw/*66.12*/("""}"""),format.raw/*66.13*/("""

           """),format.raw/*68.12*/("""window.onload = start;
    </script>



</head>

<body>

<div class="container-fluid">
		<div class="nav navbar-nav top-information">
			<!-- Main jumbotron for a primary marketing message or call to action -->
     <div id="publicarBuscar" style=" width: 96%; height: 100px; border: 2px solid #888; border-radius: 20px; vertical-align: center; background: rgb(000, 00, 00); background: rgba(000, 00, 00, 0.5); color: white; color: white;">
			<div class="row">

					<div class="col-sm-2">
            """),_display_(/*84.14*/helper/*84.20*/.form(action = routes.CaronasController.buscarCaronas())/*84.76*/{_display_(Seq[Any](format.raw/*84.77*/("""
						"""),format.raw/*85.7*/("""<button type="submit" class="btn btn-primary btn-xl" style="margin-top: 30px; margin-left: 80px">"""),_display_(/*85.105*/Messages("view_usuario.buscar")),format.raw/*85.136*/("""</button>
          """)))}),format.raw/*86.12*/("""
					"""),format.raw/*87.6*/("""</div>
					<div class="col-sm-6">
						<a class="navbar-brand"><img src="assets/SBAdminTemplate/img/trajeto carona ilustracao.png" style="margin-top: 20px; margin-left: 120px; height: 60px; width: 250px;"></a>
					</div>
					<div class="col-sm-4">
            """),_display_(/*92.14*/if(usuarioLogado.getNumeroVagas() > 0)/*92.52*/{_display_(Seq[Any](format.raw/*92.53*/("""
              """),format.raw/*93.15*/("""<button onclick="publicarCaronaBox()" class="btn btn-warning btn-xl" style="margin-top: 30px; margin-right: 150px;">"""),_display_(/*93.132*/Messages("view_usuario.oferecer")),format.raw/*93.165*/("""</button>
            """)))}/*94.15*/else/*94.20*/{_display_(Seq[Any](format.raw/*94.21*/("""
              """),format.raw/*95.15*/("""<button onclick="publicarCaronaBox()" class="btn btn-warning btn-xl disabled" style="margin-top: 30px; margin-right: 150px;">"""),_display_(/*95.141*/Messages("view_usuario.oferecer")),format.raw/*95.174*/("""</button>
            """)))}),format.raw/*96.14*/("""
          """),format.raw/*97.11*/("""</div>

				</div>

	    	</div>
        <div id="publicarCaronaBox" class="jumbotron" style=" width: 96%; border: 2px solid #888; border-radius: 20px; vertical-align: center; background: rgb(000, 00, 00);background: rgba(000, 00, 00, 0.5); color: white; ">
  	    </div>


        <div id="publicarCarona" class="jumbotron" style="display: none">
  			"""),_display_(/*107.7*/helper/*107.13*/.form(action = routes.CaronasController.cadastraNovaCarona())/*107.74*/{_display_(Seq[Any](format.raw/*107.75*/("""
  				"""),format.raw/*108.7*/("""<h2 style="text-align: center;">"""),_display_(/*108.40*/Messages("view_usuario.publicar")),format.raw/*108.73*/("""</h2>

  				<div class="row">
  					<div class="col-sm-4">
  						<div class="form-group">
  							<label>"""),_display_(/*113.18*/Messages("view_usuario.hora")),format.raw/*113.47*/("""</label> <select name="hora" id="hora" class="form-control" >
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
  							<label>"""),_display_(/*126.18*/Messages("view_usuario.dia")),format.raw/*126.46*/("""</label> <select name="diaDaSemana" id="diasDaSemana" class="form-control">
                                  <option>"""),_display_(/*127.44*/Messages("dias.segunda")),format.raw/*127.68*/("""</option>
                                  <option>"""),_display_(/*128.44*/Messages("dias.terca")),format.raw/*128.66*/("""</option>
                                  <option>"""),_display_(/*129.44*/Messages("dias.quarta")),format.raw/*129.67*/("""</option>
                                  <option>"""),_display_(/*130.44*/Messages("dias.quinta")),format.raw/*130.67*/("""</option>
                                  <option>"""),_display_(/*131.44*/Messages("dias.sexta")),format.raw/*131.66*/("""</option>
                              </select>
  						</div>
  					</div>

  					<div class="col-sm-4">
  						<div class="form-group">
                              <label>"""),_display_(/*138.39*/Messages("global.vagas")),format.raw/*138.63*/("""</label> <select name="vagasDisponiveis" class="form-control" >
                                """),_display_(/*139.34*/for(a <- 1 to usuarioLogado.getNumeroVagas()) yield /*139.79*/{_display_(Seq[Any](format.raw/*139.80*/("""
                                  """),format.raw/*140.35*/("""<option>
                                    """),_display_(/*141.38*/a),format.raw/*141.39*/("""
                                  """),format.raw/*142.35*/("""</option>
                                """)))}),format.raw/*143.34*/("""

                              """),format.raw/*145.31*/("""</select>
  						</div>
  					</div>
  					<div class="form-group" align="right">
                          <label class="radio-inline"> </br> <input type="radio" name="tipo" value="ida" checked="checked">Ida</label>
                          <label class="radio-inline"> </br> <input type="radio" name="tipo" value="volta">Volta</label>
                          <label class="checkbox-inline"> </br>
                          <input type="submit"
                              value="""),_display_(/*153.38*/Messages("view_usuario.publique")),format.raw/*153.71*/(""" """),format.raw/*153.72*/("""class="btn btn-warning btn-l"
                              style="float: right">
                          </input>
                         </label>
                      </div>
  					""")))}),format.raw/*158.9*/("""
  				"""),format.raw/*159.7*/("""</div>
  			</div>



        <div id="buscarCarona" class="jumbotron" style="display: none">
  			"""),_display_(/*165.7*/helper/*165.13*/.form(action = routes.CaronasController.buscarCaronas())/*165.69*/{_display_(Seq[Any](format.raw/*165.70*/("""
  				"""),format.raw/*166.7*/("""<h2 style="text-align: center;">"""),_display_(/*166.40*/Messages("view_usuario.buscar_aqui")),format.raw/*166.76*/("""</h2>
  				<div class="row">
  					<div class="col-sm-4">
  						<div class="form-group">
  							<label>"""),_display_(/*170.18*/Messages("view_usuario.hora")),format.raw/*170.47*/("""</label> <select onchange="habilitaDias()" name="hora" id="hora" class="form-control">
                  <option>Não quero pesquisar por hora</option>
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
  							<label>"""),_display_(/*184.18*/Messages("view_usuario.dia")),format.raw/*184.46*/("""</label> <select onchange="estouComSorte()" name="diaDaSemanaBusca" id="diaDaSemanaBusca" class="form-control">
                    <option>Escolha uma hora primeiro</option>
                            <option>"""),_display_(/*186.38*/Messages("dias.segunda")),format.raw/*186.62*/("""</option>
                            <option>"""),_display_(/*187.38*/Messages("dias.terca")),format.raw/*187.60*/("""</option>
                            <option>"""),_display_(/*188.38*/Messages("dias.quarta")),format.raw/*188.61*/("""</option>
                            <option>"""),_display_(/*189.38*/Messages("dias.quinta")),format.raw/*189.61*/("""</option>
                            <option>"""),_display_(/*190.38*/Messages("dias.sexta")),format.raw/*190.60*/("""</option>
  							</select>
  						</div>
  					</div>
                      <div class="col-sm-4">
                          <div class="form-group">
                              <label>"""),_display_(/*196.39*/Messages("view_usuario.bairro")),format.raw/*196.70*/("""</label> <select onchange="estouComSorte()" name="bairro" id="bairro" class="form-control">
                                <option>Não quero pesquisar por bairro</option>
                                """),_display_(/*198.34*/for(bairro <- bairros) yield /*198.56*/{_display_(Seq[Any](format.raw/*198.57*/("""
                                  """),format.raw/*199.35*/("""<option>
                                    """),_display_(/*200.38*/bairro),format.raw/*200.44*/("""
                                  """),format.raw/*201.35*/("""</option>
                                """)))}),format.raw/*202.34*/("""
                              """),format.raw/*203.31*/("""</select>
                          </div>
                      </div>
            <div class="form-group" align="right">
                          <label class="radio-inline"> </br> <input type="radio" name="tipo" value="ida" checked="checked">Ida</label>
                          <label class="radio-inline"> </br> <input type="radio" name="tipo" value="volta" >Volta</label>
                          <label class="checkbox-inline"> </br>
                          <input type="submit"
                              value="""),_display_(/*211.38*/Messages("view_usuario.busque")),format.raw/*211.69*/(""" """),format.raw/*211.70*/("""id="botaoBuscar" class="btn btn-primary btn-l"
                              style="float: right">
                          </input>
                         </label>
                      </div>
  					""")))}),format.raw/*216.9*/("""
  				"""),format.raw/*217.7*/("""</div>
  			</div>

			<h3 class="page-header" style="color: #FFF">"""),_display_(/*220.49*/Messages("view_usuario.recentes")),format.raw/*220.82*/("""</h3>
		</div>
	</div>


      <div id="wrapper">
         <div id="page-wrapper">

            <div class="container-fluid">

				<div class="row-xs-12">
                <!-- Page Heading -->

                <!-- /.row -->
        """),_display_(/*234.10*/if(caronasOfertadas.size() == 0)/*234.42*/{_display_(Seq[Any](format.raw/*234.43*/("""
          """),format.raw/*235.11*/("""<div class="panel-heading">
              """),_display_(/*236.16*/Messages("view_usuario.sem_caronas")),format.raw/*236.52*/("""
          """),format.raw/*237.11*/("""</div>
        """)))}),format.raw/*238.10*/("""
 				"""),_display_(/*239.7*/for(carona <- caronasOfertadas) yield /*239.38*/{_display_(Seq[Any](format.raw/*239.39*/("""
                  """),format.raw/*240.19*/("""<div class="col">
                    <div class="col-lg-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-user fa-4x"></i></br>"""),_display_(/*246.79*/carona/*246.85*/.getMotorista().getNome()),format.raw/*246.110*/("""
                                    """),format.raw/*247.37*/("""</div>
                                    <div class="col-xs-3 text-left">
                                        <div><i class="fa fa-car fa-2x"></i> """),_display_(/*249.79*/carona/*249.85*/.getTipo()),format.raw/*249.95*/("""</div>
                                        <div><img src="assets/SBAdminTemplate/img/vagasBranco.png" align="left" height="20" width="20"></i> """),_display_(/*250.142*/carona/*250.148*/.getVagasDisponiveis()),format.raw/*250.170*/("""</div>
                                    </div>
                                    <div class="col-xs-3 text-left">
                                        <div><i class="fa fa-map-marker fa-2x"></i> """),_display_(/*253.86*/carona/*253.92*/.getMotorista().getEndereco().getBairro()),format.raw/*253.133*/("""</div>
                                        <div><i class="fa fa-phone fa-2x"></i> """),_display_(/*254.81*/carona/*254.87*/.getMotorista().getNumeroDeTelefone()),format.raw/*254.124*/("""</div>
                                    </div>
                                    <div class="col-xs-3 text-left">
                                    	<div><i class="fa fa-calendar fa-2x"></i>"""),_display_(/*257.80*/carona/*257.86*/.getHorario.getDia()),format.raw/*257.106*/("""</div>
                                        <div><i class="fa fa-clock-o fa-2x"></i>"""),_display_(/*258.82*/carona/*258.88*/.getHorario.getHora()),format.raw/*258.109*/("""</div>
                                    </div>
                                </div>
                            </div>
                                <div class="panel-footer">
                                    <span class="pull-left">"""),_display_(/*263.62*/carona/*263.68*/.getTipo()),format.raw/*263.78*/("""</span>
                                    <a href="exibeDetalhes?id="""),_display_(/*264.64*/carona/*264.70*/.getId()),format.raw/*264.78*/("""" class="btn btn-warning btn-l" style="float: right">"""),_display_(/*264.132*/Messages("view_usuario.pedir")),format.raw/*264.162*/("""</a>
                                    <div class="clearfix"></div>
                                </div>
                        </div>
                    </div>
                """)))}),format.raw/*269.18*/("""
            """),format.raw/*270.13*/("""<!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    </div>
    <!-- /#wrapper -->
    </div>
    </div>
</body>
</html>

""")))}),format.raw/*283.2*/("""
"""))
      }
    }
  }

  def render(usuarioLogado:Usuario,novaCarona:Form[Carona],caronasOfertadas:List[Carona],bairros:List[String],notificacoes:List[Notificacao]): play.twirl.api.HtmlFormat.Appendable = apply(usuarioLogado,novaCarona,caronasOfertadas,bairros,notificacoes)

  def f:((Usuario,Form[Carona],List[Carona],List[String],List[Notificacao]) => play.twirl.api.HtmlFormat.Appendable) = (usuarioLogado,novaCarona,caronasOfertadas,bairros,notificacoes) => apply(usuarioLogado,novaCarona,caronasOfertadas,bairros,notificacoes)

  def ref: this.type = this

}


}

/**/
object viewUsuario extends viewUsuario_Scope0.viewUsuario
              /*
                  -- GENERATED --
                  DATE: Thu May 12 22:39:55 GMT-03:00 2016
                  SOURCE: C:/Users/Dandara/Desktop/ProjetoSI1/app/views/viewUsuario.scala.html
                  HASH: 1f4c16a3a376c59970ab4982ea2b8bdb33921d7e
                  MATRIX: 815->1|1049->139|1079->144|1168->225|1207->227|1237->231|2110->1076|2139->1077|2182->1092|2213->1096|2235->1109|2273->1126|2302->1127|2334->1131|2363->1132|2408->1149|2560->1273|2589->1274|2630->1287|2659->1288|2702->1303|2863->1436|2892->1437|2927->1445|3075->1565|3104->1566|3147->1581|3191->1597|3220->1598|3263->1613|3292->1614|3335->1629|3387->1653|3416->1654|3459->1669|3838->2019|3868->2020|3913->2037|4021->2117|4050->2118|4079->2119|4112->2124|4141->2125|4186->2142|4285->2213|4314->2214|4355->2227|4384->2228|4427->2243|4478->2266|4507->2267|4550->2282|4692->2396|4721->2397|4766->2414|4869->2489|4898->2490|4927->2491|4959->2495|4988->2496|5033->2513|5137->2589|5166->2590|5209->2605|5238->2606|5281->2621|5828->3141|5843->3147|5908->3203|5947->3204|5982->3212|6108->3310|6161->3341|6214->3363|6248->3370|6545->3640|6592->3678|6631->3679|6675->3695|6820->3812|6875->3845|6918->3870|6931->3875|6970->3876|7014->3892|7168->4018|7223->4051|7278->4075|7318->4087|7709->4451|7725->4457|7796->4518|7836->4519|7872->4527|7933->4560|7988->4593|8132->4709|8183->4738|8760->5287|8810->5315|8958->5435|9004->5459|9086->5513|9130->5535|9212->5589|9257->5612|9339->5666|9384->5689|9466->5743|9510->5765|9726->5953|9772->5977|9898->6075|9960->6120|10000->6121|10065->6157|10140->6204|10163->6205|10228->6241|10304->6285|10367->6319|10892->6816|10947->6849|10977->6850|11201->7043|11237->7051|11370->7157|11386->7163|11452->7219|11492->7220|11528->7228|11589->7261|11647->7297|11789->7411|11840->7440|12342->7914|12392->7942|12634->8156|12680->8180|12756->8228|12800->8250|12876->8298|12921->8321|12997->8369|13042->8392|13118->8440|13162->8462|13388->8660|13441->8691|13676->8898|13715->8920|13755->8921|13820->8957|13895->9004|13923->9010|13988->9046|14064->9090|14125->9122|14689->9658|14742->9689|14772->9690|15013->9900|15049->9908|15148->9979|15203->10012|15479->10260|15521->10292|15561->10293|15602->10305|15674->10349|15732->10385|15773->10397|15822->10414|15857->10422|15905->10453|15945->10454|15994->10474|16391->10843|16407->10849|16455->10874|16522->10912|16706->11068|16722->11074|16754->11084|16932->11233|16949->11239|16994->11261|17229->11468|17245->11474|17309->11515|17425->11603|17441->11609|17501->11646|17730->11847|17746->11853|17789->11873|17906->11962|17922->11968|17966->11989|18243->12238|18259->12244|18291->12254|18391->12326|18407->12332|18437->12340|18520->12394|18573->12424|18794->12613|18837->12627|19042->12801
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|64->33|64->33|65->34|65->34|67->36|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|82->51|83->52|83->52|83->52|83->52|83->52|84->53|85->54|85->54|86->55|86->55|88->57|88->57|88->57|89->58|91->60|91->60|92->61|93->62|93->62|93->62|93->62|93->62|94->63|95->64|95->64|97->66|97->66|99->68|115->84|115->84|115->84|115->84|116->85|116->85|116->85|117->86|118->87|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|127->96|128->97|138->107|138->107|138->107|138->107|139->108|139->108|139->108|144->113|144->113|157->126|157->126|158->127|158->127|159->128|159->128|160->129|160->129|161->130|161->130|162->131|162->131|169->138|169->138|170->139|170->139|170->139|171->140|172->141|172->141|173->142|174->143|176->145|184->153|184->153|184->153|189->158|190->159|196->165|196->165|196->165|196->165|197->166|197->166|197->166|201->170|201->170|215->184|215->184|217->186|217->186|218->187|218->187|219->188|219->188|220->189|220->189|221->190|221->190|227->196|227->196|229->198|229->198|229->198|230->199|231->200|231->200|232->201|233->202|234->203|242->211|242->211|242->211|247->216|248->217|251->220|251->220|265->234|265->234|265->234|266->235|267->236|267->236|268->237|269->238|270->239|270->239|270->239|271->240|277->246|277->246|277->246|278->247|280->249|280->249|280->249|281->250|281->250|281->250|284->253|284->253|284->253|285->254|285->254|285->254|288->257|288->257|288->257|289->258|289->258|289->258|294->263|294->263|294->263|295->264|295->264|295->264|295->264|295->264|300->269|301->270|314->283
                  -- GENERATED --
              */
          