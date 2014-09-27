
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
object hr extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
      </br>
      <div class="content_wrapper" id="bd_right_nav_content">
         <table class="features-table">
            <thead>
               <tr>
                  <td></td>
                  <td>Name & Designation</td>
                  <td>Phone No.</td>
                  <td>E-mail address</td>
               </tr>
            </thead>
            <tbody>
               <tr>
                  <td>
                     <div class="circle" style="background-image: 
                     url('"""),_display_(Seq[Any](/*30.28*/routes/*30.34*/.Assets.at("images/hr/ARUNA.jpg"))),format.raw/*30.67*/("""')">
      </div>
      </td>
      <td>
      <p><h3>Dr. A.R. Aruna,
      </h3><b>Director</b>
      </p>
      </td>
      <td>
      <p><b>9448076311</b></p>
      <p><b> 9845043985</b></p>
      </td>
      <td>
      <p><b>directorsihfw.bg@gmail.com</b></p>
      </td>
      </tr>
      <tr>
      <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*49.13*/routes/*49.19*/.Assets.at("images/hr/DR RC RAMESH.jpg"))),format.raw/*49.59*/("""')">
   </div>
   </td>
   <td>
   <p><h4>Dr. H.C. Ramesh,</h4>
   <b>Joint Director</b>
   </p>
   </td>
   <td>
   <p><b>9845393010</b></p>
   </td>
   <td>
   <p><b>jdsihfwblore@gmail.com</b></p>
   </td>
   </tr>
   <tr>
   <td>
   <div class="circle" style="background-image: 
   url('"""),_display_(Seq[Any](/*67.10*/routes/*67.16*/.Assets.at("images/hr/DR LAKSHMINARAYAN.jpg"))),format.raw/*67.61*/("""')">
</div>
</td>
<td>
<p><h4>Dr. H.G. Lakshminarayan,</h4><b> Deputy Director</b>
</p>
</td>
<td>
<p><b>9449843286</b></p>
</td>
<td>
<p><b>ddphsihfwkar@gmail.com</b></p>
</td>
</tr>
<tr>
<td>
<div class="circle" style="background-image: 
url('"""),_display_(Seq[Any](/*84.7*/routes/*84.13*/.Assets.at("images/hr/SHRINAVASA.jpg"))),format.raw/*84.51*/("""')"></div>
</td>
<td>
<p><h4>Dr. A.V. Sreenivasa,</h4><b> Deputy Director</b>
</p>
</td>
<td>
<p><b>9449843281</b></p>
</td>
<td>
<p><b>ddphnsihfwkar@gmail.com</b></p>
</td>
</tr>
<tr>
<td>
<div class="circle" style="background-image: 
url('"""),_display_(Seq[Any](/*100.7*/routes/*100.13*/.Assets.at("images/hr/SHANKARAPPA.jpg"))),format.raw/*100.52*/("""')"></div>
</td>
<td>
<p><h4>Dr. G.Shankarappa,</h4><b> Deputy Director</b>
</p>
</td>
<td>
<p><b>9880665838  </b></p>
<p><b> 9449843284</b></p>
</td>
<td>
<p><b>ddmangsihfw@gmail.com</b></p>
</td>
</tr>
<tr>
<td>
<div class="circle" style="background-image: 
url('"""),_display_(Seq[Any](/*117.7*/routes/*117.13*/.Assets.at("images/hr/SUJATHA.jpg"))),format.raw/*117.48*/("""')"></div>
</td>
<td>
<p><h4>Dr. Sujatha,</h4><b> Deputy Director</b>
</p>
</td>
<td>
<p><b>9449843287</b></p>
</td>
<td>
<p><b>ddfwsihfwkar@gmail.com</b></p>
</td>
</tr>
<tr>
<td>
<div class="circle" style="background-image: 
url('"""),_display_(Seq[Any](/*133.7*/routes/*133.13*/.Assets.at("images/hr/SRINIVASAGOWDA.jpg"))),format.raw/*133.55*/("""')"></div>
</td>
<td>
<p><h4>Dr. Srinivasa Gowda. C.R.</h4>
<b>Deputy Director</b>

</p>
</td>
<td>
<p><b>9449843280
</b></p><p><b>080-23208821</b></p>
</td>
<td>
<p><b>ddadminsihfwkar@gmail.com</b></p>
</td>
</tr>
<td>
<div class="circle" style="background-image: 
url('"""),_display_(Seq[Any](/*151.7*/routes/*151.13*/.Assets.at("images/hr/eshwarappa.jpg"))),format.raw/*151.51*/("""')"></div>
</td>
<td>
<p><h4>Dr. T. Eswaraiah.</h4>
<b>Deputy Director</b>
</p>
</td>
<td>
<p><b>9449843285</b></p><p><b>  9449173704</b></p>
</td>
<td>
<p><b>dddemosihfwkar@gmail.com</b></p>
</td>
</tr>
<tr>
<td>
<div class="circle" style="background-image: 
url('"""),_display_(Seq[Any](/*168.7*/routes/*168.13*/.Assets.at("images/hr/MYLARAPPA.jpg"))),format.raw/*168.50*/("""')"></div>
</td>
<td>
<p><h4>Dr. Mylarappa.Y.B</h4>
<b>CTI-Consultant</b>
</p>
</td>
<td>
<p><b>9901811022
</b></p>
</td>
<td>
<p><b>mailar.yb@gmail.com</b></p>
</td>
</tr>
<tr>
<td>
<div class="circle" style="background-image: 
url('"""),_display_(Seq[Any](/*186.7*/routes/*186.13*/.Assets.at("images/hr/SHANKARAPPA_HOSKERI.jpg"))),format.raw/*186.60*/("""')"></div>
</td>
<td>
<p><h4>Dr. Shankarappa.G. Hoskeri</h4>
<b>CTI-Consultant</b>
</p>
</td>
<td>
<p><b>9900467070
</b></p>
</td>
<td>
<p><b>shankar.hoskeri@gmail.com</b></p>
</td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*204.13*/routes/*204.19*/.Assets.at("images/hr/SHIVAMALLAPA.png"))),format.raw/*204.59*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Sri. Shivamallappa</h4>
      <b>Asst. Admn.Officer</b>
      </p>
   </td>
   <td>
      <p><b>(080)23405209
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*224.13*/routes/*224.19*/.Assets.at("images/hr/SUSHELLA.png"))),format.raw/*224.55*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Smt. T. Susheela</h4>
      <b>Office. Suptd</b>
      </p>
   </td>
   <td>
      <p><b>9632248612
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*244.13*/routes/*244.19*/.Assets.at("images/hr/SRIDAR.png"))),format.raw/*244.53*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Sri. N.P. Sridhar
</h4>
      <b>Office. Suptd (O.O.D)</b>
      </p>
   </td>
   <td>
      <p><b>9243160696, (080)7899038626
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*265.13*/routes/*265.19*/.Assets.at("images/hr/SHASIKALA.png"))),format.raw/*265.56*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Smt.Shashikala K N</h4>
      <b>Stenographer</b>
      </p>
   </td>
   <td>
      <p><b>9845577400
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*285.13*/routes/*285.19*/.Assets.at("images/hr/MURILIDHAR.png"))),format.raw/*285.57*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Sri.Muralidhar R
</h4>
      <b>FDA</b>
      </p>
   </td>
   <td>
      <p><b>9035032003
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*306.13*/routes/*306.19*/.Assets.at("images/hr/VIMALALAKSHMI.png"))),format.raw/*306.60*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Smt.Vimalakshi B J
</h4>
      <b>FDA</b>
      </p>
   </td>
   <td>
      <p><b>9986583727
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*327.13*/routes/*327.19*/.Assets.at("images/hr/DEsouza.png"))),format.raw/*327.54*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Sri.A.W.Desouza
</h4>
      <b>SDA
</b>
      </p>
   </td>
   <td>
      <p><b>9632384349
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*349.13*/routes/*349.19*/.Assets.at("images/hr/Chandrika.png"))),format.raw/*349.56*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Smt.Chandrika S
</h4>
      <b>SDA
</b>
      </p>
   </td>
   <td>
      <p><b>7760181300
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*371.13*/routes/*371.19*/.Assets.at("images/hr/PUSHPA.png"))),format.raw/*371.53*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Smt. Pushpa P
</h4>
      <b>Typist
</b>
      </p>
   </td>
   <td>
      <p><b>9663690838
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*393.13*/routes/*393.19*/.Assets.at("images/hr/SANGEETHA.png"))),format.raw/*393.56*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Smt. Sangeetha N
</h4>
      <b>Accounts Asst
</b>
      </p>
   </td>
   <td>
      <p><b>9620280240
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*415.13*/routes/*415.19*/.Assets.at("images/hr/GEETA.png"))),format.raw/*415.52*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Kum.Geeeta P C
</h4>
      <b>Comp Asst
</b>
      </p>
   </td>
   <td>
      <p><b>9663889190
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>
<tr>
   <td>
      <div class="circle" style="background-image: 
      url('"""),_display_(Seq[Any](/*437.13*/routes/*437.19*/.Assets.at("images/hr/LAVANYA.png"))),format.raw/*437.54*/("""')"></div>
   </td>
   <td>
      <p>
      <h4>Kum. Lavanya K
</h4>
      <b>Comp Asst
</b>
      </p>
   </td>
   <td>
      <p><b>8970460938
         </b>
      </p>
   </td>
   <td>
      <p><b>-</b></p>
   </td>
</tr>

</tbody>
</table>
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
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/hr.scala.html
                    HASH: 427f4865f064d602312b7a8516ea89226c8f9a82
                    MATRIX: 752->1|846->18|882->20|903->33|942->35|2472->1529|2487->1535|2542->1568|2952->1943|2967->1949|3029->1989|3356->2281|3371->2287|3438->2332|3719->2579|3734->2585|3794->2623|4072->2866|4088->2872|4150->2911|4452->3178|4468->3184|4526->3219|4795->3453|4811->3459|4876->3501|5184->3774|5200->3780|5261->3818|5563->4085|5579->4091|5639->4128|5910->4364|5926->4370|5996->4417|6298->4683|6314->4689|6377->4729|6728->5043|6744->5049|6803->5085|7144->5389|7160->5395|7217->5429|7585->5760|7601->5766|7661->5803|8003->6108|8019->6114|8080->6152|8412->6447|8428->6453|8492->6494|8826->6791|8842->6797|8900->6832|9232->7127|9248->7133|9308->7170|9640->7465|9656->7471|9713->7505|10046->7801|10062->7807|10122->7844|10465->8150|10481->8156|10537->8189|10874->8489|10890->8495|10948->8530
                    LINES: 27->1|30->1|31->2|31->2|31->2|59->30|59->30|59->30|78->49|78->49|78->49|96->67|96->67|96->67|113->84|113->84|113->84|129->100|129->100|129->100|146->117|146->117|146->117|162->133|162->133|162->133|180->151|180->151|180->151|197->168|197->168|197->168|215->186|215->186|215->186|233->204|233->204|233->204|253->224|253->224|253->224|273->244|273->244|273->244|294->265|294->265|294->265|314->285|314->285|314->285|335->306|335->306|335->306|356->327|356->327|356->327|378->349|378->349|378->349|400->371|400->371|400->371|422->393|422->393|422->393|444->415|444->415|444->415|466->437|466->437|466->437
                    -- GENERATED --
                */
            