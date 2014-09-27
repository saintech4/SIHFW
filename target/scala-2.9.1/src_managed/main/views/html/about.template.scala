
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
object about extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
         <img id="about_right_nav_page_banner_image" src=""""),_display_(Seq[Any](/*16.60*/routes/*16.66*/.Assets.at("images/about/about-banner.jpg"))),format.raw/*16.109*/("""" />
      </div>
      <h3 id="about_right_nav_header">State Institute of Health & Family Welfare (SIHFW) Karnataka</h3>
      
      <div class="content_wrapper" id="bd_right_nav_content">
          <div class="activities_banner" id="bd_right_nav_page_banner">
			<img id="bd_right_nav_page_banner_image" src=""""),_display_(Seq[Any](/*22.51*/routes/*22.57*/.Assets.at("images/activities/CHART1.jpg"))),format.raw/*22.99*/(""""/>
		</div>

        <b>Mission</b>
         <ul>
            <p>
            <li>    As an apex Institute,it facilitates the state in planning, budgeting, implementing, monitoring & evaluations of required trainings under all National Health Programmes, Human Resource Management and Logistics</li>
            </p>
            <p>  
            <li>     Development of Manuals and updating of existing Curriculums for basic trainings and in service training of Health staff</li>
            </p>
            <p>  
            <li>     Training of Trainers for faculty of training Institutions, District Training Centers and District level Programme officers including Teaching Faculty of the Medical Colleges</li>
            </p>
            <p>
            <li>         To conduct Diploma and Certificate Courses in Public Health. 
               and decentralizing the Training Activities at Districts by establishing District Training Centers
            </li>
            </p>
            <p>
            <li>        To establish a quality assurance call for monitoring & evaluation of all trainingsand to start distance learning and e-learning courses in collaboration with NIHFW</li>
            </p>
         </ul>
      </div>
      <!-- <p align="justify" style="color:#36597D"> <font face="Arial, Helvetica, sans-serif" size="2">
         <br>
         <b><a name="Minister's">MINISTER'S OFFICE PHONE NUMBER</a></b></font>&nbsp;</p>
         <table cellspacing="1" cellpadding="1" border="1" style="width: 719px; height: 124px; position: static;">
                       <tbody><tr>
                           <td style="width: 25px; height: 22px" rowspan="3" colspan="1"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>Sl.No</b></font>
                           </td>
                           <td align="left" style="width: 155px; height: 22px" rowspan="3" colspan="1"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>Name &amp; Designation </b></font>
                           </td>
                           <td align="left" style="width: 159px; height: 22px" rowspan="3" colspan="1"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>Address </b></font>
                           </td>
                           <td align="left" style="width: 145px; height: 22px" rowspan="3" colspan="1"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>Phone No/Fax</b></font>
                           </td>
                           <td align="left" style="width: 121px; height: 22px" rowspan="3" colspan="3"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>Email</b></font>
                           </td>
                       </tr>
                       <tr>
                       </tr>
                       <tr>
                       </tr>
                       <tr>
                           <td style="width: 25px; height: 106px;" rowspan="1" colspan="1"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>1</b></font>
                           </td>
                           <td align="left" style="width: 155px; height: 106px;" rowspan="1" colspan="1"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>SHRI. ARAVIND LIMBAVALI, Hon'ble Minister for Health &amp; Family Welfare </b></font></td>
                           <td align="left" style="width: 159px; height: 106px" rowspan="1" colspan="1"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>Hon'ble Minister for Health &amp; Family Welfare 
                               <br>
                               Room No.245/244, Vidhanasoudha,&nbsp; Bangalore - 1</b></font>
                           </td>
                           <td align="left" style="width: 145px; height: 106px;" rowspan="1" colspan="1"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>9449843000,<br>
                               080-22251639&nbsp;
                               (Off) 
                               <br>
                               080-28382335
                               (Res)
                               <br>
                               080-28386998 (Res)
                               </b></font>
                           </td>
                           <td align="left" style="width: 121px; height: 106px;" rowspan="1" colspan="3"><font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black"><b>
                               min - health@karnataka.gov.in
         </b></font>
                           </td>
                       </tr>
                   </tbody></table>
                   
                 <p align="justify" style="color:#36597D"> <font face="Arial, Helvetica, sans-serif" size="2">
         <br>
         <b><a name="Secretarys"> SECRETARY OFFICE PHONE NUMBER</a></b></font></p>
                   <table cellspacing="1" cellpadding="1" border="1" style="width: 719px; height: 124px; position: static;">
                       <tbody><tr>
                           <td style="width: 25px; height: 22px" rowspan="3" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Sl.No</b></font>
                           </td>
                           <td align="left" style="width: 154px; height: 22px" rowspan="3" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Name &amp; Designation </b></font>
                           </td>
                           <td align="left" style="width: 162px; height: 22px" rowspan="3" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Address </b></font>
                           </td>
                           <td align="left" style="width: 99px; height: 22px" rowspan="3" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Phone No/Fax</b></font>
                           </td>
                           <td align="left" style="width: 121px; height: 22px" rowspan="3" colspan="3">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Email</b></font>
                           </td>
                       </tr>
                       <tr>
                       </tr>
                       <tr>
                       </tr>
                       <tr>
                           <td style="width: 25px;;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>1</b></font>
                           </td>
                           <td align="left" style="width: 154px;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Shri. M. MADAN GOPAL,  IAS     Principal Secretary to Government Health &amp; FW Dept</b></font>
                           </td>
                           <td align="left" style="width: 162px;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Principal Secretary to Government Health &amp; FW Department, # 105, Ist Floor, Vikas Soudha, Bangalore-560 001 </b></font>
                           </td>
                           <td align="left" style="width: 99px; " rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>, &nbsp; &nbsp; &nbsp; 080-22255324 080-22034234
         Fax:080-22353916 080-25356761(R)
         </b></font>
                           </td>
                           <td align="left" style="width: 121px; " rowspan="1" colspan="3">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Email: prs-hfw@karnataka.gov.in </b></font>
                           </td>
                       </tr>
                       <tr>
                           <td style="width: 25px;;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>2</b></font>
                           </td>
                           <td align="left" style="width: 154px;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Joint Secretary  (Health) </b></font>
                           </td>
                           <td align="left" style="width: 162px;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Joint Secretary to Government, Health &amp; Family Welfare Department, # 402, 4th Floor, Vikas Soudha, Bangalore-560 001 </b></font>
                           </td>
                           <td align="left" style="width: 99px; " rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>22353915 22092573(D) 
         </b></font>
                           </td>
                           <td align="left" style="width: 121px; " rowspan="1" colspan="3">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>ds1_hfw@karnataka.gov.in </b></font>
                           </td>
                       </tr>
                       <tr>
                           <td style="width: 25px;;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>3</b></font>
                           </td>
                           <td align="left" style="width: 154px;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>Deputy Secretary </b></font>
                           </td>
                           <td align="left" style="width: 162px;" rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b> Deputy Secretary to Government, Health &amp; Family Welfare Department,# 101, Ist Floor, Vikas Soudha, Bangalore-560 001 </b></font>
                           </td>
                           <td align="left" style="width: 99px; " rowspan="1" colspan="1">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>22263744 22092573(D)
         </b></font>
                           </td>
                           <td align="left" style="width: 121px; " rowspan="1" colspan="3">
                               <font face="Arial, Helvetica, sans-serif" size="2" style="font-size: 9pt; color: black">
                                   <b>ds2-hfw@karnataka.gov.in </b></font>
                           </td>
                       </tr>
                   </tbody></table>-->
      </br>
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
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/about.scala.html
                    HASH: 817b22307d544a83dcd8942cd44c4efddc4bf146
                    MATRIX: 755->1|849->18|885->20|906->33|945->35|2104->1158|2119->1164|2185->1207|2534->1520|2549->1526|2613->1568
                    LINES: 27->1|30->1|31->2|31->2|31->2|45->16|45->16|45->16|51->22|51->22|51->22
                    -- GENERATED --
                */
            