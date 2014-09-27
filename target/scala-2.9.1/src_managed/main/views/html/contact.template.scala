
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
object contact extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/main(message)/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
<div class="content_container">
   <div class="left_nav" id="contact_left_nav">
      <h2 class="services" id="contact_left_nav_sevices">Services</h2>
      <ul>
 	     <li class="left_nav_link"><a id="about_left_nav_training_details" href="/training_details">Training Details<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_health_statistics" href="/health_statistics">Health Statistics<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_health_days" href="/health_days">Health Days & Themes<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_reports" href="/reports">Reports by SIHFW<span class="left_nav_arrow"></span></a></li>
         <li class="left_nav_link"><a id="about_left_nav_committee" href="/committee">Reports Committee<span class="left_nav_arrow"></span></a>
       </ul>
   </div>
   <div class="right_nav" id="contact_right_nav">
      <div class="page_banner" id="contact_right_nav_page_banner">
         <img id="contact_right_nav_page_banner_image" src=""""),_display_(Seq[Any](/*16.62*/routes/*16.68*/.Assets.at("images/contact/contact-banner.png" ))),format.raw/*16.116*/(""""/>
      </div>
      <div class="contact_layout" id="contact_right_nav_content">
         <p id="contact_right_nav_content_p">For any enquiries, please write to: <a href="mailto:info@gmail.com">contactnrhm@gmail.com</a></p>
         <div class="contact_left" id="contact_right_nav_content_left">
            <h2 id="contact_right_nav_content_left_header">Head Office</h2>
            <p class="address_location" id="contact_right_nav_content_left_location">Bangalore:</p>
            <span id="contact_right_nav_content_left_address1"><b>Director,</b></span> 
            <span id="contact_right_nav_content_left_address1"><b>SIHFW Karnataka,</b></span> 
            <span id="contact_right_nav_content_left_address2">1st Cross, Magadi Road,</span>
            <span id="contact_right_nav_content_left_address3">Bangalore - 560 023,</span>
            <span id="contact_right_nav_content_left_address4">Karnataka.</span>
            <p id="contact_right_nav_content_left_p">Phone:	080 23206126, Fax:	080-23206125, </br> Email: directorsihfw.bg@gmail.com</p>
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
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/contact.scala.html
                    HASH: 86793cfb3fabc03a8bbe1f56b6fd7936939a80e1
                    MATRIX: 757->1|851->18|887->20|908->33|947->35|2116->1168|2131->1174|2202->1222
                    LINES: 27->1|30->1|31->2|31->2|31->2|45->16|45->16|45->16
                    -- GENERATED --
                */
            