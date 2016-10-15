<%@include file="/WEB-INF/content/base.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    main page${requestScope.aa}
    <%=request.getAttribute("aa") %>

    <form action="/search/transcoding" method="post">
        <input type="text" name="type"  />

        <input type="text" name="content" />

        <input type="submit" value="commit" />
    </form>

</body>
</html>
