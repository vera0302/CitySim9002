# CitySim9002

![build status](https://travis-ci.org/asphaltpanthers/CitySim9002.svg?branch=master)

Description of issues:
Based on the requirements and my developing process, in my deliverable 2, the first issue  is how to generate random numbers. As we all know, you can use either Math.random or import the java package java.util.Random to complete. After several times of trying, I chosen the Math.random as my generator method because it is convenient for me to program other classes. I leveraged similar methods to store different kinds of visitor types, visiting locations. Using Boolean function to describe if visitors like the current visiting location or not according to their preferences in the requirements. The FunVisitor class integrates all the information about the visiting location and visitors. However, for Fun-ARGS and Fun-Display, as I cannot understand the requirement of the fun-args, I do not know the meaning of “If the program is passed in any number of arguments other than 1, including 0, or the passed-in argument is not a valid integer, the program shall display…”. I do not know how to make it come true, either. 
For Test part, I tried my best to program 6 unit tests, I’m not sure I separated those tests into stubbing and double tests write. I think it’s a little hard for me to complete more complexed and meaningful tests since I had never researched this field before. 
These are most serious problems I faced during this deliverable and I will keep in understanding Junit test in the future.
