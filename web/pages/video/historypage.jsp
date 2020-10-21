<%--
  Created by IntelliJ IDEA.
  User: ikutarian
  Date: 2020/10/18
  Time: 23:24
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
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <link rel="icon" href="static/images/Favicon.png">
    <link rel="stylesheet" type="text/css" href="static/css/animate.css">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootstrapmb.com/bootstrap/4.0.0/css/bootstrap.min.css">
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
                                            <a href="pages/user/usersettings.jsp" title="">Settings</a>
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
                            <a href="pages/video/uploadvideo.jsp" title="" class="btn-default">Upload</a>
                        </li>
                    </ul><!--controls-lv end-->
                    <div class="clearfix"></div>
                </div><!--top_header_content end-->
            </div>
        </div><!--header_content end-->
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
                    <a href="" title="">Home</a>
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
                    <a href="pages/video/historypage.jsp" title="">History</a>
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

    <section class="ab-history">
        <div class="history-lst">
            <div class="container">
                <div class="history-hd-head">
                    <ul class="nav nav-tabs" id="myTab" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="watch_history_tab" data-toggle="tab" href="#watch_history"
                               role="tab" aria-controls="watch_history_tab" aria-selected="true">Watch history</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="search_history_tab" data-toggle="tab" href="#search_history"
                               role="tab" aria-controls="search_history_tab" aria-selected="false">Search history </a>
                        </li>
                    </ul><!--nav-tabs end-->
                    <a href="#" title="" class="clear-history">
                        <i class="icon-cancel"></i>
                        Clear all search history
                    </a>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade show active" id="watch_history" role="tabpanel"
                     aria-labelledby="watch_history_tab">
                    <div class="tabs_lzt">


                    </div><!--tabs_lz end-->
                </div>
                <div class="tab-pane fade" id="search_history" role="tabpanel" aria-labelledby="search_history_tab">
                    <div class="tabs_lzt">

                    </div><!--tabs_lz end-->
                </div>
            </div>
        </div>
    </section><!--ab-history end-->

    <section class="more_items_sec text-center">
        <div class="container">
            <a href="#" title="">
                <svg width="19" height="24" viewBox="0 0 19 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M18.1618 24.0001H0.838235C0.374412 24.0001 0 23.6261 0 23.1628V5.86052C0 5.39727 0.374412 5.02332 0.838235 5.02332H18.1618C18.6256 5.02332 19 5.39727 19 5.86052V23.1628C19 23.6261 18.6256 24.0001 18.1618 24.0001ZM1.67647 22.3256H17.3235V6.69773H1.67647V22.3256Z"
                          fill="#9494A0"></path>
                    <g opacity="0.25">
                        <path opacity="0.25"
                              d="M13.1324 4.18605C12.6685 4.18605 12.2941 3.81209 12.2941 3.34884V1.67442H6.70589V3.34884C6.70589 3.81209 6.33148 4.18605 5.86765 4.18605C5.40383 4.18605 5.02942 3.81209 5.02942 3.34884V0.83721C5.02942 0.373954 5.40383 0 5.86765 0H13.1324C13.5962 0 13.9706 0.373954 13.9706 0.83721V3.34884C13.9706 3.81209 13.5962 4.18605 13.1324 4.18605Z"
                              fill="#9494A0"></path>
                    </g>
                    <path d="M9.50001 19.3479C9.28487 19.3479 9.06972 19.267 8.90766 19.1024L5.92634 16.1275C5.59942 15.801 5.59942 15.2707 5.92634 14.9442C6.25325 14.6177 6.78413 14.6177 7.11104 14.9442L9.50001 17.3275L11.8862 14.9442C12.2131 14.6177 12.744 14.6177 13.0709 14.9442C13.3978 15.2707 13.3978 15.801 13.0709 16.1275L10.0924 19.1024C9.93031 19.267 9.71516 19.3479 9.50001 19.3479Z"
                          fill="#9494A0"></path>
                    <path d="M9.49999 18.4186C9.03617 18.4186 8.66176 18.0447 8.66176 17.5814V10.3256C8.66176 9.86236 9.03617 9.4884 9.49999 9.4884C9.96382 9.4884 10.3382 9.86236 10.3382 10.3256V17.5814C10.3382 18.0447 9.96382 18.4186 9.49999 18.4186Z"
                          fill="#9494A0"></path>
                    <g opacity="0.5">
                        <path opacity="0.5"
                              d="M15.6471 6.69764C15.1832 6.69764 14.8088 6.32369 14.8088 5.86043V4.18601H4.19118V5.86043C4.19118 6.32369 3.81677 6.69764 3.35294 6.69764C2.88912 6.69764 2.51471 6.32369 2.51471 5.86043V3.34881C2.51471 2.88555 2.88912 2.5116 3.35294 2.5116H15.6471C16.1109 2.5116 16.4853 2.88555 16.4853 3.34881V5.86043C16.4853 6.32369 16.1109 6.69764 15.6471 6.69764Z"
                              fill="#9494A0"></path>
                    </g>
                </svg>
            </a>
        </div>
    </section><!--more_items_sec end-->


</div><!--wrapper end-->

<script src="static/js/jquery.min.js"></script>
<script src="static/js/popper.js"></script>
<script src="http://cdn.bootstrapmb.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="static/js/script.js"></script>

<script>
    $(function () {
        $("#searchbtn").click(function () {
            var search = $("#search").val();
            window.location.href = "http://localhost:8080/mvideo/pages/video/searchpage.jsp?search=" + search;
        })
    })
    /*发送url给servlet 查询history*/

    $(function () {
        $.ajax({
            url: "http://localhost:8080/mvideo/HistoryServlet",
            type: "POST",
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            data: {
                action: "searchAllHistoryByUser",
                page: 1,
                num: 8,
            },
            dataType: "json",
            success: function (data) {
                console.log(data)
                if(data!="error"){
                    $.each(data, function (n, value) {
                        var tabhistory = "<div class=\"tab-history\">" +
                            "                            <div class=\"videoo\">" +
                            "                                <div class=\"vid_thumbainl ms\">" +
                            "                                    <a href=\"#\" title=\"\">" +
                            "                                        <img src=\"static/images/resources/vide1.png\" alt=\"\">" +
                            "                                        <span class=\"vid-time\">10:21</span>" +
                            "                                        <span class=\"watch_later\">" +
                            "<i class=\"icon-watch_later_fill\"></i>" +
                            "</span>" +
                            "                                    </a>" +
                            "                                </div><!--vid_thumbnail end-->" +
                            "                                <div class=\"video_info ms\">" +
                            "                                    <h3><a href=\"single_video_page.html\" title=\"\">Kingdom Come: Deliverance Funny" +
                            "                                        Moments and Fails</a></h3>" +
                            "                                    <h4><a href=\"Single_Channel_Playlist.html\" title=\"\">newfox media</a> <span" +
                            "                                            class=\"verify_ic\"><i class=\"icon-tick\"></i></span></h4>" +
                            "                                    <span>686K views .<small class=\"posted_dt\">1 week ago</small></span>" +
                            "                                </div>" +
                            "                                <a href=\"#\" title=\"\" class=\"delete-video\">" +
                            "                                    <i class=\"icon-cancel\"></i>" +
                            "                                </a>" +
                            "                                <div class=\"clearfix\"></div>" +
                            "                            </div><!--videoo end-->" +
                            "                        </div>"
                        $("#watch_history").children($(".tabs_lzt")).append(tabhistory);
                    })
                }

            }
        })
    })
</script>

</body>
</html>
