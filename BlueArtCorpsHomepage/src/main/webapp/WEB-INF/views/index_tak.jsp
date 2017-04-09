<%--
  Created by IntelliJ IDEA.
  User: Namsoo
  Date: 2017. 4. 4.
  Time: 오후 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta charset="utf-8"/>

    <link href="<c:url value="/resources/css/common.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/test.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>




<%--======================--%>
    <%--<spring:url value="/css/common.css" var="commonCss" />--%>
    <%--<spring:url value="/css/test.css" var="testCss" />--%>
    <%--<spring:url value="/js/jquery.min.js" var="jqueryJs" />--%>

    <%--<link href="${commonCss}" rel="stylesheet" />--%>
    <%--<link href="${testCss}" rel="stylesheet" />--%>
    <%--<script src="${jqueryJs}"></script>--%>


    <title>냠냠ㄴ먐</title>
</head>

<script>
    $(document).ready(function () {
        $(".loginPop").hide();

        $(document).mouseup(function (e) {
            var container = $("#loginPop");
            if (!container.is(e.target) && container.has(e.target).length === 0) {
                container.css("display", "none");
            }
        });

    });

    function fn_login() {
        $(".loginPop").show();
    }

</script>
<body>
<div class="head">
    <div class="headLayoutRow">
        <div class="logo">
            <span>blueArtCompany</span>
        </div>
        <div class="layoutSpacer"></div>
        <div class="login">
            <nav>
                <a href="#">Sing up</a>
                <a href="#" onclick="javascript:fn_login();">login</a>
            </nav>
        </div>
    </div>
</div>
<form action="POST">
    <div class="container">
        <div class="info">
        </div>
        <div class="dues">
            <div class="duesName">
                <span>회비</span>
                <table>
                    <tr>
                        <th></th>
                    </tr>
                </table>
            </div>
        </div>
        <div class="three">

        </div>
    </div>
    <div class="footer">
        <span>COPYRIGHTⓒNamMinSu</span>
    </div>
</form>

<div class="loginPop" id="loginPop" name="loginPop">
    <h3>로그인</h3>
    <table>
        <colgroup>
            <col width="50%">
            <col width="50%">
        </colgroup>
        <tr>
            <td>
                <input type="text" id="loginId" name="loginId" placeholder="아이디"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" id="loginPwd" name="loginPwd" placeholder="비밀번호"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" id="loginBtn" name="loginBtn" value="LOGIN" class="loignBtn">
            </td>
        </tr>
        <tr>
            <td style="text-align:right;">
                <a href="#">
                    <button>ID/PW 찾기</button>
                </a>
                <a href="#">
                    <button style="margin-right:46px;">회원가입</button>
                </a>
            </td>
        </tr>
    </table>
</div>







<div>
    메인 페이지 입니다
    <P> The time on the server is ${serverTime}. </P>


    <table width="500" cellpadding="0" cellspacing="0" border="1">
        <tr>
            <td>번호</td>
            <td>작성자</td>
            <td>내용</td>
        <tr>
            <c:forEach items="${listUser}" var="dto">
        <tr>
            <td>${dto.userCode}</td>
            <td>${dto.username}</td>
            <td>${dto.special}</td>
        <tr>
            </c:forEach>
    </table>


</div>
</body>
</html>
