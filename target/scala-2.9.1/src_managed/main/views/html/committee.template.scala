
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
object committee extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
      <h3 id="bd_right_nav_header">Reports Committee</h3>
      <div class="img_committee_main">
         <img class="committee_members_image" id="wd_right_nav_content_first_right_image" src=""""),_display_(Seq[Any](/*17.97*/routes/*17.103*/.Assets.at("images/hr/ARUNA.jpg"))),format.raw/*17.136*/("""" />
         <div class="desc_main">Dr. A.R. Aruna,</br>Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*21.36*/routes/*21.42*/.Assets.at("images/hr/DR RC RAMESH.jpg"))),format.raw/*21.82*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*21.127*/routes/*21.133*/.Assets.at("images/hr/DR RC RAMESH.jpg"))),format.raw/*21.173*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. H.C. Ramesh,</br>Joint Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*25.36*/routes/*25.42*/.Assets.at("images/hr/DR LAKSHMINARAYAN.jpg"))),format.raw/*25.87*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*25.132*/routes/*25.138*/.Assets.at("images/hr/DR LAKSHMINARAYAN.jpg"))),format.raw/*25.183*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. H.G. Lakshminarayan, </br>Deputy Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*29.36*/routes/*29.42*/.Assets.at("images/hr/SHRINAVASA.jpg"))),format.raw/*29.80*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*29.125*/routes/*29.131*/.Assets.at("images/hr/SHRINAVASA.jpg"))),format.raw/*29.169*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. A.V. Sreenivasa,</br> Deputy Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*33.36*/routes/*33.42*/.Assets.at("images/hr/SHANKARAPPA.jpg"))),format.raw/*33.81*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*33.126*/routes/*33.132*/.Assets.at("images/hr/SHANKARAPPA.jpg"))),format.raw/*33.171*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. G.Shankarappa, </br>Deputy Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*37.36*/routes/*37.42*/.Assets.at("images/hr/SUJATHA.jpg"))),format.raw/*37.77*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*37.122*/routes/*37.128*/.Assets.at("images/hr/SUJATHA.jpg"))),format.raw/*37.163*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. Sujatha, </br>Deputy Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*41.36*/routes/*41.42*/.Assets.at("images/hr/SRINIVASAGOWDA.jpg"))),format.raw/*41.84*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*41.129*/routes/*41.135*/.Assets.at("images/hr/SRINIVASAGOWDA.jpg"))),format.raw/*41.177*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. Srinivasa Gowda. C.R. </br>Deputy Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*45.36*/routes/*45.42*/.Assets.at("images/hr/CHANDRASHEKAR.jpg"))),format.raw/*45.83*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*45.128*/routes/*45.134*/.Assets.at("images/hr/CHANDRASHEKAR.jpg"))),format.raw/*45.175*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. Chandrashekar D. </br>Deputy Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*49.36*/routes/*49.42*/.Assets.at("images/hr/eshwarappa.jpg"))),format.raw/*49.80*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*49.125*/routes/*49.131*/.Assets.at("images/hr/eshwarappa.jpg"))),format.raw/*49.169*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. T. Eswaraiah. </br>Deputy Director</div>
      </div>
      <div class="img_committee">
         <a target="_blank" href=""""),_display_(Seq[Any](/*53.36*/routes/*53.42*/.Assets.at("images/hr/MYLARAPPA.jpg"))),format.raw/*53.79*/(""""><img class="committee_members_image" src=""""),_display_(Seq[Any](/*53.124*/routes/*53.130*/.Assets.at("images/hr/MYLARAPPA.jpg"))),format.raw/*53.167*/("""" alt="Klematis" width="110" height="90"></a>
         <div class="desc">Dr. Mylarappa.Y.B </br>CTI-Consultant </div>
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
                    DATE: Sat Sep 27 15:55:50 IST 2014
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/committee.scala.html
                    HASH: b72fc281a20af16469def62f03aff3b7f8362a22
                    MATRIX: 759->1|853->18|889->20|910->33|949->35|2166->1216|2182->1222|2238->1255|2428->1409|2443->1415|2505->1455|2587->1500|2603->1506|2666->1546|2899->1743|2914->1749|2981->1794|3063->1839|3079->1845|3147->1890|3390->2097|3405->2103|3465->2141|3547->2186|3563->2192|3624->2230|3863->2433|3878->2439|3939->2478|4021->2523|4037->2529|4099->2568|4336->2769|4351->2775|4408->2810|4490->2855|4506->2861|4564->2896|4795->3091|4810->3097|4874->3139|4956->3184|4972->3190|5037->3232|5281->3440|5296->3446|5359->3487|5441->3532|5457->3538|5521->3579|5760->3782|5775->3788|5835->3826|5917->3871|5933->3877|5994->3915|6230->4115|6245->4121|6304->4158|6386->4203|6402->4209|6462->4246
                    LINES: 27->1|30->1|31->2|31->2|31->2|46->17|46->17|46->17|50->21|50->21|50->21|50->21|50->21|50->21|54->25|54->25|54->25|54->25|54->25|54->25|58->29|58->29|58->29|58->29|58->29|58->29|62->33|62->33|62->33|62->33|62->33|62->33|66->37|66->37|66->37|66->37|66->37|66->37|70->41|70->41|70->41|70->41|70->41|70->41|74->45|74->45|74->45|74->45|74->45|74->45|78->49|78->49|78->49|78->49|78->49|78->49|82->53|82->53|82->53|82->53|82->53|82->53
                    -- GENERATED --
                */
            