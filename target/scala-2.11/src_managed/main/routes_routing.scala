// @SOURCE:C:/Users/jtorres/Desktop/playframeworkapp-1.0-SNAPSHOT/playfapp/playfapp/conf/routes
// @HASH:427d4c225f1a832dffbd8e9e8663f4ad2984550a
// @DATE:Sun Oct 26 13:54:52 EDT 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_getProducts1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
private[this] lazy val controllers_Application_getProducts1_invoker = createInvoker(
controllers.Application.getProducts(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getProducts", Nil,"GET", """""", Routes.prefix + """products"""))
        

// @LINE:8
private[this] lazy val controllers_Application_addProduct2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product"))))
private[this] lazy val controllers_Application_addProduct2_invoker = createInvoker(
controllers.Application.addProduct(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addProduct", Nil,"POST", """""", Routes.prefix + """product"""))
        

// @LINE:12
private[this] lazy val controllers_Application_deleteProduct3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteProduct3_invoker = createInvoker(
controllers.Application.deleteProduct(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteProduct", Seq(classOf[Long]),"POST", """POST    /product					controllers.Application.deleteProduct()
GET    /products                   controllers.Application.AllProducts()
POST     /products/delete/{<[0-9]+>}		controllers.Application.deleteProduct(id:Long)""", Routes.prefix + """products/delete/$id<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Application.getProducts()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product""","""controllers.Application.addProduct()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/delete/$id<[^/]+>""","""controllers.Application.deleteProduct(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_getProducts1_route(params) => {
   call { 
        controllers_Application_getProducts1_invoker.call(controllers.Application.getProducts())
   }
}
        

// @LINE:8
case controllers_Application_addProduct2_route(params) => {
   call { 
        controllers_Application_addProduct2_invoker.call(controllers.Application.addProduct())
   }
}
        

// @LINE:12
case controllers_Application_deleteProduct3_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deleteProduct3_invoker.call(controllers.Application.deleteProduct(id))
   }
}
        

// @LINE:15
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     