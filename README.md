# password-checker

A partner exercise to practice using JUnit tests.

## Setup

### Forking and Cloning
1. Choose one partner to be Partner A, one partner to Partner B.
1. Have ONLY Partner A fork this repository. PARTNER B SHOULD NOT FORK.
1. Have Partner A add Partner B as a collaborator on their fork. Follow [these directions](https://docs.github.com/en/enterprise-server@3.10/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-access-to-your-personal-repositories/inviting-collaborators-to-a-personal-repository#inviting-a-collaborator-to-a-personal-repository).
1. Have the Partner A send the URL of their repository to Partner B.
1. Partner B should see an invitation at the top of the repository. Click "View Invitation", then "Accept Invitation".
1. Both partners should clone the repository to their own computer. The URL should include Partner A's username.
1. Both partners should change into the project repository:
    ```
    cd password-checker
    ```
1. Both partners should open VSCode in the project repository. If the below command does not work, open VS Code and use File > Open Folder.
    ```
    code .
    ```

## Understanding the program
1. Compile the program
    ```
    javac src/*.java
    ```
1. Run the program
    ```
    java -cp src App
1. Follow the prompts in the program. Experiment with it and understand what it does.
1. Take a brief glance at the `App.java` file to get an overall idea of what it does. Do not dwell too much on fully understanding this file.
    > It is often the case that you will need only to understand part of a program to begin working on it. Learning how to prioritize what parts of a project to deeply understand and which parts to have only a loose understanding of is an important skill to learn!
1. Look at `PasswordChecker.java`. Try to understand this code. With your partner, discuss the following:
    1. What does it do?
    1. How does it do it?
    1. What are some passwords that would be interesting to check with it?
    > There are some bugs in this file! If you see them, please do not fix them yet. We will be writing tests that we expect to trigger these bugs.

## Setting Up Tests
1. Choose one partner to write code first. Use only their computer for this section, but talk to each other and work together on how to do it.
1. Open `PasswordChecker.java`.
1. Anywhere in the file right-click (cmd+click on Mac).
1. Choose `Source Action` from the context menu.
1. Choose `Generate Tests`.
1. If prompted by an error message complaining that tests are not set up, follow these steps:
    1. Click the button to enable tests (TODO: double check the phrasing of the error message and update)
    1. Choose JUnit5
    1. If necessary, right click and choose `Generate Tests` again
1. Check the checkboxes for the public methods (not constructors).
1. A test skeleton file should be created.
1. Run the empty tests. They should pass.
1. Pull, then add, commit, and push the changes. 


## Writing Tests
You will repeatedly follow the below steps for each test you add. For the rest of this assignment you will be switching partners after writing each test. BOTH PARTNERS MUST HAVE COMMITS ON THE REPOSITORY TO RECIEVE CREDIT. Continue following this cycle until the file is thoroughly tested and all bugs are fixed. You should have a minimum of three tests for each public method (not constructor). There should be at least 9 tests overall.

1. Switch to the other partner's computer. Pull the changes. If there are merge conflicts, resolve them.
1. Create a new test that tests some functionality of the program.
1. Run all tests and see if they pass. If they do not pass, determine whether there is an issue in your test or if you found a bug in `PasswordChecker.java`. If there is an issue in your test, fix the test. If there is a bug in password checker, fix the bug.
1. Once the test is passing, pull, add, commit and push the changes. Go back to the beginning of this section and switch the partner whose computer you are using.

## Submitting
Once you have the file thoroughly tested and all bugs fixed, please make a PR to the original repository. Have BOTH partners copy the link to the PR to submit it in Canvas. You will both use the same URL.