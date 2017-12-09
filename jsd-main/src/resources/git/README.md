git checkout HEAD filename: Discards changes in the working directory.
git checkout -- filename: Discards changes in the working directory. (from last commited)
git reset HEAD filename: Unstages file changes in the staging area.
git reset SHA: Can be used to reset to a previous commit in your commit history.



#Git Quick Start Commands

git version
git config --global user.name "John Doe"
git config --global user.email "john.doe@git.training"
git config --global --list
git clone github-https-url # paste in your GitHub HTTPS clone URL
ls
cd github-demo
ls
git status
echo "Test Git Quick Start demo" >> start.txt
ls
cat start.txt
git status
git add start.txt
git status
git commit -m "Adding start text file"
git status
git push origin master


---------------------------------------------------------------------------------

1. In the project file :
	git init
2. List the added files :
	git status
3. Add all files: (index files to git)
	git add
	git add . (index tous les fichiers sauf ceux ignorés)
4. Add 1 file: (index 1 file to git)
	git add Readme.txt
5. Project snapshot :
	git commit -m “Ajout de Readme.txt”
6. Connect local repository to the GitHub repository
	git remote add origin https://github.com/jsdumas/MonProjet.git
7. Remote repository confirmation :
	git remote -v
8. Push
	git push -u origin master
