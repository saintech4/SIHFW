// @SOURCE:/home/trilok/Documents/play-2.0.8/SIHFW/conf/routes
// @HASH:46f770f01e1bbe5e5c147caa9dc1c2f80477ed03
// @DATE:Sat Sep 27 15:55:48 IST 2014

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_about1 = Route("GET", PathPattern(List(StaticPart("/about"))))
                    

// @LINE:12
val controllers_Application_infrastructure2 = Route("GET", PathPattern(List(StaticPart("/infrastructure"))))
                    

// @LINE:15
val controllers_Application_hr3 = Route("GET", PathPattern(List(StaticPart("/hr"))))
                    

// @LINE:18
val controllers_Application_activities4 = Route("GET", PathPattern(List(StaticPart("/activities"))))
                    

// @LINE:21
val controllers_Application_presentations5 = Route("GET", PathPattern(List(StaticPart("/presentations"))))
                    

// @LINE:24
val controllers_Application_trainingDetails6 = Route("GET", PathPattern(List(StaticPart("/training_details"))))
                    

// @LINE:27
val controllers_Application_healthStatistics7 = Route("GET", PathPattern(List(StaticPart("/health_statistics"))))
                    

// @LINE:30
val controllers_Application_healthDays8 = Route("GET", PathPattern(List(StaticPart("/health_days"))))
                    

// @LINE:33
val controllers_Application_reports9 = Route("GET", PathPattern(List(StaticPart("/reports"))))
                    

// @LINE:36
val controllers_Application_downloadFile10 = Route("GET", PathPattern(List(StaticPart("/download/"),DynamicPart("file", """[^/]+"""))))
                    

// @LINE:39
val controllers_Application_photos11 = Route("GET", PathPattern(List(StaticPart("/photos"))))
                    

// @LINE:42
val controllers_Application_committee12 = Route("GET", PathPattern(List(StaticPart("/committee"))))
                    

// @LINE:45
val controllers_Application_archetypal13 = Route("GET", PathPattern(List(StaticPart("/archetypal"))))
                    

// @LINE:48
val controllers_Application_contact14 = Route("GET", PathPattern(List(StaticPart("/contact"))))
                    

// @LINE:52
val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/about""","""controllers.Application.about()"""),("""GET""","""/infrastructure""","""controllers.Application.infrastructure()"""),("""GET""","""/hr""","""controllers.Application.hr()"""),("""GET""","""/activities""","""controllers.Application.activities()"""),("""GET""","""/presentations""","""controllers.Application.presentations()"""),("""GET""","""/training_details""","""controllers.Application.trainingDetails()"""),("""GET""","""/health_statistics""","""controllers.Application.healthStatistics()"""),("""GET""","""/health_days""","""controllers.Application.healthDays()"""),("""GET""","""/reports""","""controllers.Application.reports()"""),("""GET""","""/download/$file<[^/]+>""","""controllers.Application.downloadFile(file:String)"""),("""GET""","""/photos""","""controllers.Application.photos()"""),("""GET""","""/committee""","""controllers.Application.committee()"""),("""GET""","""/archetypal""","""controllers.Application.archetypal()"""),("""GET""","""/contact""","""controllers.Application.contact()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_about1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_infrastructure2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.infrastructure(), HandlerDef(this, "controllers.Application", "infrastructure", Nil))
   }
}
                    

// @LINE:15
case controllers_Application_hr3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.hr(), HandlerDef(this, "controllers.Application", "hr", Nil))
   }
}
                    

// @LINE:18
case controllers_Application_activities4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.activities(), HandlerDef(this, "controllers.Application", "activities", Nil))
   }
}
                    

// @LINE:21
case controllers_Application_presentations5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.presentations(), HandlerDef(this, "controllers.Application", "presentations", Nil))
   }
}
                    

// @LINE:24
case controllers_Application_trainingDetails6(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.trainingDetails(), HandlerDef(this, "controllers.Application", "trainingDetails", Nil))
   }
}
                    

// @LINE:27
case controllers_Application_healthStatistics7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.healthStatistics(), HandlerDef(this, "controllers.Application", "healthStatistics", Nil))
   }
}
                    

// @LINE:30
case controllers_Application_healthDays8(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.healthDays(), HandlerDef(this, "controllers.Application", "healthDays", Nil))
   }
}
                    

// @LINE:33
case controllers_Application_reports9(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.reports(), HandlerDef(this, "controllers.Application", "reports", Nil))
   }
}
                    

// @LINE:36
case controllers_Application_downloadFile10(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(_root_.controllers.Application.downloadFile(file), HandlerDef(this, "controllers.Application", "downloadFile", Seq(classOf[String])))
   }
}
                    

// @LINE:39
case controllers_Application_photos11(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.photos(), HandlerDef(this, "controllers.Application", "photos", Nil))
   }
}
                    

// @LINE:42
case controllers_Application_committee12(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.committee(), HandlerDef(this, "controllers.Application", "committee", Nil))
   }
}
                    

// @LINE:45
case controllers_Application_archetypal13(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.archetypal(), HandlerDef(this, "controllers.Application", "archetypal", Nil))
   }
}
                    

// @LINE:48
case controllers_Application_contact14(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Nil))
   }
}
                    

// @LINE:52
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                