# Desinging for Everyone - GDG Finder app

This is the toy app for Lesson 10 of the [Android App Development in Kotlin course on Udacity](https://classroom.udacity.com/courses/ud9012/).
Это игрушечное приложение для урока 10 из
## GDG Finder

GDGs, or Google Developer Groups, are communities of developers that focus on Google technologies - including Android - around the world. They host lots of different events like meetups, conferences, study jams, and more!

GDG Finder helps you locate GDGs around the world or start one of your own. You'll learn the principles of Material Design so you can implement professional looking designs and build Android apps that users love to use!
GDGs, или группы разработчиков Google, - это сообщества разработчиков, которые фокусируются на технологиях Google, включая Android, по всему миру. Они проводят множество различных мероприятий, таких как встречи, конференции, учебные джемы и многое другое!

GDG Finder поможет вам найти GDGs по всему миру или начать свой собственный. Вы узнаете принципы материального дизайна, так что вы можете реализовать профессионально выглядящие проекты и создавать приложения для Android, которые пользователи любят использовать!
 
## Screenshots

![Screenshot1](screenshots/gdg-finder-home.png)
![Screenshot2](screenshots/gdg-finder-search.png)
![Screenshot3](screenshots/gdg-finder-apply.png)

## How to use this repo while taking the course
Как использовать это РЕПО во время прохождения курса


Each code repository in this class has a chain of commits that looks like this:
Каждый репозиторий кода в этом классе имеет цепочку коммитов, которая выглядит следующим образом:
![listofcommits](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58befe2e_listofcommits/listofcommits.png)

These commits show every step you'll take to create the app. Each commit contains instructions for completing the that step.
Эти коммиты показывают каждый шаг, который вы предпримете для создания приложения.
Каждая фиксация содержит инструкции по выполнению этого шага.

Each commit also has a **branch** associated with it of the same name as the commit message, as seen below:
Каждая фиксация также имеет ветвь***, связанную с ней, с тем же именем, что и сообщение фиксации, как показано ниже:
![branches](https://d17h27t6h515a5.cloudfront.net/topher/2017/April/590390fe_branches-ud855/branches-ud855.png
)
Access all branches from this tab.
Открыть все ветки в этом разделе.

![listofbranches](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58befe76_listofbranches/listofbranches.png
)


![branchesdropdown](https://d17h27t6h515a5.cloudfront.net/topher/2017/April/590391a3_branches-dropdown-ud855/branches-dropdown-ud855.png
)

The branches are also accessible from the drop-down in the "Code" tab.
Ветви также доступны из выпадающего списка на вкладке" код".

## Working with the Course Code
Работа с исходным кодом

Here are the basic steps for working with and completing exercises in the repo.
Вот основные шаги для работы с упражнениями и выполнения их в отчете.

The basic steps are: Основные шаги заключаются в следующем:

1. Clone the repo.
2. Check out the branch corresponding to the step you want to attempt.
3. Find and complete the TODOs.
4. Optionally commit your code changes.
5. Compare your code with the solution.
6. Repeat steps 2-5 until you've gone trough all the steps to complete the toy app.

1. Клонировать РЕПО.
2. Проверьте ветвь, соответствующую шагу, который вы хотите попробовать.
3. Найти и завершить задачи.
4. При необходимости зафиксируйте изменения в коде.
5. Сравните ваш код с решением.
6. Повторяйте шаги 2-5, пока вы не пройдете все шаги, чтобы завершить игрушечное приложение.

**Step 1: Clone the repo**

As you go through the course, you'll be instructed to clone the different exercise repositories, so you don't need to set these up now. You can clone a repository from github in a folder of your choice with the command:
По мере прохождения курса вам будет предложено клонировать различные репозитории упражнений, поэтому вам не нужно настраивать их сейчас.
Вы можете клонировать репозиторий из github в выбранную вами папку с помощью команды:
```bash
git clone https://github.com/udacity/REPOSITORY_NAME.git
```

**Step 2: Check out the step branch**

As you go through different steps in the code, you'll be told which step you're on, as well as a link to the corresponding branch.
По мере прохождения различных этапов кода вам будет сообщено, на каком этапе вы находитесь, а также ссылка на соответствующую ветвь.
You'll want to check out the branch associated with that step. The command to check out a branch would be:
Вы захотите проверить ветвь, связанную с этим шагом. Команда проверить ветвь будет такой:
```bash
git checkout BRANCH_NAME
```

**Step 3: Find and complete the TODOs**

Once you've checked out the branch, you'll have the code in the exact state you need. You'll even have TODOs, which are special comments that tell you all the steps you need to complete the exercise. You can easily navigate to all the TODOs using Android Studio's TODO tool. To open the TODO tool, click the button at the bottom of the screen that says TODO. This will display a list of all comments with TODO in the project. 
Как только вы проверите ветку, у вас будет код в нужном Вам состоянии. Вы даже будете иметь TODOs,
которые являются специальными комментариями,
которые говорят вам все шаги, необходимые для завершения упражнения. Вы можете легко перемещаться,
чтобы все задачи, используя инструмент Android студии Тодо. Чтобы открыть инструмент TODO,
нажмите кнопку в нижней части экрана, которая говорит, что нужно сделать.
 Это позволит отобразить список всех комментариев с TODO в проекте.

We've numbered the TODO steps so you can do them in order:
Мы пронумеровали шаги, чтобы вы могли делать их по порядку:
![todos](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58bf00e7_todos/todos.png
)

**Step 4: Commit your code changes**

After You've completed the TODOs, you can optionally commit your changes. This will allow you to see the code you wrote whenever you return to the branch. The following git code will add and save **all** your changes.
После завершения TODOs вы можете дополнительно зафиксировать свои изменения.
Это позволит вам видеть написанный вами код всякий раз, когда вы вернетесь в ветку.
Следующий код git добавит и сохранит * * все ваши изменения.
```bash
git add .
git commit -m "Your commit message"
```

**Step 5: Compare with the solution**

Most exercises will have a list of steps for you to check off in the classroom. Once you've checked these off, you'll see a pop up window with a link to the solution code. Note the **Diff** link:
Большинство упражнений будет иметь список шагов для вас, чтобы проверить в классе.
После того как вы их отключите, вы увидите всплывающее окно со ссылкой на код решения. Примечание **различия** ссылка:
![solutionwindow](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58bf00f9_solutionwindow/solutionwindow.png
)

The **Diff** link will take you to a Github diff as seen below:
Ссылка * * Diff* * приведет вас к GitHub diff, как показано ниже:
![diff](https://d17h27t6h515a5.cloudfront.net/topher/2017/March/58bf0108_diffsceenshot/diffsceenshot.png
)

All of the code that was added in the solution is in green, and the removed code (which will usually be the TODO comments) is in red. 
Весь код, добавленный в решение, выделен зеленым цветом, а удаленный код (который обычно является комментарием TODO) - красным.

You can also compare your code locally with the branch of the following step.
Вы также можете сравнить свой код локально с ветвью следующего шага.
## Report Issues
Notice any issues with a repository? Please file a github issue in the repository.
Замечали ли вы какие-либо проблемы с репозиторием? Пожалуйста, запишите проблему github в репозиторий.

