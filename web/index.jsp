﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Oren Video Template</title>
    <base href="<%=basePath%>">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <link rel="icon" href="static/images/Favicon.png">
    <link rel="stylesheet" type="text/css" href="static/css/animate.css">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootstrapmb.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/flatpickr.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/fontello.css">
    <link rel="stylesheet" type="text/css" href="static/css/fontello-codes.css">
    <link rel="stylesheet" type="text/css" href="static/css/thumbs-embedded.css">
    <link rel="stylesheet" type="text/css" href="static/css/style.css">
    <link rel="stylesheet" type="text/css" href="static/css/responsive.css">
    <link rel="stylesheet" type="text/css" href="static/css/color.css">

</head>


<body>


<div class="wrapper hp_1">

    <header>
        <div class="top_bar">
            <div class="container">
                <div class="top_header_content">
                    <div class="menu_logo">
                        <a href="#" title="" class="menu">
                            <i class="icon-menu"></i>
                        </a>
                        <a href="index.jsp" title="" class="logo">
                            <img src="static/images/logo.png" alt="">
                        </a>
                    </div><!--menu_logo end-->
                    <div class="search_form">
                        <form>
                            <input type="text" name="search" placeholder="Search Videos">
                            <button type="submit">
                                <i class="icon-search"></i>
                            </button>
                        </form>
                    </div><!--search_form end-->
                    <ul class="controls-lv">
                        <li>
                            <a href="#" title=""><i class="icon-message"></i></a>
                        </li>
                        <li>
                            <a href="#" title=""><i class="icon-notification"></i></a>
                        </li>
                        <li class="user-log">
                            <div class="user-ac-img">
                                <img src="static/images/resources/user-img.png" alt="">
                            </div>
                            <div class="account-menu">
                                <h4>AZYRUSMAX <span class="usr-status">PRO</span></h4>
                                <div class="sd_menu">
                                    <ul class="mm_menu">
                                        <li>
												<span>
													<i class="icon-user"></i>
												</span>
                                            <a href="#" title="">My Channel</a>
                                        </li>
                                        <li>
												<span>
													<i class="icon-paid_sub"></i>
												</span>
                                            <a href="#" title="">Paid subscriptions</a>
                                        </li>
                                        <li>
												<span>
													<i class="icon-settings"></i>
												</span>
                                            <a href="#" title="">Settings</a>
                                        </li>
                                        <li>
												<span>
													<i class="icon-logout"></i>
												</span>
                                            <a href="#" title="">Sign out</a>
                                        </li>
                                    </ul>
                                </div><!--sd_menu end-->
                                <div class="sd_menu scnd">
                                    <ul class="mm_menu">
                                        <li>
												<span>
													<i class="icon-light"></i>
												</span>
                                            <a href="#" title="">Dark Theme</a>
                                            <label class="switch">
                                                <input type="checkbox">
                                                <b class="slider round"></b>
                                            </label>
                                        </li>
                                        <li>
												<span>
													<i class="icon-language"></i>
												</span>
                                            <a href="#" title="">Language</a>
                                        </li>
                                        <li>
												<span>
													<i class="icon-feedback"></i>
												</span>
                                            <a href="#" title="">Send feedback</a>
                                        </li>
                                        <li>
												<span>
													<i class="icon-location"></i>
												</span>
                                            <a href="#" title="">India</a>
                                            <i class="icon-arrow_below"></i>
                                        </li>
                                    </ul>
                                </div><!--sd_menu end-->
                                <div class="restricted-mode">
                                    <h4>Restricted Mode</h4>
                                    <label class="switch">
                                        <input type="checkbox" checked>
                                        <span class="slider round"></span>
                                    </label>
                                    <div class="clearfix"></div>
                                </div><!--restricted-more end-->
                            </div>
                        </li>
                        <li>
                            <a href="Upload_Video.html" title="" class="btn-default">Upload</a>
                        </li>
                    </ul><!--controls-lv end-->
                    <div class="clearfix"></div>
                </div><!--top_header_content end-->
            </div>
        </div><!--header_content end-->
        <div class="btm_bar">
            <div class="container">
                <div class="btm_bar_content">
                    <nav>
                        <ul>
                            <li><a href="#" title="">Pages</a>
                                <div class="mega-menu">
                                    <ul>
                                        <li><a href="index.jsp" title="">Homepage</a></li>
                                        <li><a href="single_video_page.html" title="">Single Video Page</a></li>
                                        <li><a href="Single_Video_Simplified_Page.html" title="">Single Video Simplified
                                            Page</a></li>
                                        <li><a href="single_video_fullwidth_page.html" title="">Singel Video Full Width
                                            Page</a></li>
                                        <li><a href="single_video_playlist.html" title="">Single Video Playlist Page</a>
                                        </li>
                                        <li><a href="Upload_Video.html" title="">Upload Video Page</a></li>
                                        <li><a href="Upload_Edit.html" title="">Upload Video Edit Page</a></li>
                                        <li><a href="Browse_Channels.html" title="">Browse channels page</a></li>
                                        <li><a href="Searched_Videos_Page.html" title="">Searched videos page</a></li>
                                    </ul>
                                    <ul>
                                        <li><a href="#" title="">Single channel <span
                                                class="icon-arrow_below"></span></a>
                                            <ul>
                                                <li><a href="Single_Channel_Home.html" title="">Single Channel Home
                                                    page</a></li>
                                                <li><a href="Single_Channel_Videos.html" title="">Single Channel videos
                                                    page</a></li>
                                                <li><a href="Single_Channel_Playlist.html" title="">single channel
                                                    playlist page</a></li>
                                                <li><a href="Single_Channel_Channels.html" title="">single channel
                                                    channels page</a></li>
                                                <li><a href="Single_Channel_About.html" title="">single channel about
                                                    page</a></li>
                                                <li><a href="Single_Channel_Products.html" title="">single channel
                                                    products page</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="History_Page.html" title="">History page</a></li>
                                        <li><a href="Browse_Categories.html" title="">Browse Categories Page</a></li>
                                        <li><a href="Updates_From_Subs.html" title="">Updates from subscription page</a>
                                        </li>
                                        <li><a href="login.html" title="">login page</a></li>
                                        <li><a href="signup.html" title="">signup page</a></li>
                                        <li><a href="User_Account_Page.html" title="">User account page</a></li>
                                    </ul>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li><a href="Browse_Categories.html" title="">Categories</a></li>
                            <li><a href="Browse_Channels.html" title="">Channels</a></li>
                            <li><a href="#" title="">Trending</a></li>
                            <li><a href="Single_Channel_Home.html" title="">LIVE</a></li>
                            <li><a href="#" title="">Movies</a></li>
                        </ul>
                    </nav><!--navigation end-->
                    <ul class="shr_links">
                        <li>
                            <h3>Go to : </h3>
                        </li>
                        <li>
                            <button data-toggle="tooltip" data-placement="top" title="Like">
                                <i class="icon-like"></i>
                            </button>
                        </li>
                        <li>
                            <button data-toggle="tooltip" data-placement="top" title="Watch later">
                                <i class="icon-watch_later"></i>
                            </button>
                        </li>
                        <li>
                            <button data-toggle="tooltip" data-placement="top" title="Playlist">
                                <i class="icon-playlist"></i>
                            </button>
                        </li>
                        <li>
                            <button data-toggle="tooltip" data-placement="top" title="Purchased">
                                <i class="icon-purchased"></i>
                            </button>
                        </li>
                        <li>
                            <button data-toggle="tooltip" data-placement="top" title="History">
                                <i class="icon-history"></i>
                            </button>
                        </li>
                    </ul><!--shr_links end-->
                    <ul class="vid_thums">
                        <li>
                            <a class="active" href="#" title=""><i class="icon-grid"></i></a>
                        </li>
                        <li>
                            <a href="#" title="">
                                <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"
                                     x="0px" y="0px"
                                     viewBox="0 0 108 108" xml:space="preserve">
										<rect width="63" height="45"/>
                                    <rect x="81" width="27" height="45"/>
                                    <rect x="45" y="63" width="63" height="45"/>
                                    <rect y="63" width="27" height="45"/>
									</svg>
                            </a>
                        </li>
                    </ul><!--vid_status end-->
                    <div class="clearfix"></div>
                </div><!--btm_bar_content end-->
            </div>
        </div><!--btm_bar end-->
    </header><!--header end-->

    <div class="side_menu">
        <div class="form_dvv">
            <a href="#" title="" class="login_form_show">Sign in</a>
        </div>
        <div class="sd_menu">
            <ul class="mm_menu">
                <li>
						<span>
							<i class="icon-home"></i>
						</span>
                    <a href="#" title="">Home</a>
                </li>
                <li>
						<span>
							<i class="icon-fire"></i>
						</span>
                    <a href="#" title="">Trending</a>
                </li>
                <li>
						<span>
							<i class="icon-subscriptions"></i>
						</span>
                    <a href="#" title="">Subscriptions</a>
                </li>
            </ul>
        </div><!--sd_menu end-->
        <div class="sd_menu">
            <h3>Library</h3>
            <ul class="mm_menu">
                <li>
						<span>
							<i class="icon-history"></i>
						</span>
                    <a href="#" title="">History</a>
                </li>
                <li>
						<span>
							<i class="icon-watch_later"></i>
						</span>
                    <a href="#" title="">Watch Later</a>
                </li>
                <li>
						<span>
							<i class="icon-purchased"></i>
						</span>
                    <a href="#" title="">Purchases</a>
                </li>
                <li>
						<span>
							<i class="icon-like"></i>
						</span>
                    <a href="#" title="">Liked Videos</a>
                </li>
                <li>
						<span>
							<i class="icon-play_list"></i>
						</span>
                    <a href="#" title="">Playlist</a>
                </li>
            </ul>
        </div><!--sd_menu end-->
        <div class="sd_menu subs_lst">
            <h3>Subscriptions</h3>
            <ul class="mm_menu">
                <li>
						<span class="usr_name">
							<img src="static/images/resources/th1.png" alt="">
						</span>
                    <a href="#" title="">Dr Disrespect</a>
                    <small>3</small>
                </li>
                <li>
						<span class="usr_name">
							<img src="static/images/resources/th2.png" alt="">
						</span>
                    <a href="#" title="">ASMR</a>
                    <small>6</small>
                </li>
                <li>
						<span class="usr_name">
							<img src="static/images/resources/th3.png" alt="">
						</span>
                    <a href="#" title="">Rivvrs</a>
                    <small>2</small>
                </li>
                <li>
						<span class="usr_name">
							<img src="static/images/resources/th4.png" alt="">
						</span>
                    <a href="#" title="">The Verge</a>
                    <small>11</small>
                </li>
                <li>
						<span class="usr_name">
							<img src="static/images/resources/th5.png" alt="">
						</span>
                    <a href="#" title="">Seeker</a>
                    <small>3</small>
                </li>
                <li>
						<span class="usr_name">
							<img src="static/images/resources/sn.png" alt="">
						</span>
                    <a href="#" title="">Music</a>
                    <small>20</small>
                </li>
            </ul>
            <a href="#" title="" class="more-ch"><i class="icon-arrow_below"></i> Show 14 more</a>
        </div><!--sd_menu end-->
        <div class="sd_menu">
            <ul class="mm_menu">
                <li>
						<span>
							<i class="icon-settings"></i>
						</span>
                    <a href="#" title="">Settings</a>
                </li>
                <li>
						<span>
							<i class="icon-flag"></i>
						</span>
                    <a href="#" title="">Report history</a>
                </li>
                <li>
						<span>
							<i class="icon-logout"></i>
						</span>
                    <a href="#" title="">Sign out</a>
                </li>
            </ul>
        </div><!--sd_menu end-->
        <div class="sd_menu m_linkz">
            <ul class="mm_menu">
                <li><a href="#">About</a></li>
                <li><a href="#">Community Rules </a></li>
                <li><a href="#">Privacy</a></li>
                <li><a href="#">Terms</a></li>
                <li><a href="#">Blogs</a></li>
                <li><a href="#">Contracts </a></li>
                <li><a href="#">Donate</a></li>
                <li><a href="#">FAQ</a></li>
            </ul>
            <span>azyrusthemes</span>
        </div><!--sd_menu end-->
        <div class="sd_menu bb-0">
            <ul class="social_links">
                <li>
                    <a href="#" title="">
                        <i class="icon-facebook-official"></i>
                    </a>
                </li>
                <li>
                    <a href="#" title="">
                        <i class="icon-twitter"></i>
                    </a>
                </li>
                <li>
                    <a href="#" title="">
                        <i class="icon-instagram"></i>
                    </a>
                </li>
            </ul><!--social_links end-->
        </div><!--sd_menu end-->
        <div class="dd_menu"></div>
    </div><!--side_menu end-->

    <section class="banner-section">
        <div class="container">
            <div class="banner-text">
                <h2>Watch share and upload with friends</h2>
                <a href="#" title="">Create my account</a>
            </div><!--banner-text end-->
            <h3 class="headline">Video of the Day by <a href="#" title="">newfox media</a></h3>
        </div>
    </section><!--banner-section end-->

    <section class="services-sec">
        <div class="container">
            <div class="services-row">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6 col-12">
                        <div class="service-col">
                            <img src="static/images/sv1.png" alt="">
                            <h3>Get paid by your fans</h3>
                            <p>Accept money from your fans through tips.</p>
                        </div><!--service-col end-->
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-12">
                        <div class="service-col">
                            <img src="static/images/sv2.png" alt="">
                            <h3>Grow your audience</h3>
                            <p>Join a growing community of young millennialaas & get new fans. </p>
                        </div><!--service-col end-->
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-12">
                        <div class="service-col">
                            <img src="static/images/sv3.png" alt="">
                            <h3>Simple transfer from YouTube</h3>
                            <p>Upload your videos from YouTube with an easy link copy/paste.</p>
                        </div><!--service-col end-->
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-12">
                        <div class="service-col">
                            <img src="static/images/sv4.png" alt="">
                            <h3>Make money with Amazon </h3>
                            <p>Extra income through Amazon Affiliates on your channel.</p>
                        </div><!--service-col end-->
                    </div>
                </div>
            </div><!--services-row end-->
        </div>
    </section><!--services-sec end-->

    <section class="vds-main">
        <div class="vidz-row">
            <div class="container">
                <div class="vidz_sec">
                    <h3>Featured Videos</h3>
                    <div class="vidz_list">
                        <div class="row">
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide1.png" alt="">
                                            <span class="vid-time">10:21</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Kingdom Come: Deliverance Funny
                                            Moments and Fails</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">newfox media</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>686K views .<small class="posted_dt">1 week ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide2.png" alt="">
                                            <span class="vid-time">13:49</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">DR DISRESPECT - Before They Were
                                            Famous - Twitch Streamer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Eros Now</a></h4>
                                        <span>283K views .<small class="posted_dt">3 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide3.png" alt="">
                                            <span class="vid-time">2:54</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Top Perectly Timed Twitch Moments
                                            2017 #7</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Animal Planet</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>2.6M views .<small class="posted_dt">2 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide4.png" alt="">
                                            <span class="vid-time">5:25</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Top 5 Amazing Bridge Block ever in
                                            PUBG</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Maketzi</a></h4>
                                        <span>612K views .<small class="posted_dt">5 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide5.png" alt="">
                                            <span class="vid-time">4:01</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Trailer Park Boys Season 12 -
                                            Official Trailer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">ScereBro</a></h4>
                                        <span>45K views .<small class="posted_dt">3 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide6.png" alt="">
                                            <span class="vid-time">6:20</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">A day in the life of a Google
                                            software engineer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">MathChief</a></h4>
                                        <span>86K views .<small class="posted_dt">6 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide7.png" alt="">
                                            <span class="vid-time">8:16</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Avengers: Infinity War - Gym
                                            Workout motivation 2019</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">RealLifeLore</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>144K views .<small class="posted_dt">6 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide8.png" alt="">
                                            <span class="vid-time">29:32</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">How the Universe Works - The Milky
                                            Way Galaxy - Space</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Loskes</a></h4>
                                        <span>408K views .<small class="posted_dt">19 hours ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                        </div>
                    </div><!--vidz_list end-->
                </div><!--vidz_videos end-->
            </div>
        </div><!--vidz-row end-->
        <div class="vidz-row">
            <div class="container">
                <div class="vidz_sec">
                    <h3>Updates from Subscriptions</h3>
                    <a href="#" title="" class="view-btn">View all</a>
                    <div class="vidz_list">
                        <div class="row">
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vcp_inf">
                                        <div class="vc_hd">
                                            <img src="static/images/resources/th1.png" alt="">
                                        </div>
                                        <div class="vc_info">
                                            <h4><a href="Single_Channel_Home.html" title="">TrashPanda</a></h4>
                                        </div>
                                        <span class="vc-count">3</span>
                                    </div>
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide9.png" alt="">
                                            <span class="vid-time">4:01</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Trailer Park Boys Season 12 -
                                            Official Trailer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">ScereBro</a></h4>
                                        <span>45K views .<small class="posted_dt">3 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vcp_inf">
                                        <div class="vc_hd">
                                            <img src="static/images/resources/th2.png" alt="">
                                        </div>
                                        <div class="vc_info">
                                            <h4><a href="Single_Channel_Home.html" title="">The 80’s Guy</a></h4>
                                        </div>
                                        <span class="vc-count">6</span>
                                    </div>
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide10.png" alt="">
                                            <span class="vid-time">6:20</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">A day in the life of a Google
                                            software engineer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">MathChief</a></h4>
                                        <span>86K views .<small class="posted_dt">6 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vcp_inf">
                                        <div class="vc_hd">
                                            <img src="static/images/resources/th3.png" alt="">
                                        </div>
                                        <div class="vc_info">
                                            <h4><a href="Single_Channel_Home.html" title="">Seeker</a></h4>
                                        </div>
                                        <span class="vc-count">2</span>
                                    </div>
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide11.png" alt="">
                                            <span class="vid-time">8:16</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Avengers: Infinity War - Gym
                                            Workout </a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">RealLifeLore</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>144K views .<small class="posted_dt">6 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vcp_inf">
                                        <div class="vc_hd">
                                            <img src="static/images/resources/th4.png" alt="">
                                        </div>
                                        <div class="vc_info">
                                            <h4><a href="Single_Channel_Home.html" title="">Rivvrs</a></h4>
                                        </div>
                                        <span class="vc-count">7</span>
                                    </div>
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide12.png" alt="">
                                            <span class="vid-time">29:32</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">How the Universe Works - The Milky
                                            Way Galaxy - Space</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Loskes</a></h4>
                                        <span>408K views .<small class="posted_dt">19 hours ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                        </div>
                    </div><!--vidz_list end-->
                </div><!--vidz_videos end-->
            </div>
        </div><!--vidz-row end-->
        <div class="vidz-row">
            <div class="container">
                <div class="vidz_sec">
                    <h3>New Videos</h3>
                    <div class="vidz_list">
                        <div class="row">
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide13.png" alt="">
                                            <span class="vid-time">10:21</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Kingdom Come: Deliverance Funny
                                            Moments and Fails</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">newfox media</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>686K views .<small class="posted_dt">1 week ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide14.png" alt="">
                                            <span class="vid-time">13:49</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">DR DISRESPECT - Before They Were
                                            Famous - Twitch Streamer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Eros Now</a></h4>
                                        <span>283K views .<small class="posted_dt">3 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide15.png" alt="">
                                            <span class="vid-time">2:54</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Top Perectly Timed Twitch Moments
                                            2017 #7</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Animal Planet</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>2.6M views .<small class="posted_dt">2 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide16.png" alt="">
                                            <span class="vid-time">5:25</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Top 5 Amazing Bridge Block ever in
                                            PUBG</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Maketzi</a></h4>
                                        <span>612K views .<small class="posted_dt">5 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide17.png" alt="">
                                            <span class="vid-time">4:01</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Trailer Park Boys Season 12 -
                                            Official Trailer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">ScereBro</a></h4>
                                        <span>45K views .<small class="posted_dt">3 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide18.png" alt="">
                                            <span class="vid-time">6:20</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">A day in the life of a Google
                                            software engineer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">MathChief</a></h4>
                                        <span>86K views .<small class="posted_dt">6 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide19.png" alt="">
                                            <span class="vid-time">8:16</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Avengers: Infinity War - Gym
                                            Workout motivation 2019</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">RealLifeLore</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>144K views .<small class="posted_dt">6 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide20.png" alt="">
                                            <span class="vid-time">29:32</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">How the Universe Works - The Milky
                                            Way Galaxy - Space</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Loskes</a></h4>
                                        <span>408K views .<small class="posted_dt">19 hours ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                        </div>
                    </div><!--vidz_list end-->
                </div><!--vidz_videos end-->
            </div>
        </div><!--vidz-row end-->
        <div class="vidz-row">
            <div class="container">
                <div class="vidz_sec">
                    <h3>Popular Videos</h3>
                    <div class="vidz_list">
                        <div class="row">
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide1.png" alt="">
                                            <span class="vid-time">10:21</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Kingdom Come: Deliverance Funny
                                            Moments and Fails</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">newfox media</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>686K views .<small class="posted_dt">1 week ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide2.png" alt="">
                                            <span class="vid-time">13:49</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">DR DISRESPECT - Before They Were
                                            Famous - Twitch Streamer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Eros Now</a></h4>
                                        <span>283K views .<small class="posted_dt">3 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide3.png" alt="">
                                            <span class="vid-time">2:54</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Top Perectly Timed Twitch Moments
                                            2017 #7</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Animal Planet</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>2.6M views .<small class="posted_dt">2 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide4.png" alt="">
                                            <span class="vid-time">5:25</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Top 5 Amazing Bridge Block ever in
                                            PUBG</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Maketzi</a></h4>
                                        <span>612K views .<small class="posted_dt">5 months ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide5.png" alt="">
                                            <span class="vid-time">4:01</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Trailer Park Boys Season 12 -
                                            Official Trailer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">ScereBro</a></h4>
                                        <span>45K views .<small class="posted_dt">3 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide6.png" alt="">
                                            <span class="vid-time">6:20</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">A day in the life of a Google
                                            software engineer</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">MathChief</a></h4>
                                        <span>86K views .<small class="posted_dt">6 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide7.png" alt="">
                                            <span class="vid-time">8:16</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">Avengers: Infinity War - Gym
                                            Workout motivation 2019</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">RealLifeLore</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h4>
                                        <span>144K views .<small class="posted_dt">6 days ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-3 col-md-6 col-sm-6 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="single_video_page.html" title="">
                                            <img src="static/images/resources/vide8.png" alt="">
                                            <span class="vid-time">29:32</span>
                                            <span class="watch_later">
													<i class="icon-watch_later_fill"></i>
												</span>
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="single_video_page.html" title="">How the Universe Works - The Milky
                                            Way Galaxy - Space</a></h3>
                                        <h4><a href="Single_Channel_Home.html" title="">Loskes</a></h4>
                                        <span>408K views .<small class="posted_dt">19 hours ago</small></span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                        </div>
                    </div><!--vidz_list end-->
                </div><!--vidz_videos end-->
            </div>
        </div><!--vidz-row end-->
        <div class="vidz-row pop_channels">
            <div class="container">
                <div class="vidz_sec">
                    <h3>Popular Channels</h3>
                    <div class="vidz_list">
                        <div class="row">
                            <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="Single_Channel_Home.html" title="">
                                            <img src="static/images/resources/ch1.jpg" alt="">
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="Single_Channel_Home.html" title="">BattleState</a></h3>
                                        <span>230K Followers</span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="Single_Channel_Home.html" title="">
                                            <img src="static/images/resources/ch2.jpg" alt="">
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="Single_Channel_Home.html" title="">BlackPink</a></h3>
                                        <span>191K Followers</span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="Single_Channel_Home.html" title="">
                                            <img src="static/images/resources/ch3.jpg" alt="">
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="Single_Channel_Home.html" title="">Vevo</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h3>
                                        <span>12M Followers</span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="Single_Channel_Home.html" title="">
                                            <img src="static/images/resources/ch4.jpg" alt="">
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="Single_Channel_Home.html" title="">Official PSY</a> <span
                                                class="verify_ic"><i class="icon-tick"></i></span></h3>
                                        <span>48M Followers</span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="Single_Channel_Home.html" title="">
                                            <img src="static/images/resources/ch5.jpg" alt="">
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="Single_Channel_Home.html" title="">People</a></h3>
                                        <span>954K Followers</span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                            <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                                <div class="videoo">
                                    <div class="vid_thumbainl">
                                        <a href="Single_Channel_Home.html" title="">
                                            <img src="static/images/resources/ch6.jpg" alt="">
                                        </a>
                                    </div><!--vid_thumbnail end-->
                                    <div class="video_info">
                                        <h3><a href="Single_Channel_Home.html" title="">SmTown</a></h3>
                                        <span>1.3M Followers</span>
                                    </div>
                                </div><!--videoo end-->
                            </div>
                        </div>
                    </div><!--vidz_list end-->
                </div><!--vidz_videos end-->
            </div>
        </div><!--vidz-row end-->
    </section><!--vds-main end-->

    <section class="more_items_sec text-center">
        <div class="container">
            <a href="#" title="">
                <svg width="19" height="24" viewBox="0 0 19 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M18.1618 24.0001H0.838235C0.374412 24.0001 0 23.6261 0 23.1628V5.86052C0 5.39727 0.374412 5.02332 0.838235 5.02332H18.1618C18.6256 5.02332 19 5.39727 19 5.86052V23.1628C19 23.6261 18.6256 24.0001 18.1618 24.0001ZM1.67647 22.3256H17.3235V6.69773H1.67647V22.3256Z"
                          fill="#9494A0"/>
                    <g opacity="0.25">
                        <path opacity="0.25"
                              d="M13.1324 4.18605C12.6685 4.18605 12.2941 3.81209 12.2941 3.34884V1.67442H6.70589V3.34884C6.70589 3.81209 6.33148 4.18605 5.86765 4.18605C5.40383 4.18605 5.02942 3.81209 5.02942 3.34884V0.83721C5.02942 0.373954 5.40383 0 5.86765 0H13.1324C13.5962 0 13.9706 0.373954 13.9706 0.83721V3.34884C13.9706 3.81209 13.5962 4.18605 13.1324 4.18605Z"
                              fill="#9494A0"/>
                    </g>
                    <path d="M9.50001 19.3479C9.28487 19.3479 9.06972 19.267 8.90766 19.1024L5.92634 16.1275C5.59942 15.801 5.59942 15.2707 5.92634 14.9442C6.25325 14.6177 6.78413 14.6177 7.11104 14.9442L9.50001 17.3275L11.8862 14.9442C12.2131 14.6177 12.744 14.6177 13.0709 14.9442C13.3978 15.2707 13.3978 15.801 13.0709 16.1275L10.0924 19.1024C9.93031 19.267 9.71516 19.3479 9.50001 19.3479Z"
                          fill="#9494A0"/>
                    <path d="M9.49999 18.4186C9.03617 18.4186 8.66176 18.0447 8.66176 17.5814V10.3256C8.66176 9.86236 9.03617 9.4884 9.49999 9.4884C9.96382 9.4884 10.3382 9.86236 10.3382 10.3256V17.5814C10.3382 18.0447 9.96382 18.4186 9.49999 18.4186Z"
                          fill="#9494A0"/>
                    <g opacity="0.5">
                        <path opacity="0.5"
                              d="M15.6471 6.69764C15.1832 6.69764 14.8088 6.32369 14.8088 5.86043V4.18601H4.19118V5.86043C4.19118 6.32369 3.81677 6.69764 3.35294 6.69764C2.88912 6.69764 2.51471 6.32369 2.51471 5.86043V3.34881C2.51471 2.88555 2.88912 2.5116 3.35294 2.5116H15.6471C16.1109 2.5116 16.4853 2.88555 16.4853 3.34881V5.86043C16.4853 6.32369 16.1109 6.69764 15.6471 6.69764Z"
                              fill="#9494A0"/>
                    </g>
                </svg>
            </a>
        </div>
    </section><!--more_items_sec end-->

</div><!--wrapper end-->


<script src="static/js/jquery.min.js"></script>
<script src="static/js/popper.js"></script>
<script src="http://cdn.bootstrapmb.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="static/js/flatpickr.js"></script>
<script src="static/js/script.js"></script>


</body>

</html>