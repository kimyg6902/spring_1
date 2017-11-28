<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link a href="./resources/css/home.css" rel="stylesheet">
</head>
<body>
<h1>
	Hello world!   Spring
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="./notice/noticeList?name=notice">Go notice</a>
<a href="./qna/qnaList">Go qna list</a>
<a href="./qna/qnaView">Go qna view</a>
<a href="./qna/qnaList">Go qna list</a>
<h3>Master</h3>
	<h3>Git hub</h3>
	<h1>dd</h1>
<img src="./resources/images/dog.jpg"><!--  Spring은 모든 요청은 컨트롤러를 거쳐가야한다  -->
<img src="./etc/dog.jpg">

</body>
</html>
