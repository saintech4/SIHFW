// @SOURCE:/home/trilok/Documents/play-2.0.8/SIHFW/conf/routes
// @HASH:46f770f01e1bbe5e5c147caa9dc1c2f80477ed03
// @DATE:Sat Sep 27 15:55:48 IST 2014

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:52
// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:24
def trainingDetails() = {
   Call("GET", "/training_details")
}
                                                        
 
// @LINE:39
def photos() = {
   Call("GET", "/photos")
}
                                                        
 
// @LINE:30
def healthDays() = {
   Call("GET", "/health_days")
}
                                                        
 
// @LINE:21
def presentations() = {
   Call("GET", "/presentations")
}
                                                        
 
// @LINE:9
def about() = {
   Call("GET", "/about")
}
                                                        
 
// @LINE:27
def healthStatistics() = {
   Call("GET", "/health_statistics")
}
                                                        
 
// @LINE:33
def reports() = {
   Call("GET", "/reports")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:15
def hr() = {
   Call("GET", "/hr")
}
                                                        
 
// @LINE:45
def archetypal() = {
   Call("GET", "/archetypal")
}
                                                        
 
// @LINE:48
def contact() = {
   Call("GET", "/contact")
}
                                                        
 
// @LINE:36
def downloadFile(file:String) = {
   Call("GET", "/download/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        
 
// @LINE:18
def activities() = {
   Call("GET", "/activities")
}
                                                        
 
// @LINE:12
def infrastructure() = {
   Call("GET", "/infrastructure")
}
                                                        
 
// @LINE:42
def committee() = {
   Call("GET", "/committee")
}
                                                        

                      
    
}
                            

// @LINE:52
class ReverseAssets {
    


 
// @LINE:52
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:52
// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:24
def trainingDetails = JavascriptReverseRoute(
   "controllers.Application.trainingDetails",
   """
      function() {
      return _wA({method:"GET", url:"/training_details"})
      }
   """
)
                                                        
 
// @LINE:39
def photos = JavascriptReverseRoute(
   "controllers.Application.photos",
   """
      function() {
      return _wA({method:"GET", url:"/photos"})
      }
   """
)
                                                        
 
// @LINE:30
def healthDays = JavascriptReverseRoute(
   "controllers.Application.healthDays",
   """
      function() {
      return _wA({method:"GET", url:"/health_days"})
      }
   """
)
                                                        
 
// @LINE:21
def presentations = JavascriptReverseRoute(
   "controllers.Application.presentations",
   """
      function() {
      return _wA({method:"GET", url:"/presentations"})
      }
   """
)
                                                        
 
// @LINE:9
def about = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"/about"})
      }
   """
)
                                                        
 
// @LINE:27
def healthStatistics = JavascriptReverseRoute(
   "controllers.Application.healthStatistics",
   """
      function() {
      return _wA({method:"GET", url:"/health_statistics"})
      }
   """
)
                                                        
 
// @LINE:33
def reports = JavascriptReverseRoute(
   "controllers.Application.reports",
   """
      function() {
      return _wA({method:"GET", url:"/reports"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:15
def hr = JavascriptReverseRoute(
   "controllers.Application.hr",
   """
      function() {
      return _wA({method:"GET", url:"/hr"})
      }
   """
)
                                                        
 
// @LINE:45
def archetypal = JavascriptReverseRoute(
   "controllers.Application.archetypal",
   """
      function() {
      return _wA({method:"GET", url:"/archetypal"})
      }
   """
)
                                                        
 
// @LINE:48
def contact = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"/contact"})
      }
   """
)
                                                        
 
// @LINE:36
def downloadFile = JavascriptReverseRoute(
   "controllers.Application.downloadFile",
   """
      function(file) {
      return _wA({method:"GET", url:"/download/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        
 
// @LINE:18
def activities = JavascriptReverseRoute(
   "controllers.Application.activities",
   """
      function() {
      return _wA({method:"GET", url:"/activities"})
      }
   """
)
                                                        
 
// @LINE:12
def infrastructure = JavascriptReverseRoute(
   "controllers.Application.infrastructure",
   """
      function() {
      return _wA({method:"GET", url:"/infrastructure"})
      }
   """
)
                                                        
 
// @LINE:42
def committee = JavascriptReverseRoute(
   "controllers.Application.committee",
   """
      function() {
      return _wA({method:"GET", url:"/committee"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:52
class ReverseAssets {
    


 
// @LINE:52
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:52
// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:24
def trainingDetails() = new play.api.mvc.HandlerRef(
   controllers.Application.trainingDetails(), HandlerDef(this, "controllers.Application", "trainingDetails", Seq())
)
                              
 
// @LINE:39
def photos() = new play.api.mvc.HandlerRef(
   controllers.Application.photos(), HandlerDef(this, "controllers.Application", "photos", Seq())
)
                              
 
// @LINE:30
def healthDays() = new play.api.mvc.HandlerRef(
   controllers.Application.healthDays(), HandlerDef(this, "controllers.Application", "healthDays", Seq())
)
                              
 
// @LINE:21
def presentations() = new play.api.mvc.HandlerRef(
   controllers.Application.presentations(), HandlerDef(this, "controllers.Application", "presentations", Seq())
)
                              
 
// @LINE:9
def about() = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq())
)
                              
 
// @LINE:27
def healthStatistics() = new play.api.mvc.HandlerRef(
   controllers.Application.healthStatistics(), HandlerDef(this, "controllers.Application", "healthStatistics", Seq())
)
                              
 
// @LINE:33
def reports() = new play.api.mvc.HandlerRef(
   controllers.Application.reports(), HandlerDef(this, "controllers.Application", "reports", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:15
def hr() = new play.api.mvc.HandlerRef(
   controllers.Application.hr(), HandlerDef(this, "controllers.Application", "hr", Seq())
)
                              
 
// @LINE:45
def archetypal() = new play.api.mvc.HandlerRef(
   controllers.Application.archetypal(), HandlerDef(this, "controllers.Application", "archetypal", Seq())
)
                              
 
// @LINE:48
def contact() = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq())
)
                              
 
// @LINE:36
def downloadFile(file:String) = new play.api.mvc.HandlerRef(
   controllers.Application.downloadFile(file), HandlerDef(this, "controllers.Application", "downloadFile", Seq(classOf[String]))
)
                              
 
// @LINE:18
def activities() = new play.api.mvc.HandlerRef(
   controllers.Application.activities(), HandlerDef(this, "controllers.Application", "activities", Seq())
)
                              
 
// @LINE:12
def infrastructure() = new play.api.mvc.HandlerRef(
   controllers.Application.infrastructure(), HandlerDef(this, "controllers.Application", "infrastructure", Seq())
)
                              
 
// @LINE:42
def committee() = new play.api.mvc.HandlerRef(
   controllers.Application.committee(), HandlerDef(this, "controllers.Application", "committee", Seq())
)
                              

                      
    
}
                            

// @LINE:52
class ReverseAssets {
    


 
// @LINE:52
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                