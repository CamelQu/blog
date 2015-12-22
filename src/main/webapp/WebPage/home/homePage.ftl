<html>
<head>

</head>
<body>
<p>滚动图片页</p>
<#list banner as bannerItem>
<h1>${bannerItem.picPath}</h1>
<br />
</#list>

<p>技术文章分类</p>
<#list tech as techItem>
${techItem}
<br />
</#list>

<p>教程文章分类</p>
<#list tutor as tutorItem>
${tutorItem}
<br />
</#list>

<p>随笔文章分类</p>
<#list essay as essayItem>
${essayItem}
<br />
</#list>
</body>
</html>