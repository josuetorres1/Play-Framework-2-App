
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html class="no-js" ng-app="anotheryeomanApp">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        
        
        <meta name="description" content="">
    	<meta name="viewport" content="width=device-width">
    	<script src=""""),_display_(/*14.20*/routes/*14.26*/.Assets.at("javascripts/jquery.js")),format.raw/*14.61*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*15.99*/("""">
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("javascripts/bootstrap.js")),format.raw/*16.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("javascripts/angular.js")),format.raw/*17.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("javascripts/json3.js")),format.raw/*18.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("javascripts/hello.js")),format.raw/*19.63*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*22.10*/content),format.raw/*22.17*/("""
    """),format.raw/*23.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 26 18:29:21 EDT 2014
                  SOURCE: C:/Users/jtorres/Desktop/playframeworkapp-1.0-SNAPSHOT/playfapp/playfapp/app/views/main.scala.html
                  HASH: 65ff40c5cc125ceedb6699e916788d4bc5c5c0ac
                  MATRIX: 727->1|845->31|873->33|990->124|1015->129|1103->191|1117->197|1171->231|1258->292|1272->298|1324->330|1493->472|1508->478|1564->513|1679->601|1694->607|1754->646|1806->671|1821->677|1880->715|1964->772|1979->778|2036->814|2120->871|2135->877|2190->911|2274->968|2289->974|2344->1008|2438->1075|2466->1082|2498->1087
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|50->22|50->22|51->23
                  -- GENERATED --
              */
          