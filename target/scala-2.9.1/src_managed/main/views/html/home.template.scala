
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
object home extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/main(message)/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*3.31*/routes/*3.37*/.Assets.at("stylesheets/plugins/themes/default/default.css"))),format.raw/*3.97*/("""" type="text/css" media="screen" />
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*4.31*/routes/*4.37*/.Assets.at("stylesheets/plugins/nivo-slider.css"))),format.raw/*4.86*/("""" type="text/css" media="screen" />
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
         <div class="slider-wrapper theme-default">
            <div id="slider" class="nivoSlider">
            <a href="/infrastructure"><img src=""""),_display_(Seq[Any](/*20.50*/routes/*20.56*/.Assets.at("images/home/images.jpg"))),format.raw/*20.92*/("""" data-thumb=""""),_display_(Seq[Any](/*20.107*/routes/*20.113*/.Assets.at("images/home/images.jpg"))),format.raw/*20.149*/("""" alt="" /></a>
               <a href="/infrastructure"><img src=""""),_display_(Seq[Any](/*21.53*/routes/*21.59*/.Assets.at("images/home/home-mr.jpg"))),format.raw/*21.96*/("""" data-thumb=""""),_display_(Seq[Any](/*21.111*/routes/*21.117*/.Assets.at("images/home/home-mr.jpg"))),format.raw/*21.154*/("""" alt="" /></a>
    <a href="/infrastructure"><img src=""""),_display_(Seq[Any](/*22.42*/routes/*22.48*/.Assets.at("images/home/11.jpg"))),format.raw/*22.80*/("""" data-thumb=""""),_display_(Seq[Any](/*22.95*/routes/*22.101*/.Assets.at("images/home/11.jpg"))),format.raw/*22.133*/("""" alt="" /></a>
               <a href="/about"><img src=""""),_display_(Seq[Any](/*23.44*/routes/*23.50*/.Assets.at("images/home/about-banner.jpg"))),format.raw/*23.92*/("""" data-thumb=""""),_display_(Seq[Any](/*23.107*/routes/*23.113*/.Assets.at("images/home/home-bigdata.jpg"))),format.raw/*23.155*/("""" alt="" data-transition="slideInLeft"/></a>
               <a href="/about"><img src=""""),_display_(Seq[Any](/*24.44*/routes/*24.50*/.Assets.at("images/home/health-home.jpg"))),format.raw/*24.91*/("""" data-thumb=""""),_display_(Seq[Any](/*24.106*/routes/*24.112*/.Assets.at("images/home/home-bigdata.jpg"))),format.raw/*24.154*/("""" alt="" data-transition="slideInLeft"/></a>
               <a href="/infrastructure"><img src=""""),_display_(Seq[Any](/*25.53*/routes/*25.59*/.Assets.at("images/home/home-bigdata.jpg"))),format.raw/*25.101*/("""" data-thumb=""""),_display_(Seq[Any](/*25.116*/routes/*25.122*/.Assets.at("images/home/home-bigdata.jpg"))),format.raw/*25.164*/("""" alt="" data-transition="slideInLeft"/></a>
            </div>
         </div>
      </div>
      </br>
      </br>
      <h3 id="about_right_nav_header">Welcome to SIHFW Karnataka</h3>
      <div class="content_layout" id="about_right_nav_conent">
         <p id="about_right_nav_conent_p1">Karnataka state is one of the pioneer states in the country in providing comprehensive public health services to its people. Even before the concept of Primary Health Centers was conceived by the government of India, the state had already made a beginning in establishing a number of PHU's for providing comprehensive Health Care, and a delivery system consisting of curative, preventive, promotive and rehabilitation health care, to the people of the state. "HEALTH" is an asset to every person.
         </p>
         <p id="about_right_nav_conent_p2"> <strong>STATE INSTITUTE OF HEALTH AND FAMILY WELFARE</strong></font></br>
         </p>
         <ol>
            <li>
               <p>The State Institute of Health and Family Welfare is an apex level training institute of the Health and Family Welfare Department Which was established in 1996, under IPP –IX (K).</p>
            </li>
            <li>
               <p>The State Institute of Health & Family Welfare, Bangalore is recognized as one of the 16 Collaborative Trainings Institutes for RCH Training by NIHFW, New Delhi.</p>
            </li>
            <li>
               <p>SIHFW caters trainings to all cadres of Health staff of the dept in technical and administrative skills. </p>
            </li>
            <li>
               <p>The institute conducts various trainings under NRHM, RCH, National programmes, ASHA and disease control programmes.</p>
            </li>
            <li>
               <p>The Trainings impart the requisite knowledge and skills enabling the health care providers to deliver effective services at all delivery points.</p>
            </li>
            <li>
               <p>Certificate of Public Health Nursing Course (CPHN) an eighteen months certified course in public health nursing for in service senior health assistants(F) in a batch of  25 person.</p>
            </li>
         </ol>
              	 </div>
   </div>
</div>
""")))})),format.raw/*60.2*/("""
"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Sep 27 15:55:51 IST 2014
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/home.scala.html
                    HASH: a811cf9dccd972b06627a35738a76b9395a004cd
                    MATRIX: 754->1|848->18|884->20|905->33|944->35|1010->66|1024->72|1105->132|1206->198|1220->204|1290->253|2569->1496|2584->1502|2642->1538|2694->1553|2710->1559|2769->1595|2873->1663|2888->1669|2947->1706|2999->1721|3015->1727|3075->1764|3168->1821|3183->1827|3237->1859|3288->1874|3304->1880|3359->1912|3454->1971|3469->1977|3533->2019|3585->2034|3601->2040|3666->2082|3790->2170|3805->2176|3868->2217|3920->2232|3936->2238|4001->2280|4134->2377|4149->2383|4214->2425|4266->2440|4282->2446|4347->2488|6615->4725
                    LINES: 27->1|30->1|31->2|31->2|31->2|32->3|32->3|32->3|33->4|33->4|33->4|49->20|49->20|49->20|49->20|49->20|49->20|50->21|50->21|50->21|50->21|50->21|50->21|51->22|51->22|51->22|51->22|51->22|51->22|52->23|52->23|52->23|52->23|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|54->25|54->25|54->25|54->25|54->25|54->25|89->60
                    -- GENERATED --
                */
            