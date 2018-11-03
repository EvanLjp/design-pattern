#!/bin/zsh
echo "build this gitbook...."
gitbook build
echo "create and checkout new branch gh-pages...."
echo "清理文件...."
echo "_book" > .gitignore
git rm --cached -r .
git clean -df
echo "create .gitignore...."
echo "*~" > .gitignore
echo "_book" >> .gitignore
echo "commit and push...."
cp -r _book/* .
git add -A
git commit -am "publish this book"
git push origin -u  gh-pages
echo "finished!!!"
git checkout master

