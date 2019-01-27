echo "编译gitbook"
gitbook build
echo "上传中....."
git add -A
git commit -am "提交新版本"
git push -u origin master
echo "|||||||||||||||FINISHED|||||||||||||||||||"
