#爬虫
from urllib import request

response = request.urlopen("http://www.baidu.com/")
fi = open("project.txt",'w')
page = fi.write(str(response.read()))
fi.close