
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
object presentations extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
   <div class="content_wrapper" id="bd_right_nav_content">
      <h3>Strategies for Strengthening Training under NRHM</h3>
      <ol>
         <li><b>District to be taken as a unit for training:</b> Training will be the responsibility of the district administration. State will develop/help to develop District-specific training plan. Most Trainings will be done at districts level or at place of work/nearest to place of work.</li>
         <li><b>Team leader of Training:</b>  DTC Principal works as team leader for conducting trainings at district. Health personnel at each level will be trained by District Trainers who have undergone TOT. Trainings of primary health care functionaries should be within the district.</li>
         <li><b> Provision of Basic Infrastructure:</b> Hospitals to have Adequate infrastructure including case load for training. Provision for residential training facilities. Supplies & consumables.</li>
         <li><b> Monitoring & follow up:</b> Monitoring of training at all levels is essential. Follow-up of extent of utilization of skills of trained persons & existing infrastructure.</li>
         <li><b> Re-training:</b> System of continuing education, refresher training, and on-the-job training to be institutionalized. Skill Based Training at least 2/3rd of training time should be for practicing technical, Managerial & Communication skills.</li>
         <li>Completion of Training of all categories in a specified time frame.</li>
         <li> Synchronization of training with supplies & referral linkages.</li>
         <li>Reporting of training will be done routinely from periphery to center.</li>
      </ol>
     """),format.raw/*31.16*/("""
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
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/presentations.scala.html
                    HASH: 269ef51e8290611ca9d211c084b88642e0ee782c
                    MATRIX: 763->1|857->18|893->20|914->33|953->35|3610->2904
                    LINES: 27->1|30->1|31->2|31->2|31->2|56->31
                    -- GENERATED --
                */
            