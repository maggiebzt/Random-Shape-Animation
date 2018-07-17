# Random-Shape-Animation
Midterm project from Intro to Software Systems class. The application generates and draws different shapes of random colors, random sizes, and in random locations.

### Project Requirements
Pressing the 'c', 'r', or 's' key draws a circle, rectangle, or square of random colors, sizes, and locations. The shapes would move in one direction and bounce off to the opposite direction when they hit another shape or window borders.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
I used Eclipse IDE. 

#### Installing
1. Install Eclipse: http://www.ntu.edu.sg/home/ehchua/programming/howto/eclipsejava_howto.html

2. On Eclipse:
```
File -> Import -> Git -> Projects from Git -> Clone URI
```
3. Put: https://github.com/maggiebzt/Random-Shape-Animation.git in URI

4. Select the master branch

5. Choose directory

## Deployment
Run the RSA.jar file.

### Windows
Windows users can run it immediately. 

### Mac
Mac users need to make sure you have JRE installed by running this line on Terminal:

```
java -version
```
JRE can be installed from here: http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html

Once JRE is installed, you can run the .jar file by double-clicking it or running this line on Terminal:
```
java -jar RSA.jar
```

## Acknowledgments
* This README.md template is from https://gist.github.com/PurpleBooth/109311bb0361f32d87a2
* Project improvement ideas:
  * Stop/start movement when mouse is clicked
  * Have all shapes start in random directions instead of just down-right
  * Change from using Rectangle to using Point
