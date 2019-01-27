#!/bin/zsh
echo "初始化构建中...."
gitbook init
echo "复制模板文件中...."
cp ../template/publish.sh .
cp ../template/build.sh .
cp ../template/book.json .
echo "create .gitignore...."
echo "*~" > .gitignore
echo "_book" >> .gitignore
echo "node_modules" >> .gitignore
echo "安装gitbook插件中...."
gitbook install
echo "init on github"
git add -A
git commit -am "init"
git push -u origin master
echo "初始化完成,请修改必备book.json参数!!"


