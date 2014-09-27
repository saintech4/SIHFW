
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!doctype html> 
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> 
<html class="no-js ie6 oldie" lang="en">
   <![endif]-->
   <!--[if IE 7]>    
   <html class="no-js ie7 oldie" lang="en">
      <![endif]-->
      <!--[if IE 8]>    
      <html class="no-js ie8 oldie" lang="en">
         <![endif]-->
         <!-- Consider adding an manifest.appcache: h5bp.com/d/Offline -->
         <!--[if gt IE 8]><!-->
         <html class="no-js" lang="en">
            <!--<![endif]-->
            <head>
               <meta charset="utf-8">
               """),format.raw/*19.130*/("""
               <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
               <title>"""),_display_(Seq[Any](/*21.24*/title)),format.raw/*21.29*/("""</title>
		        <meta name="description" content="SIHFW Karnataka - The State Institute of Health and Family Welfare is an apex level training institute of the Health and Family Welfare Department Which was established in 1996, under IPP –IX (K). 
	Karnataka state is one of the pioneer states in the country in providing comprehensive public health services to its people.">
               <meta name="author" content="SIHFW Karnataka.">
               <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*25.49*/routes/*25.55*/.Assets.at("images/ico/fa.png"))),format.raw/*25.86*/("""">
               """),format.raw/*26.44*/("""
               <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*27.61*/routes/*27.67*/.Assets.at("stylesheets/sihfw.css"))),format.raw/*27.102*/("""">
            </head>
            <body>
               """),format.raw/*30.46*/("""
               <div id="container">
                  <div id="top_img">
                     <img src=""""),_display_(Seq[Any](/*33.33*/routes/*33.39*/.Assets.at("images/home/home.png"))),format.raw/*33.73*/("""" />
                  </div>
                  """),format.raw/*35.42*/("""
                  <div id="top_bar">
                     <ul>
                        <li class="sihfw"><a class="hp" id="top_bar_SIHFW" href="/">Home</a></li>
                        <li ><a class="about" id="top_bar_market_research" href="/about">About</a></li>
                        <li ><a class="infrastructure" id="top_bar_business_intelligence" href="/infrastructure">Infrastructure</a></li>
                        <li ><a class="hr" id="human_resource" href="/hr">Human Resource</a></li>
                        <li ><a class="activities" id="top_bar_web_development" href="/activities">Activities</a></li>
                        <li><a class="presentations" id="top_bar_about" href="/presentations">Presentations</a></li>
                        <li><a class="contact_us" id="top_bar_contact" href="/contact">Contact Us</a></li>
                        <li><a class="photos" id="top_bar_photo" href="/photos">Photo Gallery</a></li>
                     </ul>
                  </div>
                  
                  """),format.raw/*49.104*/("""
                  """),_display_(Seq[Any](/*50.20*/content)),format.raw/*50.27*/("""
                  """),format.raw/*51.49*/("""
                  <div id="bottom_bar">
                     <span id="bottom_bar_copyright" class="copyright">Copyright &copy; 2012 SIHFW, Inc. All rights reserved.</span>
                     <span id="bottom_bar_links" class="bottom_bar_links">
                        
                     </span>
                  </div>
               </div>
               """),format.raw/*59.50*/("""
               """),format.raw/*62.97*/("""
               <script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
               <script>window.jQuery || document.write('<script src=""""),_display_(Seq[Any](/*64.71*/routes/*64.77*/.Assets.at("javascripts/libs/jquery/jquery-1.7.2-min.js"))),format.raw/*64.134*/(""""><\/script>')</script>
               <script type="text/javascript">
               		$(document).ready(function() """),format.raw("""{"""),format.raw/*66.48*/(""" 		 
                  		
              
              	        /*
              	         * Animate the Left Navigation 
              	         */
              	        
               
              	         $("li.left_nav_link").mouseout(function () """),format.raw("""{"""),format.raw/*74.69*/("""
              	            
              	            if((window.location.pathname == '/training_calendar')) """),format.raw("""{"""),format.raw/*76.84*/("""						// Contact Us page
              				$('a#about_left_nav_training_calendar').css('background-color','#DFECF8');
              				$('a#about_left_nav_training_calendar').css("""),format.raw("""{"""),format.raw/*78.64*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*78.104*/(""");
              	            $('a#about_left_nav_training_calendar').find("span").append(sm_black_arrow_right);
              				"""),format.raw("""}"""),format.raw/*80.20*/("""
              				else if((window.location.pathname == '/committee')) """),format.raw("""{"""),format.raw/*81.72*/("""						// Contact Us page
	                  		$('a#about_left_nav_committee').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_committee').css("""),format.raw("""{"""),format.raw/*83.59*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*83.99*/(""");
	                  	    $('a#about_left_nav_committee').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*85.22*/(""" else if((window.location.pathname == '/training_details')) """),format.raw("""{"""),format.raw/*85.83*/("""						// Contact Us page
	                  		$('a#about_left_nav_training_details').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_training_details').css("""),format.raw("""{"""),format.raw/*87.66*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*87.106*/(""");
	                  	    $('a#about_left_nav_training_details').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*89.22*/(""" else if((window.location.pathname == '/health_statistics')) """),format.raw("""{"""),format.raw/*89.84*/("""						// Contact Us page
	                  		$('a#about_left_nav_health_statistics').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_health_statistics').css("""),format.raw("""{"""),format.raw/*91.67*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*91.107*/(""");
	                  	    $('a#about_left_nav_health_statistics').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*93.22*/(""" else if((window.location.pathname == '/health_days')) """),format.raw("""{"""),format.raw/*93.78*/("""						// Contact Us page
	                  		$('a#about_left_nav_health_days').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_health_days').css("""),format.raw("""{"""),format.raw/*95.61*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*95.101*/(""");
	                  	    $('a#about_left_nav_health_days').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*97.22*/(""" else if((window.location.pathname == '/reports')) """),format.raw("""{"""),format.raw/*97.74*/("""						// Contact Us page
	                  		$('a#about_left_nav_reports').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_reports').css("""),format.raw("""{"""),format.raw/*99.57*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*99.97*/(""");
	                  	    $('a#about_left_nav_reports').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*101.22*/("""
              	         """),format.raw("""}"""),format.raw/*102.26*/(""");
              
	                  	/*
	                  	 * The menu item is highlighted for each selected page (SIHFW, Market Research, Business Intelligence, Big Data and Web Development)
	                  	 * For example: Onclick of the 'Web Development' page the 'Web Development' in the menu will be highlighted by giving background color.
	                  	 */
	                  	if(window.location.pathname == '/') """),format.raw("""{"""),format.raw/*108.58*/("""
	                  		// Home page
	                  		$('.hp').css('background-color','#36597D');
	                  		$('.hp').css('color','#fff');
	                  		page = 'sihfw';
	                  	"""),format.raw("""}"""),format.raw/*113.22*/(""" else if((window.location.pathname == '/about') ) """),format.raw("""{"""),format.raw/*113.73*/("""							// Market Research page
	                  		$('.about').css('background-color','#36597D');
	                  		$('.about').css('color','#fff');
	                  		page = 'about';
	                  	"""),format.raw("""}"""),format.raw/*117.22*/(""" else if((window.location.pathname == '/infrastructure')) """),format.raw("""{"""),format.raw/*117.81*/("""							// Business Intelligence page
	                  		$('.infrastructure').css('background-color','#36597D');
	                  		$('.infrastructure').css('color','#fff');
	                  		page = 'infrastructure';
	                  	"""),format.raw("""}"""),format.raw/*121.22*/(""" else if((window.location.pathname == '/hr')) """),format.raw("""{"""),format.raw/*121.69*/("""						// Big Data page
	                  		$('.hr').css('background-color','#36597D');
	                  		$('.hr').css('color','#fff');
	                  		page = 'hr';
	                  	"""),format.raw("""}"""),format.raw/*125.22*/(""" else if((window.location.pathname == '/activities')) """),format.raw("""{"""),format.raw/*125.77*/("""							// Web Development page
	                  		$('.activities').css('background-color','#36597D');
	                  		$('.activities').css('color','#fff');
	                  		page = 'activities';
	                  	"""),format.raw("""}"""),format.raw/*129.22*/(""" else if((window.location.pathname == '/presentations')) """),format.raw("""{"""),format.raw/*129.80*/("""							// About page
							$('.presentations').css('background-color','#36597D');
	                  		$('.presentations').css('color','#fff');
	                  		page = 'presentations';
	 	                """),format.raw("""}"""),format.raw/*133.21*/(""" else if((window.location.pathname == '/contact')) """),format.raw("""{"""),format.raw/*133.73*/("""						// Contact Us page
	                  		$('.contact_us').css('background-color','#36597D');
	                  		$('.contact_us').css('color','#fff');
	                  		page = 'publications';
	                  	"""),format.raw("""}"""),format.raw/*137.22*/(""" else if((window.location.pathname == '/photos')) """),format.raw("""{"""),format.raw/*137.73*/("""						// Contact Us page
	                  		$('.photos').css('background-color','#36597D');
	                  		$('.photos').css('color','#fff');
	                  		page = 'photos';
	                  	"""),format.raw("""}"""),format.raw/*141.22*/("""
	                  	 else if((window.location.pathname == '/training_calendar')) """),format.raw("""{"""),format.raw/*142.83*/("""						// Contact Us page
	                  		$('a#about_left_nav_training_calendar').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_training_calendar').css("""),format.raw("""{"""),format.raw/*144.67*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*144.107*/(""");
	                  	    $('a#about_left_nav_training_calendar').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*146.22*/("""
	                  	 else if((window.location.pathname == '/committee')) """),format.raw("""{"""),format.raw/*147.75*/("""						// Contact Us page
	                  		$('a#about_left_nav_committee').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_committee').css("""),format.raw("""{"""),format.raw/*149.59*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*149.99*/(""");
	                  	    $('a#about_left_nav_committee').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*151.22*/("""
	                  	 else if((window.location.pathname == '/training_details')) """),format.raw("""{"""),format.raw/*152.82*/("""						// Contact Us page
	                  		$('a#about_left_nav_training_details').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_training_details').css("""),format.raw("""{"""),format.raw/*154.66*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*154.106*/(""");
	                  	    $('a#about_left_nav_training_details').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*156.22*/("""
	                  	else if((window.location.pathname == '/health_statistics')) """),format.raw("""{"""),format.raw/*157.82*/("""						// Contact Us page
	                  		$('a#about_left_nav_health_statistics').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_health_statistics').css("""),format.raw("""{"""),format.raw/*159.67*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*159.107*/(""");
	                  	    $('a#about_left_nav_health_statistics').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*161.22*/("""
	                  	else if((window.location.pathname == '/health_days')) """),format.raw("""{"""),format.raw/*162.76*/("""						// Contact Us page
	                  		$('a#about_left_nav_health_days').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_health_days').css("""),format.raw("""{"""),format.raw/*164.61*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*164.101*/(""");
	                  	    $('a#about_left_nav_health_days').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*166.22*/(""" else if((window.location.pathname == '/reports')) """),format.raw("""{"""),format.raw/*166.74*/("""						// Contact Us page
	                  		$('a#about_left_nav_reports').css('background-color','#DFECF8');
	                  		$('a#about_left_nav_reports').css("""),format.raw("""{"""),format.raw/*168.57*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*168.97*/(""");
	                  	    $('a#about_left_nav_reports').find("span").append(sm_black_arrow_right);
	                  	"""),format.raw("""}"""),format.raw/*170.22*/("""
	              """),format.raw("""}"""),format.raw/*171.17*/(""");
               </script>
               """),format.raw/*175.43*/("""
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*176.53*/routes/*176.59*/.Assets.at("javascripts/plugins/jquery.nivo.slider.js"))),format.raw/*176.114*/(""""></script>
               <script type="text/javascript">
                  $(window).load(function() """),format.raw("""{"""),format.raw/*178.46*/("""
                  	    $('#slider').nivoSlider();					// Load the Nivo slider
                  """),format.raw("""}"""),format.raw/*180.20*/(""");
               </script>
            </body>
         </html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Sep 27 16:33:18 IST 2014
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/main.scala.html
                    HASH: 2dced7b71121203aed31c79df4d26bba62921fbe
                    MATRIX: 759->1|866->31|1497->747|1635->849|1662->854|2188->1344|2203->1350|2256->1381|2302->1427|2399->1488|2414->1494|2472->1529|2557->1616|2699->1722|2714->1728|2770->1762|2846->1833|3911->2954|3967->2974|3996->2981|4043->3030|4436->3429|4480->3717|4685->3886|4700->3892|4780->3949|4945->4067|5249->4324|5408->4436|5636->4617|5724->4657|5903->4789|6022->4861|6240->5032|6327->5072|6497->5195|6605->5256|6837->5441|6925->5481|7102->5611|7211->5673|7445->5860|7533->5900|7711->6031|7814->6087|8036->6262|8124->6302|8296->6427|8395->6479|8609->6646|8696->6686|8865->6807|8939->6833|9418->7264|9675->7473|9774->7524|10033->7735|10140->7794|10432->8038|10527->8085|10769->8279|10872->8334|11146->8560|11252->8618|11510->8828|11610->8880|11880->9102|11979->9153|12235->9361|12366->9444|12601->9631|12690->9671|12869->9802|12992->9877|13211->10048|13299->10088|13470->10211|13600->10293|13833->10478|13922->10518|14100->10648|14230->10730|14465->10917|14554->10957|14733->11088|14857->11164|15080->11339|15169->11379|15342->11504|15442->11556|15657->11723|15745->11763|15914->11884|15979->11901|16051->12054|16141->12107|16157->12113|16236->12168|16388->12272|16534->12370
                    LINES: 27->1|30->1|48->19|50->21|50->21|54->25|54->25|54->25|55->26|56->27|56->27|56->27|59->30|62->33|62->33|62->33|64->35|78->49|79->50|79->50|80->51|88->59|89->62|91->64|91->64|91->64|93->66|101->74|103->76|105->78|105->78|107->80|108->81|110->83|110->83|112->85|112->85|114->87|114->87|116->89|116->89|118->91|118->91|120->93|120->93|122->95|122->95|124->97|124->97|126->99|126->99|128->101|129->102|135->108|140->113|140->113|144->117|144->117|148->121|148->121|152->125|152->125|156->129|156->129|160->133|160->133|164->137|164->137|168->141|169->142|171->144|171->144|173->146|174->147|176->149|176->149|178->151|179->152|181->154|181->154|183->156|184->157|186->159|186->159|188->161|189->162|191->164|191->164|193->166|193->166|195->168|195->168|197->170|198->171|200->175|201->176|201->176|201->176|203->178|205->180
                    -- GENERATED --
                */
            