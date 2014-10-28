// @SOURCE:C:/Users/jtorres/Desktop/playframeworkapp-1.0-SNAPSHOT/playfapp/playfapp/conf/routes
// @HASH:427d4c225f1a832dffbd8e9e8663f4ad2984550a
// @DATE:Mon Oct 27 22:32:37 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {


// @LINE:15
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def addProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "product")
}
                        

// @LINE:12
def deleteProduct(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "products/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:7
def getProducts(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "products")
}
                        

}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:15
class ReverseAssets {


// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def addProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product"})
      }
   """
)
                        

// @LINE:12
def deleteProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteProduct",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def getProducts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getProducts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
      }
   """
)
                        

}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {


// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def addProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addProduct", Seq(), "POST", """""", _prefix + """product""")
)
                      

// @LINE:12
def deleteProduct(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteProduct(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteProduct", Seq(classOf[Long]), "POST", """POST    /product					controllers.Application.deleteProduct()
GET    /products                   controllers.Application.AllProducts()
POST     /products/delete/{<[0-9]+>}		controllers.Application.deleteProduct(id:Long)""", _prefix + """products/delete/$id<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def getProducts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getProducts(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getProducts", Seq(), "GET", """""", _prefix + """products""")
)
                      

}
                          
}
        
    