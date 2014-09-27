
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
object health_statistics extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/main(message)/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
<div class="content_container">
   <div class="left_nav" id="about_left_nav">
      <h2 class="services" id="about_left_nav_sevices">Services</h2>
      <ul>
 	     <li class="left_nav_link"><a id="about_left_nav_training_details" href="/training_details">Training Details<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_health_statistics" href="/health_statistics">Health Statistics<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_health_days" href="/health_days">Health Days & Themes<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_reports" href="/reports">Reports by SIHFW<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_committee" href="/committee">Reports Committee<span class="left_nav_arrow"></span></a>
      </ul>
   </div>
   <div class="right_nav" id="about_right_nav">
      <div class="page_banner" id="about_right_nav_page_banner">
         <img id="about_right_nav_page_banner_image" src=""""),_display_(Seq[Any](/*16.60*/routes/*16.66*/.Assets.at("images/about/statistics.png"))),format.raw/*16.107*/("""" />
      </div>
      <h3 id="about_right_nav_header">Health Statistics</h3>
      <div class="content_layout" id="about_right_nav_conent">
         <p>You can download the following files for the further reference</p>
         <ul>
			<a class="challan" href="/download/statistics" target="_blank"><img src=""""),_display_(Seq[Any](/*22.78*/routes/*22.84*/.Assets.at("images/about/health_statistics.png"))),format.raw/*22.132*/("""" /></a>
		 </ul>
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
""")))})))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Sep 27 15:55:51 IST 2014
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/health_statistics.scala.html
                    HASH: 023fb0717e2846d86bf085459fc3523c80aaa2fe
                    MATRIX: 767->1|861->18|897->20|918->33|957->35|2115->1157|2130->1163|2194->1204|2542->1516|2557->1522|2628->1570
                    LINES: 27->1|30->1|31->2|31->2|31->2|45->16|45->16|45->16|51->22|51->22|51->22
                    -- GENERATED --
                */
            