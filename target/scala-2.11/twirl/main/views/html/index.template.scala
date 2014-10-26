
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

    """),format.raw/*7.5*/("""<div class="container">

      <div class="header"> 
        <ul class="nav nav-pills pull-right">
          <li class="active"><a ng-href="#">Home</a></li>
          <li><a ng-href="#">About</a></li>
          <li><a ng-href="#">Contact</a></li>
        </ul>
        <h3 class="text-muted">Store</h3>
      </div>

		<form action=""""),_display_(/*18.18*/routes/*18.24*/.Application.addProduct()),format.raw/*18.49*/("""" method="post">
			<input type="text" name="name" placeholder="josue" required/>
			<button>Add Product</button>
		</form>

      <div ng-controller="StoreController as store">  
          
        <!--  Products Container  -->
      <div class="list-group">
        <!--  Product Container  -->
        <div class="list-group-item" ng-repeat="product in store.products">
          <h3>"""),format.raw/*29.15*/("""{"""),format.raw/*29.16*/("""{"""),format.raw/*29.17*/("""product.name"""),format.raw/*29.29*/("""}"""),format.raw/*29.30*/("""}"""),format.raw/*29.31*/(""" 
          		  
               """),format.raw/*31.16*/("""<form action=""""),format.raw/*31.30*/("""{"""),format.raw/*31.31*/("""{"""),format.raw/*31.32*/("""'/products/delete/' + product.Id"""),format.raw/*31.64*/("""}"""),format.raw/*31.65*/("""}"""),format.raw/*31.66*/("""" method="post">
          	   		<button id="""),format.raw/*32.28*/("""{"""),format.raw/*32.29*/("""{"""),format.raw/*32.30*/("""product.Id"""),format.raw/*32.40*/("""}"""),format.raw/*32.41*/("""}"""),format.raw/*32.42*/(""" """),format.raw/*32.43*/("""class="btn btn-danger">Delete Product</button>
			   </form>
            <em class="pull-right">"""),format.raw/*34.36*/("""{"""),format.raw/*34.37*/("""{"""),format.raw/*34.38*/("""product.price | currency"""),format.raw/*34.62*/("""}"""),format.raw/*34.63*/("""}"""),format.raw/*34.64*/("""</em></h3>

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

""")))}),format.raw/*51.2*/("""
"""))}
  }

  def render(message:String,product:Option[Product],products:List[Product],productForm:Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(message)(product)(products,productForm)

  def f:((String) => (Option[Product]) => (List[Product],Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (message) => (product) => (products,productForm) => apply(message)(product)(products,productForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 26 18:29:21 EDT 2014
                  SOURCE: C:/Users/jtorres/Desktop/playframeworkapp-1.0-SNAPSHOT/playfapp/playfapp/app/views/index.scala.html
                  HASH: 84fcbc7263ec5fec8c266f383bb23e726f178962
                  MATRIX: 767->1|966->97|994->116|1021->118|1052->141|1091->143|1123->149|1484->483|1499->489|1545->514|1960->901|1989->902|2018->903|2058->915|2087->916|2116->917|2176->949|2218->963|2247->964|2276->965|2336->997|2365->998|2394->999|2466->1043|2495->1044|2524->1045|2562->1055|2591->1056|2620->1057|2649->1058|2773->1154|2802->1155|2831->1156|2883->1180|2912->1181|2941->1182|3318->1529
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|45->18|45->18|45->18|56->29|56->29|56->29|56->29|56->29|56->29|58->31|58->31|58->31|58->31|58->31|58->31|58->31|59->32|59->32|59->32|59->32|59->32|59->32|59->32|61->34|61->34|61->34|61->34|61->34|61->34|78->51
                  -- GENERATED --
              */
          