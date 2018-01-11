# -*- coding: UTF-8 -*-
#生成1-6之间的随机数

#导入random（随机数）模块
import random

a = 1
b = 2
print("请输入指令：start--开始，stop--结束")
while a < b:
	x = input("")
	if "start" ==x:
		print(random.randint(1,9))
	elif "stop" == x:
		break
	else:
		print("输入错误！")