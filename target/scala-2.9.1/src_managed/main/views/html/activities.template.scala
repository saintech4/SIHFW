
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
object activities extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
     
        <h3>Activities</h3>
      <ol>
  <li><b>ANMTC-Total 28 are working in Karnataka:</b> 19 ANMTC's established in old 19 Districts and 9 ANMTC's under NRHM</li>
  <li><b>LHVTC - 4 LHVTC are working in Regional level:</b> Bangalore, Belgaum, Gulbarga, Mangalore</li>
  <li><b>Net Working:</b> SIHFW has established formal linkage NIHFW with UNICEF, BPNI, PATH, NIPPCD, PHFI, KSAPS etc.</li>
	</ol>
            <div class="content_wrapper" id="bd_right_nav_content">
    
		<div class="activities_banner" id="bd_right_nav_page_banner">
			<img id="bd_right_nav_page_banner_image" src=""""),_display_(Seq[Any](/*25.51*/routes/*25.57*/.Assets.at("images/activities/CHART2.jpg"))),format.raw/*25.99*/(""""/>
		</div>
		<div class="activities_banner" id="bd_right_nav_page_banner">
			<img id="bd_right_nav_page_banner_image" src=""""),_display_(Seq[Any](/*28.51*/routes/*28.57*/.Assets.at("images/activities/CHART3.jpg"))),format.raw/*28.99*/(""""/>
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
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/activities.scala.html
                    HASH: bc3ea1041e07b3f19496659a89658bb976dd3649
                    MATRIX: 760->1|854->18|890->20|911->33|950->35|2572->1621|2587->1627|2651->1669|2814->1796|2829->1802|2893->1844
                    LINES: 27->1|30->1|31->2|31->2|31->2|54->25|54->25|54->25|57->28|57->28|57->28
                    -- GENERATED --
                */
            