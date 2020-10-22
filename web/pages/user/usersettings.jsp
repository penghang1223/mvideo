<%--
  Created by IntelliJ IDEA.
  User: ikutarian
  Date: 2020/10/19
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Oren Video Template</title>
    <%-- 静态包含 base 标签 --%>
    <%@ include file="../../common/head.jsp" %>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="icon" href="images/Favicon.png">
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
                            <button type="button" id="searchbtn">
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
                                        <li><a href="pages/video/uploadvideo.jsp" title="">Upload Video Page</a></li>
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
                                        <li><a href="pages/video/historypage.jsp" title="">History page</a></li>
                                        <li><a href="Browse_Categories.html" title="">Browse Categories Page</a></li>
                                        <li><a href="Updates_From_Subs.html" title="">Updates from subscription page</a>
                                        </li>
                                        <li><a href="pages/user/login.jsp" title="">login page</a></li>
                                        <li><a href="pages/user/signup.jsp" title="">signup page</a></li>
                                        <li><a href="pages/user/usersettings.jsp" title="">User account page</a></li>
                                    </ul>
                                </div>
                                <div class="clearfix"></div>
                            </li>
                            <li><a href="pages/video/searchpage.jsp" title="">搜索视频</a></li>
                            <li><a href="pages/video/vipchannel.jsp" title="">会员专区</a></li>
                        </ul>
                    </nav><!--navigation end-->
                    <c:if test="${ not empty sessionScope.user }">
                        <ul class="shr_links">
                            <li>
                                <h3>Go to : </h3>
                            </li>
                            <li>
                                <button data-toggle="tooltip" data-placement="top" title="收藏视频" onclick="window.location.href='pages/video/collectionpage.jsp'">
                                    <i class="icon-like"></i>
                                </button>
                            </li>
                            <li>
                                <button data-toggle="tooltip" data-placement="top" title="历史记录" onclick="window.location.href='pages/video/historypage.jsp'">
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


    <section class="user-account">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="sidebar">
                        <div class="widget video_info pr sp">
								<span class="vc_hd">
									<img src="static/images//resources/sn.png" alt="">
								</span>
                            <h4>${ sessionScope.user.nickName }
                                <c:if test="${ sessionScope.user.status == 1}">
                                <i class="icon-purchased"></i>
                                </c:if></h4>
                            <span>Last Login: 42 minutes ago</span>
                        </div><!--video_info pr-->
                        <div class="widget account">
                            <h2 class="hd-uc"> <i class="icon-user"></i> 我的账户</h2>
                               <a href="#">个人资料修改</a>
                        </div><!--account end-->
                        <div class="widget notifications">
                            <h2 class="hd-uc"><i class="icon-paid_sub"></i>我的钱包</h2>
                            <a href="#" title="">账号充值</a>
                        </div><!--notifications end-->
                        <div class="widget donation">
                            <h2 class="hd-uc"><i class="icon-playlist"></i>视频管理 </h2>
                            <ul>
                                <li><a href="#">已上传视频</a></li>
                                <li><a href="#">待审核视频</a></li>
                                <li><a href="#">下架视频</a></li>
                            </ul>
                        </div><!--donation end-->
                    </div><!--sidebar end-->
                </div>
                <div class="col-lg-9">
                    <div class="video-details">
                        <div class="latest_vidz">
                            <div class="latest-vid-option">
                                <h2 class="hd-op"> Latest Videos</h2>
                                <a href="#" title="" class="op-1">Video Details</a>
                                <a href="#" title="" class="op-2"> Options</a>
                                <div class="clearfix"></div>
                            </div><!--latest-vid-option end-->
                            <div class="vidz_list">
                                <div class="tb-pr">
                                    <div class="row">
                                        <div class="col-xl-8 col-lg-9 col-md-9 col-sm-12">
                                            <div class="tab-history acct_page">
                                                <div class="videoo">
                                                    <div class="vid_thumbainl ms br">
                                                        <a href="single_video_page.html" title="">
                                                            <img src="static/images//resources/vide1.png" alt="">
                                                            <span class="vid-time">30:32</span>
                                                            <span class="watch_later">
																	<i class="icon-watch_later_fill"></i>
																</span>
                                                        </a>
                                                    </div><!--vid_thumbnail end-->
                                                    <div class="video_info ms br">
                                                        <h3><a href="single_video_page.html" title="">Kingdom Come: Deliverance Funny Moments and Fails Compilation</a></h3>
                                                        <h4><a href="Single_Channel_Home.html" title="">newfox media</a> <span class="verify_ic"><i class="icon-tick"></i></span></h4>
                                                        <span>686K views . 1 week ago</span>
                                                        <ul>
                                                            <li><span class="br-1">Inactive</span></li>
                                                            <li><span class="br-2">Successful</span></li>
                                                        </ul>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div><!--videoo end-->
                                            </div>
                                        </div>
                                        <div class="col-xl-4 col-lg-3 col-md-3 col-sm-12">
                                            <div class="icon-list">
                                                <ul>
                                                    <li><a href="#" title=""><i class="icon-play"></i></a></li>
                                                    <li><a href="#" title=""><i class="icon-pencil"></i></a></li>
                                                    <li><a href="#" title=""><i class="icon-cancel"></i></a></li>
                                                </ul>
                                            </div><!--icon-list end-->
                                        </div>
                                    </div>
                                </div><!--tb-pr end-->
                                <div class="tb-pr">
                                    <div class="row">
                                        <div class="col-xl-8 col-lg-9 col-md-9 col-sm-12">
                                            <div class="tab-history acct_page">
                                                <div class="videoo">
                                                    <div class="vid_thumbainl ms br">
                                                        <a href="single_video_page.html" title="">
                                                            <img src="static/images//resources/vide2.png" alt="">
                                                            <span class="vid-time">30:32</span>
                                                            <span class="watch_later">
																	<i class="icon-watch_later_fill"></i>
																</span>
                                                        </a>
                                                    </div><!--vid_thumbnail end-->
                                                    <div class="video_info ms br">
                                                        <h3><a href="single_video_page.html" title="">DR DISRESPECT - Before They Were Famous - Twitch Streamer</a></h3>
                                                        <h4><a href="Single_Channel_Home.html" title="">Eros Now</a></h4>
                                                        <span>283K views . 3 months ago</span>
                                                        <ul>
                                                            <li><span class="br-1">Inactive</span></li>
                                                            <li><span class="br-2">Successful</span></li>
                                                        </ul>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div><!--videoo end-->
                                            </div>
                                        </div>
                                        <div class="col-xl-4 col-lg-3 col-md-3 col-sm-12">
                                            <div class="icon-list">
                                                <ul>
                                                    <li><a href="#" title=""><i class="icon-play"></i></a></li>
                                                    <li><a href="#" title=""><i class="icon-pencil"></i></a></li>
                                                    <li><a href="#" title=""><i class="icon-cancel"></i></a></li>
                                                </ul>
                                            </div><!--icon-list end-->
                                        </div>
                                    </div>
                                </div><!--tb-pr end-->
                                <div class="tb-pr">
                                    <div class="row">
                                        <div class="col-xl-8 col-lg-9 col-md-9 col-sm-12">
                                            <div class="tab-history acct_page">
                                                <div class="videoo">
                                                    <div class="vid_thumbainl ms br">
                                                        <a href="single_video_page.html" title="">
                                                            <img src="static/images//resources/vide3.png" alt="">
                                                            <span class="vid-time">30:32</span>
                                                            <span class="watch_later">
																	<i class="icon-watch_later_fill"></i>
																</span>
                                                        </a>
                                                    </div><!--vid_thumbnail end-->
                                                    <div class="video_info ms br">
                                                        <h3><a href="single_video_page.html" title="">Top Perectly Timed Twitch Moments 2017 #7</a></h3>
                                                        <h4><a href="Single_Channel_Home.html" title="">Animal Planet</a> <span class="verify_ic"><i class="icon-tick"></i></span></h4>
                                                        <span>2.6M views . 2 months ago</span>
                                                        <ul>
                                                            <li><span class="br-3">Active</span></li>
                                                            <li><span class="br-2">Successful</span></li>
                                                        </ul>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div><!--videoo end-->
                                            </div>
                                        </div>
                                        <div class="col-xl-4 col-lg-3 col-md-3 col-sm-12">
                                            <div class="icon-list">
                                                <ul>
                                                    <li><a href="#" title=""><i class="icon-play"></i></a></li>
                                                    <li><a href="#" title=""><i class="icon-pencil"></i></a></li>
                                                    <li><a href="#" title=""><i class="icon-cancel"></i></a></li>
                                                </ul>
                                            </div><!--icon-list end-->
                                        </div>
                                    </div>
                                </div><!--tb-pr end-->
                            </div><!--vidz_list end-->
                        </div><!--latest_vidz end-->
                        <div class="blocked-users">
                            <h2 class="hd-op">  Blocked Users </h2>
                            <form>
                                <input type="text" placeholder=" Separate usernames by comma">
                                <button type="submit"> Update</button>
                            </form>
                            <ul class="optz_list">
                                <li><a href="#" title="">User</a></li>
                                <li><a href="#" title="">Options</a></li>
                            </ul><!--optz_list end-->
                            <div class="clearfix"></div>
                        </div><!--Blocked Users end-->
                        <div class="blocked-pr">
                            <div class="blocked-vcp">
                                <div class="vcp_inf">
										<span class="vc_hd">
											<img src="static/images//resources/sn.png" alt="">
										</span>
                                    <div class="vc_info st">
                                        <h4><a href="#" title="">ScereBro</a></h4>
                                        <span>Blocked on Oct 22, 2017</span>
                                    </div>
                                </div><!--vcp_inf end-->
                                <a href="#" title="" class="play_ms">
                                    <i class="icon-blocked"></i>
                                </a>
                            </div><!--blocked-vcp-->
                            <div class="blocked-vcp">
                                <div class="vcp_inf">
										<span class="vc_hd">
											<img src="static/images//resources/th1.png" alt="">
										</span>
                                    <div class="vc_info st">
                                        <h4><a href="#" title="">Doge</a></h4>
                                        <span>Blocked 20 hours ago</span>
                                    </div>
                                </div><!--vcp_inf end-->
                                <a href="#" title="" class="play_ms">
                                    <i class="icon-blocked"></i>
                                </a>
                            </div><!--blocked-vcp-->
                            <div class="blocked-vcp">
                                <div class="vcp_inf">
										<span class="vc_hd">
											<img src="static/images//resources/th3.png" alt="">
										</span>
                                    <div class="vc_info st">
                                        <h4><a href="#" title="">Menji</a></h4>
                                        <span>Blocked 1 week ago</span>
                                    </div>
                                </div><!--vcp_inf end-->
                                <a href="#" title="" class="play_ms">
                                    <i class="icon-blocked"></i>
                                </a>
                            </div><!--blocked-vcp-->
                        </div><!--blocked-pr end-->
                        <div class="change-pswd">
                            <h2 class="hd-op">Change password</h2>
                            <form>
                                <div class="ch-pswd">
                                    <input type="password" name="old_password" placeholder="Old Password">
                                </div><!--ch-pswd end-->
                                <div class="ch-pswd">
                                    <input type="password" name="new_password" placeholder=" New Password">
                                </div><!--ch-pswd end-->
                                <div class="ch-pswd">
                                    <input type="password" name="confirm_password" placeholder="Confirm New Password">
                                </div><!--ch-pswd end-->
                                <div class="ch-pswd">
                                    <button type="submit"> Update</button>
                                </div><!--ch-pswd end-->
                            </form>
                        </div><!--change-pswd end-->
                        <div class="blocked-pr mange_sub">
                            <div class="manage-sub">
                                <h2 class="hd-op"> Manage Subscriptions </h2>
                                <ul class="optz_list">
                                    <li><a href="#" title="">User</a></li>
                                    <li><a href="#" title="">Options</a></li>
                                </ul><!--optz_list end-->
                                <div class="clearfix"></div>
                            </div><!--Manage-Sub end-->
                            <div class="blckd_list">
                                <div class="blocked-vcp">
                                    <div class="vcp_inf">
											<span class="vc_hd">
												<img src="static/images//resources/th4.png" alt="">
											</span>
                                        <div class="vc_info st">
                                            <h4><a href="#" title="">ScereBro</a></h4>
                                            <span>Subscribed 3 months ago</span>
                                        </div>
                                    </div><!--vcp_inf end-->
                                    <span class="active-mb pr"> Active</span>
                                    <a href="#" title="" class="play_ms">
                                        Action
                                        <i class="icon-arrow_below"></i>
                                    </a>
                                    <div class="clearfix"></div>
                                </div><!--blocked-vcp-->
                                <div class="blocked-vcp">
                                    <div class="vcp_inf">
											<span class="vc_hd">
												<img src="static/images//resources/th5.png" alt="">
											</span>
                                        <div class="vc_info st">
                                            <h4><a href="#" title="">Doge</a></h4>
                                            <span>Subscribed 16 months ago</span>
                                        </div>
                                    </div><!--vcp_inf end-->
                                    <a href="#" title="" class="play_ms">
                                        Action
                                        <i class="icon-arrow_below"></i>
                                    </a>
                                    <span class="active-mb sr"> Inactive</span>
                                    <div class="clearfix"></div>
                                </div><!--blocked-vcp-->
                                <div class="blocked-vcp">
                                    <div class="vcp_inf">
											<span class="vc_hd">
												<img src="static/images//resources/th3.png" alt="">
											</span>
                                        <div class="vc_info st">
                                            <h4><a href="#" title="">Menji</a></h4>
                                            <span>Subscribed 2 years ago</span>
                                        </div>
                                    </div><!--vcp_inf end-->
                                    <a href="#" title="" class="play_ms">
                                        Action
                                        <i class="icon-arrow_below"></i>
                                    </a>
                                    <span class="active-mb mr">  Paused</span>
                                    <div class="clearfix"></div>
                                </div><!--blocked-vcp-->
                            </div>
                        </div><!--blocked-pr end-->
                        <div class="account-details">
                            <div class="account_details_content">
                                <h2 class="hd-op">  Account Details </h2>
                                <h4 class="slct-hd">Country</h4>
                                <div class="slct_optz">
                                    <select>
                                        <option>United States</option>
                                        <option>United States</option>
                                        <option>United States</option>
                                        <option>United States</option>
                                    </select>
                                    <a href="#" title="" class="arw_vz">
                                        <i class="icon-arrow_below"></i>
                                    </a>
                                </div>
                                <h4 class="slct-hd"> Gender</h4>
                                <ul class="gend">
                                    <li>
                                        <div class="chekbox-lg">
                                            <label>
                                                <input type="radio" name="gender" value="male">
                                                <b class="checkmark"></b>
                                                <span>Male</span>
                                            </label>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="chekbox-lg">
                                            <label>
                                                <input type="radio" name="gender" value="female">
                                                <b class="checkmark"> </b>
                                                <span>Female</span>
                                            </label>
                                        </div>
                                    </li>
                                </ul>
                                <h4 class="slct-hd">Account Details </h4>
                                <div class="slct_optz">
                                    <select>
                                        <option> ABGC</option>
                                        <option> ABGC</option>
                                        <option> ABGC</option>
                                        <option> ABGC</option>
                                    </select>
                                    <a href="#" title="" class="arw_vz">
                                        <svg width="24" height="26" viewBox="0 0 24 26" fill="none" xmlns="http://www.w3.org/2000/svg">
                                            <path fill-rule="evenodd" clip-rule="evenodd" d="M19.9394 7.51447L22.0607 9.63579L12 19.6964L1.93936 9.63579L4.06068 7.51447L12 15.4538L19.9394 7.51447Z" fill="#9494A0"></path>
                                        </svg>
                                    </a>
                                </div>
                                <h4 class="slct-hd">Date of Birth </h4>
                                <div class="dob flatpickr">
                                    <input type="number" name="date" class="flatpickr-input" placeholder="Select Date..." data-input>
                                    <a href="#" title="" class="arw_vz">
                                        <i class="icon-arrow_below"></i>
                                    </a>
                                </div>
                                <div class="ch-pswd">
                                    <button type="submit"> Update</button>
                                </div><!--ch-pswd end-->
                            </div><!--account_details_content end-->
                            <div class="clearfix"></div>
                        </div><!--Account Details end-->
                    </div><!--video-details end-->
                </div>
            </div>
        </div>
    </section><!--user-account end-->

</div><!--wrapper end-->



<script src="static/js/jquery.min.js"></script>
<script src="static/js/popper.js"></script>
<script src="http://cdn.bootstrapmb.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="static/js/flatpickr.js"></script>
<script src="static/js/script.js"></script>



</body>
</html>
