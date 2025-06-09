
Нашей компании требуется инфраструктурное приложение (написанное на Java), 
выполняющее манипуляции со строками текста, хранящимися в файлах.

- Приложение должно запускаться из командной строки, выполнять одно действие по манипулированию 
- и затем выходить.
- Приложению заданы три параметра
1.	Имя текстового файла, с которым нужно работать.
2.	Имя текстового файла, в который нужно сбросить результаты манипуляции.
3.	Имя действия, которое нужно выполнить (например, «reverse», 
4. которое должно перевернуть все строки указанного текстового файла).
- Это приложение представляет собой инфраструктуру!
- Пользователями приложения являются разработчики, которые добавляют 
- в приложение свои собственные новые действия, не изменяя код приложения.
  Ваши задачи:
1.	Предоставить дизайн верхнего уровня приложения
2.	Написать реализацию приложения и реализацию одного из действий:
      a.	Sort - сортировка строк файла (по алфавиту)
      b.	Shuffle - случайное перемешивание строк файла
      c.	Перевернуть - изменение порядка следования строк файлов.
3.	Вы можете дать дополнительные требования пользователю, который добавляет свои действия.
      Постарайтесь максимально упростить добавление новых действий как в коде, так и в требованиях.
      Сохраняйте простоту - помните, что ваш пользователь - это разработчик, который хочет 
4. сосредоточиться только на своей бизнес-логике (и от него не требуется изменять 
5. код инфраструктуры).
4.	Работа с исключениями


Our company needs an infrastructure application (written in Java) that performs manipulations 
on lines of text stored in files.

•	The application should run from a command line, perform a single manipulation action 
and then exit.
•	Three parameters are given to the application
1.	Name of the text file that should be manipulated.
2.	Name of the text file to throw the output of the manipulation to.
3.	An action name to perform (i.e. "reverse" which should reverse all lines of 
4. the specified text file)
      •	This application is an infrastructure!
      •	The application users are developers that add their own new actions to 
5. the application without changing the application code.
      Your tasks:
1.	Provide a top level design of the application
2.	Write the implementation of the application and the implementation of one of the actions:
      a.	Sort – sorting the file rows (alphabetically)
      b.	Shuffle – randomly shuffles the file rows
      c.	Reverse – reversing the order of the file rows
3.	You may give additional requirements to the user that is adding his/her actions.
      Try to make it easy as possible to add new actions in both code and requirements.