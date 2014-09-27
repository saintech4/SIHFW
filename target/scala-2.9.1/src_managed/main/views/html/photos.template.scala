
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
object photos extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""
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
               <meta name="description" content="SIHFW - The State Institute of Health and Family Welfare is an apex level training institute of the Health and Family Welfare Department Which was established in 1996, under IPP –IX (K). 
Karnataka state is one of the pioneer states in the country in providing comprehensive public health services to its people.">
               <meta name="author" content="SIHFW Karnataka.">
               <!-- First, add jQuery (and jQuery UI if using custom easing or animation -->
               <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
               <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js"></script>
               <!-- Second, add the Timer and Easing plugins -->
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*29.53*/routes/*29.59*/.Assets.at("javascripts/js/jquery.timers-1.2.js"))),format.raw/*29.108*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*30.53*/routes/*30.59*/.Assets.at("javascripts/js/jquery.easing.1.3.js"))),format.raw/*30.108*/(""""></script>
               <!-- Third, add the GalleryView Javascript and CSS files -->
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*32.53*/routes/*32.59*/.Assets.at("javascripts/js/jquery.galleryview-3.0-dev.js"))),format.raw/*32.117*/(""""></script>
               <link type="text/css" rel="stylesheet" href=""""),_display_(Seq[Any](/*33.62*/routes/*33.68*/.Assets.at("stylesheets/css/jquery.galleryview-3.0-dev.css"))),format.raw/*33.128*/("""" />
               <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*34.49*/routes/*34.55*/.Assets.at("images/ico/fa.png"))),format.raw/*34.86*/("""">
               """),format.raw/*35.44*/("""
               <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*36.61*/routes/*36.67*/.Assets.at("stylesheets/sihfw.css"))),format.raw/*36.102*/("""">
               <!-- Lastly, call the galleryView() function on your unordered list(s) -->
               <!-- Lastly, call the galleryView() function on your unordered list(s) -->
               <script type="text/javascript">
                  $(function()"""),format.raw("""{"""),format.raw/*40.32*/("""
                  $('#myGallery').galleryView("""),format.raw("""{"""),format.raw/*41.48*/("""
                  	transition_speed: 2000, 		//INT - duration of panel/frame transition (in milliseconds)
                  	transition_interval: 4000, 		//INT - delay between panel/frame transitions (in milliseconds)
                  	easing: 'swing', 				//STRING - easing method to use for animations (jQuery provides 'swing' or 'linear', more available with jQuery UI or Easing plugin)
                  	show_panels: true, 				//BOOLEAN - flag to show or hide panel portion of gallery
                  	show_panel_nav: false, 			//BOOLEAN - flag to show or hide panel navigation buttons
                  	enable_overlays: true, 			//BOOLEAN - flag to show or hide panel overlays
                  	panel_width: 700, 				//INT - width of gallery panel (in pixels)
                  	panel_height: 400, 				//INT - height of gallery panel (in pixels)
                  	panel_animation: 'slide', 		//STRING - animation method for panel transitions (crossfade,fade,slide,none)
                  	panel_scale: 'crop', 			//STRING - cropping option for panel images (crop = scale image and fit to aspect ratio determined by panel_width and panel_height, fit = scale image and preserve original aspect ratio)
                  	overlay_position: 'bottom', 	//STRING - position of panel overlay (bottom, top)
                  	pan_images: true,				//BOOLEAN - flag to allow user to grab/drag oversized images within gallery
                  	pan_style: 'drag',				//STRING - panning method (drag = user clicks and drags image to pan, track = image automatically pans based on mouse position
                  	pan_smoothness: 15,				//INT - determines smoothness of tracking pan animation (higher number = smoother)
                  	start_frame: 1, 				//INT - index of panel/frame to show first when gallery loads
                  	show_filmstrip: true, 			//BOOLEAN - flag to show or hide filmstrip portion of gallery
                  	show_filmstrip_nav: true, 		//BOOLEAN - flag indicating whether to display navigation buttons
                  	enable_slideshow: true,			//BOOLEAN - flag indicating whether to display slideshow play/pause button
                  	autoplay: false,				//BOOLEAN - flag to start slideshow on gallery load
                  	show_captions: true, 			//BOOLEAN - flag to show or hide frame captions	
                  	filmstrip_size: 3, 				//INT - number of frames to show in filmstrip-only gallery
                  	filmstrip_style: 'scroll', 		//STRING - type of filmstrip to use (scroll = display one line of frames, scroll filmstrip if necessary, showall = display multiple rows of frames if necessary)
                  	filmstrip_position: 'bottom', 	//STRING - position of filmstrip within gallery (bottom, top, left, right)
                  	frame_width: 164, 				//INT - width of filmstrip frames (in pixels)
                  	frame_height: 80, 				//INT - width of filmstrip frames (in pixels)
                  	frame_opacity: 0.5, 			//FLOAT - transparency of non-active frames (1.0 = opaque, 0.0 = transparent)
                  	frame_scale: 'crop', 			//STRING - cropping option for filmstrip images (same as above)
                  	frame_gap: 5, 					//INT - spacing between frames within filmstrip (in pixels)
                  	show_infobar: true,				//BOOLEAN - flag to show or hide infobar
                  	infobar_opacity: 1				//FLOAT - transparency for info bar
                  	"""),format.raw("""}"""),format.raw/*72.21*/(""");
                  	
             		
           
          	         $("li.left_nav_link").mouseout(function () """),format.raw("""{"""),format.raw/*76.65*/("""
          	           
          	            if((window.location.pathname == '/training_calendar')) """),format.raw("""{"""),format.raw/*78.80*/("""						// Contact Us page
          				$('a#about_left_nav_training_calendar').css('background-color','#DFECF8');
          				$('a#about_left_nav_training_calendar').css("""),format.raw("""{"""),format.raw/*80.60*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*80.100*/(""");
          	            $('a#about_left_nav_training_calendar').find("span").append(sm_black_arrow_right);
          				"""),format.raw("""}"""),format.raw/*82.16*/("""
          	         """),format.raw("""}"""),format.raw/*83.22*/(""");
          
                  	/*
                  	 * The menu item is highlighted for each selected page (SIHFW, Market Research, Business Intelligence, Big Data and Web Development)
                  	 * For example: Onclick of the 'Web Development' page the 'Web Development' in the menu will be highlighted by giving background color.
                  	 */
                  	if(window.location.pathname == '/') """),format.raw("""{"""),format.raw/*89.57*/("""
                  		// Home page
                  		$('.hp').css('background-color','#36597D');
                  		$('.hp').css('color','#fff');
                  		page = 'sihfw';
                  	"""),format.raw("""}"""),format.raw/*94.21*/(""" else if((window.location.pathname == '/about') ) """),format.raw("""{"""),format.raw/*94.72*/("""							// Market Research page
                  		$('.about').css('background-color','#36597D');
                  		$('.about').css('color','#fff');
                  		page = 'about';
                  	"""),format.raw("""}"""),format.raw/*98.21*/(""" else if((window.location.pathname == '/infrastructure')) """),format.raw("""{"""),format.raw/*98.80*/("""							// Business Intelligence page
                  		$('.infrastructure').css('background-color','#36597D');
                  		$('.infrastructure').css('color','#fff');
                  		page = 'infrastructure';
                  	"""),format.raw("""}"""),format.raw/*102.21*/(""" else if((window.location.pathname == '/hr')) """),format.raw("""{"""),format.raw/*102.68*/("""						// Big Data page
                  		$('.hr').css('background-color','#36597D');
                  		$('.hr').css('color','#fff');
                  		page = 'hr';
                  	"""),format.raw("""}"""),format.raw/*106.21*/(""" else if((window.location.pathname == '/activities')) """),format.raw("""{"""),format.raw/*106.76*/("""							// Web Development page
                  		$('.activities').css('background-color','#36597D');
                  		$('.activities').css('color','#fff');
                  		page = 'activities';
                  	"""),format.raw("""}"""),format.raw/*110.21*/(""" else if((window.location.pathname == '/presentations')) """),format.raw("""{"""),format.raw/*110.79*/("""							// About page
						$('.presentations').css('background-color','#36597D');
                  		$('.presentations').css('color','#fff');
                  		page = 'presentations';
 	                """),format.raw("""}"""),format.raw/*114.20*/(""" else if((window.location.pathname == '/contact')) """),format.raw("""{"""),format.raw/*114.72*/("""						// Contact Us page
                  		$('.contact_us').css('background-color','#36597D');
                  		$('.contact_us').css('color','#fff');
                  		page = 'publications';
                  	"""),format.raw("""}"""),format.raw/*118.21*/(""" else if((window.location.pathname == '/photos')) """),format.raw("""{"""),format.raw/*118.72*/("""						// Contact Us page
                  		$('.photos').css('background-color','#36597D');
                  		$('.photos').css('color','#fff');
                  		page = 'photos';
                  	"""),format.raw("""}"""),format.raw/*122.21*/("""
                  	 else if((window.location.pathname == '/training_calendar')) """),format.raw("""{"""),format.raw/*123.82*/("""						// Contact Us page
                  		$('a#about_left_nav_training_calendar').css('background-color','#DFECF8');
                  		$('a#about_left_nav_training_calendar').css("""),format.raw("""{"""),format.raw/*125.66*/(""" 'border-bottom': '1px dashed #588bbe' """),format.raw("""}"""),format.raw/*125.106*/(""");
                  	    $('a#about_left_nav_training_calendar').find("span").append(sm_black_arrow_right);
                  	"""),format.raw("""}"""),format.raw/*127.21*/(""" 	 	
              	
                  """),format.raw("""}"""),format.raw/*129.20*/(""");
               </script>
            </head>
            <body>
               """),format.raw/*133.46*/("""
               <div id="container">
                  <div id="top_img">
                     <img src=""""),_display_(Seq[Any](/*136.33*/routes/*136.39*/.Assets.at("images/home/home.png"))),format.raw/*136.73*/("""" />
                  </div>
                  """),format.raw/*138.42*/("""
                  <div id="top_bar">
                     <ul>
                        <li class="sihfw"><a class="hp" id="top_bar_SIHFW" href="/">Home</a></li>
                        <li ><a class="about" id="top_bar_market_research" href="/about">About</a></li>
                        <li ><a class="infrastructure" id="top_bar_business_intelligence" href="/infrastructure">Infrastructure</a></li>
                        <li ><a class="hr" id="human_resource" href="/hr">Human Resource</a></li>
                        <li "><a class="activities" id="top_bar_web_development" href="/activities">Activities</a></li>
                        <li><a class="presentations" id="top_bar_about" href="/presentations">Presentations</a></li>
                        <li><a class="contact_us" id="top_bar_contact" href="/contact">Contact Us</a></li>
                        <li><a class="photos" id="top_bar_contact" href="/photos">Photo Gallery</a></li>
                     </ul>
                  </div>
                
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
                        <div class="photo_banner" id="about_right_nav_page_banner">
                           <ul id="myGallery">
                              <li><img data-frame=""""),_display_(Seq[Any](/*166.53*/routes/*166.59*/.Assets.at("images/photos/q1.jpg"))),format.raw/*166.93*/("""" src=""""),_display_(Seq[Any](/*166.101*/routes/*166.107*/.Assets.at("images/photos/q1.jpg"))),format.raw/*166.141*/("""" title="Independence day" data-description="Celebrating the Independence day (Aug - 15th) at SIHFW, Bangalore." />
 							  <li><img data-frame=""""),_display_(Seq[Any](/*167.33*/routes/*167.39*/.Assets.at("images/photos/q2.jpg"))),format.raw/*167.73*/("""" src=""""),_display_(Seq[Any](/*167.81*/routes/*167.87*/.Assets.at("images/photos/q2.jpg"))),format.raw/*167.121*/("""" title="Independence day" data-description="Celebrating the Independence day (Aug - 15th) at SIHFW, Bangalore." />
 							  <li><img data-frame=""""),_display_(Seq[Any](/*168.33*/routes/*168.39*/.Assets.at("images/photos/q4.jpg"))),format.raw/*168.73*/("""" src=""""),_display_(Seq[Any](/*168.81*/routes/*168.87*/.Assets.at("images/photos/q4.jpg"))),format.raw/*168.121*/("""" title="Independence day" data-description="Celebrating the Independence day (Aug - 15th) at SIHFW, Bangalore." />
 							  <li><img data-frame=""""),_display_(Seq[Any](/*169.33*/routes/*169.39*/.Assets.at("images/photos/q6.jpg"))),format.raw/*169.73*/("""" src=""""),_display_(Seq[Any](/*169.81*/routes/*169.87*/.Assets.at("images/photos/q6.jpg"))),format.raw/*169.121*/("""" title="Independence day" data-description="Celebrating the Independence day (Aug - 15th) at SIHFW, Bangalore." />
 							  <li><img data-frame=""""),_display_(Seq[Any](/*170.33*/routes/*170.39*/.Assets.at("images/photos/q7.jpg"))),format.raw/*170.73*/("""" src=""""),_display_(Seq[Any](/*170.81*/routes/*170.87*/.Assets.at("images/photos/q7.jpg"))),format.raw/*170.121*/("""" title="Independence day" data-description="Celebrating the Independence day (Aug - 15th) at SIHFW, Bangalore." />
                              <li><img data-frame=""""),_display_(Seq[Any](/*171.53*/routes/*171.59*/.Assets.at("images/photos/GAL2.jpg"))),format.raw/*171.95*/("""" src=""""),_display_(Seq[Any](/*171.103*/routes/*171.109*/.Assets.at("images/photos/GAL2.jpg"))),format.raw/*171.145*/("""" title="Commissioner H & F W services Govt. of Karnataka Visited" data-description="Commissioner H & F W services Govt. of Karnataka Visited" />
							  <li><img data-frame=""""),_display_(Seq[Any](/*172.32*/routes/*172.38*/.Assets.at("images/photos/11.jpg"))),format.raw/*172.72*/("""" src=""""),_display_(Seq[Any](/*172.80*/routes/*172.86*/.Assets.at("images/photos/11.jpg"))),format.raw/*172.120*/("""" title="IYCF TOT Inaugural Ceremony" data-description="IYCF TOT Inaugural Ceremony" />
							  <li><img data-frame=""""),_display_(Seq[Any](/*173.32*/routes/*173.38*/.Assets.at("images/photos/22.jpg"))),format.raw/*173.72*/("""" src=""""),_display_(Seq[Any](/*173.80*/routes/*173.86*/.Assets.at("images/photos/22.jpg"))),format.raw/*173.120*/("""" title="IYCF TOT Inaugural Ceremony" data-description="IYCF TOT Inaugural Ceremony" />
							  <li><img data-frame=""""),_display_(Seq[Any](/*174.32*/routes/*174.38*/.Assets.at("images/photos/44.jpg"))),format.raw/*174.72*/("""" src=""""),_display_(Seq[Any](/*174.80*/routes/*174.86*/.Assets.at("images/photos/44.jpg"))),format.raw/*174.120*/("""" title="IYCF TOT Inaugural Ceremony" data-description="IYCF TOT Inaugural Ceremony" />
                              <li><img data-frame=""""),_display_(Seq[Any](/*175.53*/routes/*175.59*/.Assets.at("images/photos/GAL4.jpg"))),format.raw/*175.95*/("""" src=""""),_display_(Seq[Any](/*175.103*/routes/*175.109*/.Assets.at("images/photos/GAL4.jpg"))),format.raw/*175.145*/("""" title="CPHN Course Valedictory Function" data-description="CPHN Course Valedictory Function" />
                              <li><img data-frame=""""),_display_(Seq[Any](/*176.53*/routes/*176.59*/.Assets.at("images/photos/GAL6.jpg"))),format.raw/*176.95*/("""" src=""""),_display_(Seq[Any](/*176.103*/routes/*176.109*/.Assets.at("images/photos/GAL6.jpg"))),format.raw/*176.145*/("""" title="Certificate and prize distrubution to CPHN Ist Batch Students" data-description="Certificate and prize distrubution to CPHN Ist Batch Students" />
                            </ul>
                        </div>
                        </br>
                        </br>
                        </br>
                        </br>
                        </br>
                        </br>
                        </br>
                        </br>
                     </div>
                  </div>
                  """),format.raw/*189.49*/("""
                  <div id="bottom_bar">
                     <span id="bottom_bar_copyright" class="copyright">Copyright &copy; 2012 SIHFW, Inc. All rights reserved.</span>
                     <span id="bottom_bar_links" class="bottom_bar_links">
                       
                     </span>
                  </div>
               </div>
               """),format.raw/*197.50*/("""
            </body>
         </html>
"""))}
    }
    
    def render(title:String) = apply(title)
    
    def f:((String) => play.api.templates.Html) = (title) => apply(title)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Sep 27 16:33:03 IST 2014
                    SOURCE: /home/trilok/Documents/play-2.0.8/SIHFW/app/views/photos.scala.html
                    HASH: 13b5e751ba020fc1ac7f32b5c74cc83a0992460a
                    MATRIX: 756->1|848->16|1479->732|1617->834|1644->839|2586->1745|2601->1751|2673->1800|2773->1864|2788->1870|2860->1919|3036->2059|3051->2065|3132->2123|3241->2196|3256->2202|3339->2262|3428->2315|3443->2321|3496->2352|3542->2398|3639->2459|3654->2465|3712->2500|4020->2761|4115->2809|7619->6266|7781->6381|7931->6484|8151->6657|8239->6697|8410->6821|8479->6843|8948->7265|9199->7469|9297->7520|9551->7727|9657->7786|9945->8026|10040->8073|10278->8263|10381->8318|10651->8540|10757->8598|11011->8804|11111->8856|11377->9074|11476->9125|11728->9329|11858->9411|12091->9596|12180->9636|12357->9765|12445->9805|12556->9917|12699->10023|12715->10029|12772->10063|12849->10134|15243->12491|15259->12497|15316->12531|15362->12539|15379->12545|15437->12579|15622->12727|15638->12733|15695->12767|15740->12775|15756->12781|15814->12815|15999->12963|16015->12969|16072->13003|16117->13011|16133->13017|16191->13051|16376->13199|16392->13205|16449->13239|16494->13247|16510->13253|16568->13287|16753->13435|16769->13441|16826->13475|16871->13483|16887->13489|16945->13523|17150->13691|17166->13697|17225->13733|17271->13741|17288->13747|17348->13783|17562->13960|17578->13966|17635->14000|17680->14008|17696->14014|17754->14048|17910->14167|17926->14173|17983->14207|18028->14215|18044->14221|18102->14255|18258->14374|18274->14380|18331->14414|18376->14422|18392->14428|18450->14462|18627->14602|18643->14608|18702->14644|18748->14652|18765->14658|18825->14694|19012->14844|19028->14850|19087->14886|19133->14894|19150->14900|19210->14936|19771->15498|20164->15896
                    LINES: 27->1|30->1|48->19|50->21|50->21|58->29|58->29|58->29|59->30|59->30|59->30|61->32|61->32|61->32|62->33|62->33|62->33|63->34|63->34|63->34|64->35|65->36|65->36|65->36|69->40|70->41|101->72|105->76|107->78|109->80|109->80|111->82|112->83|118->89|123->94|123->94|127->98|127->98|131->102|131->102|135->106|135->106|139->110|139->110|143->114|143->114|147->118|147->118|151->122|152->123|154->125|154->125|156->127|158->129|162->133|165->136|165->136|165->136|167->138|195->166|195->166|195->166|195->166|195->166|195->166|196->167|196->167|196->167|196->167|196->167|196->167|197->168|197->168|197->168|197->168|197->168|197->168|198->169|198->169|198->169|198->169|198->169|198->169|199->170|199->170|199->170|199->170|199->170|199->170|200->171|200->171|200->171|200->171|200->171|200->171|201->172|201->172|201->172|201->172|201->172|201->172|202->173|202->173|202->173|202->173|202->173|202->173|203->174|203->174|203->174|203->174|203->174|203->174|204->175|204->175|204->175|204->175|204->175|204->175|205->176|205->176|205->176|205->176|205->176|205->176|218->189|226->197
                    -- GENERATED --
                */
            