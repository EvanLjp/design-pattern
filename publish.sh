#!/bin/zsh
echo "build this gitbook...."
gitbook build
echo "create and checkout new branch gh-pages...."
echo "清理文件...."
git branch -D gh-pages
git checkout -b gh-pages
git rm --cached -r .
git clean -df
echo "create .gitignore...."
echo "*~" > .gitignore
echo "_book" >> .gitignore
echo "node_modules" >> .gitignore
echo "commit and push...."
cp -r _book/* .
git add -A
git commit -am "publish this book"
git push origin -u  gh-pages --force
echo "finished!!!"
git checkout master

