H57 Shiro Example
=================

A Spring MVC 3.1.0 sample, leveraging Shiro 1.20, myBatis 3.0.6, and JSR-303 Validation (Hibernate reference implementation).

When playing around with these technologies, I found it challenging to find a solid sample implementation that I could wrap my head around. So I decided to to write one myself and then use it to write some tutorials.

Website: [Google +] (https://plus.google.com/u/0/113383164169998763938/about)
Bugs/Suggestions: [Google +] (https://plus.google.com/u/0/113383164169998763938/about) (till I have need of something more mature)

Compilation
-----------

We use maven to handle our dependencies.

* Install [Maven 3](http://maven.apache.org/download.html)
* Check out this repo and: `mvn clean package`

Coding and Pull Request Conventions
-----------

* We generally follow the Java coding standards.
* No Spaces; use Tabs instead.
* No trailing whitespaces.
* No CRLF line endings, LF only, put your gits 'core.autocrlf' on 'true'.
* No 80 column limit or 'weird' midstatement newlines.
* The number of commits in a pull request should be kept to a minimum (squish them into one most of the time - use common sense!).
* No merges should be included in pull requests unless the pull request's purpose is a merge.
* Pull requests should be tested (does it compile? AND does it work?) before submission.
* Any major additions should have documentation ready and provided if applicable (this is usually the case).
* Most pull requests should be accompanied by a corresponding Google Plus post so we can associate commits with issues (this is primarily for changelog generation).
* Try to follow test driven development where applicable.

If you make changes or add classes it is mandatory to:

* Get the files from the [this repo](https://github.com/Bubba) - make sure you have the last version!
* Make a separate commit adding the new classes (commit message: "Added x for diff visibility" or so).
* Then make further commits with your changes.
* Mark your changes with:
    * 1 line; add a trailing: `// H57_Shiro [- Optional reason]`
    * 2+ lines; add
        * Before: `// H57_Shiro start [- Optional comment]`
        * After: `// H57_Shiro end`
* Keep the diffs to a minimum (*really* important)

Tips to get your pull request accepted
-----------
Making sure you follow the above conventions is important, but just the beginning. Follow these tips to better the chances of your pull request being accepted and pulled.

* Make sure you follow all of our conventions to the letter.
* Make sure your code compiles under Java 6.
* Provide proper JavaDocs where appropriate.
* Provide proper accompanying documentation where appropriate.
* Test your code.
* Make sure to follow coding best practises.
* Your pull request should link to accompanying pull requests.
* The description of your pull request should provide detailed information on the pull along with justification of the changes where applicable.