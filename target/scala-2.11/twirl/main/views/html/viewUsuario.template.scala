
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
                                  <option>Segunda</option>
                                  <option>Terça</option>
                                  <option>Quarta</option>
                                  <option>Quinta</option>
                                  <option>Sexta</option>
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
    								<option>Segunda</option>
    								<option>Terça</option>
    								<option>Quarta</option>
    								<option>Quinta</option>
    								<option>Sexta</option>
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
                              value="Buscar" id="botaoBuscar" class="btn btn-primary btn-l"
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
                                        <i class="fa fa-user fa-4x"></i></br>"""),_display_(/*246.79*/carona/*246.85*/.getUsuario().getNome()),format.raw/*246.108*/("""
                                    """),format.raw/*247.37*/("""</div>
                                    <div class="col-xs-3 text-left">
                                        <div><i class="fa fa-car fa-2x"></i> """),_display_(/*249.79*/carona/*249.85*/.getTipo()),format.raw/*249.95*/("""</div>
                                        <div><img src="assets/SBAdminTemplate/img/vagasBranco.png" align="left" height="20" width="20"></i> """),_display_(/*250.142*/carona/*250.148*/.getVagasDisponiveis()),format.raw/*250.170*/("""</div>
                                    </div>
                                    <div class="col-xs-3 text-left">
                                        <div><i class="fa fa-map-marker fa-2x"></i> """),_display_(/*253.86*/carona/*253.92*/.getUsuario().getEndereco().getBairro()),format.raw/*253.131*/("""</div>
                                        <div><i class="fa fa-phone fa-2x"></i> """),_display_(/*254.81*/carona/*254.87*/.getUsuario().getNumeroDeTelefone()),format.raw/*254.122*/("""</div>
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
                  DATE: Sat May 14 01:47:25 BRT 2016
                  SOURCE: /home/hugo/Documentos/Projeto-Vumbora/ProjetoSI1/app/views/viewUsuario.scala.html
                  HASH: ef6860f154fc1614e1f4a5f794c0d93a82b07b8f
                  MATRIX: 815->1|1049->139|1077->142|1166->223|1205->225|1233->227|2081->1047|2110->1048|2152->1062|2183->1066|2205->1079|2243->1096|2272->1097|2304->1101|2333->1102|2377->1118|2528->1241|2557->1242|2597->1254|2626->1255|2667->1268|2827->1400|2856->1401|2890->1408|3037->1527|3066->1528|3107->1541|3151->1557|3180->1558|3221->1571|3250->1572|3291->1585|3343->1609|3372->1610|3414->1624|3789->1970|3819->1971|3863->1987|3970->2066|3999->2067|4028->2068|4061->2073|4090->2074|4134->2090|4232->2160|4261->2161|4301->2173|4330->2174|4371->2187|4422->2210|4451->2211|4493->2225|4633->2337|4662->2338|4706->2354|4808->2428|4837->2429|4866->2430|4898->2434|4927->2435|4971->2451|5074->2526|5103->2527|5144->2540|5173->2541|5214->2554|5745->3058|5760->3064|5825->3120|5864->3121|5898->3128|6024->3226|6077->3257|6129->3278|6162->3284|6454->3549|6501->3587|6540->3588|6583->3603|6728->3720|6783->3753|6825->3777|6838->3782|6877->3783|6920->3798|7074->3924|7129->3957|7183->3980|7222->3991|7603->4345|7619->4351|7690->4412|7730->4413|7765->4420|7826->4453|7881->4486|8020->4597|8071->4626|8635->5162|8685->5190|9249->5726|9295->5750|9420->5847|9482->5892|9522->5893|9586->5928|9660->5974|9683->5975|9747->6010|9822->6053|9883->6085|10400->6574|10455->6607|10485->6608|10704->6796|10739->6803|10866->6903|10882->6909|10948->6965|10988->6966|11023->6973|11084->7006|11142->7042|11280->7152|11331->7181|11819->7641|11869->7669|12433->8205|12486->8236|12719->8441|12758->8463|12798->8464|12862->8499|12936->8545|12964->8551|13028->8586|13103->8629|13163->8660|13935->9401|13970->9408|14066->9476|14121->9509|14383->9743|14425->9775|14465->9776|14505->9787|14576->9830|14634->9866|14674->9877|14722->9893|14756->9900|14804->9931|14844->9932|14892->9951|15283->10314|15299->10320|15345->10343|15411->10380|15593->10534|15609->10540|15641->10550|15818->10698|15835->10704|15880->10726|16112->10930|16128->10936|16190->10975|16305->11062|16321->11068|16379->11103|16605->11301|16621->11307|16664->11327|16780->11415|16796->11421|16840->11442|17112->11686|17128->11692|17160->11702|17259->11773|17275->11779|17305->11787|17388->11841|17441->11871|17657->12055|17699->12068|17891->12229
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|64->33|64->33|65->34|65->34|67->36|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|82->51|83->52|83->52|83->52|83->52|83->52|84->53|85->54|85->54|86->55|86->55|88->57|88->57|88->57|89->58|91->60|91->60|92->61|93->62|93->62|93->62|93->62|93->62|94->63|95->64|95->64|97->66|97->66|99->68|115->84|115->84|115->84|115->84|116->85|116->85|116->85|117->86|118->87|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|127->96|128->97|138->107|138->107|138->107|138->107|139->108|139->108|139->108|144->113|144->113|157->126|157->126|169->138|169->138|170->139|170->139|170->139|171->140|172->141|172->141|173->142|174->143|176->145|184->153|184->153|184->153|189->158|190->159|196->165|196->165|196->165|196->165|197->166|197->166|197->166|201->170|201->170|215->184|215->184|227->196|227->196|229->198|229->198|229->198|230->199|231->200|231->200|232->201|233->202|234->203|247->216|248->217|251->220|251->220|265->234|265->234|265->234|266->235|267->236|267->236|268->237|269->238|270->239|270->239|270->239|271->240|277->246|277->246|277->246|278->247|280->249|280->249|280->249|281->250|281->250|281->250|284->253|284->253|284->253|285->254|285->254|285->254|288->257|288->257|288->257|289->258|289->258|289->258|294->263|294->263|294->263|295->264|295->264|295->264|295->264|295->264|300->269|301->270|314->283
                  -- GENERATED --
              */
          