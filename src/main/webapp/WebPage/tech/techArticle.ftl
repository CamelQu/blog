<html>
<head>

</head>
<body>
<h1>${title}</h1>
<br />
<p>阅读量：${count}&nbsp;|&nbsp;发表日期：${publishDate?string("yyyy-MM-dd")}&nbsp;|&nbsp;作者：<a href="mailto:${email}">${author}</a>
<p>${content}
</body>
</html>