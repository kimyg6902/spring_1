<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Qna List Page</h1>
		<div>
			<h3>
				Title:${view.title }
				writer:${view.wirter }
				age:${view.age }
			
			</h3>
		
		</div>
		<a href="../">Home</a>
		<a href="../notice/noticeList">noticeList</a>
		<a href="../notice/noticeView">noticeView</a>
		<a href="./qnaView">Qna View</a>
		<a href="./qnaWrite">Qna Write Form Page</a>
		
		
</body>	
</html>