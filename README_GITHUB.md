BEGIN:
1. Create a GitHub account at https://github.com

2. Please give your username to me. I will add you to the project repository.

3.  Download Git at http://git-scm.com/download/win

4. After dowloading, please run Git Bash and type the following commands:

- $ git config --global user.name "Type your name"

- $ git config --global user.email "Type your email"

- $ git clone https://github.com/vihoang/SourceCode  --->( the import command. It will create a repository folder on your local computer.)

5. Go to C drive --> users ---> choose the user is login then--> check whether the  folder named SourceCode exists
----------------------------------------------------------------------------------------------------------------------
ONCE CREATING A NEW FILE & MAKING CHANGES ON ANY FILES IN THE REPOSITORY FOLDER
6. When creating a new file, if you want to track it, please use the command:
- $ git add file_name
---> It's important, becasue if you don't add, then anything you changed is not pushed to server and not tracked.

7. When you do some changes on any files in the repository folder and want to commit it, please open Git Bash and type:
- $ git commit -m "Your comment for the reason of commit"

8. Then you have to type: "$ git push origin master"  to push those changes to server (https://github.com/vihoang/SourceCode)

9. A popup is shown and requires you enter your username and pwd of Github. Enter them!

10. Go to server (https://github.com/vihoang/SourceCode) to check the existation of your files. 


