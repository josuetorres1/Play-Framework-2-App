
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Option[Product],List[Product],Form[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(product: Option[Product])(products: List[Product], productForm: Form[Product]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.98*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

	"""),format.raw/*7.2*/("""<div class="container">
    
    	<div class="jumbotron" style="text-align: center;">
  			<h1>Enjoy the Play Framework</h1>
  			<p><a class="btn btn-lg btn-success" ng-href="#">Splendid!!</span></a></p>
		</div>

      <div class="header"> 
        <ul class="nav nav-pills pull-right">
          <li class="active"><a ng-href="#">Home</a></li>
          <li><a ng-href="#">About</a></li>
          <li><a ng-href="#">Contact</a></li>
        </ul>
        <h3 class="text-muted">Store</h3>
      </div>

		<form action=""""),_display_(/*23.18*/routes/*23.24*/.Application.addProduct()),format.raw/*23.49*/("""" method="post">
			<input type="text" name="name" placeholder="josue" required/>
			<button>Add Product</button>
		</form>

      <div ng-controller="StoreController as store">  
          
        <!--  Products Container  -->
      <div class="list-group">
        <!--  Product Container  -->
        <div class="list-group-item" ng-repeat="product in store.products">
          <h3>"""),format.raw/*34.15*/("""{"""),format.raw/*34.16*/("""{"""),format.raw/*34.17*/("""product.name"""),format.raw/*34.29*/("""}"""),format.raw/*34.30*/("""}"""),format.raw/*34.31*/(""" 
          		  
               """),format.raw/*36.16*/("""<form action=""""),format.raw/*36.30*/("""{"""),format.raw/*36.31*/("""{"""),format.raw/*36.32*/("""'/products/delete/' + product.Id"""),format.raw/*36.64*/("""}"""),format.raw/*36.65*/("""}"""),format.raw/*36.66*/("""" method="post">
          	   		<button id="""),format.raw/*37.28*/("""{"""),format.raw/*37.29*/("""{"""),format.raw/*37.30*/("""product.Id"""),format.raw/*37.40*/("""}"""),format.raw/*37.41*/("""}"""),format.raw/*37.42*/(""" """),format.raw/*37.43*/("""class="btn btn-danger">Delete Product</button>
			   </form>
            <em class="pull-right">"""),format.raw/*39.36*/("""{"""),format.raw/*39.37*/("""{"""),format.raw/*39.38*/("""product.price | currency"""),format.raw/*39.62*/("""}"""),format.raw/*39.63*/("""}"""),format.raw/*39.64*/("""</em></h3>

          <!-- Image Gallery  -->
          <product-gallery></product-gallery>

          <!-- Product Tabs  -->
          <product-tabs></product-tabs>
        </div>

      </div>
      </div>
    </div>

    <!--<div class="footer">
      <p><span class="glyphicon glyphicon-heart"></span> from the Yeoman team</p>
    </div>-->

""")))}),format.raw/*56.2*/("""
"""))}
  }

  def render(message:String,product:Option[Product],products:List[Product],productForm:Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(message)(product)(products,productForm)

  def f:((String) => (Option[Product]) => (List[Product],Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (message) => (product) => (products,productForm) => apply(message)(product)(products,productForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 27 22:32:37 EDT 2014
                  SOURCE: C:/Users/jtorres/Desktop/playframeworkapp-1.0-SNAPSHOT/playfapp/playfapp/app/views/index.scala.html
                  HASH: 000ee9fea8b67392aee18afcff53b0242a49a9c6
                  MATRIX: 767->1|966->97|994->116|1021->118|1052->141|1091->143|1120->146|1671->670|1686->676|1732->701|2147->1088|2176->1089|2205->1090|2245->1102|2274->1103|2303->1104|2363->1136|2405->1150|2434->1151|2463->1152|2523->1184|2552->1185|2581->1186|2653->1230|2682->1231|2711->1232|2749->1242|2778->1243|2807->1244|2836->1245|2960->1341|2989->1342|3018->1343|3070->1367|3099->1368|3128->1369|3505->1716
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|50->23|50->23|50->23|61->34|61->34|61->34|61->34|61->34|61->34|63->36|63->36|63->36|63->36|63->36|63->36|63->36|64->37|64->37|64->37|64->37|64->37|64->37|64->37|66->39|66->39|66->39|66->39|66->39|66->39|83->56
                  -- GENERATED --
              */
          