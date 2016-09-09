<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<link href="${basePath}css/nsfw/css.css" rel="stylesheet" type="text/css" />
	<link href="${basePath}css/nsfw/style.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="${basePath}js/DD_belatedPNG.js" ></script>
<script type="text/javascript">
    DD_belatedPNG.fix('b, s, img, span, .prev, .next, a, input,');
</script>
<![endif]-->
<script type="text/javascript">
	function openApp(url) {
		window.top.location = url;
	}
	function delCookie() {
		top.document.cookie = "TopNode=;expires=Fri, 31 Dec 1999 23:59:59 GMT;";
	}
</script>
</head>

<body>
	<!-- 头部{ -->
	<table width="1222" border="0" align="center" cellpadding="0" cellspacing="0" background="${basePath}images/nsfw/xingzheng.png" class="top">
		<tr>
			<td width="26" height="106">&nbsp;</td>
			<td width="416" height="110" align="left" valign="middle">
				<img class="zxx_test_png" src="${basePath}images/home/ind01.png" width="470" height="90" alt="" />
			</td>
			<td width="135">&nbsp;</td>
			<td width="418">
				<object id="FlashID" classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="450" height="86">
					<param name="movie" value="${basePath}images/home/flash.swf" />
					<param name="quality" value="high" />
					<param name="wmode" value="transparent" />
					<param name="swfversion" value="6.0.65.0" />
					<!-- 此 param 标签提示使用 Flash Player 6.0 r65 和更高版本的用户下载最新版本的 Flash Player。如果您不想让用户看到该提示，请将其删除。 -->
					<param name="expressinstall" value="Scripts/expressInstall.swf" />
					<!-- 下一个对象标签用于非 IE 浏览器。所以使用 IECC 将其从 IE 隐藏。 -->
					<!--[if !IE]>-->
					<object type="application/x-shockwave-flash" data="${basePath}images/home/flash.swf"
						width="380" height="86">
						<!--<![endif]-->
						<param name="quality" value="high" />
						<param name="wmode" value="transparent" />
						<param name="swfversion" value="6.0.65.0" />
						<param name="expressinstall" value="Scripts/expressInstall.swf" />
						<!-- 浏览器将以下替代内容显示给使用 Flash Player 6.0 和更低版本的用户。 -->
						<div>
							<h4>此页面上的内容需要较新版本的 Adobe Flash Player。</h4>
							<p>
								<a href="http://www.adobe.com/go/getflashplayer">
									<img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="获取 Adobe Flash Player" width="112" height="33" />
								</a>
							</p>
						</div>
						<!--[if !IE]>-->
					</object>
					<!--<![endif]-->
				</object>
			</td>
			<td width="300" align="right" valign="top">
				<table width="350" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="17" height="9"></td>
                        <td width="66" height="9"></td>
                        <td width="120" height="5"></td>
                        <td width="17" height="9"></td>
						<td width="36" height="9"></td>
						<td width="17"></td>
						<td width="46"></td>
					</tr>
					<tr>
					    <td align="center"></td>
                        <td align="left"></td>
                        <td align="left"><a><b></b><font color="red">欢迎您，${sessionScope.SYS_USER.name }</font></a></td>
                        <td align="center"><img src="${basePath}images/nsfw/help.png" width="12"height="17" /></td>
						<td align="left"><a href="javascript:void(0)">帮助</a></td>
						<td width="17" align="center"><img src="${basePath}images/nsfw/exit.png"width="14" height="14"/></td>
						<td align="left" valign="middle"><a href="${basePath}sys/login_logout.action" target="_top">退出</a></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<!-- }头部 -->
	<!-- 导航{ -->
	<div class="banner">
		<div class="menu">
			<ul class="clearfix">
				<li><a href="${basePath}sys/home.action" target="_top">工作主页</a></li>
                <li><a href="javascript:void(0);">行政管理</a></li>
                <li><a href="javascript:void(0);">后勤服务</a></li>
                <li><a href="javascript:void(0);">在线学习</a></li>
                <li><a href="javascript:void(0);">纳税服务</a></li>
                <li><a href="javascript:void(0);">我的空间</a></li>
			</ul>
		</div>
	</div>
	<!-- }导航 -->
</body>
</html>
