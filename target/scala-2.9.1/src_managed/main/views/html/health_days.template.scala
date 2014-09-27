
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object health_days extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/main(message)/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
<div class="content_container">
   <div class="left_nav" id="bd_left_nav">
      <h2 class="services" id="bd_left_nav_sevices">Services</h2>
      <ul>
      	 <li class="left_nav_link"><a id="about_left_nav_training_details" href="/training_details">Training Details<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_health_statistics" href="/health_statistics">Health Statistics<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_health_days" href="/health_days">Health Days & Themes<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_reports" href="/reports">Reports by SIHFW<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_committee" href="/committee">Reports Committee<span class="left_nav_arrow"></span></a>
 	   </ul>
   </div>
   <div class="right_nav" id="bd_right_nav">
      <h3 id="bd_right_nav_header">Health Days & Themes</h3>
     <div class="content_layout" id="about_right_nav_conent">
         <p>You can download the following files for the further reference</p>
			<a class="challan" href="/download/health_days" target="_blank"><img src=""""),_display_(Seq[Any](/*18.79*/routes/*18.85*/.Assets.at("images/about/health_days.png"))),format.raw/*18.127*/("""" /></a>
			<a class="challan" href="/download/themes" target="_blank"><img src=""""),_display_(Seq[Any](/*19.74*/routes/*19.80*/.Assets.at("images/about/themes.png"))),format.raw/*19.117*/("""" /></a>
         </br>
         </br>
         </br>
         </br>
         </br>
         </br>
         </br>
         </br>
         </br>
         </br>
         </br>
         </br>
      </div> 
   </div>
   </div>
</div>
""")))})),format.raw/*36.2*/("""
"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Sep 27 15:55:50 IST 2014
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/health_days.scala.html
                    HASH: 70584d8aada683101908b9b0def9b7e1e0a719c2
                    MATRIX: 761->1|855->18|891->20|912->33|951->35|2256->1304|2271->1310|2336->1352|2454->1434|2469->1440|2529->1477|2791->1708
                    LINES: 27->1|30->1|31->2|31->2|31->2|47->18|47->18|47->18|48->19|48->19|48->19|65->36
                    -- GENERATED --
                */
            