<%--
  Created by IntelliJ IDEA.
  User: ikutarian
  Date: 2020/10/18
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Oren Video Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="icon" href="<%=basePath %>static/images/Favicon.png">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/animate.css">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootstrapmb.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/fontello.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/fontello-codes.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/thumbs-embedded.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/style.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/responsive.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/color.css">
</head>
<body>
<div class="wrapper">

        <header>
            <div class="top_bar">
                <div class="container">
                    <div class="top_header_content">
                        <div class="menu_logo">
                            <a href="#" title="" class="menu">
                                <i class="icon-menu"></i>
                            </a>
                            <a href="<%=basePath %>index.jsp" title="" class="logo">
                                <img src="<%=basePath %>static/images/logo.png" alt="">
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
                                    <img src="<%=basePath %>static/images/resources/user-img.png" alt="">
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
                                <a href="<%=basePath%>pages/Video/uploadvideo.jsp" title="" class="btn-default">Upload</a>
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
                                            <li><a href="<%=basePath %>index.jsp" title="">Homepage</a></li>
                                            <li><a href="single_video_page.html" title="">Single Video Page</a></li>
                                            <li><a href="Single_Video_Simplified_Page.html" title="">Single Video Simplified Page</a></li>
                                            <li><a href="single_video_fullwidth_page.html" title="">Singel Video Full Width Page</a></li>
                                            <li><a href="single_video_playlist.html" title="">Single Video Playlist Page</a></li>
                                            <li><a href="<%=basePath%>pages/Video/uploadvideo.jsp" title="">Upload Video Page</a></li>
                                            <li><a href="Upload_Edit.html" title="">Upload Video Edit Page</a></li>
                                            <li><a href="Browse_Channels.html" title="">Browse channels page</a></li>
                                            <li><a href="Searched_Videos_Page.html" title="">Searched videos page</a></li>
                                        </ul>
                                        <ul>
                                            <li><a href="#" title="">Single channel <span class="icon-arrow_below"></span></a>
                                                <ul>
                                                    <li><a href="Single_Channel_Home.html" title="">Single Channel Home page</a></li>
                                                    <li><a href="Single_Channel_Videos.html" title="">Single Channel videos page</a></li>
                                                    <li><a href="Single_Channel_Playlist.html" title="">single channel playlist page</a></li>
                                                    <li><a href="Single_Channel_Channels.html" title="">single channel channels page</a></li>
                                                    <li><a href="Single_Channel_About.html" title="">single channel about page</a></li>
                                                    <li><a href="Single_Channel_Products.html" title="">single channel products page</a></li>
                                                </ul>
                                            </li>
                                            <li><a href="<%=basePath%>pages/Video/historypage.jsp" title="">History page</a></li>
                                            <li><a href="Browse_Categories.html" title="">Browse Categories Page</a></li>
                                            <li><a href="Updates_From_Subs.html" title="">Updates from subscription page</a></li>
                                            <li><a href="<%=basePath%>pages/User/login.jsp" title="">login page</a></li>
                                            <li><a href="<%=basePath%>pages/User/signup.jsp" title="">signup page</a></li>
                                            <li><a href="<%=basePath%>pages/User/usersettings.jsp" title="">User account page</a></li>
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
                                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
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
                        <a href="<%=basePath%>" title="">Home</a>
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
                        <a href="<%=basePath%>pages/Video/historypage.jsp" title="">History</a>
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
							<img src="<%=basePath %>static/images/resources/th1.png" alt="">
						</span>
                        <a href="#" title="">Dr Disrespect</a>
                        <small>3</small>
                    </li>
                    <li>
						<span class="usr_name">
							<img src="<%=basePath %>static/images/resources/th2.png" alt="">
						</span>
                        <a href="#" title="">ASMR</a>
                        <small>6</small>
                    </li>
                    <li>
						<span class="usr_name">
							<img src="<%=basePath %>static/images/resources/th3.png" alt="">
						</span>
                        <a href="#" title="">Rivvrs</a>
                        <small>2</small>
                    </li>
                    <li>
						<span class="usr_name">
							<img src="<%=basePath %>static/images/resources/th4.png" alt="">
						</span>
                        <a href="#" title="">The Verge</a>
                        <small>11</small>
                    </li>
                    <li>
						<span class="usr_name">
							<img src="<%=basePath %>static/images/resources/th5.png" alt="">
						</span>
                        <a href="#" title="">Seeker</a>
                        <small>3</small>
                    </li>
                    <li>
						<span class="usr_name">
							<img src="<%=basePath %>static/images/resources/sn.png" alt="">
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
                        <a href="<%=basePath%>pages/User/usersettings.jsp" title="">Settings</a>
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

        <section class="upload-videooz">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="video-file">
                            <i class="icon-graphics_05"></i>
                            <h3>Select video files to upload </h3>
                            <span>or drag & drop video files</span>
                            <form>
                                <label for="file-upload" class="custom-file-upload">
                                    Upload Video
                                </label>
                                <input id="file-upload" type="file"/>
                            </form>
                        </div><!--video-file end-->
                    </div>
                    <div class="col-lg-6">
                        <div class="youtube-dwn">
                            <i class="icon-graphics_03"></i>
                            <h3>Import videos from YouTube </h3>
                            <span>Copy / Paste your video link here</span>
                            <form>
                                <input type="text" name="import_video" placeholder="Paste link here">
                                <button type="submit">Import Video</button>
                            </form>
                        </div><!--youtube-dwn end-->
                    </div>
                </div>
            </div>
        </section><!--upload-videooz end-->

        <section class="suggestions">
            <div class="container">
                <div class="sgst_content">
                    <h3>Help & Suggestions</h3>
                    <p>By submitting your videos to ProjectFitnessTV, you acknowledge that you agree to ProjectFitnessTV’s<a href="#" title=""> Terms of Service</a>and<a href="#" title="">Community Guidelines</a>. Please be sure not to violate others’ copyright or privacy rights.<a href="#"> Learn more</a></p>
                </div>
            </div>
        </section><!--Suggestions end-->

        <section class="abt-vidz">
            <ul>
                <li>
                    <a href="#">Upload Instructions </a>
                </li>
                <li>
                    <a href="#">Troubleshooting </a>
                </li>
                <li>
                    <a href="#">Mobile Upload </a>
                </li>
            </ul>
        </section><!--abt-vidz-->

        <footer>
            <div class="container">
                <div class="top-footer">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="ft-logo">
                                <img src="<%=basePath %>static/images/ft-logo.png" alt="">
                            </div><!--ft-logo end-->
                        </div>
                        <div class="col-lg-2 col-md-4 col-sm-6 col-12">
                            <div class="widget">
                                <h3 class="widget-title">pages</h3>
                                <ul class="pages-link">
                                    <li><a href="#" title="">About</a></li>
                                    <li><a href="#" title="">Community Rules</a></li>
                                    <li><a href="#" title="">Privacy</a></li>
                                    <li><a href="#" title="">Terms</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-2 col-md-4 col-sm-6 col-12">
                            <div class="widget">
                                <h3 class="widget-title">Links</h3>
                                <ul class="pages-link">
                                    <li><a href="#" title="">Blog</a></li>
                                    <li><a href="#" title="">Contact</a></li>
                                    <li><a href="#" title="">Donate</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-2 col-md-4 col-sm-6 col-12">
                            <div class="widget">
                                <h3 class="widget-title">support</h3>
                                <ul class="pages-link">
                                    <li><a href="#" title="">Support</a></li>
                                    <li><a href="#" title="">FAQ</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-12 col-sm-6 col-12">
                            <div class="widget widget-information">
                                <h3 class="widget-title">Information</h3>
                                <p>Oren is a video sharing platform created for the discovery & promotion of content creators. It's home to breaking news in social media, & urban cultural entertainment.</p>
                            </div><!--widget-information end-->
                        </div>
                    </div>
                </div><!--top-footer end-->
                <div class="bottom-strip">
                    <p>© azyrusthemes    <i class="icon-like"></i> Made in India</p>
                    <ul class="social-links">
                        <li><a href="#" title=""><i class="icon-facebook-official"></i></a></li>
                        <li><a href="#" title=""><i class="icon-twitter"></i></a></li>
                        <li><a href="#" title=""><i class="icon-instagram"></i></a></li>
                    </ul>
                    <div class="clearfix"></div>
                </div><!--bottom-strip end-->
            </div>
        </footer><!--footer end-->


    </div><!--wrapper end-->





<script src="<%=basePath %>static/js/jquery.min.js"></script>
<script src="<%=basePath %>static/js/popper.js"></script>
<script src="http://cdn.bootstrapmb.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="<%=basePath %>static/js/script.js"></script>


</body>
</html>
