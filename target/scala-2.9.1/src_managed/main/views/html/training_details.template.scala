
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
object training_details extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
         <img id="about_right_nav_page_banner_image" src=""""),_display_(Seq[Any](/*16.60*/routes/*16.66*/.Assets.at("images/about/images.jpg"))),format.raw/*16.103*/("""" />
      </div> 
      </br>
    <!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
table.hovertable """),format.raw("""{"""),format.raw/*21.19*/("""
	font-family: verdana,arial,sans-serif;
	font-size:14px;
	color:#333333;
	border-width: 1px;
	border-color: #999999;
	border-collapse: collapse;
"""),format.raw("""}"""),format.raw/*28.2*/("""
.caption_head """),format.raw("""{"""),format.raw/*29.16*/("""
padding: 5px;
font-size:15px;
color:white;
font-weight:bold;
background-color:#365A7E;
border-width: 1px;
	border-style: double double double double;
	border-color: #fffff;
"""),format.raw("""}"""),format.raw/*38.2*/("""
table.hovertable th """),format.raw("""{"""),format.raw/*39.22*/("""
	background-color:#c3dde0;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
"""),format.raw("""}"""),format.raw/*45.2*/("""
table.hovertable tr """),format.raw("""{"""),format.raw/*46.22*/("""
	
"""),format.raw("""}"""),format.raw/*48.2*/("""
table.hovertable td """),format.raw("""{"""),format.raw/*49.22*/("""
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
"""),format.raw("""}"""),format.raw/*54.2*/("""
</style>
<!-- Table goes in the document BODY -->
<table class="hovertable">
<caption class="caption_head">Health & Family Welfare Training Centres</caption>
<tr>
	<th>Sl.No.</th><th style="width:355px;">Addresses</th><th>Phone Nos & Email IDs</th>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>1</td><td>The Principal, Health & Family Welfare Training Centre, </br>Magadi Road, Ist Cross, </br>Inside Leprosy Hospital, </br>Bangalore-560 023.
</td><td>Off  : 9580-23351373, 
9580-23351103, 
hfwtcbangalore@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>2</td><td>The Principal, Health & Family Welfare Training Centre,</br> Metagalli, KRS.Road,</br>Mysore-16.
	</td><td>Off : 95821-2413896, 
hfwtcmysore@gmail.com
</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>3</td><td>The Principal, Health & Family Welfare Training Centre, Gulbarga.
</td><td>Off : 958472-222070, 
principalgulbarga544@yahoo.com
</td>
</tr>
</table>
</br>
</br>
<!-- Table goes in the document BODY -->
<table class="hovertable">
<caption class="caption_head">State Institute & District Training Centres</caption>
<tr>
	<th>Sl.No.</th><th style="width:325px;">Addresses</th><th>Phone Nos & Email IDs</th>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>1</td><td>Director, State Institute of Health & Family Welfare, Bangalore</td><td>Ph:   080 - 23206126,</br>  
Fax: 080  - 23206125,</br>     
directorsihfw.bg@gmail.com, </br>          
Hostel - I  080-23350117,</br>             
Hostel – II 080- 23401649</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>2</td><td>The Principal, District Training Centre,</br> Mysore.
	</td><td>95821-2414462,</br> dtc.principal.mys@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>3</td><td>The Principal, District Training Centre, </br> Madikeri.</td><td>958272-221211,</br>
dtcprincipalmadikeri@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>4</td><td>The Principal, District Training Centre,</br>  Surtkal, Mangalore.</td><td>95824-2478920,  
Fax :    2477564, 
dtcsurathkal@yahoo.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>5</td><td>The Principal, District Training Centre, </br>  Chikmagalur.</td><td>958262- 221245,</br> 
dtc.ckmg@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>6</td><td>The Principal, District Training Centre, </br>  Chitradurga.</td><td>958194-234188,</br> 
principaldtcchitradurga@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>7</td><td>The Principal, District Training Centre, </br>  Tumkur – 572101.</td><td>95816-2255865,</br> 
dtcprincipaltumkur@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>8</td><td>The Principal, District Training Centre,  </br>  Kolar –563101.</td><td>958152 224077,</br> 
dtckolar@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>9</td><td>The Principal, District Training Centre,</br>    Bellary.</td><td>958392-278780,</br> 
dtcbellary@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>10</td><td>The Principal, District Training Centre,</br>   Raichur.</td><td>958532-234467,</br> 
dtcprincipalraichur@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>11</td><td>The Principal, District Training Centre,</br>   Gulbarga.</td><td>958472-243857,</br> 
principaldtcfwglb@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>12</td><td>The Principal, District Training Centre, </br>  Ramanagara.</td><td>9580-27271214,</br> 
principaldtcrmg@yahoo.co.in</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>13</td><td>The Principal, District Training Centre,  </br>  Bidar District.</td><td>958482-222645,</br> 
principaldtcbdr@gmail.com</td>
</tr>

<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>14</td><td>The Principal, District Training Centre, </br>  Mandya District-571401.</td><td>958232-239054,</br> 
mandyadistricthtc@yahoo.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>15</td><td>The Principal, District Training Centre,</br>   P.B.Bijapur-586102.</td><td>958352-271308,</br> 
dtc.bijapur@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>16</td><td>The Principal, District Training Centre,</br>    Karwar (U.K)District.</td><td>958382-229625,</br> 
hfwdtckarwar@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>17</td><td>The Principal, District Training Centre,</br>  Dharwad District.</td><td>95836-2747190,</br> 
principaldhtcdwd@gmail.com</td>
</tr>
<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>18</td><td>The Principal,  District Training Centre,</br>  Belgaum District.</td><td>95831-2431221, </br>
dtcprincipal@gmail.com</td>
</tr>

<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>19</td><td>The Principal, District Training Centre, </br>  Hassan District.</td><td>958172-231099, </br>
dtchassan@gmail.com</td>
</tr>

<tr onmouseover="this.style.backgroundColor='#D5E3E5';" onmouseout="this.style.backgroundColor='#E8F0F1';">
	<td>20</td><td>The Principal,  District Training Centre,</br>   Shimoga District.</td><td>958182-225959, </br>
dtc_smg@rediffmail.com</td>
</tr>

</table>
     
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
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/training_details.scala.html
                    HASH: c399193779d53a4a2c162989d3433bc3e5b7d6ed
                    MATRIX: 766->1|860->18|896->20|917->33|956->35|2113->1156|2128->1162|2188->1199|2388->1352|2581->1499|2644->1515|2865->1690|2934->1712|3090->1822|3159->1844|3209->1848|3278->1870|3407->1953
                    LINES: 27->1|30->1|31->2|31->2|31->2|45->16|45->16|45->16|50->21|57->28|58->29|67->38|68->39|74->45|75->46|77->48|78->49|83->54
                    -- GENERATED --
                */
            