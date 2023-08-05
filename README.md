<a name="readme-top"></a>

<br />
<div align="center">
    <img src="/images/Logo.png" alt="Logo" width="120" height="120">
  </a>
  <h1 align="center">Chess System</h1>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built Only With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#Installation and Execution">Installation and Execution</a></li>
      </ul>
    </li>
    <li><a href="#How to play">How to play</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
<br>
<div align="center">
  <img src="/images/demo.png" alt="Demo" width="257" height="360">
</div
</br>

<br>
This project was created with the intention of applying knowledge about the Java programming language foundation. With that said, in this project, knowledge of data structures, the principles of Object-Oriented Programming (encapsulation, inheritance, polymorphism, and abstraction), defensive programming (exceptions), enumerators, and the layer pattern were applied, along with other skills such as:
</br>
<br>

* Board implementation
* Piece implementation on the board
* Practice of piece movement logic and handling of capturing the opponent's piece
* Turn implementation for player switching
* Check and Checkmate logic
* Special moves: castling, en passant capture, and pawn promotion.
  
</br>

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built Only With

 [![Java-icon]][Java-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.

### Prerequisites

* Java Development Kit (JDK)

  * [Instructions for installing the JDK on the Windows platform][Java-install-windows]
  * [Instructions for installing the JDK on the Linux platform][Java-install-linux]
  * [Instructions for installing the JDK on the macOS platform][Java-install-macOS]
 
* GIT to clone the project

  * [Instructions for installing the GIT on the Windows platform, Linux or macOS][Git]
 

### Installation and Execution

To run it is very simple just follow these steps:

1. Clone the repository
   ```sh
     git clone git@github.com:RaulMafra/chess-system-java.git
   ```
2. Open the command prompt (if you are using Windows) or the Terminal (if you are using Linux or masOS) inside the <strong>bin</strong> directory of the project. You can also run it in git bash if you want
3. Run the project:
   ```sh
   java application/Program to run the project
   ```
 

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## How to play

* White pieces have white color, black pieces have yellow color.
* The board has rows and columns, and the rows go from number **1** to number <strong>8</strong> in descending order and are located on the left side of the board, and the columns that go from letter **a** to letter **h** and are located at the bottom of the board. board.
  
**Moving a piece**:
<ol> 
    <li>Choose the piece you want to move by typing in the <strong>source</strong> field the desired column + the line, for example, <strong>a2</strong></li>
    <li>Then choose which position you want to move the piece to by typing in the <strong>target</strong> field the desired column + the line, for example, <strong>a3</strong></li>
</ol>

* Pieces that are captured will appear inside the square brackets under **Captured pieces** according to the color of the captured piece.
  
<p align="right">(<a href="#readme-top">back to top</a>)</p>




<!-- CONTACT -->
## Contact

My instagram profile - [@raul.csm][Instagram]

Project Link - [Project chess system][Project]

<p align="right">(<a href="#readme-top">back to top</a>)</p>





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[Java-icon]: https://skillicons.dev/icons?i=java
[Java-url]: https://www.oracle.com/br/java/
[Java-install-windows]: https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA
[Java-install-linux]: https://docs.oracle.com/en/java/javase/11/install/installation-jdk-linux-platforms.html#GUID-737A84E4-2EFF-4D38-8E60-3E29D1B884B8
[Java-install-macOS]: https://docs.oracle.com/en/java/javase/11/install/installation-jdk-macos.html#GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE
[Git]: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
[Instagram]: https://www.instagram.com/raul.csm/
[Project]: https://github.com/RaulMafra/chess-system-java/tree/main

