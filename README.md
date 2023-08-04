<a name="readme-top"></a>

<br />
<div align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>
  <h3 align="center">Chess System</h3>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#Installation and execution">Installation</a></li>
      </ul>
    </li>
    <li><a href="#How to play">Usage</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

[![Demo](/images/Demo.png)

This project was created with the intention of applying knowledge about the Java programming language foundation. With that said, in this project, knowledge of data structures, the principles of Object-Oriented Programming (encapsulation, inheritance, polymorphism, and abstraction), defensive programming (exceptions), enumerators, and the layer pattern were applied, along with other skills such as:

* Board implementation
* Piece implementation on the board
* Practice of piece movement logic and handling of capturing the opponent's piece
* Turn implementation for player switching
* Check and Checkmate logic
* Special moves: castling, en passant capture, and pawn promotion.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* <!--![Java][Java.icon]][Java-url]

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
 

### Installation and execution

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
* Moving a piece:
  <ol>
    <li>First choose the piece you want to move by typing in the <strong>source</strong> field the desired column + the line, for example, <strong>a2</strong></li>
    <li>Then choose which position you want to move the piece to by typing in the <strong>target</strong> field the desired column + the line, for example, <strong>a3</strong></li>
  </ol>
* Pieces that are captured will appear inside the square brackets under **Captured pieces** according to the color of the captured piece.
  
<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**❤️.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

My instagram profile - [@raul.csm][Instagram]

Project Link - [Project chess system][Project]

<p align="right">(<a href="#readme-top">back to top</a>)</p>





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 

[Java.icon]: /images/java.png
[Java-url]: https://www.oracle.com/br/java/
[Java-install-windows]: https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA
[Java-install-linux]: https://docs.oracle.com/en/java/javase/11/install/installation-jdk-linux-platforms.html#GUID-737A84E4-2EFF-4D38-8E60-3E29D1B884B8
[Java-install-macOS]: https://docs.oracle.com/en/java/javase/11/install/installation-jdk-macos.html#GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE
[Git]: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
[Instagram]: https://www.instagram.com/raul.csm/
[Project]: https://github.com/RaulMafra/chess-system-java/tree/main

