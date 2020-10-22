<%--
  Created by IntelliJ IDEA.
  User: ikutarian
  Date: 2020/10/20
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="UTF-8">
    <%-- 静态包含 base 标签 --%>
    <%@ include file="../../common/head.jsp" %>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="icon" href="static/images/Favicon.png">
    <link rel="stylesheet" type="text/css" href="static/css/animate.css">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootstrapmb.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="static/css/fontello.css">
    <link rel="stylesheet" type="text/css" href="static/css/fontello-codes.css">
    <link rel="stylesheet" type="text/css" href="static/css/thumbs-embedded.css">
    <link rel="stylesheet" type="text/css" href="static/css/style.css">
    <link rel="stylesheet" type="text/css" href="static/css/responsive.css">
    <link rel="stylesheet" type="text/css" href="static/css/color.css">
    <title>视频分类</title>



</head>
<body>
<div class="wrapper">



    <header>
        <div class="top_bar">
            <div class="container">
                <div class="top_header_content">
                    <div class="menu_logo">
                        <a href="index.jsp" title="" class="logo">
                            <img src="static/images/logo.png" alt="">
                        </a>
                    </div><!--menu_logo end-->
                    <div class="search_form">
                        <form>
                            <input type="text" name="search" placeholder="Search Videos" id="search">
                            <button type="submit" id="searchbtn">
                                <i class="icon-search"></i>
                            </button>
                        </form>
                    </div><!--search_form end-->
                    <c:if test="${ not empty sessionScope.user }">
                        <ul class="controls-lv">
                            <li class="user-log">
                                <div class="user-ac-img">
                                    <img src="static/images/resources/user-img.png" alt="">
                                </div>
                                <div class="account-menu">
                                    <h4>${sessionScope.user.nickName}
                                        <c:if test="${ sessionScope.user.status == 1}">
                                            <span class="usr-status">VIP</span>
                                        </c:if>
                                    </h4>
                                    <div class="sd_menu">
                                        <ul class="mm_menu">
                                            <li>
												<span>
													<i class="icon-user"></i>
												</span>
                                                <a href="#" title="">我的账户</a>
                                            </li>
                                            <li>
												<span>
													<i class="icon-paid_sub"></i>
												</span>
                                                <a href="#" title="">我的钱包</a>
                                            </li>
                                            <li>
												<span>
													<i class="icon-playlist"></i>
												</span>
                                                <a href="#" title="">视频管理</a>
                                            </li>
                                            <li>
												<span>
													<i class="icon-logout"></i>
												</span>
                                                <a href="#" title="">登出</a>
                                            </li>
                                        </ul>
                                    </div><!--sd_menu end-->
                                </div>
                            </li>
                            <li>
                                <a href="UploadServlet?action=show" title="" class="btn-default">上传</a>
                            </li>
                        </ul>
                        <!--controls-lv end-->
                    </c:if>
                    <div class="clearfix"></div>
                </div><!--top_header_content end-->
            </div>
        </div><!--header_content end-->
        <div class="btm_bar">
            <div class="container">
                <div class="btm_bar_content">
                    <nav>
                        <ul>
                            <li><a href="#" title="">首页</a>
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
                            <li><a href="Browse_Categories.html" title="">搜索视频</a></li>
                            <li><a href="Browse_Channels.html" title="">会员专区</a></li>
                        </ul>
                    </nav><!--navigation end-->
                    <c:if test="${ not empty sessionScope.user }">
                        <ul class="shr_links">
                            <li>
                                <h3>Go to : </h3>
                            </li>
                            <li>
                                <button data-toggle="tooltip" data-placement="top" title="收藏视频" href="">
                                    <i class="icon-like"></i>
                                </button>
                            </li>
                            <li>
                                <button data-toggle="tooltip" data-placement="top" title="历史记录">
                                    <i class="icon-history"></i>
                                </button>
                            </li>
                        </ul><!--shr_links end-->
                    </c:if>
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

    <section class="browse_categories_sec">
        <div class="container">
            <div class="browse_categories">
                <div class="row">
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br1.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BattleState</a></h3>
                                <span>230 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br2.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BlackPink</a></h3>
                                <span>191 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br3.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Vevo</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>12 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br4.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Official PSY</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>48 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br5.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">People</a></h3>
                                <span>954 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br6.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">SmTownSmTown</a></h3>
                                <span>130 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br7.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BattleState</a></h3>
                                <span>230 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br8.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BlackPink</a></h3>
                                <span>191 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br9.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Vevo</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>12 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br10.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Official PSY</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>48 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br11.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">People</a></h3>
                                <span>954 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br12.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">SmTownSmTown</a></h3>
                                <span>130 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br13.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BattleState</a></h3>
                                <span>230 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br14.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BlackPink</a></h3>
                                <span>191 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br15.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Vevo</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>12 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br16.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Official PSY</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>48 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br17.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">People</a></h3>
                                <span>954 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br18.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">SmTownSmTown</a></h3>
                                <span>130 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br1.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BattleState</a></h3>
                                <span>230 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br2.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BlackPink</a></h3>
                                <span>191 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br3.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Vevo</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>12 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br4.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Official PSY</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>48 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br5.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">People</a></h3>
                                <span>954 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br6.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">SmTownSmTown</a></h3>
                                <span>130 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br7.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BattleState</a></h3>
                                <span>230 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br8.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BlackPink</a></h3>
                                <span>191 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br9.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Vevo</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>12 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br10.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Official PSY</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>48 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br11.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">People</a></h3>
                                <span>954 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br12.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">SmTownSmTown</a></h3>
                                <span>130 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br13.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BattleState</a></h3>
                                <span>230 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br14.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">BlackPink</a></h3>
                                <span>191 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br15.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Vevo</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>12 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br16.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">Official PSY</a> <span class="verify_ic"><i class="icon-tick"></i></span></h3>
                                <span>48 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br17.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">People</a></h3>
                                <span>954 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                    <div class="col-lg-2 col-md-4 col-sm-4 col-6 full_wdth">
                        <div class="br-channel">
                            <div class="br-channel-img">
                                <a href="#" title="">
                                    <img src="static/images/resources/br18.jpg" alt="">
                                </a>
                            </div>
                            <div class="br-info">
                                <h3><a href="#" title="">SmTownSmTown</a></h3>
                                <span>130 Videos</span>
                            </div>
                        </div><!--br-channel end-->
                    </div>
                </div>
            </div><!--</div> end-->
            <div class="browse_cat_lists">
                <h3>Browse Categories</h3>
                <ul>
                    <li><a href="#" title="">Abaft</a></li>
                    <li><a href="#" title="">Brick</a></li>
                    <li><a href="#" title="">Purpose</a></li>
                    <li><a href="#" title="">Shallow</a></li>
                    <li><a href="#" title="">Spray</a></li>
                    <li><a href="#" title="">Seashore</a></li>
                    <li><a href="#" title="">Orange</a></li>
                    <li><a href="#" title="">Dynamic</a></li>
                    <li><a href="#" title="">Planes</a></li>
                    <li><a href="#" title="">Comfortable</a></li>
                </ul>
                <ul>
                    <li><a href="#" title="">Leg</a></li>
                    <li><a href="#" title="">Fall</a></li>
                    <li><a href="#" title="">Pin</a></li>
                    <li><a href="#" title="">Trouble</a></li>
                    <li><a href="#" title="">Cemetery</a></li>
                    <li><a href="#" title="">Sort</a></li>
                    <li><a href="#" title="">Respect</a></li>
                    <li><a href="#" title="">Rice</a></li>
                    <li><a href="#" title="">Disagreeable</a></li>
                    <li><a href="#" title="">Minister</a></li>
                </ul>
                <ul>
                    <li><a href="#" title="">Quiet</a></li>
                    <li><a href="#" title="">Rescue</a></li>
                    <li><a href="#" title="">Agonizing</a></li>
                    <li><a href="#" title="">Stitch</a></li>
                    <li><a href="#" title="">Scissors</a></li>
                    <li><a href="#" title="">Spiffy</a></li>
                    <li><a href="#" title="">Tin</a></li>
                    <li><a href="#" title="">Rambunctious</a></li>
                    <li><a href="#" title="">Sordid</a></li>
                    <li><a href="#" title="">Wise</a></li>
                </ul>
                <ul>
                    <li><a href="#" title="">Boy</a></li>
                    <li><a href="#" title="">Fold</a></li>
                    <li><a href="#" title="">Moan</a></li>
                    <li><a href="#" title="">Overjoyed</a></li>
                    <li><a href="#" title="">Obsequious</a></li>
                    <li><a href="#" title="">Heat</a></li>
                    <li><a href="#" title="">Incompetent</a></li>
                    <li><a href="#" title="">Grin</a></li>
                    <li><a href="#" title="">Fat</a></li>
                    <li><a href="#" title="">Gate</a></li>
                </ul>
                <ul>
                    <li><a href="#" title="">Bells</a></li>
                    <li><a href="#" title="">Symptomatic</a></li>
                    <li><a href="#" title="">Rub</a></li>
                    <li><a href="#" title="">Holiday</a></li>
                    <li><a href="#" title="">Doubtful</a></li>
                    <li><a href="#" title="">Bored</a></li>
                    <li><a href="#" title="">Hot</a></li>
                    <li><a href="#" title="">Tasteful</a></li>
                    <li><a href="#" title="">Plot</a></li>
                    <li><a href="#" title="">Grotesque</a></li>
                </ul>
                <ul>
                    <li><a href="#" title="">Water</a></li>
                    <li><a href="#" title="">Vessel</a></li>
                    <li><a href="#" title="">Well-to-do</a></li>
                    <li><a href="#" title="">Unequal</a></li>
                    <li><a href="#" title="">Rhetorical</a></li>
                    <li><a href="#" title="">Limit</a></li>
                </ul>
                <div class="clearfix"></div>
            </div><!--browse_cat_lists end-->
        </div>
    </section><!--browse-sec end-->

    <section class="more_items_sec text-center">
        <div class="container">
            <a href="#" title="">
                <svg width="19" height="24" viewBox="0 0 19 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M18.1618 24.0001H0.838235C0.374412 24.0001 0 23.6261 0 23.1628V5.86052C0 5.39727 0.374412 5.02332 0.838235 5.02332H18.1618C18.6256 5.02332 19 5.39727 19 5.86052V23.1628C19 23.6261 18.6256 24.0001 18.1618 24.0001ZM1.67647 22.3256H17.3235V6.69773H1.67647V22.3256Z" fill="#9494A0"></path>
                    <g opacity="0.25">
                        <path opacity="0.25" d="M13.1324 4.18605C12.6685 4.18605 12.2941 3.81209 12.2941 3.34884V1.67442H6.70589V3.34884C6.70589 3.81209 6.33148 4.18605 5.86765 4.18605C5.40383 4.18605 5.02942 3.81209 5.02942 3.34884V0.83721C5.02942 0.373954 5.40383 0 5.86765 0H13.1324C13.5962 0 13.9706 0.373954 13.9706 0.83721V3.34884C13.9706 3.81209 13.5962 4.18605 13.1324 4.18605Z" fill="#9494A0"></path>
                    </g>
                    <path d="M9.50001 19.3479C9.28487 19.3479 9.06972 19.267 8.90766 19.1024L5.92634 16.1275C5.59942 15.801 5.59942 15.2707 5.92634 14.9442C6.25325 14.6177 6.78413 14.6177 7.11104 14.9442L9.50001 17.3275L11.8862 14.9442C12.2131 14.6177 12.744 14.6177 13.0709 14.9442C13.3978 15.2707 13.3978 15.801 13.0709 16.1275L10.0924 19.1024C9.93031 19.267 9.71516 19.3479 9.50001 19.3479Z" fill="#9494A0"></path>
                    <path d="M9.49999 18.4186C9.03617 18.4186 8.66176 18.0447 8.66176 17.5814V10.3256C8.66176 9.86236 9.03617 9.4884 9.49999 9.4884C9.96382 9.4884 10.3382 9.86236 10.3382 10.3256V17.5814C10.3382 18.0447 9.96382 18.4186 9.49999 18.4186Z" fill="#9494A0"></path>
                    <g opacity="0.5">
                        <path opacity="0.5" d="M15.6471 6.69764C15.1832 6.69764 14.8088 6.32369 14.8088 5.86043V4.18601H4.19118V5.86043C4.19118 6.32369 3.81677 6.69764 3.35294 6.69764C2.88912 6.69764 2.51471 6.32369 2.51471 5.86043V3.34881C2.51471 2.88555 2.88912 2.5116 3.35294 2.5116H15.6471C16.1109 2.5116 16.4853 2.88555 16.4853 3.34881V5.86043C16.4853 6.32369 16.1109 6.69764 15.6471 6.69764Z" fill="#9494A0"></path>
                    </g>
                </svg>
            </a>
        </div>
    </section><!--more_items_sec end-->


</div><!--wrapper end-->

<script src="js/jquery.min.js"></script>
<script src="js/popper.js"></script>
<script src="http://cdn.bootstrapmb.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="js/script.js"></script>
</body>
</html>
