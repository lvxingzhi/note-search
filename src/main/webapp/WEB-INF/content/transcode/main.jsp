<%--
  Created by IntelliJ IDEA.
  User: lvxz5
  Date: 2016/10/11
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/content/base.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    main page${requestScope.aa}
    <%=request.getAttribute("aa") %>
</body>
</html>
