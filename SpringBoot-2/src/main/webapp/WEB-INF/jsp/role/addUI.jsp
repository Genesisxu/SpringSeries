<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/header.jsp"%>
    <title>角色管理</title>
</head>
<body class="rightBody">
<form id="form" name="form" action="${basePath }nsfw/role_add.action" method="post" enctype="multipart/form-data">
    <div class="p_d_1">
        <div class="p_d_1_1">
            <div class="content_info">
    <div class="c_crumbs"><div><b></b><strong>角色管理</strong>&nbsp;-&nbsp;新增角色</div></div>
    <div class="tableH2">新增角色</div>
    <table id="baseInfo" width="100%" align="center" class="list" border="0" cellpadding="0" cellspacing="0"  >
        <tr>
            <td class="tdBg" width="200px">角色名称：</td>
            <td><s:textfield name="role.name" /></td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">角色权限：</td>
            <td>
            	<s:checkboxlist list="#privilegeMap" name="privilegeIds"></s:checkboxlist>
            </td>
        </tr>
        <tr>
            <td class="tdBg" width="200px">状态：</td>
            <td><s:radio list="#{'1':'有效','0':'无效'}" name="role.state"/></td>
        </tr>
    </table>
    
    <div class="tc mt20">
        <input type="submit" class="btnB2" value="保存" />
        &nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" onclick="history.go(-1)" class="btnB2" value="返回" />
    </div>
    </div></div></div>
    
   
</form>
</body>
</html>