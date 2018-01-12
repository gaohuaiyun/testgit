#!/usr/bin/python3
#coding=utf-8
#文件名：five.py
import sys
#from sys import argv,path #导入特定的成员
print('========= Python import mode ========')
print('命令行参数为：')
for i in sys.argv:
	print(i)
	print('\n python3 路径为',sys.path)