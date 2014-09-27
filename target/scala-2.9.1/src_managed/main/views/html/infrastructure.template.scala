
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
object infrastructure extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
      <h3 id="bd_right_nav_header">Infrastructure</h3>
      <div class="content_first" id="wd_right_nav_content_first">
         <div class="content_left_text" id="wd_right_nav_content_first_left_text">
            <p id="wd_right_nav_content_first_left_text_p">	<b>Administrative Block</b></br>Administrative block has three Class Rooms, Meeting Hall, Chambers of Director, Jt. Director, Dy. Directors, CTI-Consultants, rooms for other office staffs and a superior Computer lab for 30 participants.
            </p>
         </div>
         <img class="content_right_image image_first" id="wd_right_nav_content_first_right_image" src=""""),_display_(Seq[Any](/*21.105*/routes/*21.111*/.Assets.at("images/infrastructure/1.png"))),format.raw/*21.152*/("""" />
      </div>
      <div class="content_second" id="wd_right_nav_content_second">
         <img class="content_left_image image_second" id="wd_right_nav_content_second_image" src=""""),_display_(Seq[Any](/*24.100*/routes/*24.106*/.Assets.at("images/infrastructure/2.jpg"))),format.raw/*24.147*/("""" />
         <div class="content_right_text" id="wd_right_nav_content_second_right_text" >
            <p id="wd_right_nav_content_second_text_p"><b>
               Hostel and Seminar</b></br>
               The Seminar Hall is air-conditioned with a seating capacity of 60. It is well equipped with Public addressing systems, lighting systems, LCD Projector Accommodation facility.Hostel Block has 16 rooms with Dining and Recreation Room, Chambers for Director and Library
            </p>
         </div>
      </div>
      <div class="content_third" id="wd_right_nav_content_third">
         <div class="content_left_text" id="wd_right_nav_content_third_left_content">
            <p id="wd_right_nav_content_third_left_content_p"><b>
               Seminar Hall 2</b></br>
               One of the most modern seminar hall using for TOT and other ongoing activities like review meetings counselling activities. Some part of the building is provided to HFWTC Bangalore, has got full pledged SBA skill lab to conduct State level TOTs.</br>
         </div>
         <img class="content_right_image image_first" id="wd_right_nav_content_first_right_image" src=""""),_display_(Seq[Any](/*38.105*/routes/*38.111*/.Assets.at("images/infrastructure/3.jpg"))),format.raw/*38.152*/("""" />
      </div>
      <div class="content_second" id="wd_right_nav_content_second">
         <img class="content_left_image image_second" id="wd_right_nav_content_second_image" src=""""),_display_(Seq[Any](/*41.100*/routes/*41.106*/.Assets.at("images/infrastructure/4.png"))),format.raw/*41.147*/("""" />
         <div class="content_right_text" id="wd_right_nav_content_second_right_text" >
            <p id="wd_right_nav_content_second_text_p"><b>Hostels </b></br>
               New hostel is having 10 fully furnished twin bedded A/C rooms and 15 Non A/C rooms with colour TV and an attractive reception hall. In house catering services is also available </br>
         </div>
      </div>
      <div class="content_first" id="wd_right_nav_content_first">
         <div class="content_left_text" id="wd_right_nav_content_third_left_content">
            <p id="wd_right_nav_content_third_left_content_p"><b>CHPN Building
               </b></br>
               Is the centre for the Certificate Course in Public Health Nursing (CPHN) for senior female Health workers with A.C- training hall, computer room, staff room etc., It also accommodates Karnataka State Health System Resource Centre (KHSRC) </br>
         </div>
         <img class="content_right_image image_first" id="wd_right_nav_content_first_right_image" src=""""),_display_(Seq[Any](/*53.105*/routes/*53.111*/.Assets.at("images/infrastructure/5.png"))),format.raw/*53.152*/("""" />
      </div>
      <div class="content_second" id="wd_right_nav_content_second">
         <img class="content_left_image image_second" id="wd_right_nav_content_second_image" src=""""),_display_(Seq[Any](/*56.100*/routes/*56.106*/.Assets.at("images/infrastructure/8.jpg"))),format.raw/*56.147*/("""" />
         <div class="content_right_text" id="wd_right_nav_content_second_right_text" >
            <p id="wd_right_nav_content_second_text_p"><b>
               HFWTC
               </b></br>
               The State Institute is supported by 4 Regional HFWTCs and 19 DTCs, which are fully equipped with modern teaching aids, and hostel facilities, to train the staff of HFW Department. </br>
         </div>
      </div>
   </div>
</div>
""")))})),format.raw/*66.2*/("""
"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Sep 27 15:55:51 IST 2014
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/infrastructure.scala.html
                    HASH: 5d5ab991bb2c1ac94135e5f42031b16b527778f7
                    MATRIX: 764->1|858->18|894->20|915->33|954->35|2617->1661|2633->1667|2697->1708|2919->1893|2935->1899|2999->1940|4201->3105|4217->3111|4281->3152|4503->3337|4519->3343|4583->3384|5650->4414|5666->4420|5730->4461|5952->4646|5968->4652|6032->4693|6508->5138
                    LINES: 27->1|30->1|31->2|31->2|31->2|50->21|50->21|50->21|53->24|53->24|53->24|67->38|67->38|67->38|70->41|70->41|70->41|82->53|82->53|82->53|85->56|85->56|85->56|95->66
                    -- GENERATED --
                */
            